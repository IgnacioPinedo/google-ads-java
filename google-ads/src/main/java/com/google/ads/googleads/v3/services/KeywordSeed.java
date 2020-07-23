// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v3/services/keyword_plan_idea_service.proto

package com.google.ads.googleads.v3.services;

/**
 * <pre>
 * Keyword Seed
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v3.services.KeywordSeed}
 */
public final class KeywordSeed extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v3.services.KeywordSeed)
    KeywordSeedOrBuilder {
private static final long serialVersionUID = 0L;
  // Use KeywordSeed.newBuilder() to construct.
  private KeywordSeed(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private KeywordSeed() {
    keywords_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new KeywordSeed();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private KeywordSeed(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              keywords_ = new java.util.ArrayList<com.google.protobuf.StringValue>();
              mutable_bitField0_ |= 0x00000001;
            }
            keywords_.add(
                input.readMessage(com.google.protobuf.StringValue.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        keywords_ = java.util.Collections.unmodifiableList(keywords_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v3.services.KeywordPlanIdeaServiceProto.internal_static_google_ads_googleads_v3_services_KeywordSeed_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v3.services.KeywordPlanIdeaServiceProto.internal_static_google_ads_googleads_v3_services_KeywordSeed_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v3.services.KeywordSeed.class, com.google.ads.googleads.v3.services.KeywordSeed.Builder.class);
  }

  public static final int KEYWORDS_FIELD_NUMBER = 1;
  private java.util.List<com.google.protobuf.StringValue> keywords_;
  /**
   * <pre>
   * Requires at least one keyword.
   * </pre>
   *
   * <code>repeated .google.protobuf.StringValue keywords = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.protobuf.StringValue> getKeywordsList() {
    return keywords_;
  }
  /**
   * <pre>
   * Requires at least one keyword.
   * </pre>
   *
   * <code>repeated .google.protobuf.StringValue keywords = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.protobuf.StringValueOrBuilder> 
      getKeywordsOrBuilderList() {
    return keywords_;
  }
  /**
   * <pre>
   * Requires at least one keyword.
   * </pre>
   *
   * <code>repeated .google.protobuf.StringValue keywords = 1;</code>
   */
  @java.lang.Override
  public int getKeywordsCount() {
    return keywords_.size();
  }
  /**
   * <pre>
   * Requires at least one keyword.
   * </pre>
   *
   * <code>repeated .google.protobuf.StringValue keywords = 1;</code>
   */
  @java.lang.Override
  public com.google.protobuf.StringValue getKeywords(int index) {
    return keywords_.get(index);
  }
  /**
   * <pre>
   * Requires at least one keyword.
   * </pre>
   *
   * <code>repeated .google.protobuf.StringValue keywords = 1;</code>
   */
  @java.lang.Override
  public com.google.protobuf.StringValueOrBuilder getKeywordsOrBuilder(
      int index) {
    return keywords_.get(index);
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
    for (int i = 0; i < keywords_.size(); i++) {
      output.writeMessage(1, keywords_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < keywords_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, keywords_.get(i));
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
    if (!(obj instanceof com.google.ads.googleads.v3.services.KeywordSeed)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v3.services.KeywordSeed other = (com.google.ads.googleads.v3.services.KeywordSeed) obj;

    if (!getKeywordsList()
        .equals(other.getKeywordsList())) return false;
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
    if (getKeywordsCount() > 0) {
      hash = (37 * hash) + KEYWORDS_FIELD_NUMBER;
      hash = (53 * hash) + getKeywordsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v3.services.KeywordSeed parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v3.services.KeywordSeed parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v3.services.KeywordSeed parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v3.services.KeywordSeed parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v3.services.KeywordSeed parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v3.services.KeywordSeed parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v3.services.KeywordSeed parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v3.services.KeywordSeed parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v3.services.KeywordSeed parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v3.services.KeywordSeed parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v3.services.KeywordSeed parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v3.services.KeywordSeed parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v3.services.KeywordSeed prototype) {
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
   * Keyword Seed
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v3.services.KeywordSeed}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v3.services.KeywordSeed)
      com.google.ads.googleads.v3.services.KeywordSeedOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v3.services.KeywordPlanIdeaServiceProto.internal_static_google_ads_googleads_v3_services_KeywordSeed_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v3.services.KeywordPlanIdeaServiceProto.internal_static_google_ads_googleads_v3_services_KeywordSeed_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v3.services.KeywordSeed.class, com.google.ads.googleads.v3.services.KeywordSeed.Builder.class);
    }

    // Construct using com.google.ads.googleads.v3.services.KeywordSeed.newBuilder()
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
        getKeywordsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (keywordsBuilder_ == null) {
        keywords_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        keywordsBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v3.services.KeywordPlanIdeaServiceProto.internal_static_google_ads_googleads_v3_services_KeywordSeed_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v3.services.KeywordSeed getDefaultInstanceForType() {
      return com.google.ads.googleads.v3.services.KeywordSeed.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v3.services.KeywordSeed build() {
      com.google.ads.googleads.v3.services.KeywordSeed result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v3.services.KeywordSeed buildPartial() {
      com.google.ads.googleads.v3.services.KeywordSeed result = new com.google.ads.googleads.v3.services.KeywordSeed(this);
      int from_bitField0_ = bitField0_;
      if (keywordsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          keywords_ = java.util.Collections.unmodifiableList(keywords_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.keywords_ = keywords_;
      } else {
        result.keywords_ = keywordsBuilder_.build();
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
      if (other instanceof com.google.ads.googleads.v3.services.KeywordSeed) {
        return mergeFrom((com.google.ads.googleads.v3.services.KeywordSeed)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v3.services.KeywordSeed other) {
      if (other == com.google.ads.googleads.v3.services.KeywordSeed.getDefaultInstance()) return this;
      if (keywordsBuilder_ == null) {
        if (!other.keywords_.isEmpty()) {
          if (keywords_.isEmpty()) {
            keywords_ = other.keywords_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureKeywordsIsMutable();
            keywords_.addAll(other.keywords_);
          }
          onChanged();
        }
      } else {
        if (!other.keywords_.isEmpty()) {
          if (keywordsBuilder_.isEmpty()) {
            keywordsBuilder_.dispose();
            keywordsBuilder_ = null;
            keywords_ = other.keywords_;
            bitField0_ = (bitField0_ & ~0x00000001);
            keywordsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getKeywordsFieldBuilder() : null;
          } else {
            keywordsBuilder_.addAllMessages(other.keywords_);
          }
        }
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
      com.google.ads.googleads.v3.services.KeywordSeed parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v3.services.KeywordSeed) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.google.protobuf.StringValue> keywords_ =
      java.util.Collections.emptyList();
    private void ensureKeywordsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        keywords_ = new java.util.ArrayList<com.google.protobuf.StringValue>(keywords_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> keywordsBuilder_;

    /**
     * <pre>
     * Requires at least one keyword.
     * </pre>
     *
     * <code>repeated .google.protobuf.StringValue keywords = 1;</code>
     */
    public java.util.List<com.google.protobuf.StringValue> getKeywordsList() {
      if (keywordsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(keywords_);
      } else {
        return keywordsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * Requires at least one keyword.
     * </pre>
     *
     * <code>repeated .google.protobuf.StringValue keywords = 1;</code>
     */
    public int getKeywordsCount() {
      if (keywordsBuilder_ == null) {
        return keywords_.size();
      } else {
        return keywordsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * Requires at least one keyword.
     * </pre>
     *
     * <code>repeated .google.protobuf.StringValue keywords = 1;</code>
     */
    public com.google.protobuf.StringValue getKeywords(int index) {
      if (keywordsBuilder_ == null) {
        return keywords_.get(index);
      } else {
        return keywordsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * Requires at least one keyword.
     * </pre>
     *
     * <code>repeated .google.protobuf.StringValue keywords = 1;</code>
     */
    public Builder setKeywords(
        int index, com.google.protobuf.StringValue value) {
      if (keywordsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureKeywordsIsMutable();
        keywords_.set(index, value);
        onChanged();
      } else {
        keywordsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Requires at least one keyword.
     * </pre>
     *
     * <code>repeated .google.protobuf.StringValue keywords = 1;</code>
     */
    public Builder setKeywords(
        int index, com.google.protobuf.StringValue.Builder builderForValue) {
      if (keywordsBuilder_ == null) {
        ensureKeywordsIsMutable();
        keywords_.set(index, builderForValue.build());
        onChanged();
      } else {
        keywordsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Requires at least one keyword.
     * </pre>
     *
     * <code>repeated .google.protobuf.StringValue keywords = 1;</code>
     */
    public Builder addKeywords(com.google.protobuf.StringValue value) {
      if (keywordsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureKeywordsIsMutable();
        keywords_.add(value);
        onChanged();
      } else {
        keywordsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * Requires at least one keyword.
     * </pre>
     *
     * <code>repeated .google.protobuf.StringValue keywords = 1;</code>
     */
    public Builder addKeywords(
        int index, com.google.protobuf.StringValue value) {
      if (keywordsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureKeywordsIsMutable();
        keywords_.add(index, value);
        onChanged();
      } else {
        keywordsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Requires at least one keyword.
     * </pre>
     *
     * <code>repeated .google.protobuf.StringValue keywords = 1;</code>
     */
    public Builder addKeywords(
        com.google.protobuf.StringValue.Builder builderForValue) {
      if (keywordsBuilder_ == null) {
        ensureKeywordsIsMutable();
        keywords_.add(builderForValue.build());
        onChanged();
      } else {
        keywordsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Requires at least one keyword.
     * </pre>
     *
     * <code>repeated .google.protobuf.StringValue keywords = 1;</code>
     */
    public Builder addKeywords(
        int index, com.google.protobuf.StringValue.Builder builderForValue) {
      if (keywordsBuilder_ == null) {
        ensureKeywordsIsMutable();
        keywords_.add(index, builderForValue.build());
        onChanged();
      } else {
        keywordsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Requires at least one keyword.
     * </pre>
     *
     * <code>repeated .google.protobuf.StringValue keywords = 1;</code>
     */
    public Builder addAllKeywords(
        java.lang.Iterable<? extends com.google.protobuf.StringValue> values) {
      if (keywordsBuilder_ == null) {
        ensureKeywordsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, keywords_);
        onChanged();
      } else {
        keywordsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * Requires at least one keyword.
     * </pre>
     *
     * <code>repeated .google.protobuf.StringValue keywords = 1;</code>
     */
    public Builder clearKeywords() {
      if (keywordsBuilder_ == null) {
        keywords_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        keywordsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Requires at least one keyword.
     * </pre>
     *
     * <code>repeated .google.protobuf.StringValue keywords = 1;</code>
     */
    public Builder removeKeywords(int index) {
      if (keywordsBuilder_ == null) {
        ensureKeywordsIsMutable();
        keywords_.remove(index);
        onChanged();
      } else {
        keywordsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * Requires at least one keyword.
     * </pre>
     *
     * <code>repeated .google.protobuf.StringValue keywords = 1;</code>
     */
    public com.google.protobuf.StringValue.Builder getKeywordsBuilder(
        int index) {
      return getKeywordsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * Requires at least one keyword.
     * </pre>
     *
     * <code>repeated .google.protobuf.StringValue keywords = 1;</code>
     */
    public com.google.protobuf.StringValueOrBuilder getKeywordsOrBuilder(
        int index) {
      if (keywordsBuilder_ == null) {
        return keywords_.get(index);  } else {
        return keywordsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * Requires at least one keyword.
     * </pre>
     *
     * <code>repeated .google.protobuf.StringValue keywords = 1;</code>
     */
    public java.util.List<? extends com.google.protobuf.StringValueOrBuilder> 
         getKeywordsOrBuilderList() {
      if (keywordsBuilder_ != null) {
        return keywordsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(keywords_);
      }
    }
    /**
     * <pre>
     * Requires at least one keyword.
     * </pre>
     *
     * <code>repeated .google.protobuf.StringValue keywords = 1;</code>
     */
    public com.google.protobuf.StringValue.Builder addKeywordsBuilder() {
      return getKeywordsFieldBuilder().addBuilder(
          com.google.protobuf.StringValue.getDefaultInstance());
    }
    /**
     * <pre>
     * Requires at least one keyword.
     * </pre>
     *
     * <code>repeated .google.protobuf.StringValue keywords = 1;</code>
     */
    public com.google.protobuf.StringValue.Builder addKeywordsBuilder(
        int index) {
      return getKeywordsFieldBuilder().addBuilder(
          index, com.google.protobuf.StringValue.getDefaultInstance());
    }
    /**
     * <pre>
     * Requires at least one keyword.
     * </pre>
     *
     * <code>repeated .google.protobuf.StringValue keywords = 1;</code>
     */
    public java.util.List<com.google.protobuf.StringValue.Builder> 
         getKeywordsBuilderList() {
      return getKeywordsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> 
        getKeywordsFieldBuilder() {
      if (keywordsBuilder_ == null) {
        keywordsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder>(
                keywords_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        keywords_ = null;
      }
      return keywordsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v3.services.KeywordSeed)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v3.services.KeywordSeed)
  private static final com.google.ads.googleads.v3.services.KeywordSeed DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v3.services.KeywordSeed();
  }

  public static com.google.ads.googleads.v3.services.KeywordSeed getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<KeywordSeed>
      PARSER = new com.google.protobuf.AbstractParser<KeywordSeed>() {
    @java.lang.Override
    public KeywordSeed parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new KeywordSeed(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<KeywordSeed> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<KeywordSeed> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v3.services.KeywordSeed getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

