// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v2/common/ad_type_infos.proto

package com.google.ads.googleads.v2.common;

/**
 * <pre>
 * Data for display call to action. The call to action is a piece of the ad
 * that prompts the user to do something. Like clicking a link or making a phone
 * call.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v2.common.DisplayCallToAction}
 */
public final class DisplayCallToAction extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v2.common.DisplayCallToAction)
    DisplayCallToActionOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DisplayCallToAction.newBuilder() to construct.
  private DisplayCallToAction(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DisplayCallToAction() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DisplayCallToAction();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private DisplayCallToAction(
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
            if (text_ != null) {
              subBuilder = text_.toBuilder();
            }
            text_ = input.readMessage(com.google.protobuf.StringValue.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(text_);
              text_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            com.google.protobuf.StringValue.Builder subBuilder = null;
            if (textColor_ != null) {
              subBuilder = textColor_.toBuilder();
            }
            textColor_ = input.readMessage(com.google.protobuf.StringValue.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(textColor_);
              textColor_ = subBuilder.buildPartial();
            }

            break;
          }
          case 26: {
            com.google.protobuf.StringValue.Builder subBuilder = null;
            if (urlCollectionId_ != null) {
              subBuilder = urlCollectionId_.toBuilder();
            }
            urlCollectionId_ = input.readMessage(com.google.protobuf.StringValue.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(urlCollectionId_);
              urlCollectionId_ = subBuilder.buildPartial();
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
    return com.google.ads.googleads.v2.common.AdTypeInfosProto.internal_static_google_ads_googleads_v2_common_DisplayCallToAction_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v2.common.AdTypeInfosProto.internal_static_google_ads_googleads_v2_common_DisplayCallToAction_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v2.common.DisplayCallToAction.class, com.google.ads.googleads.v2.common.DisplayCallToAction.Builder.class);
  }

  public static final int TEXT_FIELD_NUMBER = 1;
  private com.google.protobuf.StringValue text_;
  /**
   * <pre>
   * Text for the display-call-to-action.
   * </pre>
   *
   * <code>.google.protobuf.StringValue text = 1;</code>
   * @return Whether the text field is set.
   */
  @java.lang.Override
  public boolean hasText() {
    return text_ != null;
  }
  /**
   * <pre>
   * Text for the display-call-to-action.
   * </pre>
   *
   * <code>.google.protobuf.StringValue text = 1;</code>
   * @return The text.
   */
  @java.lang.Override
  public com.google.protobuf.StringValue getText() {
    return text_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : text_;
  }
  /**
   * <pre>
   * Text for the display-call-to-action.
   * </pre>
   *
   * <code>.google.protobuf.StringValue text = 1;</code>
   */
  @java.lang.Override
  public com.google.protobuf.StringValueOrBuilder getTextOrBuilder() {
    return getText();
  }

  public static final int TEXT_COLOR_FIELD_NUMBER = 2;
  private com.google.protobuf.StringValue textColor_;
  /**
   * <pre>
   * Text color for the display-call-to-action in hexadecimal, e.g. #ffffff for
   * white.
   * </pre>
   *
   * <code>.google.protobuf.StringValue text_color = 2;</code>
   * @return Whether the textColor field is set.
   */
  @java.lang.Override
  public boolean hasTextColor() {
    return textColor_ != null;
  }
  /**
   * <pre>
   * Text color for the display-call-to-action in hexadecimal, e.g. #ffffff for
   * white.
   * </pre>
   *
   * <code>.google.protobuf.StringValue text_color = 2;</code>
   * @return The textColor.
   */
  @java.lang.Override
  public com.google.protobuf.StringValue getTextColor() {
    return textColor_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : textColor_;
  }
  /**
   * <pre>
   * Text color for the display-call-to-action in hexadecimal, e.g. #ffffff for
   * white.
   * </pre>
   *
   * <code>.google.protobuf.StringValue text_color = 2;</code>
   */
  @java.lang.Override
  public com.google.protobuf.StringValueOrBuilder getTextColorOrBuilder() {
    return getTextColor();
  }

  public static final int URL_COLLECTION_ID_FIELD_NUMBER = 3;
  private com.google.protobuf.StringValue urlCollectionId_;
  /**
   * <pre>
   * Identifies the url collection in the ad.url_collections field. If not set
   * the url defaults to final_url.
   * </pre>
   *
   * <code>.google.protobuf.StringValue url_collection_id = 3;</code>
   * @return Whether the urlCollectionId field is set.
   */
  @java.lang.Override
  public boolean hasUrlCollectionId() {
    return urlCollectionId_ != null;
  }
  /**
   * <pre>
   * Identifies the url collection in the ad.url_collections field. If not set
   * the url defaults to final_url.
   * </pre>
   *
   * <code>.google.protobuf.StringValue url_collection_id = 3;</code>
   * @return The urlCollectionId.
   */
  @java.lang.Override
  public com.google.protobuf.StringValue getUrlCollectionId() {
    return urlCollectionId_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : urlCollectionId_;
  }
  /**
   * <pre>
   * Identifies the url collection in the ad.url_collections field. If not set
   * the url defaults to final_url.
   * </pre>
   *
   * <code>.google.protobuf.StringValue url_collection_id = 3;</code>
   */
  @java.lang.Override
  public com.google.protobuf.StringValueOrBuilder getUrlCollectionIdOrBuilder() {
    return getUrlCollectionId();
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
    if (text_ != null) {
      output.writeMessage(1, getText());
    }
    if (textColor_ != null) {
      output.writeMessage(2, getTextColor());
    }
    if (urlCollectionId_ != null) {
      output.writeMessage(3, getUrlCollectionId());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (text_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getText());
    }
    if (textColor_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getTextColor());
    }
    if (urlCollectionId_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getUrlCollectionId());
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
    if (!(obj instanceof com.google.ads.googleads.v2.common.DisplayCallToAction)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v2.common.DisplayCallToAction other = (com.google.ads.googleads.v2.common.DisplayCallToAction) obj;

    if (hasText() != other.hasText()) return false;
    if (hasText()) {
      if (!getText()
          .equals(other.getText())) return false;
    }
    if (hasTextColor() != other.hasTextColor()) return false;
    if (hasTextColor()) {
      if (!getTextColor()
          .equals(other.getTextColor())) return false;
    }
    if (hasUrlCollectionId() != other.hasUrlCollectionId()) return false;
    if (hasUrlCollectionId()) {
      if (!getUrlCollectionId()
          .equals(other.getUrlCollectionId())) return false;
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
    if (hasText()) {
      hash = (37 * hash) + TEXT_FIELD_NUMBER;
      hash = (53 * hash) + getText().hashCode();
    }
    if (hasTextColor()) {
      hash = (37 * hash) + TEXT_COLOR_FIELD_NUMBER;
      hash = (53 * hash) + getTextColor().hashCode();
    }
    if (hasUrlCollectionId()) {
      hash = (37 * hash) + URL_COLLECTION_ID_FIELD_NUMBER;
      hash = (53 * hash) + getUrlCollectionId().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v2.common.DisplayCallToAction parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v2.common.DisplayCallToAction parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v2.common.DisplayCallToAction parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v2.common.DisplayCallToAction parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v2.common.DisplayCallToAction parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v2.common.DisplayCallToAction parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v2.common.DisplayCallToAction parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v2.common.DisplayCallToAction parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v2.common.DisplayCallToAction parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v2.common.DisplayCallToAction parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v2.common.DisplayCallToAction parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v2.common.DisplayCallToAction parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v2.common.DisplayCallToAction prototype) {
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
   * Data for display call to action. The call to action is a piece of the ad
   * that prompts the user to do something. Like clicking a link or making a phone
   * call.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v2.common.DisplayCallToAction}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v2.common.DisplayCallToAction)
      com.google.ads.googleads.v2.common.DisplayCallToActionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v2.common.AdTypeInfosProto.internal_static_google_ads_googleads_v2_common_DisplayCallToAction_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v2.common.AdTypeInfosProto.internal_static_google_ads_googleads_v2_common_DisplayCallToAction_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v2.common.DisplayCallToAction.class, com.google.ads.googleads.v2.common.DisplayCallToAction.Builder.class);
    }

    // Construct using com.google.ads.googleads.v2.common.DisplayCallToAction.newBuilder()
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
      if (textBuilder_ == null) {
        text_ = null;
      } else {
        text_ = null;
        textBuilder_ = null;
      }
      if (textColorBuilder_ == null) {
        textColor_ = null;
      } else {
        textColor_ = null;
        textColorBuilder_ = null;
      }
      if (urlCollectionIdBuilder_ == null) {
        urlCollectionId_ = null;
      } else {
        urlCollectionId_ = null;
        urlCollectionIdBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v2.common.AdTypeInfosProto.internal_static_google_ads_googleads_v2_common_DisplayCallToAction_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v2.common.DisplayCallToAction getDefaultInstanceForType() {
      return com.google.ads.googleads.v2.common.DisplayCallToAction.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v2.common.DisplayCallToAction build() {
      com.google.ads.googleads.v2.common.DisplayCallToAction result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v2.common.DisplayCallToAction buildPartial() {
      com.google.ads.googleads.v2.common.DisplayCallToAction result = new com.google.ads.googleads.v2.common.DisplayCallToAction(this);
      if (textBuilder_ == null) {
        result.text_ = text_;
      } else {
        result.text_ = textBuilder_.build();
      }
      if (textColorBuilder_ == null) {
        result.textColor_ = textColor_;
      } else {
        result.textColor_ = textColorBuilder_.build();
      }
      if (urlCollectionIdBuilder_ == null) {
        result.urlCollectionId_ = urlCollectionId_;
      } else {
        result.urlCollectionId_ = urlCollectionIdBuilder_.build();
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
      if (other instanceof com.google.ads.googleads.v2.common.DisplayCallToAction) {
        return mergeFrom((com.google.ads.googleads.v2.common.DisplayCallToAction)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v2.common.DisplayCallToAction other) {
      if (other == com.google.ads.googleads.v2.common.DisplayCallToAction.getDefaultInstance()) return this;
      if (other.hasText()) {
        mergeText(other.getText());
      }
      if (other.hasTextColor()) {
        mergeTextColor(other.getTextColor());
      }
      if (other.hasUrlCollectionId()) {
        mergeUrlCollectionId(other.getUrlCollectionId());
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
      com.google.ads.googleads.v2.common.DisplayCallToAction parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v2.common.DisplayCallToAction) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.protobuf.StringValue text_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> textBuilder_;
    /**
     * <pre>
     * Text for the display-call-to-action.
     * </pre>
     *
     * <code>.google.protobuf.StringValue text = 1;</code>
     * @return Whether the text field is set.
     */
    public boolean hasText() {
      return textBuilder_ != null || text_ != null;
    }
    /**
     * <pre>
     * Text for the display-call-to-action.
     * </pre>
     *
     * <code>.google.protobuf.StringValue text = 1;</code>
     * @return The text.
     */
    public com.google.protobuf.StringValue getText() {
      if (textBuilder_ == null) {
        return text_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : text_;
      } else {
        return textBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Text for the display-call-to-action.
     * </pre>
     *
     * <code>.google.protobuf.StringValue text = 1;</code>
     */
    public Builder setText(com.google.protobuf.StringValue value) {
      if (textBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        text_ = value;
        onChanged();
      } else {
        textBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Text for the display-call-to-action.
     * </pre>
     *
     * <code>.google.protobuf.StringValue text = 1;</code>
     */
    public Builder setText(
        com.google.protobuf.StringValue.Builder builderForValue) {
      if (textBuilder_ == null) {
        text_ = builderForValue.build();
        onChanged();
      } else {
        textBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Text for the display-call-to-action.
     * </pre>
     *
     * <code>.google.protobuf.StringValue text = 1;</code>
     */
    public Builder mergeText(com.google.protobuf.StringValue value) {
      if (textBuilder_ == null) {
        if (text_ != null) {
          text_ =
            com.google.protobuf.StringValue.newBuilder(text_).mergeFrom(value).buildPartial();
        } else {
          text_ = value;
        }
        onChanged();
      } else {
        textBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Text for the display-call-to-action.
     * </pre>
     *
     * <code>.google.protobuf.StringValue text = 1;</code>
     */
    public Builder clearText() {
      if (textBuilder_ == null) {
        text_ = null;
        onChanged();
      } else {
        text_ = null;
        textBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Text for the display-call-to-action.
     * </pre>
     *
     * <code>.google.protobuf.StringValue text = 1;</code>
     */
    public com.google.protobuf.StringValue.Builder getTextBuilder() {
      
      onChanged();
      return getTextFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Text for the display-call-to-action.
     * </pre>
     *
     * <code>.google.protobuf.StringValue text = 1;</code>
     */
    public com.google.protobuf.StringValueOrBuilder getTextOrBuilder() {
      if (textBuilder_ != null) {
        return textBuilder_.getMessageOrBuilder();
      } else {
        return text_ == null ?
            com.google.protobuf.StringValue.getDefaultInstance() : text_;
      }
    }
    /**
     * <pre>
     * Text for the display-call-to-action.
     * </pre>
     *
     * <code>.google.protobuf.StringValue text = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> 
        getTextFieldBuilder() {
      if (textBuilder_ == null) {
        textBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder>(
                getText(),
                getParentForChildren(),
                isClean());
        text_ = null;
      }
      return textBuilder_;
    }

    private com.google.protobuf.StringValue textColor_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> textColorBuilder_;
    /**
     * <pre>
     * Text color for the display-call-to-action in hexadecimal, e.g. #ffffff for
     * white.
     * </pre>
     *
     * <code>.google.protobuf.StringValue text_color = 2;</code>
     * @return Whether the textColor field is set.
     */
    public boolean hasTextColor() {
      return textColorBuilder_ != null || textColor_ != null;
    }
    /**
     * <pre>
     * Text color for the display-call-to-action in hexadecimal, e.g. #ffffff for
     * white.
     * </pre>
     *
     * <code>.google.protobuf.StringValue text_color = 2;</code>
     * @return The textColor.
     */
    public com.google.protobuf.StringValue getTextColor() {
      if (textColorBuilder_ == null) {
        return textColor_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : textColor_;
      } else {
        return textColorBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Text color for the display-call-to-action in hexadecimal, e.g. #ffffff for
     * white.
     * </pre>
     *
     * <code>.google.protobuf.StringValue text_color = 2;</code>
     */
    public Builder setTextColor(com.google.protobuf.StringValue value) {
      if (textColorBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        textColor_ = value;
        onChanged();
      } else {
        textColorBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Text color for the display-call-to-action in hexadecimal, e.g. #ffffff for
     * white.
     * </pre>
     *
     * <code>.google.protobuf.StringValue text_color = 2;</code>
     */
    public Builder setTextColor(
        com.google.protobuf.StringValue.Builder builderForValue) {
      if (textColorBuilder_ == null) {
        textColor_ = builderForValue.build();
        onChanged();
      } else {
        textColorBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Text color for the display-call-to-action in hexadecimal, e.g. #ffffff for
     * white.
     * </pre>
     *
     * <code>.google.protobuf.StringValue text_color = 2;</code>
     */
    public Builder mergeTextColor(com.google.protobuf.StringValue value) {
      if (textColorBuilder_ == null) {
        if (textColor_ != null) {
          textColor_ =
            com.google.protobuf.StringValue.newBuilder(textColor_).mergeFrom(value).buildPartial();
        } else {
          textColor_ = value;
        }
        onChanged();
      } else {
        textColorBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Text color for the display-call-to-action in hexadecimal, e.g. #ffffff for
     * white.
     * </pre>
     *
     * <code>.google.protobuf.StringValue text_color = 2;</code>
     */
    public Builder clearTextColor() {
      if (textColorBuilder_ == null) {
        textColor_ = null;
        onChanged();
      } else {
        textColor_ = null;
        textColorBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Text color for the display-call-to-action in hexadecimal, e.g. #ffffff for
     * white.
     * </pre>
     *
     * <code>.google.protobuf.StringValue text_color = 2;</code>
     */
    public com.google.protobuf.StringValue.Builder getTextColorBuilder() {
      
      onChanged();
      return getTextColorFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Text color for the display-call-to-action in hexadecimal, e.g. #ffffff for
     * white.
     * </pre>
     *
     * <code>.google.protobuf.StringValue text_color = 2;</code>
     */
    public com.google.protobuf.StringValueOrBuilder getTextColorOrBuilder() {
      if (textColorBuilder_ != null) {
        return textColorBuilder_.getMessageOrBuilder();
      } else {
        return textColor_ == null ?
            com.google.protobuf.StringValue.getDefaultInstance() : textColor_;
      }
    }
    /**
     * <pre>
     * Text color for the display-call-to-action in hexadecimal, e.g. #ffffff for
     * white.
     * </pre>
     *
     * <code>.google.protobuf.StringValue text_color = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> 
        getTextColorFieldBuilder() {
      if (textColorBuilder_ == null) {
        textColorBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder>(
                getTextColor(),
                getParentForChildren(),
                isClean());
        textColor_ = null;
      }
      return textColorBuilder_;
    }

    private com.google.protobuf.StringValue urlCollectionId_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> urlCollectionIdBuilder_;
    /**
     * <pre>
     * Identifies the url collection in the ad.url_collections field. If not set
     * the url defaults to final_url.
     * </pre>
     *
     * <code>.google.protobuf.StringValue url_collection_id = 3;</code>
     * @return Whether the urlCollectionId field is set.
     */
    public boolean hasUrlCollectionId() {
      return urlCollectionIdBuilder_ != null || urlCollectionId_ != null;
    }
    /**
     * <pre>
     * Identifies the url collection in the ad.url_collections field. If not set
     * the url defaults to final_url.
     * </pre>
     *
     * <code>.google.protobuf.StringValue url_collection_id = 3;</code>
     * @return The urlCollectionId.
     */
    public com.google.protobuf.StringValue getUrlCollectionId() {
      if (urlCollectionIdBuilder_ == null) {
        return urlCollectionId_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : urlCollectionId_;
      } else {
        return urlCollectionIdBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Identifies the url collection in the ad.url_collections field. If not set
     * the url defaults to final_url.
     * </pre>
     *
     * <code>.google.protobuf.StringValue url_collection_id = 3;</code>
     */
    public Builder setUrlCollectionId(com.google.protobuf.StringValue value) {
      if (urlCollectionIdBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        urlCollectionId_ = value;
        onChanged();
      } else {
        urlCollectionIdBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Identifies the url collection in the ad.url_collections field. If not set
     * the url defaults to final_url.
     * </pre>
     *
     * <code>.google.protobuf.StringValue url_collection_id = 3;</code>
     */
    public Builder setUrlCollectionId(
        com.google.protobuf.StringValue.Builder builderForValue) {
      if (urlCollectionIdBuilder_ == null) {
        urlCollectionId_ = builderForValue.build();
        onChanged();
      } else {
        urlCollectionIdBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Identifies the url collection in the ad.url_collections field. If not set
     * the url defaults to final_url.
     * </pre>
     *
     * <code>.google.protobuf.StringValue url_collection_id = 3;</code>
     */
    public Builder mergeUrlCollectionId(com.google.protobuf.StringValue value) {
      if (urlCollectionIdBuilder_ == null) {
        if (urlCollectionId_ != null) {
          urlCollectionId_ =
            com.google.protobuf.StringValue.newBuilder(urlCollectionId_).mergeFrom(value).buildPartial();
        } else {
          urlCollectionId_ = value;
        }
        onChanged();
      } else {
        urlCollectionIdBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Identifies the url collection in the ad.url_collections field. If not set
     * the url defaults to final_url.
     * </pre>
     *
     * <code>.google.protobuf.StringValue url_collection_id = 3;</code>
     */
    public Builder clearUrlCollectionId() {
      if (urlCollectionIdBuilder_ == null) {
        urlCollectionId_ = null;
        onChanged();
      } else {
        urlCollectionId_ = null;
        urlCollectionIdBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Identifies the url collection in the ad.url_collections field. If not set
     * the url defaults to final_url.
     * </pre>
     *
     * <code>.google.protobuf.StringValue url_collection_id = 3;</code>
     */
    public com.google.protobuf.StringValue.Builder getUrlCollectionIdBuilder() {
      
      onChanged();
      return getUrlCollectionIdFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Identifies the url collection in the ad.url_collections field. If not set
     * the url defaults to final_url.
     * </pre>
     *
     * <code>.google.protobuf.StringValue url_collection_id = 3;</code>
     */
    public com.google.protobuf.StringValueOrBuilder getUrlCollectionIdOrBuilder() {
      if (urlCollectionIdBuilder_ != null) {
        return urlCollectionIdBuilder_.getMessageOrBuilder();
      } else {
        return urlCollectionId_ == null ?
            com.google.protobuf.StringValue.getDefaultInstance() : urlCollectionId_;
      }
    }
    /**
     * <pre>
     * Identifies the url collection in the ad.url_collections field. If not set
     * the url defaults to final_url.
     * </pre>
     *
     * <code>.google.protobuf.StringValue url_collection_id = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> 
        getUrlCollectionIdFieldBuilder() {
      if (urlCollectionIdBuilder_ == null) {
        urlCollectionIdBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder>(
                getUrlCollectionId(),
                getParentForChildren(),
                isClean());
        urlCollectionId_ = null;
      }
      return urlCollectionIdBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v2.common.DisplayCallToAction)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v2.common.DisplayCallToAction)
  private static final com.google.ads.googleads.v2.common.DisplayCallToAction DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v2.common.DisplayCallToAction();
  }

  public static com.google.ads.googleads.v2.common.DisplayCallToAction getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DisplayCallToAction>
      PARSER = new com.google.protobuf.AbstractParser<DisplayCallToAction>() {
    @java.lang.Override
    public DisplayCallToAction parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new DisplayCallToAction(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DisplayCallToAction> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DisplayCallToAction> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v2.common.DisplayCallToAction getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

