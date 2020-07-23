// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v1/errors/function_error.proto

package com.google.ads.googleads.v1.errors;

/**
 * <pre>
 * Container for enum describing possible function errors.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v1.errors.FunctionErrorEnum}
 */
public final class FunctionErrorEnum extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v1.errors.FunctionErrorEnum)
    FunctionErrorEnumOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FunctionErrorEnum.newBuilder() to construct.
  private FunctionErrorEnum(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FunctionErrorEnum() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new FunctionErrorEnum();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private FunctionErrorEnum(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v1.errors.FunctionErrorProto.internal_static_google_ads_googleads_v1_errors_FunctionErrorEnum_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v1.errors.FunctionErrorProto.internal_static_google_ads_googleads_v1_errors_FunctionErrorEnum_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v1.errors.FunctionErrorEnum.class, com.google.ads.googleads.v1.errors.FunctionErrorEnum.Builder.class);
  }

  /**
   * <pre>
   * Enum describing possible function errors.
   * </pre>
   *
   * Protobuf enum {@code google.ads.googleads.v1.errors.FunctionErrorEnum.FunctionError}
   */
  public enum FunctionError
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * Enum unspecified.
     * </pre>
     *
     * <code>UNSPECIFIED = 0;</code>
     */
    UNSPECIFIED(0),
    /**
     * <pre>
     * The received error code is not known in this version.
     * </pre>
     *
     * <code>UNKNOWN = 1;</code>
     */
    UNKNOWN(1),
    /**
     * <pre>
     * The format of the function is not recognized as a supported function
     * format.
     * </pre>
     *
     * <code>INVALID_FUNCTION_FORMAT = 2;</code>
     */
    INVALID_FUNCTION_FORMAT(2),
    /**
     * <pre>
     * Operand data types do not match.
     * </pre>
     *
     * <code>DATA_TYPE_MISMATCH = 3;</code>
     */
    DATA_TYPE_MISMATCH(3),
    /**
     * <pre>
     * The operands cannot be used together in a conjunction.
     * </pre>
     *
     * <code>INVALID_CONJUNCTION_OPERANDS = 4;</code>
     */
    INVALID_CONJUNCTION_OPERANDS(4),
    /**
     * <pre>
     * Invalid numer of Operands.
     * </pre>
     *
     * <code>INVALID_NUMBER_OF_OPERANDS = 5;</code>
     */
    INVALID_NUMBER_OF_OPERANDS(5),
    /**
     * <pre>
     * Operand Type not supported.
     * </pre>
     *
     * <code>INVALID_OPERAND_TYPE = 6;</code>
     */
    INVALID_OPERAND_TYPE(6),
    /**
     * <pre>
     * Operator not supported.
     * </pre>
     *
     * <code>INVALID_OPERATOR = 7;</code>
     */
    INVALID_OPERATOR(7),
    /**
     * <pre>
     * Request context type not supported.
     * </pre>
     *
     * <code>INVALID_REQUEST_CONTEXT_TYPE = 8;</code>
     */
    INVALID_REQUEST_CONTEXT_TYPE(8),
    /**
     * <pre>
     * The matching function is not allowed for call placeholders
     * </pre>
     *
     * <code>INVALID_FUNCTION_FOR_CALL_PLACEHOLDER = 9;</code>
     */
    INVALID_FUNCTION_FOR_CALL_PLACEHOLDER(9),
    /**
     * <pre>
     * The matching function is not allowed for the specified placeholder
     * </pre>
     *
     * <code>INVALID_FUNCTION_FOR_PLACEHOLDER = 10;</code>
     */
    INVALID_FUNCTION_FOR_PLACEHOLDER(10),
    /**
     * <pre>
     * Invalid operand.
     * </pre>
     *
     * <code>INVALID_OPERAND = 11;</code>
     */
    INVALID_OPERAND(11),
    /**
     * <pre>
     * Missing value for the constant operand.
     * </pre>
     *
     * <code>MISSING_CONSTANT_OPERAND_VALUE = 12;</code>
     */
    MISSING_CONSTANT_OPERAND_VALUE(12),
    /**
     * <pre>
     * The value of the constant operand is invalid.
     * </pre>
     *
     * <code>INVALID_CONSTANT_OPERAND_VALUE = 13;</code>
     */
    INVALID_CONSTANT_OPERAND_VALUE(13),
    /**
     * <pre>
     * Invalid function nesting.
     * </pre>
     *
     * <code>INVALID_NESTING = 14;</code>
     */
    INVALID_NESTING(14),
    /**
     * <pre>
     * The Feed ID was different from another Feed ID in the same function.
     * </pre>
     *
     * <code>MULTIPLE_FEED_IDS_NOT_SUPPORTED = 15;</code>
     */
    MULTIPLE_FEED_IDS_NOT_SUPPORTED(15),
    /**
     * <pre>
     * The matching function is invalid for use with a feed with a fixed schema.
     * </pre>
     *
     * <code>INVALID_FUNCTION_FOR_FEED_WITH_FIXED_SCHEMA = 16;</code>
     */
    INVALID_FUNCTION_FOR_FEED_WITH_FIXED_SCHEMA(16),
    /**
     * <pre>
     * Invalid attribute name.
     * </pre>
     *
     * <code>INVALID_ATTRIBUTE_NAME = 17;</code>
     */
    INVALID_ATTRIBUTE_NAME(17),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * Enum unspecified.
     * </pre>
     *
     * <code>UNSPECIFIED = 0;</code>
     */
    public static final int UNSPECIFIED_VALUE = 0;
    /**
     * <pre>
     * The received error code is not known in this version.
     * </pre>
     *
     * <code>UNKNOWN = 1;</code>
     */
    public static final int UNKNOWN_VALUE = 1;
    /**
     * <pre>
     * The format of the function is not recognized as a supported function
     * format.
     * </pre>
     *
     * <code>INVALID_FUNCTION_FORMAT = 2;</code>
     */
    public static final int INVALID_FUNCTION_FORMAT_VALUE = 2;
    /**
     * <pre>
     * Operand data types do not match.
     * </pre>
     *
     * <code>DATA_TYPE_MISMATCH = 3;</code>
     */
    public static final int DATA_TYPE_MISMATCH_VALUE = 3;
    /**
     * <pre>
     * The operands cannot be used together in a conjunction.
     * </pre>
     *
     * <code>INVALID_CONJUNCTION_OPERANDS = 4;</code>
     */
    public static final int INVALID_CONJUNCTION_OPERANDS_VALUE = 4;
    /**
     * <pre>
     * Invalid numer of Operands.
     * </pre>
     *
     * <code>INVALID_NUMBER_OF_OPERANDS = 5;</code>
     */
    public static final int INVALID_NUMBER_OF_OPERANDS_VALUE = 5;
    /**
     * <pre>
     * Operand Type not supported.
     * </pre>
     *
     * <code>INVALID_OPERAND_TYPE = 6;</code>
     */
    public static final int INVALID_OPERAND_TYPE_VALUE = 6;
    /**
     * <pre>
     * Operator not supported.
     * </pre>
     *
     * <code>INVALID_OPERATOR = 7;</code>
     */
    public static final int INVALID_OPERATOR_VALUE = 7;
    /**
     * <pre>
     * Request context type not supported.
     * </pre>
     *
     * <code>INVALID_REQUEST_CONTEXT_TYPE = 8;</code>
     */
    public static final int INVALID_REQUEST_CONTEXT_TYPE_VALUE = 8;
    /**
     * <pre>
     * The matching function is not allowed for call placeholders
     * </pre>
     *
     * <code>INVALID_FUNCTION_FOR_CALL_PLACEHOLDER = 9;</code>
     */
    public static final int INVALID_FUNCTION_FOR_CALL_PLACEHOLDER_VALUE = 9;
    /**
     * <pre>
     * The matching function is not allowed for the specified placeholder
     * </pre>
     *
     * <code>INVALID_FUNCTION_FOR_PLACEHOLDER = 10;</code>
     */
    public static final int INVALID_FUNCTION_FOR_PLACEHOLDER_VALUE = 10;
    /**
     * <pre>
     * Invalid operand.
     * </pre>
     *
     * <code>INVALID_OPERAND = 11;</code>
     */
    public static final int INVALID_OPERAND_VALUE = 11;
    /**
     * <pre>
     * Missing value for the constant operand.
     * </pre>
     *
     * <code>MISSING_CONSTANT_OPERAND_VALUE = 12;</code>
     */
    public static final int MISSING_CONSTANT_OPERAND_VALUE_VALUE = 12;
    /**
     * <pre>
     * The value of the constant operand is invalid.
     * </pre>
     *
     * <code>INVALID_CONSTANT_OPERAND_VALUE = 13;</code>
     */
    public static final int INVALID_CONSTANT_OPERAND_VALUE_VALUE = 13;
    /**
     * <pre>
     * Invalid function nesting.
     * </pre>
     *
     * <code>INVALID_NESTING = 14;</code>
     */
    public static final int INVALID_NESTING_VALUE = 14;
    /**
     * <pre>
     * The Feed ID was different from another Feed ID in the same function.
     * </pre>
     *
     * <code>MULTIPLE_FEED_IDS_NOT_SUPPORTED = 15;</code>
     */
    public static final int MULTIPLE_FEED_IDS_NOT_SUPPORTED_VALUE = 15;
    /**
     * <pre>
     * The matching function is invalid for use with a feed with a fixed schema.
     * </pre>
     *
     * <code>INVALID_FUNCTION_FOR_FEED_WITH_FIXED_SCHEMA = 16;</code>
     */
    public static final int INVALID_FUNCTION_FOR_FEED_WITH_FIXED_SCHEMA_VALUE = 16;
    /**
     * <pre>
     * Invalid attribute name.
     * </pre>
     *
     * <code>INVALID_ATTRIBUTE_NAME = 17;</code>
     */
    public static final int INVALID_ATTRIBUTE_NAME_VALUE = 17;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static FunctionError valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static FunctionError forNumber(int value) {
      switch (value) {
        case 0: return UNSPECIFIED;
        case 1: return UNKNOWN;
        case 2: return INVALID_FUNCTION_FORMAT;
        case 3: return DATA_TYPE_MISMATCH;
        case 4: return INVALID_CONJUNCTION_OPERANDS;
        case 5: return INVALID_NUMBER_OF_OPERANDS;
        case 6: return INVALID_OPERAND_TYPE;
        case 7: return INVALID_OPERATOR;
        case 8: return INVALID_REQUEST_CONTEXT_TYPE;
        case 9: return INVALID_FUNCTION_FOR_CALL_PLACEHOLDER;
        case 10: return INVALID_FUNCTION_FOR_PLACEHOLDER;
        case 11: return INVALID_OPERAND;
        case 12: return MISSING_CONSTANT_OPERAND_VALUE;
        case 13: return INVALID_CONSTANT_OPERAND_VALUE;
        case 14: return INVALID_NESTING;
        case 15: return MULTIPLE_FEED_IDS_NOT_SUPPORTED;
        case 16: return INVALID_FUNCTION_FOR_FEED_WITH_FIXED_SCHEMA;
        case 17: return INVALID_ATTRIBUTE_NAME;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<FunctionError>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        FunctionError> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<FunctionError>() {
            public FunctionError findValueByNumber(int number) {
              return FunctionError.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.google.ads.googleads.v1.errors.FunctionErrorEnum.getDescriptor().getEnumTypes().get(0);
    }

    private static final FunctionError[] VALUES = values();

    public static FunctionError valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private FunctionError(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.ads.googleads.v1.errors.FunctionErrorEnum.FunctionError)
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
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.ads.googleads.v1.errors.FunctionErrorEnum)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v1.errors.FunctionErrorEnum other = (com.google.ads.googleads.v1.errors.FunctionErrorEnum) obj;

    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v1.errors.FunctionErrorEnum parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v1.errors.FunctionErrorEnum parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.errors.FunctionErrorEnum parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v1.errors.FunctionErrorEnum parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.errors.FunctionErrorEnum parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v1.errors.FunctionErrorEnum parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.errors.FunctionErrorEnum parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v1.errors.FunctionErrorEnum parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.errors.FunctionErrorEnum parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v1.errors.FunctionErrorEnum parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.errors.FunctionErrorEnum parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v1.errors.FunctionErrorEnum parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v1.errors.FunctionErrorEnum prototype) {
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
   * <pre>
   * Container for enum describing possible function errors.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v1.errors.FunctionErrorEnum}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v1.errors.FunctionErrorEnum)
      com.google.ads.googleads.v1.errors.FunctionErrorEnumOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v1.errors.FunctionErrorProto.internal_static_google_ads_googleads_v1_errors_FunctionErrorEnum_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v1.errors.FunctionErrorProto.internal_static_google_ads_googleads_v1_errors_FunctionErrorEnum_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v1.errors.FunctionErrorEnum.class, com.google.ads.googleads.v1.errors.FunctionErrorEnum.Builder.class);
    }

    // Construct using com.google.ads.googleads.v1.errors.FunctionErrorEnum.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v1.errors.FunctionErrorProto.internal_static_google_ads_googleads_v1_errors_FunctionErrorEnum_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v1.errors.FunctionErrorEnum getDefaultInstanceForType() {
      return com.google.ads.googleads.v1.errors.FunctionErrorEnum.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v1.errors.FunctionErrorEnum build() {
      com.google.ads.googleads.v1.errors.FunctionErrorEnum result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v1.errors.FunctionErrorEnum buildPartial() {
      com.google.ads.googleads.v1.errors.FunctionErrorEnum result = new com.google.ads.googleads.v1.errors.FunctionErrorEnum(this);
      onBuilt();
      return result;
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
      if (other instanceof com.google.ads.googleads.v1.errors.FunctionErrorEnum) {
        return mergeFrom((com.google.ads.googleads.v1.errors.FunctionErrorEnum)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v1.errors.FunctionErrorEnum other) {
      if (other == com.google.ads.googleads.v1.errors.FunctionErrorEnum.getDefaultInstance()) return this;
      this.mergeUnknownFields(other.unknownFields);
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
      com.google.ads.googleads.v1.errors.FunctionErrorEnum parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v1.errors.FunctionErrorEnum) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v1.errors.FunctionErrorEnum)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v1.errors.FunctionErrorEnum)
  private static final com.google.ads.googleads.v1.errors.FunctionErrorEnum DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v1.errors.FunctionErrorEnum();
  }

  public static com.google.ads.googleads.v1.errors.FunctionErrorEnum getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FunctionErrorEnum>
      PARSER = new com.google.protobuf.AbstractParser<FunctionErrorEnum>() {
    @java.lang.Override
    public FunctionErrorEnum parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new FunctionErrorEnum(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<FunctionErrorEnum> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FunctionErrorEnum> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v1.errors.FunctionErrorEnum getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

