// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v1/common/criteria.proto

package com.google.ads.googleads.v1.common;

/**
 * <pre>
 * Represents an operating system version to be targeted.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v1.common.OperatingSystemVersionInfo}
 */
public final class OperatingSystemVersionInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v1.common.OperatingSystemVersionInfo)
    OperatingSystemVersionInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use OperatingSystemVersionInfo.newBuilder() to construct.
  private OperatingSystemVersionInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private OperatingSystemVersionInfo() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new OperatingSystemVersionInfo();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private OperatingSystemVersionInfo(
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
            if (operatingSystemVersionConstant_ != null) {
              subBuilder = operatingSystemVersionConstant_.toBuilder();
            }
            operatingSystemVersionConstant_ = input.readMessage(com.google.protobuf.StringValue.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(operatingSystemVersionConstant_);
              operatingSystemVersionConstant_ = subBuilder.buildPartial();
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
    return com.google.ads.googleads.v1.common.CriteriaProto.internal_static_google_ads_googleads_v1_common_OperatingSystemVersionInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v1.common.CriteriaProto.internal_static_google_ads_googleads_v1_common_OperatingSystemVersionInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v1.common.OperatingSystemVersionInfo.class, com.google.ads.googleads.v1.common.OperatingSystemVersionInfo.Builder.class);
  }

  public static final int OPERATING_SYSTEM_VERSION_CONSTANT_FIELD_NUMBER = 1;
  private com.google.protobuf.StringValue operatingSystemVersionConstant_;
  /**
   * <pre>
   * The operating system version constant resource name.
   * </pre>
   *
   * <code>.google.protobuf.StringValue operating_system_version_constant = 1;</code>
   * @return Whether the operatingSystemVersionConstant field is set.
   */
  @java.lang.Override
  public boolean hasOperatingSystemVersionConstant() {
    return operatingSystemVersionConstant_ != null;
  }
  /**
   * <pre>
   * The operating system version constant resource name.
   * </pre>
   *
   * <code>.google.protobuf.StringValue operating_system_version_constant = 1;</code>
   * @return The operatingSystemVersionConstant.
   */
  @java.lang.Override
  public com.google.protobuf.StringValue getOperatingSystemVersionConstant() {
    return operatingSystemVersionConstant_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : operatingSystemVersionConstant_;
  }
  /**
   * <pre>
   * The operating system version constant resource name.
   * </pre>
   *
   * <code>.google.protobuf.StringValue operating_system_version_constant = 1;</code>
   */
  @java.lang.Override
  public com.google.protobuf.StringValueOrBuilder getOperatingSystemVersionConstantOrBuilder() {
    return getOperatingSystemVersionConstant();
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
    if (operatingSystemVersionConstant_ != null) {
      output.writeMessage(1, getOperatingSystemVersionConstant());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (operatingSystemVersionConstant_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getOperatingSystemVersionConstant());
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
    if (!(obj instanceof com.google.ads.googleads.v1.common.OperatingSystemVersionInfo)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v1.common.OperatingSystemVersionInfo other = (com.google.ads.googleads.v1.common.OperatingSystemVersionInfo) obj;

    if (hasOperatingSystemVersionConstant() != other.hasOperatingSystemVersionConstant()) return false;
    if (hasOperatingSystemVersionConstant()) {
      if (!getOperatingSystemVersionConstant()
          .equals(other.getOperatingSystemVersionConstant())) return false;
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
    if (hasOperatingSystemVersionConstant()) {
      hash = (37 * hash) + OPERATING_SYSTEM_VERSION_CONSTANT_FIELD_NUMBER;
      hash = (53 * hash) + getOperatingSystemVersionConstant().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v1.common.OperatingSystemVersionInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v1.common.OperatingSystemVersionInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.common.OperatingSystemVersionInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v1.common.OperatingSystemVersionInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.common.OperatingSystemVersionInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v1.common.OperatingSystemVersionInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.common.OperatingSystemVersionInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v1.common.OperatingSystemVersionInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.common.OperatingSystemVersionInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v1.common.OperatingSystemVersionInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.common.OperatingSystemVersionInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v1.common.OperatingSystemVersionInfo parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v1.common.OperatingSystemVersionInfo prototype) {
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
   * Represents an operating system version to be targeted.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v1.common.OperatingSystemVersionInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v1.common.OperatingSystemVersionInfo)
      com.google.ads.googleads.v1.common.OperatingSystemVersionInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v1.common.CriteriaProto.internal_static_google_ads_googleads_v1_common_OperatingSystemVersionInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v1.common.CriteriaProto.internal_static_google_ads_googleads_v1_common_OperatingSystemVersionInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v1.common.OperatingSystemVersionInfo.class, com.google.ads.googleads.v1.common.OperatingSystemVersionInfo.Builder.class);
    }

    // Construct using com.google.ads.googleads.v1.common.OperatingSystemVersionInfo.newBuilder()
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
      if (operatingSystemVersionConstantBuilder_ == null) {
        operatingSystemVersionConstant_ = null;
      } else {
        operatingSystemVersionConstant_ = null;
        operatingSystemVersionConstantBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v1.common.CriteriaProto.internal_static_google_ads_googleads_v1_common_OperatingSystemVersionInfo_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v1.common.OperatingSystemVersionInfo getDefaultInstanceForType() {
      return com.google.ads.googleads.v1.common.OperatingSystemVersionInfo.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v1.common.OperatingSystemVersionInfo build() {
      com.google.ads.googleads.v1.common.OperatingSystemVersionInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v1.common.OperatingSystemVersionInfo buildPartial() {
      com.google.ads.googleads.v1.common.OperatingSystemVersionInfo result = new com.google.ads.googleads.v1.common.OperatingSystemVersionInfo(this);
      if (operatingSystemVersionConstantBuilder_ == null) {
        result.operatingSystemVersionConstant_ = operatingSystemVersionConstant_;
      } else {
        result.operatingSystemVersionConstant_ = operatingSystemVersionConstantBuilder_.build();
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
      if (other instanceof com.google.ads.googleads.v1.common.OperatingSystemVersionInfo) {
        return mergeFrom((com.google.ads.googleads.v1.common.OperatingSystemVersionInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v1.common.OperatingSystemVersionInfo other) {
      if (other == com.google.ads.googleads.v1.common.OperatingSystemVersionInfo.getDefaultInstance()) return this;
      if (other.hasOperatingSystemVersionConstant()) {
        mergeOperatingSystemVersionConstant(other.getOperatingSystemVersionConstant());
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
      com.google.ads.googleads.v1.common.OperatingSystemVersionInfo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v1.common.OperatingSystemVersionInfo) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.protobuf.StringValue operatingSystemVersionConstant_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> operatingSystemVersionConstantBuilder_;
    /**
     * <pre>
     * The operating system version constant resource name.
     * </pre>
     *
     * <code>.google.protobuf.StringValue operating_system_version_constant = 1;</code>
     * @return Whether the operatingSystemVersionConstant field is set.
     */
    public boolean hasOperatingSystemVersionConstant() {
      return operatingSystemVersionConstantBuilder_ != null || operatingSystemVersionConstant_ != null;
    }
    /**
     * <pre>
     * The operating system version constant resource name.
     * </pre>
     *
     * <code>.google.protobuf.StringValue operating_system_version_constant = 1;</code>
     * @return The operatingSystemVersionConstant.
     */
    public com.google.protobuf.StringValue getOperatingSystemVersionConstant() {
      if (operatingSystemVersionConstantBuilder_ == null) {
        return operatingSystemVersionConstant_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : operatingSystemVersionConstant_;
      } else {
        return operatingSystemVersionConstantBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The operating system version constant resource name.
     * </pre>
     *
     * <code>.google.protobuf.StringValue operating_system_version_constant = 1;</code>
     */
    public Builder setOperatingSystemVersionConstant(com.google.protobuf.StringValue value) {
      if (operatingSystemVersionConstantBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        operatingSystemVersionConstant_ = value;
        onChanged();
      } else {
        operatingSystemVersionConstantBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The operating system version constant resource name.
     * </pre>
     *
     * <code>.google.protobuf.StringValue operating_system_version_constant = 1;</code>
     */
    public Builder setOperatingSystemVersionConstant(
        com.google.protobuf.StringValue.Builder builderForValue) {
      if (operatingSystemVersionConstantBuilder_ == null) {
        operatingSystemVersionConstant_ = builderForValue.build();
        onChanged();
      } else {
        operatingSystemVersionConstantBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The operating system version constant resource name.
     * </pre>
     *
     * <code>.google.protobuf.StringValue operating_system_version_constant = 1;</code>
     */
    public Builder mergeOperatingSystemVersionConstant(com.google.protobuf.StringValue value) {
      if (operatingSystemVersionConstantBuilder_ == null) {
        if (operatingSystemVersionConstant_ != null) {
          operatingSystemVersionConstant_ =
            com.google.protobuf.StringValue.newBuilder(operatingSystemVersionConstant_).mergeFrom(value).buildPartial();
        } else {
          operatingSystemVersionConstant_ = value;
        }
        onChanged();
      } else {
        operatingSystemVersionConstantBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The operating system version constant resource name.
     * </pre>
     *
     * <code>.google.protobuf.StringValue operating_system_version_constant = 1;</code>
     */
    public Builder clearOperatingSystemVersionConstant() {
      if (operatingSystemVersionConstantBuilder_ == null) {
        operatingSystemVersionConstant_ = null;
        onChanged();
      } else {
        operatingSystemVersionConstant_ = null;
        operatingSystemVersionConstantBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The operating system version constant resource name.
     * </pre>
     *
     * <code>.google.protobuf.StringValue operating_system_version_constant = 1;</code>
     */
    public com.google.protobuf.StringValue.Builder getOperatingSystemVersionConstantBuilder() {
      
      onChanged();
      return getOperatingSystemVersionConstantFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The operating system version constant resource name.
     * </pre>
     *
     * <code>.google.protobuf.StringValue operating_system_version_constant = 1;</code>
     */
    public com.google.protobuf.StringValueOrBuilder getOperatingSystemVersionConstantOrBuilder() {
      if (operatingSystemVersionConstantBuilder_ != null) {
        return operatingSystemVersionConstantBuilder_.getMessageOrBuilder();
      } else {
        return operatingSystemVersionConstant_ == null ?
            com.google.protobuf.StringValue.getDefaultInstance() : operatingSystemVersionConstant_;
      }
    }
    /**
     * <pre>
     * The operating system version constant resource name.
     * </pre>
     *
     * <code>.google.protobuf.StringValue operating_system_version_constant = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> 
        getOperatingSystemVersionConstantFieldBuilder() {
      if (operatingSystemVersionConstantBuilder_ == null) {
        operatingSystemVersionConstantBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder>(
                getOperatingSystemVersionConstant(),
                getParentForChildren(),
                isClean());
        operatingSystemVersionConstant_ = null;
      }
      return operatingSystemVersionConstantBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v1.common.OperatingSystemVersionInfo)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v1.common.OperatingSystemVersionInfo)
  private static final com.google.ads.googleads.v1.common.OperatingSystemVersionInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v1.common.OperatingSystemVersionInfo();
  }

  public static com.google.ads.googleads.v1.common.OperatingSystemVersionInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<OperatingSystemVersionInfo>
      PARSER = new com.google.protobuf.AbstractParser<OperatingSystemVersionInfo>() {
    @java.lang.Override
    public OperatingSystemVersionInfo parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new OperatingSystemVersionInfo(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<OperatingSystemVersionInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<OperatingSystemVersionInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v1.common.OperatingSystemVersionInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

