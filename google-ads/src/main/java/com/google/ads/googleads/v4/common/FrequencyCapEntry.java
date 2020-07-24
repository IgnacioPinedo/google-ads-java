// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v4/common/frequency_cap.proto

package com.google.ads.googleads.v4.common;

/**
 * <pre>
 * A rule specifying the maximum number of times an ad (or some set of ads) can
 * be shown to a user over a particular time period.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v4.common.FrequencyCapEntry}
 */
public final class FrequencyCapEntry extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v4.common.FrequencyCapEntry)
    FrequencyCapEntryOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FrequencyCapEntry.newBuilder() to construct.
  private FrequencyCapEntry(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FrequencyCapEntry() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new FrequencyCapEntry();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private FrequencyCapEntry(
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
            com.google.ads.googleads.v4.common.FrequencyCapKey.Builder subBuilder = null;
            if (key_ != null) {
              subBuilder = key_.toBuilder();
            }
            key_ = input.readMessage(com.google.ads.googleads.v4.common.FrequencyCapKey.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(key_);
              key_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            com.google.protobuf.Int32Value.Builder subBuilder = null;
            if (cap_ != null) {
              subBuilder = cap_.toBuilder();
            }
            cap_ = input.readMessage(com.google.protobuf.Int32Value.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(cap_);
              cap_ = subBuilder.buildPartial();
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
    return com.google.ads.googleads.v4.common.FrequencyCapProto.internal_static_google_ads_googleads_v4_common_FrequencyCapEntry_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v4.common.FrequencyCapProto.internal_static_google_ads_googleads_v4_common_FrequencyCapEntry_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v4.common.FrequencyCapEntry.class, com.google.ads.googleads.v4.common.FrequencyCapEntry.Builder.class);
  }

  public static final int KEY_FIELD_NUMBER = 1;
  private com.google.ads.googleads.v4.common.FrequencyCapKey key_;
  /**
   * <pre>
   * The key of a particular frequency cap. There can be no more
   * than one frequency cap with the same key.
   * </pre>
   *
   * <code>.google.ads.googleads.v4.common.FrequencyCapKey key = 1;</code>
   * @return Whether the key field is set.
   */
  @java.lang.Override
  public boolean hasKey() {
    return key_ != null;
  }
  /**
   * <pre>
   * The key of a particular frequency cap. There can be no more
   * than one frequency cap with the same key.
   * </pre>
   *
   * <code>.google.ads.googleads.v4.common.FrequencyCapKey key = 1;</code>
   * @return The key.
   */
  @java.lang.Override
  public com.google.ads.googleads.v4.common.FrequencyCapKey getKey() {
    return key_ == null ? com.google.ads.googleads.v4.common.FrequencyCapKey.getDefaultInstance() : key_;
  }
  /**
   * <pre>
   * The key of a particular frequency cap. There can be no more
   * than one frequency cap with the same key.
   * </pre>
   *
   * <code>.google.ads.googleads.v4.common.FrequencyCapKey key = 1;</code>
   */
  @java.lang.Override
  public com.google.ads.googleads.v4.common.FrequencyCapKeyOrBuilder getKeyOrBuilder() {
    return getKey();
  }

  public static final int CAP_FIELD_NUMBER = 2;
  private com.google.protobuf.Int32Value cap_;
  /**
   * <pre>
   * Maximum number of events allowed during the time range by this cap.
   * </pre>
   *
   * <code>.google.protobuf.Int32Value cap = 2;</code>
   * @return Whether the cap field is set.
   */
  @java.lang.Override
  public boolean hasCap() {
    return cap_ != null;
  }
  /**
   * <pre>
   * Maximum number of events allowed during the time range by this cap.
   * </pre>
   *
   * <code>.google.protobuf.Int32Value cap = 2;</code>
   * @return The cap.
   */
  @java.lang.Override
  public com.google.protobuf.Int32Value getCap() {
    return cap_ == null ? com.google.protobuf.Int32Value.getDefaultInstance() : cap_;
  }
  /**
   * <pre>
   * Maximum number of events allowed during the time range by this cap.
   * </pre>
   *
   * <code>.google.protobuf.Int32Value cap = 2;</code>
   */
  @java.lang.Override
  public com.google.protobuf.Int32ValueOrBuilder getCapOrBuilder() {
    return getCap();
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
    if (key_ != null) {
      output.writeMessage(1, getKey());
    }
    if (cap_ != null) {
      output.writeMessage(2, getCap());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (key_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getKey());
    }
    if (cap_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getCap());
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
    if (!(obj instanceof com.google.ads.googleads.v4.common.FrequencyCapEntry)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v4.common.FrequencyCapEntry other = (com.google.ads.googleads.v4.common.FrequencyCapEntry) obj;

    if (hasKey() != other.hasKey()) return false;
    if (hasKey()) {
      if (!getKey()
          .equals(other.getKey())) return false;
    }
    if (hasCap() != other.hasCap()) return false;
    if (hasCap()) {
      if (!getCap()
          .equals(other.getCap())) return false;
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
    if (hasKey()) {
      hash = (37 * hash) + KEY_FIELD_NUMBER;
      hash = (53 * hash) + getKey().hashCode();
    }
    if (hasCap()) {
      hash = (37 * hash) + CAP_FIELD_NUMBER;
      hash = (53 * hash) + getCap().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v4.common.FrequencyCapEntry parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v4.common.FrequencyCapEntry parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v4.common.FrequencyCapEntry parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v4.common.FrequencyCapEntry parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v4.common.FrequencyCapEntry parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v4.common.FrequencyCapEntry parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v4.common.FrequencyCapEntry parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v4.common.FrequencyCapEntry parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v4.common.FrequencyCapEntry parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v4.common.FrequencyCapEntry parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v4.common.FrequencyCapEntry parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v4.common.FrequencyCapEntry parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v4.common.FrequencyCapEntry prototype) {
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
   * A rule specifying the maximum number of times an ad (or some set of ads) can
   * be shown to a user over a particular time period.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v4.common.FrequencyCapEntry}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v4.common.FrequencyCapEntry)
      com.google.ads.googleads.v4.common.FrequencyCapEntryOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v4.common.FrequencyCapProto.internal_static_google_ads_googleads_v4_common_FrequencyCapEntry_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v4.common.FrequencyCapProto.internal_static_google_ads_googleads_v4_common_FrequencyCapEntry_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v4.common.FrequencyCapEntry.class, com.google.ads.googleads.v4.common.FrequencyCapEntry.Builder.class);
    }

    // Construct using com.google.ads.googleads.v4.common.FrequencyCapEntry.newBuilder()
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
      if (keyBuilder_ == null) {
        key_ = null;
      } else {
        key_ = null;
        keyBuilder_ = null;
      }
      if (capBuilder_ == null) {
        cap_ = null;
      } else {
        cap_ = null;
        capBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v4.common.FrequencyCapProto.internal_static_google_ads_googleads_v4_common_FrequencyCapEntry_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v4.common.FrequencyCapEntry getDefaultInstanceForType() {
      return com.google.ads.googleads.v4.common.FrequencyCapEntry.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v4.common.FrequencyCapEntry build() {
      com.google.ads.googleads.v4.common.FrequencyCapEntry result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v4.common.FrequencyCapEntry buildPartial() {
      com.google.ads.googleads.v4.common.FrequencyCapEntry result = new com.google.ads.googleads.v4.common.FrequencyCapEntry(this);
      if (keyBuilder_ == null) {
        result.key_ = key_;
      } else {
        result.key_ = keyBuilder_.build();
      }
      if (capBuilder_ == null) {
        result.cap_ = cap_;
      } else {
        result.cap_ = capBuilder_.build();
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
      if (other instanceof com.google.ads.googleads.v4.common.FrequencyCapEntry) {
        return mergeFrom((com.google.ads.googleads.v4.common.FrequencyCapEntry)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v4.common.FrequencyCapEntry other) {
      if (other == com.google.ads.googleads.v4.common.FrequencyCapEntry.getDefaultInstance()) return this;
      if (other.hasKey()) {
        mergeKey(other.getKey());
      }
      if (other.hasCap()) {
        mergeCap(other.getCap());
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
      com.google.ads.googleads.v4.common.FrequencyCapEntry parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v4.common.FrequencyCapEntry) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.ads.googleads.v4.common.FrequencyCapKey key_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v4.common.FrequencyCapKey, com.google.ads.googleads.v4.common.FrequencyCapKey.Builder, com.google.ads.googleads.v4.common.FrequencyCapKeyOrBuilder> keyBuilder_;
    /**
     * <pre>
     * The key of a particular frequency cap. There can be no more
     * than one frequency cap with the same key.
     * </pre>
     *
     * <code>.google.ads.googleads.v4.common.FrequencyCapKey key = 1;</code>
     * @return Whether the key field is set.
     */
    public boolean hasKey() {
      return keyBuilder_ != null || key_ != null;
    }
    /**
     * <pre>
     * The key of a particular frequency cap. There can be no more
     * than one frequency cap with the same key.
     * </pre>
     *
     * <code>.google.ads.googleads.v4.common.FrequencyCapKey key = 1;</code>
     * @return The key.
     */
    public com.google.ads.googleads.v4.common.FrequencyCapKey getKey() {
      if (keyBuilder_ == null) {
        return key_ == null ? com.google.ads.googleads.v4.common.FrequencyCapKey.getDefaultInstance() : key_;
      } else {
        return keyBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The key of a particular frequency cap. There can be no more
     * than one frequency cap with the same key.
     * </pre>
     *
     * <code>.google.ads.googleads.v4.common.FrequencyCapKey key = 1;</code>
     */
    public Builder setKey(com.google.ads.googleads.v4.common.FrequencyCapKey value) {
      if (keyBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        key_ = value;
        onChanged();
      } else {
        keyBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The key of a particular frequency cap. There can be no more
     * than one frequency cap with the same key.
     * </pre>
     *
     * <code>.google.ads.googleads.v4.common.FrequencyCapKey key = 1;</code>
     */
    public Builder setKey(
        com.google.ads.googleads.v4.common.FrequencyCapKey.Builder builderForValue) {
      if (keyBuilder_ == null) {
        key_ = builderForValue.build();
        onChanged();
      } else {
        keyBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The key of a particular frequency cap. There can be no more
     * than one frequency cap with the same key.
     * </pre>
     *
     * <code>.google.ads.googleads.v4.common.FrequencyCapKey key = 1;</code>
     */
    public Builder mergeKey(com.google.ads.googleads.v4.common.FrequencyCapKey value) {
      if (keyBuilder_ == null) {
        if (key_ != null) {
          key_ =
            com.google.ads.googleads.v4.common.FrequencyCapKey.newBuilder(key_).mergeFrom(value).buildPartial();
        } else {
          key_ = value;
        }
        onChanged();
      } else {
        keyBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The key of a particular frequency cap. There can be no more
     * than one frequency cap with the same key.
     * </pre>
     *
     * <code>.google.ads.googleads.v4.common.FrequencyCapKey key = 1;</code>
     */
    public Builder clearKey() {
      if (keyBuilder_ == null) {
        key_ = null;
        onChanged();
      } else {
        key_ = null;
        keyBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The key of a particular frequency cap. There can be no more
     * than one frequency cap with the same key.
     * </pre>
     *
     * <code>.google.ads.googleads.v4.common.FrequencyCapKey key = 1;</code>
     */
    public com.google.ads.googleads.v4.common.FrequencyCapKey.Builder getKeyBuilder() {
      
      onChanged();
      return getKeyFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The key of a particular frequency cap. There can be no more
     * than one frequency cap with the same key.
     * </pre>
     *
     * <code>.google.ads.googleads.v4.common.FrequencyCapKey key = 1;</code>
     */
    public com.google.ads.googleads.v4.common.FrequencyCapKeyOrBuilder getKeyOrBuilder() {
      if (keyBuilder_ != null) {
        return keyBuilder_.getMessageOrBuilder();
      } else {
        return key_ == null ?
            com.google.ads.googleads.v4.common.FrequencyCapKey.getDefaultInstance() : key_;
      }
    }
    /**
     * <pre>
     * The key of a particular frequency cap. There can be no more
     * than one frequency cap with the same key.
     * </pre>
     *
     * <code>.google.ads.googleads.v4.common.FrequencyCapKey key = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v4.common.FrequencyCapKey, com.google.ads.googleads.v4.common.FrequencyCapKey.Builder, com.google.ads.googleads.v4.common.FrequencyCapKeyOrBuilder> 
        getKeyFieldBuilder() {
      if (keyBuilder_ == null) {
        keyBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.ads.googleads.v4.common.FrequencyCapKey, com.google.ads.googleads.v4.common.FrequencyCapKey.Builder, com.google.ads.googleads.v4.common.FrequencyCapKeyOrBuilder>(
                getKey(),
                getParentForChildren(),
                isClean());
        key_ = null;
      }
      return keyBuilder_;
    }

    private com.google.protobuf.Int32Value cap_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Int32Value, com.google.protobuf.Int32Value.Builder, com.google.protobuf.Int32ValueOrBuilder> capBuilder_;
    /**
     * <pre>
     * Maximum number of events allowed during the time range by this cap.
     * </pre>
     *
     * <code>.google.protobuf.Int32Value cap = 2;</code>
     * @return Whether the cap field is set.
     */
    public boolean hasCap() {
      return capBuilder_ != null || cap_ != null;
    }
    /**
     * <pre>
     * Maximum number of events allowed during the time range by this cap.
     * </pre>
     *
     * <code>.google.protobuf.Int32Value cap = 2;</code>
     * @return The cap.
     */
    public com.google.protobuf.Int32Value getCap() {
      if (capBuilder_ == null) {
        return cap_ == null ? com.google.protobuf.Int32Value.getDefaultInstance() : cap_;
      } else {
        return capBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Maximum number of events allowed during the time range by this cap.
     * </pre>
     *
     * <code>.google.protobuf.Int32Value cap = 2;</code>
     */
    public Builder setCap(com.google.protobuf.Int32Value value) {
      if (capBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        cap_ = value;
        onChanged();
      } else {
        capBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Maximum number of events allowed during the time range by this cap.
     * </pre>
     *
     * <code>.google.protobuf.Int32Value cap = 2;</code>
     */
    public Builder setCap(
        com.google.protobuf.Int32Value.Builder builderForValue) {
      if (capBuilder_ == null) {
        cap_ = builderForValue.build();
        onChanged();
      } else {
        capBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Maximum number of events allowed during the time range by this cap.
     * </pre>
     *
     * <code>.google.protobuf.Int32Value cap = 2;</code>
     */
    public Builder mergeCap(com.google.protobuf.Int32Value value) {
      if (capBuilder_ == null) {
        if (cap_ != null) {
          cap_ =
            com.google.protobuf.Int32Value.newBuilder(cap_).mergeFrom(value).buildPartial();
        } else {
          cap_ = value;
        }
        onChanged();
      } else {
        capBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Maximum number of events allowed during the time range by this cap.
     * </pre>
     *
     * <code>.google.protobuf.Int32Value cap = 2;</code>
     */
    public Builder clearCap() {
      if (capBuilder_ == null) {
        cap_ = null;
        onChanged();
      } else {
        cap_ = null;
        capBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Maximum number of events allowed during the time range by this cap.
     * </pre>
     *
     * <code>.google.protobuf.Int32Value cap = 2;</code>
     */
    public com.google.protobuf.Int32Value.Builder getCapBuilder() {
      
      onChanged();
      return getCapFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Maximum number of events allowed during the time range by this cap.
     * </pre>
     *
     * <code>.google.protobuf.Int32Value cap = 2;</code>
     */
    public com.google.protobuf.Int32ValueOrBuilder getCapOrBuilder() {
      if (capBuilder_ != null) {
        return capBuilder_.getMessageOrBuilder();
      } else {
        return cap_ == null ?
            com.google.protobuf.Int32Value.getDefaultInstance() : cap_;
      }
    }
    /**
     * <pre>
     * Maximum number of events allowed during the time range by this cap.
     * </pre>
     *
     * <code>.google.protobuf.Int32Value cap = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Int32Value, com.google.protobuf.Int32Value.Builder, com.google.protobuf.Int32ValueOrBuilder> 
        getCapFieldBuilder() {
      if (capBuilder_ == null) {
        capBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Int32Value, com.google.protobuf.Int32Value.Builder, com.google.protobuf.Int32ValueOrBuilder>(
                getCap(),
                getParentForChildren(),
                isClean());
        cap_ = null;
      }
      return capBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v4.common.FrequencyCapEntry)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v4.common.FrequencyCapEntry)
  private static final com.google.ads.googleads.v4.common.FrequencyCapEntry DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v4.common.FrequencyCapEntry();
  }

  public static com.google.ads.googleads.v4.common.FrequencyCapEntry getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FrequencyCapEntry>
      PARSER = new com.google.protobuf.AbstractParser<FrequencyCapEntry>() {
    @java.lang.Override
    public FrequencyCapEntry parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new FrequencyCapEntry(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<FrequencyCapEntry> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FrequencyCapEntry> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v4.common.FrequencyCapEntry getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
