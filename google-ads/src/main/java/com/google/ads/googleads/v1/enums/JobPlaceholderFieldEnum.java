// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v1/enums/job_placeholder_field.proto

package com.google.ads.googleads.v1.enums;

/**
 * <pre>
 * Values for Job placeholder fields.
 * For more information about dynamic remarketing feeds, see
 * https://support.google.com/google-ads/answer/6053288.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v1.enums.JobPlaceholderFieldEnum}
 */
public final class JobPlaceholderFieldEnum extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v1.enums.JobPlaceholderFieldEnum)
    JobPlaceholderFieldEnumOrBuilder {
private static final long serialVersionUID = 0L;
  // Use JobPlaceholderFieldEnum.newBuilder() to construct.
  private JobPlaceholderFieldEnum(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private JobPlaceholderFieldEnum() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new JobPlaceholderFieldEnum();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private JobPlaceholderFieldEnum(
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
    return com.google.ads.googleads.v1.enums.JobsPlaceholderFieldProto.internal_static_google_ads_googleads_v1_enums_JobPlaceholderFieldEnum_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v1.enums.JobsPlaceholderFieldProto.internal_static_google_ads_googleads_v1_enums_JobPlaceholderFieldEnum_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v1.enums.JobPlaceholderFieldEnum.class, com.google.ads.googleads.v1.enums.JobPlaceholderFieldEnum.Builder.class);
  }

  /**
   * <pre>
   * Possible values for Job placeholder fields.
   * </pre>
   *
   * Protobuf enum {@code google.ads.googleads.v1.enums.JobPlaceholderFieldEnum.JobPlaceholderField}
   */
  public enum JobPlaceholderField
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
     * Data Type: STRING. Required. If only JOB_ID is specified, then it must be
     * unique. If both JOB_ID and LOCATION_ID are specified, then the
     * pair must be unique.
     * ID) pair must be unique.
     * </pre>
     *
     * <code>JOB_ID = 2;</code>
     */
    JOB_ID(2),
    /**
     * <pre>
     * Data Type: STRING. Combination of JOB_ID and LOCATION_ID must be unique
     * per offer.
     * </pre>
     *
     * <code>LOCATION_ID = 3;</code>
     */
    LOCATION_ID(3),
    /**
     * <pre>
     * Data Type: STRING. Required. Main headline with job title to be shown in
     * dynamic ad.
     * </pre>
     *
     * <code>TITLE = 4;</code>
     */
    TITLE(4),
    /**
     * <pre>
     * Data Type: STRING. Job subtitle to be shown in dynamic ad.
     * </pre>
     *
     * <code>SUBTITLE = 5;</code>
     */
    SUBTITLE(5),
    /**
     * <pre>
     * Data Type: STRING. Description of job to be shown in dynamic ad.
     * </pre>
     *
     * <code>DESCRIPTION = 6;</code>
     */
    DESCRIPTION(6),
    /**
     * <pre>
     * Data Type: URL. Image to be displayed in the ad. Highly recommended for
     * image ads.
     * </pre>
     *
     * <code>IMAGE_URL = 7;</code>
     */
    IMAGE_URL(7),
    /**
     * <pre>
     * Data Type: STRING. Category of property used to group like items together
     * for recommendation engine.
     * </pre>
     *
     * <code>CATEGORY = 8;</code>
     */
    CATEGORY(8),
    /**
     * <pre>
     * Data Type: STRING_LIST. Keywords used for product retrieval.
     * </pre>
     *
     * <code>CONTEXTUAL_KEYWORDS = 9;</code>
     */
    CONTEXTUAL_KEYWORDS(9),
    /**
     * <pre>
     * Data Type: STRING. Complete property address, including postal code.
     * </pre>
     *
     * <code>ADDRESS = 10;</code>
     */
    ADDRESS(10),
    /**
     * <pre>
     * Data Type: STRING. Salary or salary range of job to be shown in dynamic
     * ad.
     * </pre>
     *
     * <code>SALARY = 11;</code>
     */
    SALARY(11),
    /**
     * <pre>
     * Data Type: URL_LIST. Required. Final URLs to be used in ad when using
     * Upgraded URLs; the more specific the better (e.g. the individual URL of a
     * specific job and its location).
     * </pre>
     *
     * <code>FINAL_URLS = 12;</code>
     */
    FINAL_URLS(12),
    /**
     * <pre>
     * Data Type: URL_LIST. Final mobile URLs for the ad when using Upgraded
     * URLs.
     * </pre>
     *
     * <code>FINAL_MOBILE_URLS = 14;</code>
     */
    FINAL_MOBILE_URLS(14),
    /**
     * <pre>
     * Data Type: URL. Tracking template for the ad when using Upgraded URLs.
     * </pre>
     *
     * <code>TRACKING_URL = 15;</code>
     */
    TRACKING_URL(15),
    /**
     * <pre>
     * Data Type: STRING. Android app link. Must be formatted as:
     * android-app://{package_id}/{scheme}/{host_path}.
     * The components are defined as follows:
     * package_id: app ID as specified in Google Play.
     * scheme: the scheme to pass to the application. Can be HTTP, or a custom
     *   scheme.
     * host_path: identifies the specific content within your application.
     * </pre>
     *
     * <code>ANDROID_APP_LINK = 16;</code>
     */
    ANDROID_APP_LINK(16),
    /**
     * <pre>
     * Data Type: STRING_LIST. List of recommended job IDs to show together with
     * this item.
     * </pre>
     *
     * <code>SIMILAR_JOB_IDS = 17;</code>
     */
    SIMILAR_JOB_IDS(17),
    /**
     * <pre>
     * Data Type: STRING. iOS app link.
     * </pre>
     *
     * <code>IOS_APP_LINK = 18;</code>
     */
    IOS_APP_LINK(18),
    /**
     * <pre>
     * Data Type: INT64. iOS app store ID.
     * </pre>
     *
     * <code>IOS_APP_STORE_ID = 19;</code>
     */
    IOS_APP_STORE_ID(19),
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
     * Data Type: STRING. Required. If only JOB_ID is specified, then it must be
     * unique. If both JOB_ID and LOCATION_ID are specified, then the
     * pair must be unique.
     * ID) pair must be unique.
     * </pre>
     *
     * <code>JOB_ID = 2;</code>
     */
    public static final int JOB_ID_VALUE = 2;
    /**
     * <pre>
     * Data Type: STRING. Combination of JOB_ID and LOCATION_ID must be unique
     * per offer.
     * </pre>
     *
     * <code>LOCATION_ID = 3;</code>
     */
    public static final int LOCATION_ID_VALUE = 3;
    /**
     * <pre>
     * Data Type: STRING. Required. Main headline with job title to be shown in
     * dynamic ad.
     * </pre>
     *
     * <code>TITLE = 4;</code>
     */
    public static final int TITLE_VALUE = 4;
    /**
     * <pre>
     * Data Type: STRING. Job subtitle to be shown in dynamic ad.
     * </pre>
     *
     * <code>SUBTITLE = 5;</code>
     */
    public static final int SUBTITLE_VALUE = 5;
    /**
     * <pre>
     * Data Type: STRING. Description of job to be shown in dynamic ad.
     * </pre>
     *
     * <code>DESCRIPTION = 6;</code>
     */
    public static final int DESCRIPTION_VALUE = 6;
    /**
     * <pre>
     * Data Type: URL. Image to be displayed in the ad. Highly recommended for
     * image ads.
     * </pre>
     *
     * <code>IMAGE_URL = 7;</code>
     */
    public static final int IMAGE_URL_VALUE = 7;
    /**
     * <pre>
     * Data Type: STRING. Category of property used to group like items together
     * for recommendation engine.
     * </pre>
     *
     * <code>CATEGORY = 8;</code>
     */
    public static final int CATEGORY_VALUE = 8;
    /**
     * <pre>
     * Data Type: STRING_LIST. Keywords used for product retrieval.
     * </pre>
     *
     * <code>CONTEXTUAL_KEYWORDS = 9;</code>
     */
    public static final int CONTEXTUAL_KEYWORDS_VALUE = 9;
    /**
     * <pre>
     * Data Type: STRING. Complete property address, including postal code.
     * </pre>
     *
     * <code>ADDRESS = 10;</code>
     */
    public static final int ADDRESS_VALUE = 10;
    /**
     * <pre>
     * Data Type: STRING. Salary or salary range of job to be shown in dynamic
     * ad.
     * </pre>
     *
     * <code>SALARY = 11;</code>
     */
    public static final int SALARY_VALUE = 11;
    /**
     * <pre>
     * Data Type: URL_LIST. Required. Final URLs to be used in ad when using
     * Upgraded URLs; the more specific the better (e.g. the individual URL of a
     * specific job and its location).
     * </pre>
     *
     * <code>FINAL_URLS = 12;</code>
     */
    public static final int FINAL_URLS_VALUE = 12;
    /**
     * <pre>
     * Data Type: URL_LIST. Final mobile URLs for the ad when using Upgraded
     * URLs.
     * </pre>
     *
     * <code>FINAL_MOBILE_URLS = 14;</code>
     */
    public static final int FINAL_MOBILE_URLS_VALUE = 14;
    /**
     * <pre>
     * Data Type: URL. Tracking template for the ad when using Upgraded URLs.
     * </pre>
     *
     * <code>TRACKING_URL = 15;</code>
     */
    public static final int TRACKING_URL_VALUE = 15;
    /**
     * <pre>
     * Data Type: STRING. Android app link. Must be formatted as:
     * android-app://{package_id}/{scheme}/{host_path}.
     * The components are defined as follows:
     * package_id: app ID as specified in Google Play.
     * scheme: the scheme to pass to the application. Can be HTTP, or a custom
     *   scheme.
     * host_path: identifies the specific content within your application.
     * </pre>
     *
     * <code>ANDROID_APP_LINK = 16;</code>
     */
    public static final int ANDROID_APP_LINK_VALUE = 16;
    /**
     * <pre>
     * Data Type: STRING_LIST. List of recommended job IDs to show together with
     * this item.
     * </pre>
     *
     * <code>SIMILAR_JOB_IDS = 17;</code>
     */
    public static final int SIMILAR_JOB_IDS_VALUE = 17;
    /**
     * <pre>
     * Data Type: STRING. iOS app link.
     * </pre>
     *
     * <code>IOS_APP_LINK = 18;</code>
     */
    public static final int IOS_APP_LINK_VALUE = 18;
    /**
     * <pre>
     * Data Type: INT64. iOS app store ID.
     * </pre>
     *
     * <code>IOS_APP_STORE_ID = 19;</code>
     */
    public static final int IOS_APP_STORE_ID_VALUE = 19;


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
    public static JobPlaceholderField valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static JobPlaceholderField forNumber(int value) {
      switch (value) {
        case 0: return UNSPECIFIED;
        case 1: return UNKNOWN;
        case 2: return JOB_ID;
        case 3: return LOCATION_ID;
        case 4: return TITLE;
        case 5: return SUBTITLE;
        case 6: return DESCRIPTION;
        case 7: return IMAGE_URL;
        case 8: return CATEGORY;
        case 9: return CONTEXTUAL_KEYWORDS;
        case 10: return ADDRESS;
        case 11: return SALARY;
        case 12: return FINAL_URLS;
        case 14: return FINAL_MOBILE_URLS;
        case 15: return TRACKING_URL;
        case 16: return ANDROID_APP_LINK;
        case 17: return SIMILAR_JOB_IDS;
        case 18: return IOS_APP_LINK;
        case 19: return IOS_APP_STORE_ID;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<JobPlaceholderField>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        JobPlaceholderField> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<JobPlaceholderField>() {
            public JobPlaceholderField findValueByNumber(int number) {
              return JobPlaceholderField.forNumber(number);
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
      return com.google.ads.googleads.v1.enums.JobPlaceholderFieldEnum.getDescriptor().getEnumTypes().get(0);
    }

    private static final JobPlaceholderField[] VALUES = values();

    public static JobPlaceholderField valueOf(
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

    private JobPlaceholderField(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.ads.googleads.v1.enums.JobPlaceholderFieldEnum.JobPlaceholderField)
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
    if (!(obj instanceof com.google.ads.googleads.v1.enums.JobPlaceholderFieldEnum)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v1.enums.JobPlaceholderFieldEnum other = (com.google.ads.googleads.v1.enums.JobPlaceholderFieldEnum) obj;

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

  public static com.google.ads.googleads.v1.enums.JobPlaceholderFieldEnum parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v1.enums.JobPlaceholderFieldEnum parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.enums.JobPlaceholderFieldEnum parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v1.enums.JobPlaceholderFieldEnum parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.enums.JobPlaceholderFieldEnum parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v1.enums.JobPlaceholderFieldEnum parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.enums.JobPlaceholderFieldEnum parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v1.enums.JobPlaceholderFieldEnum parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.enums.JobPlaceholderFieldEnum parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v1.enums.JobPlaceholderFieldEnum parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.enums.JobPlaceholderFieldEnum parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v1.enums.JobPlaceholderFieldEnum parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v1.enums.JobPlaceholderFieldEnum prototype) {
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
   * Values for Job placeholder fields.
   * For more information about dynamic remarketing feeds, see
   * https://support.google.com/google-ads/answer/6053288.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v1.enums.JobPlaceholderFieldEnum}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v1.enums.JobPlaceholderFieldEnum)
      com.google.ads.googleads.v1.enums.JobPlaceholderFieldEnumOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v1.enums.JobsPlaceholderFieldProto.internal_static_google_ads_googleads_v1_enums_JobPlaceholderFieldEnum_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v1.enums.JobsPlaceholderFieldProto.internal_static_google_ads_googleads_v1_enums_JobPlaceholderFieldEnum_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v1.enums.JobPlaceholderFieldEnum.class, com.google.ads.googleads.v1.enums.JobPlaceholderFieldEnum.Builder.class);
    }

    // Construct using com.google.ads.googleads.v1.enums.JobPlaceholderFieldEnum.newBuilder()
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
      return com.google.ads.googleads.v1.enums.JobsPlaceholderFieldProto.internal_static_google_ads_googleads_v1_enums_JobPlaceholderFieldEnum_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v1.enums.JobPlaceholderFieldEnum getDefaultInstanceForType() {
      return com.google.ads.googleads.v1.enums.JobPlaceholderFieldEnum.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v1.enums.JobPlaceholderFieldEnum build() {
      com.google.ads.googleads.v1.enums.JobPlaceholderFieldEnum result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v1.enums.JobPlaceholderFieldEnum buildPartial() {
      com.google.ads.googleads.v1.enums.JobPlaceholderFieldEnum result = new com.google.ads.googleads.v1.enums.JobPlaceholderFieldEnum(this);
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
      if (other instanceof com.google.ads.googleads.v1.enums.JobPlaceholderFieldEnum) {
        return mergeFrom((com.google.ads.googleads.v1.enums.JobPlaceholderFieldEnum)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v1.enums.JobPlaceholderFieldEnum other) {
      if (other == com.google.ads.googleads.v1.enums.JobPlaceholderFieldEnum.getDefaultInstance()) return this;
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
      com.google.ads.googleads.v1.enums.JobPlaceholderFieldEnum parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v1.enums.JobPlaceholderFieldEnum) e.getUnfinishedMessage();
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v1.enums.JobPlaceholderFieldEnum)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v1.enums.JobPlaceholderFieldEnum)
  private static final com.google.ads.googleads.v1.enums.JobPlaceholderFieldEnum DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v1.enums.JobPlaceholderFieldEnum();
  }

  public static com.google.ads.googleads.v1.enums.JobPlaceholderFieldEnum getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<JobPlaceholderFieldEnum>
      PARSER = new com.google.protobuf.AbstractParser<JobPlaceholderFieldEnum>() {
    @java.lang.Override
    public JobPlaceholderFieldEnum parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new JobPlaceholderFieldEnum(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<JobPlaceholderFieldEnum> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<JobPlaceholderFieldEnum> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v1.enums.JobPlaceholderFieldEnum getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

