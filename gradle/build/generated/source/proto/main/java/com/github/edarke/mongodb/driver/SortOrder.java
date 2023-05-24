// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: search.proto

package com.github.edarke.mongodb.driver;

/**
 * Protobuf enum {@code com.github.edarke.mongodb.SortOrder}
 */
public enum SortOrder
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>ASC = 1 [(.com.github.edarke.mongodb.Options.bson_value) = "1"];</code>
   */
  ASC(1),
  /**
   * <code>DESC = 2 [(.com.github.edarke.mongodb.Options.bson_value) = "-1"];</code>
   */
  DESC(2),
  ;

  /**
   * <code>ASC = 1 [(.com.github.edarke.mongodb.Options.bson_value) = "1"];</code>
   */
  public static final int ASC_VALUE = 1;
  /**
   * <code>DESC = 2 [(.com.github.edarke.mongodb.Options.bson_value) = "-1"];</code>
   */
  public static final int DESC_VALUE = 2;


  public final int getNumber() {
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static SortOrder valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static SortOrder forNumber(int value) {
    switch (value) {
      case 1: return ASC;
      case 2: return DESC;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<SortOrder>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      SortOrder> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<SortOrder>() {
          public SortOrder findValueByNumber(int number) {
            return SortOrder.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return com.github.edarke.mongodb.driver.SearchOuterClass.getDescriptor().getEnumTypes().get(0);
  }

  private static final SortOrder[] VALUES = values();

  public static SortOrder valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private SortOrder(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:com.github.edarke.mongodb.SortOrder)
}
