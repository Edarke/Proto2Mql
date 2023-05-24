package com.github.edarke.mongodb.driver;

import com.google.protobuf.Descriptors.Descriptor;
import com.google.protobuf.Descriptors.EnumValueDescriptor;
import com.google.protobuf.Descriptors.FieldDescriptor;
import com.google.protobuf.Descriptors.FieldDescriptor.Type;
import com.google.protobuf.Message;
import java.util.function.Function;
import org.bson.BsonArray;
import org.bson.BsonBoolean;
import org.bson.BsonDocument;
import org.bson.BsonDouble;
import org.bson.BsonInt32;
import org.bson.BsonInt64;
import org.bson.BsonString;
import org.bson.BsonValue;

public class Proto2Bson {
  public static BsonValue repeat(FieldDescriptor d, Message m, Function<Object, BsonValue> mapper) {
    if (d.isRepeated()) {
      BsonArray array = new BsonArray();
      for (int i = 0; i < m.getRepeatedFieldCount(d); ++i) {
        Object element = m.getRepeatedField(d, i);
        array.add(mapper.apply(element));
      }
      return array;
    } else {
      return mapper.apply(m.getField(d));
    }
  }

  public static BsonValue toBson(FieldDescriptor d, Message m) {
    Object value = m.getField(d);
    switch (d.getType()) {
      case DOUBLE:
        return repeat(d, m, e -> new BsonDouble((Double) e));
      case FLOAT:
        return repeat(d, m, e -> new BsonDouble((Float) e));
      case INT64:
        return repeat(d, m, e -> new BsonInt64((Long) e));
      case INT32:
        return repeat(d, m, e -> new BsonInt32((Integer) e));
      case BOOL:
        return repeat(d, m, e -> new BsonBoolean((Boolean) e));
      case STRING:
        return repeat(d, m, e ->  new BsonString(e.toString()));
      case MESSAGE:
        if (d.getMessageType().getOptions().hasExtension(Options.map)) {
          BsonDocument doc = new BsonDocument();
          for (int i = 0; i < m.getRepeatedFieldCount(d); ++i) {
            Message entry = (Message) m.getRepeatedField(d, i);
            Descriptor entryDescriptor = entry.getDescriptorForType();
            FieldDescriptor keyDescriptor = entryDescriptor.findFieldByNumber(1);
            String key;
            if (keyDescriptor.getType() == Type.MESSAGE) {
              key = toBson((Message) entry.getField(keyDescriptor)).asString().getValue();
            } else {
              key = entry.getField(entryDescriptor.findFieldByNumber(1)).toString();
            }
            FieldDescriptor valueDescriptor = entryDescriptor.findFieldByNumber(2);
            doc.put(key, toBson(valueDescriptor, entry));
          }
          return doc;
        }

        return repeat(d, m, e -> toBson((Message) e));
      case ENUM:
        EnumValueDescriptor field = (EnumValueDescriptor) value;
        if (field.getOptions().hasExtension(Options.bsonValue)) {
          String extension = field.getOptions().getExtension(Options.bsonValue);
          return new BsonString(extension);
        }
        return new BsonString(field.getName());
    }
    throw new IllegalArgumentException();
  }

  public static BsonValue toBson(Message msg) {
    if (msg.getDescriptorForType().getOptions().hasExtension(Options.wrapper)) {
      FieldDescriptor onlyField = msg.getDescriptorForType().findFieldByNumber(1);
      return toBson(onlyField, msg);
    }

    BsonDocument root = new BsonDocument();
    BsonDocument nested;
    if (msg.getDescriptorForType().getOptions().hasExtension(Options.nest)) {
      nested = new BsonDocument();
      root.put(msg.getDescriptorForType().getOptions().getExtension(Options.nest), nested);
    } else {
      nested = root;
    }
    msg.getAllFields().forEach((d, v) -> nested.put(d.getJsonName(), toBson( d, msg)));
    return root;
  }
}
