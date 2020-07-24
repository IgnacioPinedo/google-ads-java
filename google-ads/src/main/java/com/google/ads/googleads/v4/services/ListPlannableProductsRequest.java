// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v4/services/reach_plan_service.proto

package com.google.ads.googleads.v4.services;

/**
 * <pre>
 * Request to list available products in a given location.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v4.services.ListPlannableProductsRequest}
 */
public final class ListPlannableProductsRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v4.services.ListPlannableProductsRequest)
    ListPlannableProductsRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListPlannableProductsRequest.newBuilder() to construct.
  private ListPlannableProductsRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListPlannableProductsRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListPlannableProductsRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ListPlannableProductsRequest(
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
            com.google.protobuf.StringValue.Builder subBuilder = null;
            if (plannableLocationId_ != null) {
              subBuilder = plannableLocationId_.toBuilder();
            }
            plannableLocationId_ = input.readMessage(com.google.protobuf.StringValue.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(plannableLocationId_);
              plannableLocationId_ = subBuilder.buildPartial();
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
    return com.google.ads.googleads.v4.services.ReachPlanServiceProto.internal_static_google_ads_googleads_v4_services_ListPlannableProductsRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v4.services.ReachPlanServiceProto.internal_static_google_ads_googleads_v4_services_ListPlannableProductsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v4.services.ListPlannableProductsRequest.class, com.google.ads.googleads.v4.services.ListPlannableProductsRequest.Builder.class);
  }

  public static final int PLANNABLE_LOCATION_ID_FIELD_NUMBER = 1;
  private com.google.protobuf.StringValue plannableLocationId_;
  /**
   * <pre>
   * Required. The ID of the selected location for planning. To list the available
   * plannable location ids use ListPlannableLocations.
   * </pre>
   *
   * <code>.google.protobuf.StringValue plannable_location_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the plannableLocationId field is set.
   */
  @java.lang.Override
  public boolean hasPlannableLocationId() {
    return plannableLocationId_ != null;
  }
  /**
   * <pre>
   * Required. The ID of the selected location for planning. To list the available
   * plannable location ids use ListPlannableLocations.
   * </pre>
   *
   * <code>.google.protobuf.StringValue plannable_location_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The plannableLocationId.
   */
  @java.lang.Override
  public com.google.protobuf.StringValue getPlannableLocationId() {
    return plannableLocationId_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : plannableLocationId_;
  }
  /**
   * <pre>
   * Required. The ID of the selected location for planning. To list the available
   * plannable location ids use ListPlannableLocations.
   * </pre>
   *
   * <code>.google.protobuf.StringValue plannable_location_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.protobuf.StringValueOrBuilder getPlannableLocationIdOrBuilder() {
    return getPlannableLocationId();
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
    if (plannableLocationId_ != null) {
      output.writeMessage(1, getPlannableLocationId());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (plannableLocationId_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getPlannableLocationId());
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
    if (!(obj instanceof com.google.ads.googleads.v4.services.ListPlannableProductsRequest)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v4.services.ListPlannableProductsRequest other = (com.google.ads.googleads.v4.services.ListPlannableProductsRequest) obj;

    if (hasPlannableLocationId() != other.hasPlannableLocationId()) return false;
    if (hasPlannableLocationId()) {
      if (!getPlannableLocationId()
          .equals(other.getPlannableLocationId())) return false;
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
    if (hasPlannableLocationId()) {
      hash = (37 * hash) + PLANNABLE_LOCATION_ID_FIELD_NUMBER;
      hash = (53 * hash) + getPlannableLocationId().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v4.services.ListPlannableProductsRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v4.services.ListPlannableProductsRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v4.services.ListPlannableProductsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v4.services.ListPlannableProductsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v4.services.ListPlannableProductsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v4.services.ListPlannableProductsRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v4.services.ListPlannableProductsRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v4.services.ListPlannableProductsRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v4.services.ListPlannableProductsRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v4.services.ListPlannableProductsRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v4.services.ListPlannableProductsRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v4.services.ListPlannableProductsRequest parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v4.services.ListPlannableProductsRequest prototype) {
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
   * Request to list available products in a given location.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v4.services.ListPlannableProductsRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v4.services.ListPlannableProductsRequest)
      com.google.ads.googleads.v4.services.ListPlannableProductsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v4.services.ReachPlanServiceProto.internal_static_google_ads_googleads_v4_services_ListPlannableProductsRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v4.services.ReachPlanServiceProto.internal_static_google_ads_googleads_v4_services_ListPlannableProductsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v4.services.ListPlannableProductsRequest.class, com.google.ads.googleads.v4.services.ListPlannableProductsRequest.Builder.class);
    }

    // Construct using com.google.ads.googleads.v4.services.ListPlannableProductsRequest.newBuilder()
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
      if (plannableLocationIdBuilder_ == null) {
        plannableLocationId_ = null;
      } else {
        plannableLocationId_ = null;
        plannableLocationIdBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v4.services.ReachPlanServiceProto.internal_static_google_ads_googleads_v4_services_ListPlannableProductsRequest_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v4.services.ListPlannableProductsRequest getDefaultInstanceForType() {
      return com.google.ads.googleads.v4.services.ListPlannableProductsRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v4.services.ListPlannableProductsRequest build() {
      com.google.ads.googleads.v4.services.ListPlannableProductsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v4.services.ListPlannableProductsRequest buildPartial() {
      com.google.ads.googleads.v4.services.ListPlannableProductsRequest result = new com.google.ads.googleads.v4.services.ListPlannableProductsRequest(this);
      if (plannableLocationIdBuilder_ == null) {
        result.plannableLocationId_ = plannableLocationId_;
      } else {
        result.plannableLocationId_ = plannableLocationIdBuilder_.build();
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
      if (other instanceof com.google.ads.googleads.v4.services.ListPlannableProductsRequest) {
        return mergeFrom((com.google.ads.googleads.v4.services.ListPlannableProductsRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v4.services.ListPlannableProductsRequest other) {
      if (other == com.google.ads.googleads.v4.services.ListPlannableProductsRequest.getDefaultInstance()) return this;
      if (other.hasPlannableLocationId()) {
        mergePlannableLocationId(other.getPlannableLocationId());
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
      com.google.ads.googleads.v4.services.ListPlannableProductsRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v4.services.ListPlannableProductsRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.protobuf.StringValue plannableLocationId_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> plannableLocationIdBuilder_;
    /**
     * <pre>
     * Required. The ID of the selected location for planning. To list the available
     * plannable location ids use ListPlannableLocations.
     * </pre>
     *
     * <code>.google.protobuf.StringValue plannable_location_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the plannableLocationId field is set.
     */
    public boolean hasPlannableLocationId() {
      return plannableLocationIdBuilder_ != null || plannableLocationId_ != null;
    }
    /**
     * <pre>
     * Required. The ID of the selected location for planning. To list the available
     * plannable location ids use ListPlannableLocations.
     * </pre>
     *
     * <code>.google.protobuf.StringValue plannable_location_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The plannableLocationId.
     */
    public com.google.protobuf.StringValue getPlannableLocationId() {
      if (plannableLocationIdBuilder_ == null) {
        return plannableLocationId_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : plannableLocationId_;
      } else {
        return plannableLocationIdBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Required. The ID of the selected location for planning. To list the available
     * plannable location ids use ListPlannableLocations.
     * </pre>
     *
     * <code>.google.protobuf.StringValue plannable_location_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setPlannableLocationId(com.google.protobuf.StringValue value) {
      if (plannableLocationIdBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        plannableLocationId_ = value;
        onChanged();
      } else {
        plannableLocationIdBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Required. The ID of the selected location for planning. To list the available
     * plannable location ids use ListPlannableLocations.
     * </pre>
     *
     * <code>.google.protobuf.StringValue plannable_location_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setPlannableLocationId(
        com.google.protobuf.StringValue.Builder builderForValue) {
      if (plannableLocationIdBuilder_ == null) {
        plannableLocationId_ = builderForValue.build();
        onChanged();
      } else {
        plannableLocationIdBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Required. The ID of the selected location for planning. To list the available
     * plannable location ids use ListPlannableLocations.
     * </pre>
     *
     * <code>.google.protobuf.StringValue plannable_location_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergePlannableLocationId(com.google.protobuf.StringValue value) {
      if (plannableLocationIdBuilder_ == null) {
        if (plannableLocationId_ != null) {
          plannableLocationId_ =
            com.google.protobuf.StringValue.newBuilder(plannableLocationId_).mergeFrom(value).buildPartial();
        } else {
          plannableLocationId_ = value;
        }
        onChanged();
      } else {
        plannableLocationIdBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Required. The ID of the selected location for planning. To list the available
     * plannable location ids use ListPlannableLocations.
     * </pre>
     *
     * <code>.google.protobuf.StringValue plannable_location_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearPlannableLocationId() {
      if (plannableLocationIdBuilder_ == null) {
        plannableLocationId_ = null;
        onChanged();
      } else {
        plannableLocationId_ = null;
        plannableLocationIdBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Required. The ID of the selected location for planning. To list the available
     * plannable location ids use ListPlannableLocations.
     * </pre>
     *
     * <code>.google.protobuf.StringValue plannable_location_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.protobuf.StringValue.Builder getPlannableLocationIdBuilder() {
      
      onChanged();
      return getPlannableLocationIdFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. The ID of the selected location for planning. To list the available
     * plannable location ids use ListPlannableLocations.
     * </pre>
     *
     * <code>.google.protobuf.StringValue plannable_location_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.protobuf.StringValueOrBuilder getPlannableLocationIdOrBuilder() {
      if (plannableLocationIdBuilder_ != null) {
        return plannableLocationIdBuilder_.getMessageOrBuilder();
      } else {
        return plannableLocationId_ == null ?
            com.google.protobuf.StringValue.getDefaultInstance() : plannableLocationId_;
      }
    }
    /**
     * <pre>
     * Required. The ID of the selected location for planning. To list the available
     * plannable location ids use ListPlannableLocations.
     * </pre>
     *
     * <code>.google.protobuf.StringValue plannable_location_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> 
        getPlannableLocationIdFieldBuilder() {
      if (plannableLocationIdBuilder_ == null) {
        plannableLocationIdBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder>(
                getPlannableLocationId(),
                getParentForChildren(),
                isClean());
        plannableLocationId_ = null;
      }
      return plannableLocationIdBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v4.services.ListPlannableProductsRequest)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v4.services.ListPlannableProductsRequest)
  private static final com.google.ads.googleads.v4.services.ListPlannableProductsRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v4.services.ListPlannableProductsRequest();
  }

  public static com.google.ads.googleads.v4.services.ListPlannableProductsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListPlannableProductsRequest>
      PARSER = new com.google.protobuf.AbstractParser<ListPlannableProductsRequest>() {
    @java.lang.Override
    public ListPlannableProductsRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ListPlannableProductsRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ListPlannableProductsRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListPlannableProductsRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v4.services.ListPlannableProductsRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
