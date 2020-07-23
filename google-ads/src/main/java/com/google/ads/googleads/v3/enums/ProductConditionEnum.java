// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v3/enums/product_condition.proto

package com.google.ads.googleads.v3.enums;

/**
 * <pre>
 * Condition of a product offer.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v3.enums.ProductConditionEnum}
 */
public final class ProductConditionEnum extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v3.enums.ProductConditionEnum)
    ProductConditionEnumOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ProductConditionEnum.newBuilder() to construct.
  private ProductConditionEnum(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ProductConditionEnum() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ProductConditionEnum();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ProductConditionEnum(
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
    return com.google.ads.googleads.v3.enums.ProductConditionProto.internal_static_google_ads_googleads_v3_enums_ProductConditionEnum_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v3.enums.ProductConditionProto.internal_static_google_ads_googleads_v3_enums_ProductConditionEnum_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v3.enums.ProductConditionEnum.class, com.google.ads.googleads.v3.enums.ProductConditionEnum.Builder.class);
  }

  /**
   * <pre>
   * Enum describing the condition of a product offer.
   * </pre>
   *
   * Protobuf enum {@code google.ads.googleads.v3.enums.ProductConditionEnum.ProductCondition}
   */
  public enum ProductCondition
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * Not specified.
     * </pre>
     *
     * <code>UNSPECIFIED = 0;</code>
     */
    UNSPECIFIED(0),
    /**
     * <pre>
     * Used for return value only. Represents value unknown in this version.
     * </pre>
     *
     * <code>UNKNOWN = 1;</code>
     */
    UNKNOWN(1),
    /**
     * <pre>
     * The product condition is new.
     * </pre>
     *
     * <code>NEW = 3;</code>
     */
    NEW(3),
    /**
     * <pre>
     * The product condition is refurbished.
     * </pre>
     *
     * <code>REFURBISHED = 4;</code>
     */
    REFURBISHED(4),
    /**
     * <pre>
     * The product condition is used.
     * </pre>
     *
     * <code>USED = 5;</code>
     */
    USED(5),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * Not specified.
     * </pre>
     *
     * <code>UNSPECIFIED = 0;</code>
     */
    public static final int UNSPECIFIED_VALUE = 0;
    /**
     * <pre>
     * Used for return value only. Represents value unknown in this version.
     * </pre>
     *
     * <code>UNKNOWN = 1;</code>
     */
    public static final int UNKNOWN_VALUE = 1;
    /**
     * <pre>
     * The product condition is new.
     * </pre>
     *
     * <code>NEW = 3;</code>
     */
    public static final int NEW_VALUE = 3;
    /**
     * <pre>
     * The product condition is refurbished.
     * </pre>
     *
     * <code>REFURBISHED = 4;</code>
     */
    public static final int REFURBISHED_VALUE = 4;
    /**
     * <pre>
     * The product condition is used.
     * </pre>
     *
     * <code>USED = 5;</code>
     */
    public static final int USED_VALUE = 5;


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
    public static ProductCondition valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static ProductCondition forNumber(int value) {
      switch (value) {
        case 0: return UNSPECIFIED;
        case 1: return UNKNOWN;
        case 3: return NEW;
        case 4: return REFURBISHED;
        case 5: return USED;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<ProductCondition>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        ProductCondition> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<ProductCondition>() {
            public ProductCondition findValueByNumber(int number) {
              return ProductCondition.forNumber(number);
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
      return com.google.ads.googleads.v3.enums.ProductConditionEnum.getDescriptor().getEnumTypes().get(0);
    }

    private static final ProductCondition[] VALUES = values();

    public static ProductCondition valueOf(
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

    private ProductCondition(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.ads.googleads.v3.enums.ProductConditionEnum.ProductCondition)
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
    if (!(obj instanceof com.google.ads.googleads.v3.enums.ProductConditionEnum)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v3.enums.ProductConditionEnum other = (com.google.ads.googleads.v3.enums.ProductConditionEnum) obj;

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

  public static com.google.ads.googleads.v3.enums.ProductConditionEnum parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v3.enums.ProductConditionEnum parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v3.enums.ProductConditionEnum parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v3.enums.ProductConditionEnum parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v3.enums.ProductConditionEnum parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v3.enums.ProductConditionEnum parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v3.enums.ProductConditionEnum parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v3.enums.ProductConditionEnum parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v3.enums.ProductConditionEnum parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v3.enums.ProductConditionEnum parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v3.enums.ProductConditionEnum parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v3.enums.ProductConditionEnum parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v3.enums.ProductConditionEnum prototype) {
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
   * Condition of a product offer.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v3.enums.ProductConditionEnum}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v3.enums.ProductConditionEnum)
      com.google.ads.googleads.v3.enums.ProductConditionEnumOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v3.enums.ProductConditionProto.internal_static_google_ads_googleads_v3_enums_ProductConditionEnum_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v3.enums.ProductConditionProto.internal_static_google_ads_googleads_v3_enums_ProductConditionEnum_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v3.enums.ProductConditionEnum.class, com.google.ads.googleads.v3.enums.ProductConditionEnum.Builder.class);
    }

    // Construct using com.google.ads.googleads.v3.enums.ProductConditionEnum.newBuilder()
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
      return com.google.ads.googleads.v3.enums.ProductConditionProto.internal_static_google_ads_googleads_v3_enums_ProductConditionEnum_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v3.enums.ProductConditionEnum getDefaultInstanceForType() {
      return com.google.ads.googleads.v3.enums.ProductConditionEnum.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v3.enums.ProductConditionEnum build() {
      com.google.ads.googleads.v3.enums.ProductConditionEnum result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v3.enums.ProductConditionEnum buildPartial() {
      com.google.ads.googleads.v3.enums.ProductConditionEnum result = new com.google.ads.googleads.v3.enums.ProductConditionEnum(this);
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
      if (other instanceof com.google.ads.googleads.v3.enums.ProductConditionEnum) {
        return mergeFrom((com.google.ads.googleads.v3.enums.ProductConditionEnum)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v3.enums.ProductConditionEnum other) {
      if (other == com.google.ads.googleads.v3.enums.ProductConditionEnum.getDefaultInstance()) return this;
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
      com.google.ads.googleads.v3.enums.ProductConditionEnum parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v3.enums.ProductConditionEnum) e.getUnfinishedMessage();
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v3.enums.ProductConditionEnum)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v3.enums.ProductConditionEnum)
  private static final com.google.ads.googleads.v3.enums.ProductConditionEnum DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v3.enums.ProductConditionEnum();
  }

  public static com.google.ads.googleads.v3.enums.ProductConditionEnum getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ProductConditionEnum>
      PARSER = new com.google.protobuf.AbstractParser<ProductConditionEnum>() {
    @java.lang.Override
    public ProductConditionEnum parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ProductConditionEnum(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ProductConditionEnum> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ProductConditionEnum> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v3.enums.ProductConditionEnum getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

