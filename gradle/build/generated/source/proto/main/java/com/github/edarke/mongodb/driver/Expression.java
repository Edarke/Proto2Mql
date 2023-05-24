// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: operator.proto

package com.github.edarke.mongodb.driver;

/**
 * Protobuf type {@code com.github.edarke.mongodb.Expression}
 */
public final class Expression extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.github.edarke.mongodb.Expression)
    ExpressionOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Expression.newBuilder() to construct.
  private Expression(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Expression() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Expression();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.github.edarke.mongodb.driver.Operator.internal_static_com_github_edarke_mongodb_Expression_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.github.edarke.mongodb.driver.Operator.internal_static_com_github_edarke_mongodb_Expression_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.github.edarke.mongodb.driver.Expression.class, com.github.edarke.mongodb.driver.Expression.Builder.class);
  }

  private int bitField0_;
  private int valueCase_ = 0;
  private java.lang.Object value_;
  public enum ValueCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    ADD(1),
    VALUE_NOT_SET(0);
    private final int value;
    private ValueCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static ValueCase valueOf(int value) {
      return forNumber(value);
    }

    public static ValueCase forNumber(int value) {
      switch (value) {
        case 1: return ADD;
        case 0: return VALUE_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public ValueCase
  getValueCase() {
    return ValueCase.forNumber(
        valueCase_);
  }

  public static final int ADD_FIELD_NUMBER = 1;
  /**
   * <code>.com.github.edarke.mongodb.AddExpression add = 1;</code>
   * @return Whether the add field is set.
   */
  @java.lang.Override
  public boolean hasAdd() {
    return valueCase_ == 1;
  }
  /**
   * <code>.com.github.edarke.mongodb.AddExpression add = 1;</code>
   * @return The add.
   */
  @java.lang.Override
  public com.github.edarke.mongodb.driver.AddExpression getAdd() {
    if (valueCase_ == 1) {
       return (com.github.edarke.mongodb.driver.AddExpression) value_;
    }
    return com.github.edarke.mongodb.driver.AddExpression.getDefaultInstance();
  }
  /**
   * <code>.com.github.edarke.mongodb.AddExpression add = 1;</code>
   */
  @java.lang.Override
  public com.github.edarke.mongodb.driver.AddExpressionOrBuilder getAddOrBuilder() {
    if (valueCase_ == 1) {
       return (com.github.edarke.mongodb.driver.AddExpression) value_;
    }
    return com.github.edarke.mongodb.driver.AddExpression.getDefaultInstance();
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (valueCase_ == 1) {
      output.writeMessage(1, (com.github.edarke.mongodb.driver.AddExpression) value_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (valueCase_ == 1) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, (com.github.edarke.mongodb.driver.AddExpression) value_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.github.edarke.mongodb.driver.Expression)) {
      return super.equals(obj);
    }
    com.github.edarke.mongodb.driver.Expression other = (com.github.edarke.mongodb.driver.Expression) obj;

    if (!getValueCase().equals(other.getValueCase())) return false;
    switch (valueCase_) {
      case 1:
        if (!getAdd()
            .equals(other.getAdd())) return false;
        break;
      case 0:
      default:
    }
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    switch (valueCase_) {
      case 1:
        hash = (37 * hash) + ADD_FIELD_NUMBER;
        hash = (53 * hash) + getAdd().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.github.edarke.mongodb.driver.Expression parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.edarke.mongodb.driver.Expression parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.edarke.mongodb.driver.Expression parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.edarke.mongodb.driver.Expression parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.edarke.mongodb.driver.Expression parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.edarke.mongodb.driver.Expression parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.edarke.mongodb.driver.Expression parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.github.edarke.mongodb.driver.Expression parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.github.edarke.mongodb.driver.Expression parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.github.edarke.mongodb.driver.Expression parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.github.edarke.mongodb.driver.Expression parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.github.edarke.mongodb.driver.Expression parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.github.edarke.mongodb.driver.Expression prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code com.github.edarke.mongodb.Expression}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.github.edarke.mongodb.Expression)
      com.github.edarke.mongodb.driver.ExpressionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.github.edarke.mongodb.driver.Operator.internal_static_com_github_edarke_mongodb_Expression_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.github.edarke.mongodb.driver.Operator.internal_static_com_github_edarke_mongodb_Expression_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.github.edarke.mongodb.driver.Expression.class, com.github.edarke.mongodb.driver.Expression.Builder.class);
    }

    // Construct using com.github.edarke.mongodb.driver.Expression.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (addBuilder_ != null) {
        addBuilder_.clear();
      }
      valueCase_ = 0;
      value_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.github.edarke.mongodb.driver.Operator.internal_static_com_github_edarke_mongodb_Expression_descriptor;
    }

    @java.lang.Override
    public com.github.edarke.mongodb.driver.Expression getDefaultInstanceForType() {
      return com.github.edarke.mongodb.driver.Expression.getDefaultInstance();
    }

    @java.lang.Override
    public com.github.edarke.mongodb.driver.Expression build() {
      com.github.edarke.mongodb.driver.Expression result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.github.edarke.mongodb.driver.Expression buildPartial() {
      com.github.edarke.mongodb.driver.Expression result = new com.github.edarke.mongodb.driver.Expression(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(com.github.edarke.mongodb.driver.Expression result) {
      int from_bitField0_ = bitField0_;
    }

    private void buildPartialOneofs(com.github.edarke.mongodb.driver.Expression result) {
      result.valueCase_ = valueCase_;
      result.value_ = this.value_;
      if (valueCase_ == 1 &&
          addBuilder_ != null) {
        result.value_ = addBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.github.edarke.mongodb.driver.Expression) {
        return mergeFrom((com.github.edarke.mongodb.driver.Expression)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.github.edarke.mongodb.driver.Expression other) {
      if (other == com.github.edarke.mongodb.driver.Expression.getDefaultInstance()) return this;
      switch (other.getValueCase()) {
        case ADD: {
          mergeAdd(other.getAdd());
          break;
        }
        case VALUE_NOT_SET: {
          break;
        }
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              input.readMessage(
                  getAddFieldBuilder().getBuilder(),
                  extensionRegistry);
              valueCase_ = 1;
              break;
            } // case 10
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int valueCase_ = 0;
    private java.lang.Object value_;
    public ValueCase
        getValueCase() {
      return ValueCase.forNumber(
          valueCase_);
    }

    public Builder clearValue() {
      valueCase_ = 0;
      value_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    private com.google.protobuf.SingleFieldBuilderV3<
        com.github.edarke.mongodb.driver.AddExpression, com.github.edarke.mongodb.driver.AddExpression.Builder, com.github.edarke.mongodb.driver.AddExpressionOrBuilder> addBuilder_;
    /**
     * <code>.com.github.edarke.mongodb.AddExpression add = 1;</code>
     * @return Whether the add field is set.
     */
    @java.lang.Override
    public boolean hasAdd() {
      return valueCase_ == 1;
    }
    /**
     * <code>.com.github.edarke.mongodb.AddExpression add = 1;</code>
     * @return The add.
     */
    @java.lang.Override
    public com.github.edarke.mongodb.driver.AddExpression getAdd() {
      if (addBuilder_ == null) {
        if (valueCase_ == 1) {
          return (com.github.edarke.mongodb.driver.AddExpression) value_;
        }
        return com.github.edarke.mongodb.driver.AddExpression.getDefaultInstance();
      } else {
        if (valueCase_ == 1) {
          return addBuilder_.getMessage();
        }
        return com.github.edarke.mongodb.driver.AddExpression.getDefaultInstance();
      }
    }
    /**
     * <code>.com.github.edarke.mongodb.AddExpression add = 1;</code>
     */
    public Builder setAdd(com.github.edarke.mongodb.driver.AddExpression value) {
      if (addBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        value_ = value;
        onChanged();
      } else {
        addBuilder_.setMessage(value);
      }
      valueCase_ = 1;
      return this;
    }
    /**
     * <code>.com.github.edarke.mongodb.AddExpression add = 1;</code>
     */
    public Builder setAdd(
        com.github.edarke.mongodb.driver.AddExpression.Builder builderForValue) {
      if (addBuilder_ == null) {
        value_ = builderForValue.build();
        onChanged();
      } else {
        addBuilder_.setMessage(builderForValue.build());
      }
      valueCase_ = 1;
      return this;
    }
    /**
     * <code>.com.github.edarke.mongodb.AddExpression add = 1;</code>
     */
    public Builder mergeAdd(com.github.edarke.mongodb.driver.AddExpression value) {
      if (addBuilder_ == null) {
        if (valueCase_ == 1 &&
            value_ != com.github.edarke.mongodb.driver.AddExpression.getDefaultInstance()) {
          value_ = com.github.edarke.mongodb.driver.AddExpression.newBuilder((com.github.edarke.mongodb.driver.AddExpression) value_)
              .mergeFrom(value).buildPartial();
        } else {
          value_ = value;
        }
        onChanged();
      } else {
        if (valueCase_ == 1) {
          addBuilder_.mergeFrom(value);
        } else {
          addBuilder_.setMessage(value);
        }
      }
      valueCase_ = 1;
      return this;
    }
    /**
     * <code>.com.github.edarke.mongodb.AddExpression add = 1;</code>
     */
    public Builder clearAdd() {
      if (addBuilder_ == null) {
        if (valueCase_ == 1) {
          valueCase_ = 0;
          value_ = null;
          onChanged();
        }
      } else {
        if (valueCase_ == 1) {
          valueCase_ = 0;
          value_ = null;
        }
        addBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>.com.github.edarke.mongodb.AddExpression add = 1;</code>
     */
    public com.github.edarke.mongodb.driver.AddExpression.Builder getAddBuilder() {
      return getAddFieldBuilder().getBuilder();
    }
    /**
     * <code>.com.github.edarke.mongodb.AddExpression add = 1;</code>
     */
    @java.lang.Override
    public com.github.edarke.mongodb.driver.AddExpressionOrBuilder getAddOrBuilder() {
      if ((valueCase_ == 1) && (addBuilder_ != null)) {
        return addBuilder_.getMessageOrBuilder();
      } else {
        if (valueCase_ == 1) {
          return (com.github.edarke.mongodb.driver.AddExpression) value_;
        }
        return com.github.edarke.mongodb.driver.AddExpression.getDefaultInstance();
      }
    }
    /**
     * <code>.com.github.edarke.mongodb.AddExpression add = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.github.edarke.mongodb.driver.AddExpression, com.github.edarke.mongodb.driver.AddExpression.Builder, com.github.edarke.mongodb.driver.AddExpressionOrBuilder> 
        getAddFieldBuilder() {
      if (addBuilder_ == null) {
        if (!(valueCase_ == 1)) {
          value_ = com.github.edarke.mongodb.driver.AddExpression.getDefaultInstance();
        }
        addBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.github.edarke.mongodb.driver.AddExpression, com.github.edarke.mongodb.driver.AddExpression.Builder, com.github.edarke.mongodb.driver.AddExpressionOrBuilder>(
                (com.github.edarke.mongodb.driver.AddExpression) value_,
                getParentForChildren(),
                isClean());
        value_ = null;
      }
      valueCase_ = 1;
      onChanged();
      return addBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:com.github.edarke.mongodb.Expression)
  }

  // @@protoc_insertion_point(class_scope:com.github.edarke.mongodb.Expression)
  private static final com.github.edarke.mongodb.driver.Expression DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.github.edarke.mongodb.driver.Expression();
  }

  public static com.github.edarke.mongodb.driver.Expression getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<Expression>
      PARSER = new com.google.protobuf.AbstractParser<Expression>() {
    @java.lang.Override
    public Expression parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<Expression> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Expression> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.github.edarke.mongodb.driver.Expression getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

