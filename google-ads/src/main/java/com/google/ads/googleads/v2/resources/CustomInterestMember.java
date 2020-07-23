// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v2/resources/custom_interest.proto

package com.google.ads.googleads.v2.resources;

/**
 * <pre>
 * A member of custom interest audience. A member can be a keyword or url.
 * It is immutable, that is, it can only be created or removed but not changed.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v2.resources.CustomInterestMember}
 */
public final class CustomInterestMember extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v2.resources.CustomInterestMember)
    CustomInterestMemberOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CustomInterestMember.newBuilder() to construct.
  private CustomInterestMember(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CustomInterestMember() {
    memberType_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CustomInterestMember();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CustomInterestMember(
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
          case 8: {
            int rawValue = input.readEnum();

            memberType_ = rawValue;
            break;
          }
          case 18: {
            com.google.protobuf.StringValue.Builder subBuilder = null;
            if (parameter_ != null) {
              subBuilder = parameter_.toBuilder();
            }
            parameter_ = input.readMessage(com.google.protobuf.StringValue.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(parameter_);
              parameter_ = subBuilder.buildPartial();
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
    return com.google.ads.googleads.v2.resources.CustomInterestProto.internal_static_google_ads_googleads_v2_resources_CustomInterestMember_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v2.resources.CustomInterestProto.internal_static_google_ads_googleads_v2_resources_CustomInterestMember_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v2.resources.CustomInterestMember.class, com.google.ads.googleads.v2.resources.CustomInterestMember.Builder.class);
  }

  public static final int MEMBER_TYPE_FIELD_NUMBER = 1;
  private int memberType_;
  /**
   * <pre>
   * The type of custom interest member, KEYWORD or URL.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.enums.CustomInterestMemberTypeEnum.CustomInterestMemberType member_type = 1;</code>
   * @return The enum numeric value on the wire for memberType.
   */
  @java.lang.Override public int getMemberTypeValue() {
    return memberType_;
  }
  /**
   * <pre>
   * The type of custom interest member, KEYWORD or URL.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.enums.CustomInterestMemberTypeEnum.CustomInterestMemberType member_type = 1;</code>
   * @return The memberType.
   */
  @java.lang.Override public com.google.ads.googleads.v2.enums.CustomInterestMemberTypeEnum.CustomInterestMemberType getMemberType() {
    @SuppressWarnings("deprecation")
    com.google.ads.googleads.v2.enums.CustomInterestMemberTypeEnum.CustomInterestMemberType result = com.google.ads.googleads.v2.enums.CustomInterestMemberTypeEnum.CustomInterestMemberType.valueOf(memberType_);
    return result == null ? com.google.ads.googleads.v2.enums.CustomInterestMemberTypeEnum.CustomInterestMemberType.UNRECOGNIZED : result;
  }

  public static final int PARAMETER_FIELD_NUMBER = 2;
  private com.google.protobuf.StringValue parameter_;
  /**
   * <pre>
   * Keyword text when member_type is KEYWORD or URL string when
   * member_type is URL.
   * </pre>
   *
   * <code>.google.protobuf.StringValue parameter = 2;</code>
   * @return Whether the parameter field is set.
   */
  @java.lang.Override
  public boolean hasParameter() {
    return parameter_ != null;
  }
  /**
   * <pre>
   * Keyword text when member_type is KEYWORD or URL string when
   * member_type is URL.
   * </pre>
   *
   * <code>.google.protobuf.StringValue parameter = 2;</code>
   * @return The parameter.
   */
  @java.lang.Override
  public com.google.protobuf.StringValue getParameter() {
    return parameter_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : parameter_;
  }
  /**
   * <pre>
   * Keyword text when member_type is KEYWORD or URL string when
   * member_type is URL.
   * </pre>
   *
   * <code>.google.protobuf.StringValue parameter = 2;</code>
   */
  @java.lang.Override
  public com.google.protobuf.StringValueOrBuilder getParameterOrBuilder() {
    return getParameter();
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
    if (memberType_ != com.google.ads.googleads.v2.enums.CustomInterestMemberTypeEnum.CustomInterestMemberType.UNSPECIFIED.getNumber()) {
      output.writeEnum(1, memberType_);
    }
    if (parameter_ != null) {
      output.writeMessage(2, getParameter());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (memberType_ != com.google.ads.googleads.v2.enums.CustomInterestMemberTypeEnum.CustomInterestMemberType.UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, memberType_);
    }
    if (parameter_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getParameter());
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
    if (!(obj instanceof com.google.ads.googleads.v2.resources.CustomInterestMember)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v2.resources.CustomInterestMember other = (com.google.ads.googleads.v2.resources.CustomInterestMember) obj;

    if (memberType_ != other.memberType_) return false;
    if (hasParameter() != other.hasParameter()) return false;
    if (hasParameter()) {
      if (!getParameter()
          .equals(other.getParameter())) return false;
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
    hash = (37 * hash) + MEMBER_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + memberType_;
    if (hasParameter()) {
      hash = (37 * hash) + PARAMETER_FIELD_NUMBER;
      hash = (53 * hash) + getParameter().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v2.resources.CustomInterestMember parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v2.resources.CustomInterestMember parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v2.resources.CustomInterestMember parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v2.resources.CustomInterestMember parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v2.resources.CustomInterestMember parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v2.resources.CustomInterestMember parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v2.resources.CustomInterestMember parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v2.resources.CustomInterestMember parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v2.resources.CustomInterestMember parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v2.resources.CustomInterestMember parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v2.resources.CustomInterestMember parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v2.resources.CustomInterestMember parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v2.resources.CustomInterestMember prototype) {
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
   * A member of custom interest audience. A member can be a keyword or url.
   * It is immutable, that is, it can only be created or removed but not changed.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v2.resources.CustomInterestMember}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v2.resources.CustomInterestMember)
      com.google.ads.googleads.v2.resources.CustomInterestMemberOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v2.resources.CustomInterestProto.internal_static_google_ads_googleads_v2_resources_CustomInterestMember_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v2.resources.CustomInterestProto.internal_static_google_ads_googleads_v2_resources_CustomInterestMember_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v2.resources.CustomInterestMember.class, com.google.ads.googleads.v2.resources.CustomInterestMember.Builder.class);
    }

    // Construct using com.google.ads.googleads.v2.resources.CustomInterestMember.newBuilder()
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
      memberType_ = 0;

      if (parameterBuilder_ == null) {
        parameter_ = null;
      } else {
        parameter_ = null;
        parameterBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v2.resources.CustomInterestProto.internal_static_google_ads_googleads_v2_resources_CustomInterestMember_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v2.resources.CustomInterestMember getDefaultInstanceForType() {
      return com.google.ads.googleads.v2.resources.CustomInterestMember.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v2.resources.CustomInterestMember build() {
      com.google.ads.googleads.v2.resources.CustomInterestMember result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v2.resources.CustomInterestMember buildPartial() {
      com.google.ads.googleads.v2.resources.CustomInterestMember result = new com.google.ads.googleads.v2.resources.CustomInterestMember(this);
      result.memberType_ = memberType_;
      if (parameterBuilder_ == null) {
        result.parameter_ = parameter_;
      } else {
        result.parameter_ = parameterBuilder_.build();
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
      if (other instanceof com.google.ads.googleads.v2.resources.CustomInterestMember) {
        return mergeFrom((com.google.ads.googleads.v2.resources.CustomInterestMember)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v2.resources.CustomInterestMember other) {
      if (other == com.google.ads.googleads.v2.resources.CustomInterestMember.getDefaultInstance()) return this;
      if (other.memberType_ != 0) {
        setMemberTypeValue(other.getMemberTypeValue());
      }
      if (other.hasParameter()) {
        mergeParameter(other.getParameter());
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
      com.google.ads.googleads.v2.resources.CustomInterestMember parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v2.resources.CustomInterestMember) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int memberType_ = 0;
    /**
     * <pre>
     * The type of custom interest member, KEYWORD or URL.
     * </pre>
     *
     * <code>.google.ads.googleads.v2.enums.CustomInterestMemberTypeEnum.CustomInterestMemberType member_type = 1;</code>
     * @return The enum numeric value on the wire for memberType.
     */
    @java.lang.Override public int getMemberTypeValue() {
      return memberType_;
    }
    /**
     * <pre>
     * The type of custom interest member, KEYWORD or URL.
     * </pre>
     *
     * <code>.google.ads.googleads.v2.enums.CustomInterestMemberTypeEnum.CustomInterestMemberType member_type = 1;</code>
     * @param value The enum numeric value on the wire for memberType to set.
     * @return This builder for chaining.
     */
    public Builder setMemberTypeValue(int value) {
      
      memberType_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The type of custom interest member, KEYWORD or URL.
     * </pre>
     *
     * <code>.google.ads.googleads.v2.enums.CustomInterestMemberTypeEnum.CustomInterestMemberType member_type = 1;</code>
     * @return The memberType.
     */
    @java.lang.Override
    public com.google.ads.googleads.v2.enums.CustomInterestMemberTypeEnum.CustomInterestMemberType getMemberType() {
      @SuppressWarnings("deprecation")
      com.google.ads.googleads.v2.enums.CustomInterestMemberTypeEnum.CustomInterestMemberType result = com.google.ads.googleads.v2.enums.CustomInterestMemberTypeEnum.CustomInterestMemberType.valueOf(memberType_);
      return result == null ? com.google.ads.googleads.v2.enums.CustomInterestMemberTypeEnum.CustomInterestMemberType.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * The type of custom interest member, KEYWORD or URL.
     * </pre>
     *
     * <code>.google.ads.googleads.v2.enums.CustomInterestMemberTypeEnum.CustomInterestMemberType member_type = 1;</code>
     * @param value The memberType to set.
     * @return This builder for chaining.
     */
    public Builder setMemberType(com.google.ads.googleads.v2.enums.CustomInterestMemberTypeEnum.CustomInterestMemberType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      memberType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The type of custom interest member, KEYWORD or URL.
     * </pre>
     *
     * <code>.google.ads.googleads.v2.enums.CustomInterestMemberTypeEnum.CustomInterestMemberType member_type = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearMemberType() {
      
      memberType_ = 0;
      onChanged();
      return this;
    }

    private com.google.protobuf.StringValue parameter_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> parameterBuilder_;
    /**
     * <pre>
     * Keyword text when member_type is KEYWORD or URL string when
     * member_type is URL.
     * </pre>
     *
     * <code>.google.protobuf.StringValue parameter = 2;</code>
     * @return Whether the parameter field is set.
     */
    public boolean hasParameter() {
      return parameterBuilder_ != null || parameter_ != null;
    }
    /**
     * <pre>
     * Keyword text when member_type is KEYWORD or URL string when
     * member_type is URL.
     * </pre>
     *
     * <code>.google.protobuf.StringValue parameter = 2;</code>
     * @return The parameter.
     */
    public com.google.protobuf.StringValue getParameter() {
      if (parameterBuilder_ == null) {
        return parameter_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : parameter_;
      } else {
        return parameterBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Keyword text when member_type is KEYWORD or URL string when
     * member_type is URL.
     * </pre>
     *
     * <code>.google.protobuf.StringValue parameter = 2;</code>
     */
    public Builder setParameter(com.google.protobuf.StringValue value) {
      if (parameterBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        parameter_ = value;
        onChanged();
      } else {
        parameterBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Keyword text when member_type is KEYWORD or URL string when
     * member_type is URL.
     * </pre>
     *
     * <code>.google.protobuf.StringValue parameter = 2;</code>
     */
    public Builder setParameter(
        com.google.protobuf.StringValue.Builder builderForValue) {
      if (parameterBuilder_ == null) {
        parameter_ = builderForValue.build();
        onChanged();
      } else {
        parameterBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Keyword text when member_type is KEYWORD or URL string when
     * member_type is URL.
     * </pre>
     *
     * <code>.google.protobuf.StringValue parameter = 2;</code>
     */
    public Builder mergeParameter(com.google.protobuf.StringValue value) {
      if (parameterBuilder_ == null) {
        if (parameter_ != null) {
          parameter_ =
            com.google.protobuf.StringValue.newBuilder(parameter_).mergeFrom(value).buildPartial();
        } else {
          parameter_ = value;
        }
        onChanged();
      } else {
        parameterBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Keyword text when member_type is KEYWORD or URL string when
     * member_type is URL.
     * </pre>
     *
     * <code>.google.protobuf.StringValue parameter = 2;</code>
     */
    public Builder clearParameter() {
      if (parameterBuilder_ == null) {
        parameter_ = null;
        onChanged();
      } else {
        parameter_ = null;
        parameterBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Keyword text when member_type is KEYWORD or URL string when
     * member_type is URL.
     * </pre>
     *
     * <code>.google.protobuf.StringValue parameter = 2;</code>
     */
    public com.google.protobuf.StringValue.Builder getParameterBuilder() {
      
      onChanged();
      return getParameterFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Keyword text when member_type is KEYWORD or URL string when
     * member_type is URL.
     * </pre>
     *
     * <code>.google.protobuf.StringValue parameter = 2;</code>
     */
    public com.google.protobuf.StringValueOrBuilder getParameterOrBuilder() {
      if (parameterBuilder_ != null) {
        return parameterBuilder_.getMessageOrBuilder();
      } else {
        return parameter_ == null ?
            com.google.protobuf.StringValue.getDefaultInstance() : parameter_;
      }
    }
    /**
     * <pre>
     * Keyword text when member_type is KEYWORD or URL string when
     * member_type is URL.
     * </pre>
     *
     * <code>.google.protobuf.StringValue parameter = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> 
        getParameterFieldBuilder() {
      if (parameterBuilder_ == null) {
        parameterBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder>(
                getParameter(),
                getParentForChildren(),
                isClean());
        parameter_ = null;
      }
      return parameterBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v2.resources.CustomInterestMember)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v2.resources.CustomInterestMember)
  private static final com.google.ads.googleads.v2.resources.CustomInterestMember DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v2.resources.CustomInterestMember();
  }

  public static com.google.ads.googleads.v2.resources.CustomInterestMember getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CustomInterestMember>
      PARSER = new com.google.protobuf.AbstractParser<CustomInterestMember>() {
    @java.lang.Override
    public CustomInterestMember parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CustomInterestMember(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CustomInterestMember> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CustomInterestMember> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v2.resources.CustomInterestMember getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

