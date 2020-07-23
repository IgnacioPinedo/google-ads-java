// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v3/errors/ad_group_feed_error.proto

package com.google.ads.googleads.v3.errors;

/**
 * <pre>
 * Container for enum describing possible ad group feed errors.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v3.errors.AdGroupFeedErrorEnum}
 */
public final class AdGroupFeedErrorEnum extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v3.errors.AdGroupFeedErrorEnum)
    AdGroupFeedErrorEnumOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AdGroupFeedErrorEnum.newBuilder() to construct.
  private AdGroupFeedErrorEnum(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AdGroupFeedErrorEnum() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AdGroupFeedErrorEnum();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AdGroupFeedErrorEnum(
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
    return com.google.ads.googleads.v3.errors.AdGroupFeedErrorProto.internal_static_google_ads_googleads_v3_errors_AdGroupFeedErrorEnum_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v3.errors.AdGroupFeedErrorProto.internal_static_google_ads_googleads_v3_errors_AdGroupFeedErrorEnum_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v3.errors.AdGroupFeedErrorEnum.class, com.google.ads.googleads.v3.errors.AdGroupFeedErrorEnum.Builder.class);
  }

  /**
   * <pre>
   * Enum describing possible ad group feed errors.
   * </pre>
   *
   * Protobuf enum {@code google.ads.googleads.v3.errors.AdGroupFeedErrorEnum.AdGroupFeedError}
   */
  public enum AdGroupFeedError
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
     * An active feed already exists for this ad group and place holder type.
     * </pre>
     *
     * <code>FEED_ALREADY_EXISTS_FOR_PLACEHOLDER_TYPE = 2;</code>
     */
    FEED_ALREADY_EXISTS_FOR_PLACEHOLDER_TYPE(2),
    /**
     * <pre>
     * The specified feed is removed.
     * </pre>
     *
     * <code>CANNOT_CREATE_FOR_REMOVED_FEED = 3;</code>
     */
    CANNOT_CREATE_FOR_REMOVED_FEED(3),
    /**
     * <pre>
     * The AdGroupFeed already exists. UPDATE operation should be used to modify
     * the existing AdGroupFeed.
     * </pre>
     *
     * <code>ADGROUP_FEED_ALREADY_EXISTS = 4;</code>
     */
    ADGROUP_FEED_ALREADY_EXISTS(4),
    /**
     * <pre>
     * Cannot operate on removed AdGroupFeed.
     * </pre>
     *
     * <code>CANNOT_OPERATE_ON_REMOVED_ADGROUP_FEED = 5;</code>
     */
    CANNOT_OPERATE_ON_REMOVED_ADGROUP_FEED(5),
    /**
     * <pre>
     * Invalid placeholder type.
     * </pre>
     *
     * <code>INVALID_PLACEHOLDER_TYPE = 6;</code>
     */
    INVALID_PLACEHOLDER_TYPE(6),
    /**
     * <pre>
     * Feed mapping for this placeholder type does not exist.
     * </pre>
     *
     * <code>MISSING_FEEDMAPPING_FOR_PLACEHOLDER_TYPE = 7;</code>
     */
    MISSING_FEEDMAPPING_FOR_PLACEHOLDER_TYPE(7),
    /**
     * <pre>
     * Location AdGroupFeeds cannot be created unless there is a location
     * CustomerFeed for the specified feed.
     * </pre>
     *
     * <code>NO_EXISTING_LOCATION_CUSTOMER_FEED = 8;</code>
     */
    NO_EXISTING_LOCATION_CUSTOMER_FEED(8),
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
     * An active feed already exists for this ad group and place holder type.
     * </pre>
     *
     * <code>FEED_ALREADY_EXISTS_FOR_PLACEHOLDER_TYPE = 2;</code>
     */
    public static final int FEED_ALREADY_EXISTS_FOR_PLACEHOLDER_TYPE_VALUE = 2;
    /**
     * <pre>
     * The specified feed is removed.
     * </pre>
     *
     * <code>CANNOT_CREATE_FOR_REMOVED_FEED = 3;</code>
     */
    public static final int CANNOT_CREATE_FOR_REMOVED_FEED_VALUE = 3;
    /**
     * <pre>
     * The AdGroupFeed already exists. UPDATE operation should be used to modify
     * the existing AdGroupFeed.
     * </pre>
     *
     * <code>ADGROUP_FEED_ALREADY_EXISTS = 4;</code>
     */
    public static final int ADGROUP_FEED_ALREADY_EXISTS_VALUE = 4;
    /**
     * <pre>
     * Cannot operate on removed AdGroupFeed.
     * </pre>
     *
     * <code>CANNOT_OPERATE_ON_REMOVED_ADGROUP_FEED = 5;</code>
     */
    public static final int CANNOT_OPERATE_ON_REMOVED_ADGROUP_FEED_VALUE = 5;
    /**
     * <pre>
     * Invalid placeholder type.
     * </pre>
     *
     * <code>INVALID_PLACEHOLDER_TYPE = 6;</code>
     */
    public static final int INVALID_PLACEHOLDER_TYPE_VALUE = 6;
    /**
     * <pre>
     * Feed mapping for this placeholder type does not exist.
     * </pre>
     *
     * <code>MISSING_FEEDMAPPING_FOR_PLACEHOLDER_TYPE = 7;</code>
     */
    public static final int MISSING_FEEDMAPPING_FOR_PLACEHOLDER_TYPE_VALUE = 7;
    /**
     * <pre>
     * Location AdGroupFeeds cannot be created unless there is a location
     * CustomerFeed for the specified feed.
     * </pre>
     *
     * <code>NO_EXISTING_LOCATION_CUSTOMER_FEED = 8;</code>
     */
    public static final int NO_EXISTING_LOCATION_CUSTOMER_FEED_VALUE = 8;


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
    public static AdGroupFeedError valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static AdGroupFeedError forNumber(int value) {
      switch (value) {
        case 0: return UNSPECIFIED;
        case 1: return UNKNOWN;
        case 2: return FEED_ALREADY_EXISTS_FOR_PLACEHOLDER_TYPE;
        case 3: return CANNOT_CREATE_FOR_REMOVED_FEED;
        case 4: return ADGROUP_FEED_ALREADY_EXISTS;
        case 5: return CANNOT_OPERATE_ON_REMOVED_ADGROUP_FEED;
        case 6: return INVALID_PLACEHOLDER_TYPE;
        case 7: return MISSING_FEEDMAPPING_FOR_PLACEHOLDER_TYPE;
        case 8: return NO_EXISTING_LOCATION_CUSTOMER_FEED;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<AdGroupFeedError>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        AdGroupFeedError> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<AdGroupFeedError>() {
            public AdGroupFeedError findValueByNumber(int number) {
              return AdGroupFeedError.forNumber(number);
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
      return com.google.ads.googleads.v3.errors.AdGroupFeedErrorEnum.getDescriptor().getEnumTypes().get(0);
    }

    private static final AdGroupFeedError[] VALUES = values();

    public static AdGroupFeedError valueOf(
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

    private AdGroupFeedError(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.ads.googleads.v3.errors.AdGroupFeedErrorEnum.AdGroupFeedError)
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
    if (!(obj instanceof com.google.ads.googleads.v3.errors.AdGroupFeedErrorEnum)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v3.errors.AdGroupFeedErrorEnum other = (com.google.ads.googleads.v3.errors.AdGroupFeedErrorEnum) obj;

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

  public static com.google.ads.googleads.v3.errors.AdGroupFeedErrorEnum parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v3.errors.AdGroupFeedErrorEnum parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v3.errors.AdGroupFeedErrorEnum parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v3.errors.AdGroupFeedErrorEnum parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v3.errors.AdGroupFeedErrorEnum parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v3.errors.AdGroupFeedErrorEnum parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v3.errors.AdGroupFeedErrorEnum parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v3.errors.AdGroupFeedErrorEnum parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v3.errors.AdGroupFeedErrorEnum parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v3.errors.AdGroupFeedErrorEnum parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v3.errors.AdGroupFeedErrorEnum parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v3.errors.AdGroupFeedErrorEnum parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v3.errors.AdGroupFeedErrorEnum prototype) {
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
   * Container for enum describing possible ad group feed errors.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v3.errors.AdGroupFeedErrorEnum}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v3.errors.AdGroupFeedErrorEnum)
      com.google.ads.googleads.v3.errors.AdGroupFeedErrorEnumOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v3.errors.AdGroupFeedErrorProto.internal_static_google_ads_googleads_v3_errors_AdGroupFeedErrorEnum_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v3.errors.AdGroupFeedErrorProto.internal_static_google_ads_googleads_v3_errors_AdGroupFeedErrorEnum_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v3.errors.AdGroupFeedErrorEnum.class, com.google.ads.googleads.v3.errors.AdGroupFeedErrorEnum.Builder.class);
    }

    // Construct using com.google.ads.googleads.v3.errors.AdGroupFeedErrorEnum.newBuilder()
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
      return com.google.ads.googleads.v3.errors.AdGroupFeedErrorProto.internal_static_google_ads_googleads_v3_errors_AdGroupFeedErrorEnum_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v3.errors.AdGroupFeedErrorEnum getDefaultInstanceForType() {
      return com.google.ads.googleads.v3.errors.AdGroupFeedErrorEnum.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v3.errors.AdGroupFeedErrorEnum build() {
      com.google.ads.googleads.v3.errors.AdGroupFeedErrorEnum result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v3.errors.AdGroupFeedErrorEnum buildPartial() {
      com.google.ads.googleads.v3.errors.AdGroupFeedErrorEnum result = new com.google.ads.googleads.v3.errors.AdGroupFeedErrorEnum(this);
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
      if (other instanceof com.google.ads.googleads.v3.errors.AdGroupFeedErrorEnum) {
        return mergeFrom((com.google.ads.googleads.v3.errors.AdGroupFeedErrorEnum)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v3.errors.AdGroupFeedErrorEnum other) {
      if (other == com.google.ads.googleads.v3.errors.AdGroupFeedErrorEnum.getDefaultInstance()) return this;
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
      com.google.ads.googleads.v3.errors.AdGroupFeedErrorEnum parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v3.errors.AdGroupFeedErrorEnum) e.getUnfinishedMessage();
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v3.errors.AdGroupFeedErrorEnum)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v3.errors.AdGroupFeedErrorEnum)
  private static final com.google.ads.googleads.v3.errors.AdGroupFeedErrorEnum DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v3.errors.AdGroupFeedErrorEnum();
  }

  public static com.google.ads.googleads.v3.errors.AdGroupFeedErrorEnum getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AdGroupFeedErrorEnum>
      PARSER = new com.google.protobuf.AbstractParser<AdGroupFeedErrorEnum>() {
    @java.lang.Override
    public AdGroupFeedErrorEnum parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AdGroupFeedErrorEnum(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AdGroupFeedErrorEnum> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AdGroupFeedErrorEnum> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v3.errors.AdGroupFeedErrorEnum getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

