// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v1/errors/media_bundle_error.proto

package com.google.ads.googleads.v1.errors;

/**
 * <pre>
 * Container for enum describing possible media bundle errors.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v1.errors.MediaBundleErrorEnum}
 */
public final class MediaBundleErrorEnum extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v1.errors.MediaBundleErrorEnum)
    MediaBundleErrorEnumOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MediaBundleErrorEnum.newBuilder() to construct.
  private MediaBundleErrorEnum(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MediaBundleErrorEnum() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MediaBundleErrorEnum();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private MediaBundleErrorEnum(
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
    return com.google.ads.googleads.v1.errors.MediaBundleErrorProto.internal_static_google_ads_googleads_v1_errors_MediaBundleErrorEnum_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v1.errors.MediaBundleErrorProto.internal_static_google_ads_googleads_v1_errors_MediaBundleErrorEnum_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v1.errors.MediaBundleErrorEnum.class, com.google.ads.googleads.v1.errors.MediaBundleErrorEnum.Builder.class);
  }

  /**
   * <pre>
   * Enum describing possible media bundle errors.
   * </pre>
   *
   * Protobuf enum {@code google.ads.googleads.v1.errors.MediaBundleErrorEnum.MediaBundleError}
   */
  public enum MediaBundleError
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
     * There was a problem with the request.
     * </pre>
     *
     * <code>BAD_REQUEST = 3;</code>
     */
    BAD_REQUEST(3),
    /**
     * <pre>
     * HTML5 ads using DoubleClick Studio created ZIP files are not supported.
     * </pre>
     *
     * <code>DOUBLECLICK_BUNDLE_NOT_ALLOWED = 4;</code>
     */
    DOUBLECLICK_BUNDLE_NOT_ALLOWED(4),
    /**
     * <pre>
     * Cannot reference URL external to the media bundle.
     * </pre>
     *
     * <code>EXTERNAL_URL_NOT_ALLOWED = 5;</code>
     */
    EXTERNAL_URL_NOT_ALLOWED(5),
    /**
     * <pre>
     * Media bundle file is too large.
     * </pre>
     *
     * <code>FILE_TOO_LARGE = 6;</code>
     */
    FILE_TOO_LARGE(6),
    /**
     * <pre>
     * ZIP file from Google Web Designer is not published.
     * </pre>
     *
     * <code>GOOGLE_WEB_DESIGNER_ZIP_FILE_NOT_PUBLISHED = 7;</code>
     */
    GOOGLE_WEB_DESIGNER_ZIP_FILE_NOT_PUBLISHED(7),
    /**
     * <pre>
     * Input was invalid.
     * </pre>
     *
     * <code>INVALID_INPUT = 8;</code>
     */
    INVALID_INPUT(8),
    /**
     * <pre>
     * There was a problem with the media bundle.
     * </pre>
     *
     * <code>INVALID_MEDIA_BUNDLE = 9;</code>
     */
    INVALID_MEDIA_BUNDLE(9),
    /**
     * <pre>
     * There was a problem with one or more of the media bundle entries.
     * </pre>
     *
     * <code>INVALID_MEDIA_BUNDLE_ENTRY = 10;</code>
     */
    INVALID_MEDIA_BUNDLE_ENTRY(10),
    /**
     * <pre>
     * The media bundle contains a file with an unknown mime type
     * </pre>
     *
     * <code>INVALID_MIME_TYPE = 11;</code>
     */
    INVALID_MIME_TYPE(11),
    /**
     * <pre>
     * The media bundle contain an invalid asset path.
     * </pre>
     *
     * <code>INVALID_PATH = 12;</code>
     */
    INVALID_PATH(12),
    /**
     * <pre>
     * HTML5 ad is trying to reference an asset not in .ZIP file
     * </pre>
     *
     * <code>INVALID_URL_REFERENCE = 13;</code>
     */
    INVALID_URL_REFERENCE(13),
    /**
     * <pre>
     * Media data is too large.
     * </pre>
     *
     * <code>MEDIA_DATA_TOO_LARGE = 14;</code>
     */
    MEDIA_DATA_TOO_LARGE(14),
    /**
     * <pre>
     * The media bundle contains no primary entry.
     * </pre>
     *
     * <code>MISSING_PRIMARY_MEDIA_BUNDLE_ENTRY = 15;</code>
     */
    MISSING_PRIMARY_MEDIA_BUNDLE_ENTRY(15),
    /**
     * <pre>
     * There was an error on the server.
     * </pre>
     *
     * <code>SERVER_ERROR = 16;</code>
     */
    SERVER_ERROR(16),
    /**
     * <pre>
     * The image could not be stored.
     * </pre>
     *
     * <code>STORAGE_ERROR = 17;</code>
     */
    STORAGE_ERROR(17),
    /**
     * <pre>
     * Media bundle created with the Swiffy tool is not allowed.
     * </pre>
     *
     * <code>SWIFFY_BUNDLE_NOT_ALLOWED = 18;</code>
     */
    SWIFFY_BUNDLE_NOT_ALLOWED(18),
    /**
     * <pre>
     * The media bundle contains too many files.
     * </pre>
     *
     * <code>TOO_MANY_FILES = 19;</code>
     */
    TOO_MANY_FILES(19),
    /**
     * <pre>
     * The media bundle is not of legal dimensions.
     * </pre>
     *
     * <code>UNEXPECTED_SIZE = 20;</code>
     */
    UNEXPECTED_SIZE(20),
    /**
     * <pre>
     * Google Web Designer not created for "Google Ads" environment.
     * </pre>
     *
     * <code>UNSUPPORTED_GOOGLE_WEB_DESIGNER_ENVIRONMENT = 21;</code>
     */
    UNSUPPORTED_GOOGLE_WEB_DESIGNER_ENVIRONMENT(21),
    /**
     * <pre>
     * Unsupported HTML5 feature in HTML5 asset.
     * </pre>
     *
     * <code>UNSUPPORTED_HTML5_FEATURE = 22;</code>
     */
    UNSUPPORTED_HTML5_FEATURE(22),
    /**
     * <pre>
     * URL in HTML5 entry is not ssl compliant.
     * </pre>
     *
     * <code>URL_IN_MEDIA_BUNDLE_NOT_SSL_COMPLIANT = 23;</code>
     */
    URL_IN_MEDIA_BUNDLE_NOT_SSL_COMPLIANT(23),
    /**
     * <pre>
     * Custom exits not allowed in HTML5 entry.
     * </pre>
     *
     * <code>CUSTOM_EXIT_NOT_ALLOWED = 24;</code>
     */
    CUSTOM_EXIT_NOT_ALLOWED(24),
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
     * There was a problem with the request.
     * </pre>
     *
     * <code>BAD_REQUEST = 3;</code>
     */
    public static final int BAD_REQUEST_VALUE = 3;
    /**
     * <pre>
     * HTML5 ads using DoubleClick Studio created ZIP files are not supported.
     * </pre>
     *
     * <code>DOUBLECLICK_BUNDLE_NOT_ALLOWED = 4;</code>
     */
    public static final int DOUBLECLICK_BUNDLE_NOT_ALLOWED_VALUE = 4;
    /**
     * <pre>
     * Cannot reference URL external to the media bundle.
     * </pre>
     *
     * <code>EXTERNAL_URL_NOT_ALLOWED = 5;</code>
     */
    public static final int EXTERNAL_URL_NOT_ALLOWED_VALUE = 5;
    /**
     * <pre>
     * Media bundle file is too large.
     * </pre>
     *
     * <code>FILE_TOO_LARGE = 6;</code>
     */
    public static final int FILE_TOO_LARGE_VALUE = 6;
    /**
     * <pre>
     * ZIP file from Google Web Designer is not published.
     * </pre>
     *
     * <code>GOOGLE_WEB_DESIGNER_ZIP_FILE_NOT_PUBLISHED = 7;</code>
     */
    public static final int GOOGLE_WEB_DESIGNER_ZIP_FILE_NOT_PUBLISHED_VALUE = 7;
    /**
     * <pre>
     * Input was invalid.
     * </pre>
     *
     * <code>INVALID_INPUT = 8;</code>
     */
    public static final int INVALID_INPUT_VALUE = 8;
    /**
     * <pre>
     * There was a problem with the media bundle.
     * </pre>
     *
     * <code>INVALID_MEDIA_BUNDLE = 9;</code>
     */
    public static final int INVALID_MEDIA_BUNDLE_VALUE = 9;
    /**
     * <pre>
     * There was a problem with one or more of the media bundle entries.
     * </pre>
     *
     * <code>INVALID_MEDIA_BUNDLE_ENTRY = 10;</code>
     */
    public static final int INVALID_MEDIA_BUNDLE_ENTRY_VALUE = 10;
    /**
     * <pre>
     * The media bundle contains a file with an unknown mime type
     * </pre>
     *
     * <code>INVALID_MIME_TYPE = 11;</code>
     */
    public static final int INVALID_MIME_TYPE_VALUE = 11;
    /**
     * <pre>
     * The media bundle contain an invalid asset path.
     * </pre>
     *
     * <code>INVALID_PATH = 12;</code>
     */
    public static final int INVALID_PATH_VALUE = 12;
    /**
     * <pre>
     * HTML5 ad is trying to reference an asset not in .ZIP file
     * </pre>
     *
     * <code>INVALID_URL_REFERENCE = 13;</code>
     */
    public static final int INVALID_URL_REFERENCE_VALUE = 13;
    /**
     * <pre>
     * Media data is too large.
     * </pre>
     *
     * <code>MEDIA_DATA_TOO_LARGE = 14;</code>
     */
    public static final int MEDIA_DATA_TOO_LARGE_VALUE = 14;
    /**
     * <pre>
     * The media bundle contains no primary entry.
     * </pre>
     *
     * <code>MISSING_PRIMARY_MEDIA_BUNDLE_ENTRY = 15;</code>
     */
    public static final int MISSING_PRIMARY_MEDIA_BUNDLE_ENTRY_VALUE = 15;
    /**
     * <pre>
     * There was an error on the server.
     * </pre>
     *
     * <code>SERVER_ERROR = 16;</code>
     */
    public static final int SERVER_ERROR_VALUE = 16;
    /**
     * <pre>
     * The image could not be stored.
     * </pre>
     *
     * <code>STORAGE_ERROR = 17;</code>
     */
    public static final int STORAGE_ERROR_VALUE = 17;
    /**
     * <pre>
     * Media bundle created with the Swiffy tool is not allowed.
     * </pre>
     *
     * <code>SWIFFY_BUNDLE_NOT_ALLOWED = 18;</code>
     */
    public static final int SWIFFY_BUNDLE_NOT_ALLOWED_VALUE = 18;
    /**
     * <pre>
     * The media bundle contains too many files.
     * </pre>
     *
     * <code>TOO_MANY_FILES = 19;</code>
     */
    public static final int TOO_MANY_FILES_VALUE = 19;
    /**
     * <pre>
     * The media bundle is not of legal dimensions.
     * </pre>
     *
     * <code>UNEXPECTED_SIZE = 20;</code>
     */
    public static final int UNEXPECTED_SIZE_VALUE = 20;
    /**
     * <pre>
     * Google Web Designer not created for "Google Ads" environment.
     * </pre>
     *
     * <code>UNSUPPORTED_GOOGLE_WEB_DESIGNER_ENVIRONMENT = 21;</code>
     */
    public static final int UNSUPPORTED_GOOGLE_WEB_DESIGNER_ENVIRONMENT_VALUE = 21;
    /**
     * <pre>
     * Unsupported HTML5 feature in HTML5 asset.
     * </pre>
     *
     * <code>UNSUPPORTED_HTML5_FEATURE = 22;</code>
     */
    public static final int UNSUPPORTED_HTML5_FEATURE_VALUE = 22;
    /**
     * <pre>
     * URL in HTML5 entry is not ssl compliant.
     * </pre>
     *
     * <code>URL_IN_MEDIA_BUNDLE_NOT_SSL_COMPLIANT = 23;</code>
     */
    public static final int URL_IN_MEDIA_BUNDLE_NOT_SSL_COMPLIANT_VALUE = 23;
    /**
     * <pre>
     * Custom exits not allowed in HTML5 entry.
     * </pre>
     *
     * <code>CUSTOM_EXIT_NOT_ALLOWED = 24;</code>
     */
    public static final int CUSTOM_EXIT_NOT_ALLOWED_VALUE = 24;


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
    public static MediaBundleError valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static MediaBundleError forNumber(int value) {
      switch (value) {
        case 0: return UNSPECIFIED;
        case 1: return UNKNOWN;
        case 3: return BAD_REQUEST;
        case 4: return DOUBLECLICK_BUNDLE_NOT_ALLOWED;
        case 5: return EXTERNAL_URL_NOT_ALLOWED;
        case 6: return FILE_TOO_LARGE;
        case 7: return GOOGLE_WEB_DESIGNER_ZIP_FILE_NOT_PUBLISHED;
        case 8: return INVALID_INPUT;
        case 9: return INVALID_MEDIA_BUNDLE;
        case 10: return INVALID_MEDIA_BUNDLE_ENTRY;
        case 11: return INVALID_MIME_TYPE;
        case 12: return INVALID_PATH;
        case 13: return INVALID_URL_REFERENCE;
        case 14: return MEDIA_DATA_TOO_LARGE;
        case 15: return MISSING_PRIMARY_MEDIA_BUNDLE_ENTRY;
        case 16: return SERVER_ERROR;
        case 17: return STORAGE_ERROR;
        case 18: return SWIFFY_BUNDLE_NOT_ALLOWED;
        case 19: return TOO_MANY_FILES;
        case 20: return UNEXPECTED_SIZE;
        case 21: return UNSUPPORTED_GOOGLE_WEB_DESIGNER_ENVIRONMENT;
        case 22: return UNSUPPORTED_HTML5_FEATURE;
        case 23: return URL_IN_MEDIA_BUNDLE_NOT_SSL_COMPLIANT;
        case 24: return CUSTOM_EXIT_NOT_ALLOWED;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<MediaBundleError>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        MediaBundleError> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<MediaBundleError>() {
            public MediaBundleError findValueByNumber(int number) {
              return MediaBundleError.forNumber(number);
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
      return com.google.ads.googleads.v1.errors.MediaBundleErrorEnum.getDescriptor().getEnumTypes().get(0);
    }

    private static final MediaBundleError[] VALUES = values();

    public static MediaBundleError valueOf(
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

    private MediaBundleError(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.ads.googleads.v1.errors.MediaBundleErrorEnum.MediaBundleError)
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
    if (!(obj instanceof com.google.ads.googleads.v1.errors.MediaBundleErrorEnum)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v1.errors.MediaBundleErrorEnum other = (com.google.ads.googleads.v1.errors.MediaBundleErrorEnum) obj;

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

  public static com.google.ads.googleads.v1.errors.MediaBundleErrorEnum parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v1.errors.MediaBundleErrorEnum parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.errors.MediaBundleErrorEnum parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v1.errors.MediaBundleErrorEnum parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.errors.MediaBundleErrorEnum parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v1.errors.MediaBundleErrorEnum parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.errors.MediaBundleErrorEnum parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v1.errors.MediaBundleErrorEnum parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.errors.MediaBundleErrorEnum parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v1.errors.MediaBundleErrorEnum parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.errors.MediaBundleErrorEnum parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v1.errors.MediaBundleErrorEnum parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v1.errors.MediaBundleErrorEnum prototype) {
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
   * Container for enum describing possible media bundle errors.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v1.errors.MediaBundleErrorEnum}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v1.errors.MediaBundleErrorEnum)
      com.google.ads.googleads.v1.errors.MediaBundleErrorEnumOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v1.errors.MediaBundleErrorProto.internal_static_google_ads_googleads_v1_errors_MediaBundleErrorEnum_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v1.errors.MediaBundleErrorProto.internal_static_google_ads_googleads_v1_errors_MediaBundleErrorEnum_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v1.errors.MediaBundleErrorEnum.class, com.google.ads.googleads.v1.errors.MediaBundleErrorEnum.Builder.class);
    }

    // Construct using com.google.ads.googleads.v1.errors.MediaBundleErrorEnum.newBuilder()
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
      return com.google.ads.googleads.v1.errors.MediaBundleErrorProto.internal_static_google_ads_googleads_v1_errors_MediaBundleErrorEnum_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v1.errors.MediaBundleErrorEnum getDefaultInstanceForType() {
      return com.google.ads.googleads.v1.errors.MediaBundleErrorEnum.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v1.errors.MediaBundleErrorEnum build() {
      com.google.ads.googleads.v1.errors.MediaBundleErrorEnum result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v1.errors.MediaBundleErrorEnum buildPartial() {
      com.google.ads.googleads.v1.errors.MediaBundleErrorEnum result = new com.google.ads.googleads.v1.errors.MediaBundleErrorEnum(this);
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
      if (other instanceof com.google.ads.googleads.v1.errors.MediaBundleErrorEnum) {
        return mergeFrom((com.google.ads.googleads.v1.errors.MediaBundleErrorEnum)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v1.errors.MediaBundleErrorEnum other) {
      if (other == com.google.ads.googleads.v1.errors.MediaBundleErrorEnum.getDefaultInstance()) return this;
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
      com.google.ads.googleads.v1.errors.MediaBundleErrorEnum parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v1.errors.MediaBundleErrorEnum) e.getUnfinishedMessage();
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v1.errors.MediaBundleErrorEnum)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v1.errors.MediaBundleErrorEnum)
  private static final com.google.ads.googleads.v1.errors.MediaBundleErrorEnum DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v1.errors.MediaBundleErrorEnum();
  }

  public static com.google.ads.googleads.v1.errors.MediaBundleErrorEnum getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MediaBundleErrorEnum>
      PARSER = new com.google.protobuf.AbstractParser<MediaBundleErrorEnum>() {
    @java.lang.Override
    public MediaBundleErrorEnum parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new MediaBundleErrorEnum(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MediaBundleErrorEnum> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MediaBundleErrorEnum> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v1.errors.MediaBundleErrorEnum getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

