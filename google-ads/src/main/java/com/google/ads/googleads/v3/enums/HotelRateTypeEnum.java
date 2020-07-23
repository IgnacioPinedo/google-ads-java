// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v3/enums/hotel_rate_type.proto

package com.google.ads.googleads.v3.enums;

/**
 * <pre>
 * Container for enum describing possible hotel rate types.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v3.enums.HotelRateTypeEnum}
 */
public final class HotelRateTypeEnum extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v3.enums.HotelRateTypeEnum)
    HotelRateTypeEnumOrBuilder {
private static final long serialVersionUID = 0L;
  // Use HotelRateTypeEnum.newBuilder() to construct.
  private HotelRateTypeEnum(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private HotelRateTypeEnum() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new HotelRateTypeEnum();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private HotelRateTypeEnum(
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
    return com.google.ads.googleads.v3.enums.HotelRateTypeProto.internal_static_google_ads_googleads_v3_enums_HotelRateTypeEnum_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v3.enums.HotelRateTypeProto.internal_static_google_ads_googleads_v3_enums_HotelRateTypeEnum_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v3.enums.HotelRateTypeEnum.class, com.google.ads.googleads.v3.enums.HotelRateTypeEnum.Builder.class);
  }

  /**
   * <pre>
   * Enum describing possible hotel rate types.
   * </pre>
   *
   * Protobuf enum {@code google.ads.googleads.v3.enums.HotelRateTypeEnum.HotelRateType}
   */
  public enum HotelRateType
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
     * The value is unknown in this version.
     * </pre>
     *
     * <code>UNKNOWN = 1;</code>
     */
    UNKNOWN(1),
    /**
     * <pre>
     * Rate type information is unavailable.
     * </pre>
     *
     * <code>UNAVAILABLE = 2;</code>
     */
    UNAVAILABLE(2),
    /**
     * <pre>
     * Rates available to everyone.
     * </pre>
     *
     * <code>PUBLIC_RATE = 3;</code>
     */
    PUBLIC_RATE(3),
    /**
     * <pre>
     * A membership program rate is available and satisfies basic requirements
     * like having a public rate available. UI treatment will strikethrough the
     * public rate and indicate that a discount is available to the user. For
     * more on Qualified Rates, visit
     * https://developers.google.com/hotels/hotel-ads/dev-guide/qualified-rates
     * </pre>
     *
     * <code>QUALIFIED_RATE = 4;</code>
     */
    QUALIFIED_RATE(4),
    /**
     * <pre>
     * Rates available to users that satisfy some eligibility criteria. e.g.
     * all signed-in users, 20% of mobile users, all mobile users in Canada,
     * etc.
     * </pre>
     *
     * <code>PRIVATE_RATE = 5;</code>
     */
    PRIVATE_RATE(5),
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
     * The value is unknown in this version.
     * </pre>
     *
     * <code>UNKNOWN = 1;</code>
     */
    public static final int UNKNOWN_VALUE = 1;
    /**
     * <pre>
     * Rate type information is unavailable.
     * </pre>
     *
     * <code>UNAVAILABLE = 2;</code>
     */
    public static final int UNAVAILABLE_VALUE = 2;
    /**
     * <pre>
     * Rates available to everyone.
     * </pre>
     *
     * <code>PUBLIC_RATE = 3;</code>
     */
    public static final int PUBLIC_RATE_VALUE = 3;
    /**
     * <pre>
     * A membership program rate is available and satisfies basic requirements
     * like having a public rate available. UI treatment will strikethrough the
     * public rate and indicate that a discount is available to the user. For
     * more on Qualified Rates, visit
     * https://developers.google.com/hotels/hotel-ads/dev-guide/qualified-rates
     * </pre>
     *
     * <code>QUALIFIED_RATE = 4;</code>
     */
    public static final int QUALIFIED_RATE_VALUE = 4;
    /**
     * <pre>
     * Rates available to users that satisfy some eligibility criteria. e.g.
     * all signed-in users, 20% of mobile users, all mobile users in Canada,
     * etc.
     * </pre>
     *
     * <code>PRIVATE_RATE = 5;</code>
     */
    public static final int PRIVATE_RATE_VALUE = 5;


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
    public static HotelRateType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static HotelRateType forNumber(int value) {
      switch (value) {
        case 0: return UNSPECIFIED;
        case 1: return UNKNOWN;
        case 2: return UNAVAILABLE;
        case 3: return PUBLIC_RATE;
        case 4: return QUALIFIED_RATE;
        case 5: return PRIVATE_RATE;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<HotelRateType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        HotelRateType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<HotelRateType>() {
            public HotelRateType findValueByNumber(int number) {
              return HotelRateType.forNumber(number);
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
      return com.google.ads.googleads.v3.enums.HotelRateTypeEnum.getDescriptor().getEnumTypes().get(0);
    }

    private static final HotelRateType[] VALUES = values();

    public static HotelRateType valueOf(
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

    private HotelRateType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.ads.googleads.v3.enums.HotelRateTypeEnum.HotelRateType)
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
    if (!(obj instanceof com.google.ads.googleads.v3.enums.HotelRateTypeEnum)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v3.enums.HotelRateTypeEnum other = (com.google.ads.googleads.v3.enums.HotelRateTypeEnum) obj;

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

  public static com.google.ads.googleads.v3.enums.HotelRateTypeEnum parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v3.enums.HotelRateTypeEnum parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v3.enums.HotelRateTypeEnum parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v3.enums.HotelRateTypeEnum parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v3.enums.HotelRateTypeEnum parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v3.enums.HotelRateTypeEnum parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v3.enums.HotelRateTypeEnum parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v3.enums.HotelRateTypeEnum parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v3.enums.HotelRateTypeEnum parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v3.enums.HotelRateTypeEnum parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v3.enums.HotelRateTypeEnum parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v3.enums.HotelRateTypeEnum parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v3.enums.HotelRateTypeEnum prototype) {
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
   * Container for enum describing possible hotel rate types.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v3.enums.HotelRateTypeEnum}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v3.enums.HotelRateTypeEnum)
      com.google.ads.googleads.v3.enums.HotelRateTypeEnumOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v3.enums.HotelRateTypeProto.internal_static_google_ads_googleads_v3_enums_HotelRateTypeEnum_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v3.enums.HotelRateTypeProto.internal_static_google_ads_googleads_v3_enums_HotelRateTypeEnum_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v3.enums.HotelRateTypeEnum.class, com.google.ads.googleads.v3.enums.HotelRateTypeEnum.Builder.class);
    }

    // Construct using com.google.ads.googleads.v3.enums.HotelRateTypeEnum.newBuilder()
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
      return com.google.ads.googleads.v3.enums.HotelRateTypeProto.internal_static_google_ads_googleads_v3_enums_HotelRateTypeEnum_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v3.enums.HotelRateTypeEnum getDefaultInstanceForType() {
      return com.google.ads.googleads.v3.enums.HotelRateTypeEnum.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v3.enums.HotelRateTypeEnum build() {
      com.google.ads.googleads.v3.enums.HotelRateTypeEnum result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v3.enums.HotelRateTypeEnum buildPartial() {
      com.google.ads.googleads.v3.enums.HotelRateTypeEnum result = new com.google.ads.googleads.v3.enums.HotelRateTypeEnum(this);
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
      if (other instanceof com.google.ads.googleads.v3.enums.HotelRateTypeEnum) {
        return mergeFrom((com.google.ads.googleads.v3.enums.HotelRateTypeEnum)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v3.enums.HotelRateTypeEnum other) {
      if (other == com.google.ads.googleads.v3.enums.HotelRateTypeEnum.getDefaultInstance()) return this;
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
      com.google.ads.googleads.v3.enums.HotelRateTypeEnum parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v3.enums.HotelRateTypeEnum) e.getUnfinishedMessage();
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v3.enums.HotelRateTypeEnum)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v3.enums.HotelRateTypeEnum)
  private static final com.google.ads.googleads.v3.enums.HotelRateTypeEnum DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v3.enums.HotelRateTypeEnum();
  }

  public static com.google.ads.googleads.v3.enums.HotelRateTypeEnum getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<HotelRateTypeEnum>
      PARSER = new com.google.protobuf.AbstractParser<HotelRateTypeEnum>() {
    @java.lang.Override
    public HotelRateTypeEnum parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new HotelRateTypeEnum(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<HotelRateTypeEnum> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<HotelRateTypeEnum> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v3.enums.HotelRateTypeEnum getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

