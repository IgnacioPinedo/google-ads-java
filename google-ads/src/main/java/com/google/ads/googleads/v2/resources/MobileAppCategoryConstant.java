// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v2/resources/mobile_app_category_constant.proto

package com.google.ads.googleads.v2.resources;

/**
 * <pre>
 * A mobile application category constant.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v2.resources.MobileAppCategoryConstant}
 */
public final class MobileAppCategoryConstant extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v2.resources.MobileAppCategoryConstant)
    MobileAppCategoryConstantOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MobileAppCategoryConstant.newBuilder() to construct.
  private MobileAppCategoryConstant(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MobileAppCategoryConstant() {
    resourceName_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MobileAppCategoryConstant();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private MobileAppCategoryConstant(
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
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            resourceName_ = s;
            break;
          }
          case 18: {
            com.google.protobuf.Int32Value.Builder subBuilder = null;
            if (id_ != null) {
              subBuilder = id_.toBuilder();
            }
            id_ = input.readMessage(com.google.protobuf.Int32Value.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(id_);
              id_ = subBuilder.buildPartial();
            }

            break;
          }
          case 26: {
            com.google.protobuf.StringValue.Builder subBuilder = null;
            if (name_ != null) {
              subBuilder = name_.toBuilder();
            }
            name_ = input.readMessage(com.google.protobuf.StringValue.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(name_);
              name_ = subBuilder.buildPartial();
            }

            break;
          }
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
    return com.google.ads.googleads.v2.resources.MobileAppCategoryConstantProto.internal_static_google_ads_googleads_v2_resources_MobileAppCategoryConstant_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v2.resources.MobileAppCategoryConstantProto.internal_static_google_ads_googleads_v2_resources_MobileAppCategoryConstant_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v2.resources.MobileAppCategoryConstant.class, com.google.ads.googleads.v2.resources.MobileAppCategoryConstant.Builder.class);
  }

  public static final int RESOURCE_NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object resourceName_;
  /**
   * <pre>
   * Output only. The resource name of the mobile app category constant.
   * Mobile app category constant resource names have the form:
   * `mobileAppCategoryConstants/{mobile_app_category_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The resourceName.
   */
  @java.lang.Override
  public java.lang.String getResourceName() {
    java.lang.Object ref = resourceName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      resourceName_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Output only. The resource name of the mobile app category constant.
   * Mobile app category constant resource names have the form:
   * `mobileAppCategoryConstants/{mobile_app_category_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for resourceName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getResourceNameBytes() {
    java.lang.Object ref = resourceName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      resourceName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ID_FIELD_NUMBER = 2;
  private com.google.protobuf.Int32Value id_;
  /**
   * <pre>
   * Output only. The ID of the mobile app category constant.
   * </pre>
   *
   * <code>.google.protobuf.Int32Value id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the id field is set.
   */
  @java.lang.Override
  public boolean hasId() {
    return id_ != null;
  }
  /**
   * <pre>
   * Output only. The ID of the mobile app category constant.
   * </pre>
   *
   * <code>.google.protobuf.Int32Value id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The id.
   */
  @java.lang.Override
  public com.google.protobuf.Int32Value getId() {
    return id_ == null ? com.google.protobuf.Int32Value.getDefaultInstance() : id_;
  }
  /**
   * <pre>
   * Output only. The ID of the mobile app category constant.
   * </pre>
   *
   * <code>.google.protobuf.Int32Value id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  @java.lang.Override
  public com.google.protobuf.Int32ValueOrBuilder getIdOrBuilder() {
    return getId();
  }

  public static final int NAME_FIELD_NUMBER = 3;
  private com.google.protobuf.StringValue name_;
  /**
   * <pre>
   * Output only. Mobile app category name.
   * </pre>
   *
   * <code>.google.protobuf.StringValue name = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the name field is set.
   */
  @java.lang.Override
  public boolean hasName() {
    return name_ != null;
  }
  /**
   * <pre>
   * Output only. Mobile app category name.
   * </pre>
   *
   * <code>.google.protobuf.StringValue name = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The name.
   */
  @java.lang.Override
  public com.google.protobuf.StringValue getName() {
    return name_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : name_;
  }
  /**
   * <pre>
   * Output only. Mobile app category name.
   * </pre>
   *
   * <code>.google.protobuf.StringValue name = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  @java.lang.Override
  public com.google.protobuf.StringValueOrBuilder getNameOrBuilder() {
    return getName();
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
    if (!getResourceNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, resourceName_);
    }
    if (id_ != null) {
      output.writeMessage(2, getId());
    }
    if (name_ != null) {
      output.writeMessage(3, getName());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getResourceNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, resourceName_);
    }
    if (id_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getId());
    }
    if (name_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getName());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.ads.googleads.v2.resources.MobileAppCategoryConstant)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v2.resources.MobileAppCategoryConstant other = (com.google.ads.googleads.v2.resources.MobileAppCategoryConstant) obj;

    if (!getResourceName()
        .equals(other.getResourceName())) return false;
    if (hasId() != other.hasId()) return false;
    if (hasId()) {
      if (!getId()
          .equals(other.getId())) return false;
    }
    if (hasName() != other.hasName()) return false;
    if (hasName()) {
      if (!getName()
          .equals(other.getName())) return false;
    }
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
    hash = (37 * hash) + RESOURCE_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getResourceName().hashCode();
    if (hasId()) {
      hash = (37 * hash) + ID_FIELD_NUMBER;
      hash = (53 * hash) + getId().hashCode();
    }
    if (hasName()) {
      hash = (37 * hash) + NAME_FIELD_NUMBER;
      hash = (53 * hash) + getName().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v2.resources.MobileAppCategoryConstant parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v2.resources.MobileAppCategoryConstant parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v2.resources.MobileAppCategoryConstant parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v2.resources.MobileAppCategoryConstant parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v2.resources.MobileAppCategoryConstant parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v2.resources.MobileAppCategoryConstant parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v2.resources.MobileAppCategoryConstant parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v2.resources.MobileAppCategoryConstant parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v2.resources.MobileAppCategoryConstant parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v2.resources.MobileAppCategoryConstant parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v2.resources.MobileAppCategoryConstant parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v2.resources.MobileAppCategoryConstant parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v2.resources.MobileAppCategoryConstant prototype) {
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
   * A mobile application category constant.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v2.resources.MobileAppCategoryConstant}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v2.resources.MobileAppCategoryConstant)
      com.google.ads.googleads.v2.resources.MobileAppCategoryConstantOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v2.resources.MobileAppCategoryConstantProto.internal_static_google_ads_googleads_v2_resources_MobileAppCategoryConstant_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v2.resources.MobileAppCategoryConstantProto.internal_static_google_ads_googleads_v2_resources_MobileAppCategoryConstant_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v2.resources.MobileAppCategoryConstant.class, com.google.ads.googleads.v2.resources.MobileAppCategoryConstant.Builder.class);
    }

    // Construct using com.google.ads.googleads.v2.resources.MobileAppCategoryConstant.newBuilder()
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
      resourceName_ = "";

      if (idBuilder_ == null) {
        id_ = null;
      } else {
        id_ = null;
        idBuilder_ = null;
      }
      if (nameBuilder_ == null) {
        name_ = null;
      } else {
        name_ = null;
        nameBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v2.resources.MobileAppCategoryConstantProto.internal_static_google_ads_googleads_v2_resources_MobileAppCategoryConstant_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v2.resources.MobileAppCategoryConstant getDefaultInstanceForType() {
      return com.google.ads.googleads.v2.resources.MobileAppCategoryConstant.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v2.resources.MobileAppCategoryConstant build() {
      com.google.ads.googleads.v2.resources.MobileAppCategoryConstant result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v2.resources.MobileAppCategoryConstant buildPartial() {
      com.google.ads.googleads.v2.resources.MobileAppCategoryConstant result = new com.google.ads.googleads.v2.resources.MobileAppCategoryConstant(this);
      result.resourceName_ = resourceName_;
      if (idBuilder_ == null) {
        result.id_ = id_;
      } else {
        result.id_ = idBuilder_.build();
      }
      if (nameBuilder_ == null) {
        result.name_ = name_;
      } else {
        result.name_ = nameBuilder_.build();
      }
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
      if (other instanceof com.google.ads.googleads.v2.resources.MobileAppCategoryConstant) {
        return mergeFrom((com.google.ads.googleads.v2.resources.MobileAppCategoryConstant)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v2.resources.MobileAppCategoryConstant other) {
      if (other == com.google.ads.googleads.v2.resources.MobileAppCategoryConstant.getDefaultInstance()) return this;
      if (!other.getResourceName().isEmpty()) {
        resourceName_ = other.resourceName_;
        onChanged();
      }
      if (other.hasId()) {
        mergeId(other.getId());
      }
      if (other.hasName()) {
        mergeName(other.getName());
      }
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
      com.google.ads.googleads.v2.resources.MobileAppCategoryConstant parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v2.resources.MobileAppCategoryConstant) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object resourceName_ = "";
    /**
     * <pre>
     * Output only. The resource name of the mobile app category constant.
     * Mobile app category constant resource names have the form:
     * `mobileAppCategoryConstants/{mobile_app_category_id}`
     * </pre>
     *
     * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
     * @return The resourceName.
     */
    public java.lang.String getResourceName() {
      java.lang.Object ref = resourceName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        resourceName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Output only. The resource name of the mobile app category constant.
     * Mobile app category constant resource names have the form:
     * `mobileAppCategoryConstants/{mobile_app_category_id}`
     * </pre>
     *
     * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
     * @return The bytes for resourceName.
     */
    public com.google.protobuf.ByteString
        getResourceNameBytes() {
      java.lang.Object ref = resourceName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        resourceName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Output only. The resource name of the mobile app category constant.
     * Mobile app category constant resource names have the form:
     * `mobileAppCategoryConstants/{mobile_app_category_id}`
     * </pre>
     *
     * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
     * @param value The resourceName to set.
     * @return This builder for chaining.
     */
    public Builder setResourceName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      resourceName_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. The resource name of the mobile app category constant.
     * Mobile app category constant resource names have the form:
     * `mobileAppCategoryConstants/{mobile_app_category_id}`
     * </pre>
     *
     * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearResourceName() {
      
      resourceName_ = getDefaultInstance().getResourceName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. The resource name of the mobile app category constant.
     * Mobile app category constant resource names have the form:
     * `mobileAppCategoryConstants/{mobile_app_category_id}`
     * </pre>
     *
     * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
     * @param value The bytes for resourceName to set.
     * @return This builder for chaining.
     */
    public Builder setResourceNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      resourceName_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.Int32Value id_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Int32Value, com.google.protobuf.Int32Value.Builder, com.google.protobuf.Int32ValueOrBuilder> idBuilder_;
    /**
     * <pre>
     * Output only. The ID of the mobile app category constant.
     * </pre>
     *
     * <code>.google.protobuf.Int32Value id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return Whether the id field is set.
     */
    public boolean hasId() {
      return idBuilder_ != null || id_ != null;
    }
    /**
     * <pre>
     * Output only. The ID of the mobile app category constant.
     * </pre>
     *
     * <code>.google.protobuf.Int32Value id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The id.
     */
    public com.google.protobuf.Int32Value getId() {
      if (idBuilder_ == null) {
        return id_ == null ? com.google.protobuf.Int32Value.getDefaultInstance() : id_;
      } else {
        return idBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Output only. The ID of the mobile app category constant.
     * </pre>
     *
     * <code>.google.protobuf.Int32Value id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public Builder setId(com.google.protobuf.Int32Value value) {
      if (idBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        id_ = value;
        onChanged();
      } else {
        idBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Output only. The ID of the mobile app category constant.
     * </pre>
     *
     * <code>.google.protobuf.Int32Value id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public Builder setId(
        com.google.protobuf.Int32Value.Builder builderForValue) {
      if (idBuilder_ == null) {
        id_ = builderForValue.build();
        onChanged();
      } else {
        idBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Output only. The ID of the mobile app category constant.
     * </pre>
     *
     * <code>.google.protobuf.Int32Value id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public Builder mergeId(com.google.protobuf.Int32Value value) {
      if (idBuilder_ == null) {
        if (id_ != null) {
          id_ =
            com.google.protobuf.Int32Value.newBuilder(id_).mergeFrom(value).buildPartial();
        } else {
          id_ = value;
        }
        onChanged();
      } else {
        idBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Output only. The ID of the mobile app category constant.
     * </pre>
     *
     * <code>.google.protobuf.Int32Value id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public Builder clearId() {
      if (idBuilder_ == null) {
        id_ = null;
        onChanged();
      } else {
        id_ = null;
        idBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Output only. The ID of the mobile app category constant.
     * </pre>
     *
     * <code>.google.protobuf.Int32Value id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public com.google.protobuf.Int32Value.Builder getIdBuilder() {
      
      onChanged();
      return getIdFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Output only. The ID of the mobile app category constant.
     * </pre>
     *
     * <code>.google.protobuf.Int32Value id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public com.google.protobuf.Int32ValueOrBuilder getIdOrBuilder() {
      if (idBuilder_ != null) {
        return idBuilder_.getMessageOrBuilder();
      } else {
        return id_ == null ?
            com.google.protobuf.Int32Value.getDefaultInstance() : id_;
      }
    }
    /**
     * <pre>
     * Output only. The ID of the mobile app category constant.
     * </pre>
     *
     * <code>.google.protobuf.Int32Value id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Int32Value, com.google.protobuf.Int32Value.Builder, com.google.protobuf.Int32ValueOrBuilder> 
        getIdFieldBuilder() {
      if (idBuilder_ == null) {
        idBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Int32Value, com.google.protobuf.Int32Value.Builder, com.google.protobuf.Int32ValueOrBuilder>(
                getId(),
                getParentForChildren(),
                isClean());
        id_ = null;
      }
      return idBuilder_;
    }

    private com.google.protobuf.StringValue name_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> nameBuilder_;
    /**
     * <pre>
     * Output only. Mobile app category name.
     * </pre>
     *
     * <code>.google.protobuf.StringValue name = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return Whether the name field is set.
     */
    public boolean hasName() {
      return nameBuilder_ != null || name_ != null;
    }
    /**
     * <pre>
     * Output only. Mobile app category name.
     * </pre>
     *
     * <code>.google.protobuf.StringValue name = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The name.
     */
    public com.google.protobuf.StringValue getName() {
      if (nameBuilder_ == null) {
        return name_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : name_;
      } else {
        return nameBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Output only. Mobile app category name.
     * </pre>
     *
     * <code>.google.protobuf.StringValue name = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public Builder setName(com.google.protobuf.StringValue value) {
      if (nameBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        name_ = value;
        onChanged();
      } else {
        nameBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Output only. Mobile app category name.
     * </pre>
     *
     * <code>.google.protobuf.StringValue name = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public Builder setName(
        com.google.protobuf.StringValue.Builder builderForValue) {
      if (nameBuilder_ == null) {
        name_ = builderForValue.build();
        onChanged();
      } else {
        nameBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Output only. Mobile app category name.
     * </pre>
     *
     * <code>.google.protobuf.StringValue name = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public Builder mergeName(com.google.protobuf.StringValue value) {
      if (nameBuilder_ == null) {
        if (name_ != null) {
          name_ =
            com.google.protobuf.StringValue.newBuilder(name_).mergeFrom(value).buildPartial();
        } else {
          name_ = value;
        }
        onChanged();
      } else {
        nameBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Output only. Mobile app category name.
     * </pre>
     *
     * <code>.google.protobuf.StringValue name = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public Builder clearName() {
      if (nameBuilder_ == null) {
        name_ = null;
        onChanged();
      } else {
        name_ = null;
        nameBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Output only. Mobile app category name.
     * </pre>
     *
     * <code>.google.protobuf.StringValue name = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public com.google.protobuf.StringValue.Builder getNameBuilder() {
      
      onChanged();
      return getNameFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Output only. Mobile app category name.
     * </pre>
     *
     * <code>.google.protobuf.StringValue name = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public com.google.protobuf.StringValueOrBuilder getNameOrBuilder() {
      if (nameBuilder_ != null) {
        return nameBuilder_.getMessageOrBuilder();
      } else {
        return name_ == null ?
            com.google.protobuf.StringValue.getDefaultInstance() : name_;
      }
    }
    /**
     * <pre>
     * Output only. Mobile app category name.
     * </pre>
     *
     * <code>.google.protobuf.StringValue name = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> 
        getNameFieldBuilder() {
      if (nameBuilder_ == null) {
        nameBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder>(
                getName(),
                getParentForChildren(),
                isClean());
        name_ = null;
      }
      return nameBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v2.resources.MobileAppCategoryConstant)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v2.resources.MobileAppCategoryConstant)
  private static final com.google.ads.googleads.v2.resources.MobileAppCategoryConstant DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v2.resources.MobileAppCategoryConstant();
  }

  public static com.google.ads.googleads.v2.resources.MobileAppCategoryConstant getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MobileAppCategoryConstant>
      PARSER = new com.google.protobuf.AbstractParser<MobileAppCategoryConstant>() {
    @java.lang.Override
    public MobileAppCategoryConstant parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new MobileAppCategoryConstant(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MobileAppCategoryConstant> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MobileAppCategoryConstant> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v2.resources.MobileAppCategoryConstant getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

