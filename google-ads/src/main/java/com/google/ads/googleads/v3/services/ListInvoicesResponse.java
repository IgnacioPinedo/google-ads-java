// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v3/services/invoice_service.proto

package com.google.ads.googleads.v3.services;

/**
 * <pre>
 * Response message for [InvoiceService.ListInvoices][google.ads.googleads.v3.services.InvoiceService.ListInvoices].
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v3.services.ListInvoicesResponse}
 */
public final class ListInvoicesResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v3.services.ListInvoicesResponse)
    ListInvoicesResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListInvoicesResponse.newBuilder() to construct.
  private ListInvoicesResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListInvoicesResponse() {
    invoices_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListInvoicesResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ListInvoicesResponse(
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
              invoices_ = new java.util.ArrayList<com.google.ads.googleads.v3.resources.Invoice>();
              mutable_bitField0_ |= 0x00000001;
            }
            invoices_.add(
                input.readMessage(com.google.ads.googleads.v3.resources.Invoice.parser(), extensionRegistry));
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
        invoices_ = java.util.Collections.unmodifiableList(invoices_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v3.services.InvoiceServiceProto.internal_static_google_ads_googleads_v3_services_ListInvoicesResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v3.services.InvoiceServiceProto.internal_static_google_ads_googleads_v3_services_ListInvoicesResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v3.services.ListInvoicesResponse.class, com.google.ads.googleads.v3.services.ListInvoicesResponse.Builder.class);
  }

  public static final int INVOICES_FIELD_NUMBER = 1;
  private java.util.List<com.google.ads.googleads.v3.resources.Invoice> invoices_;
  /**
   * <pre>
   * The list of invoices that match the billing setup and time period.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v3.resources.Invoice invoices = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.ads.googleads.v3.resources.Invoice> getInvoicesList() {
    return invoices_;
  }
  /**
   * <pre>
   * The list of invoices that match the billing setup and time period.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v3.resources.Invoice invoices = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.ads.googleads.v3.resources.InvoiceOrBuilder> 
      getInvoicesOrBuilderList() {
    return invoices_;
  }
  /**
   * <pre>
   * The list of invoices that match the billing setup and time period.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v3.resources.Invoice invoices = 1;</code>
   */
  @java.lang.Override
  public int getInvoicesCount() {
    return invoices_.size();
  }
  /**
   * <pre>
   * The list of invoices that match the billing setup and time period.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v3.resources.Invoice invoices = 1;</code>
   */
  @java.lang.Override
  public com.google.ads.googleads.v3.resources.Invoice getInvoices(int index) {
    return invoices_.get(index);
  }
  /**
   * <pre>
   * The list of invoices that match the billing setup and time period.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v3.resources.Invoice invoices = 1;</code>
   */
  @java.lang.Override
  public com.google.ads.googleads.v3.resources.InvoiceOrBuilder getInvoicesOrBuilder(
      int index) {
    return invoices_.get(index);
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
    for (int i = 0; i < invoices_.size(); i++) {
      output.writeMessage(1, invoices_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < invoices_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, invoices_.get(i));
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
    if (!(obj instanceof com.google.ads.googleads.v3.services.ListInvoicesResponse)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v3.services.ListInvoicesResponse other = (com.google.ads.googleads.v3.services.ListInvoicesResponse) obj;

    if (!getInvoicesList()
        .equals(other.getInvoicesList())) return false;
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
    if (getInvoicesCount() > 0) {
      hash = (37 * hash) + INVOICES_FIELD_NUMBER;
      hash = (53 * hash) + getInvoicesList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v3.services.ListInvoicesResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v3.services.ListInvoicesResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v3.services.ListInvoicesResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v3.services.ListInvoicesResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v3.services.ListInvoicesResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v3.services.ListInvoicesResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v3.services.ListInvoicesResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v3.services.ListInvoicesResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v3.services.ListInvoicesResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v3.services.ListInvoicesResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v3.services.ListInvoicesResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v3.services.ListInvoicesResponse parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v3.services.ListInvoicesResponse prototype) {
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
   * Response message for [InvoiceService.ListInvoices][google.ads.googleads.v3.services.InvoiceService.ListInvoices].
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v3.services.ListInvoicesResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v3.services.ListInvoicesResponse)
      com.google.ads.googleads.v3.services.ListInvoicesResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v3.services.InvoiceServiceProto.internal_static_google_ads_googleads_v3_services_ListInvoicesResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v3.services.InvoiceServiceProto.internal_static_google_ads_googleads_v3_services_ListInvoicesResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v3.services.ListInvoicesResponse.class, com.google.ads.googleads.v3.services.ListInvoicesResponse.Builder.class);
    }

    // Construct using com.google.ads.googleads.v3.services.ListInvoicesResponse.newBuilder()
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
        getInvoicesFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (invoicesBuilder_ == null) {
        invoices_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        invoicesBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v3.services.InvoiceServiceProto.internal_static_google_ads_googleads_v3_services_ListInvoicesResponse_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v3.services.ListInvoicesResponse getDefaultInstanceForType() {
      return com.google.ads.googleads.v3.services.ListInvoicesResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v3.services.ListInvoicesResponse build() {
      com.google.ads.googleads.v3.services.ListInvoicesResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v3.services.ListInvoicesResponse buildPartial() {
      com.google.ads.googleads.v3.services.ListInvoicesResponse result = new com.google.ads.googleads.v3.services.ListInvoicesResponse(this);
      int from_bitField0_ = bitField0_;
      if (invoicesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          invoices_ = java.util.Collections.unmodifiableList(invoices_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.invoices_ = invoices_;
      } else {
        result.invoices_ = invoicesBuilder_.build();
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
      if (other instanceof com.google.ads.googleads.v3.services.ListInvoicesResponse) {
        return mergeFrom((com.google.ads.googleads.v3.services.ListInvoicesResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v3.services.ListInvoicesResponse other) {
      if (other == com.google.ads.googleads.v3.services.ListInvoicesResponse.getDefaultInstance()) return this;
      if (invoicesBuilder_ == null) {
        if (!other.invoices_.isEmpty()) {
          if (invoices_.isEmpty()) {
            invoices_ = other.invoices_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureInvoicesIsMutable();
            invoices_.addAll(other.invoices_);
          }
          onChanged();
        }
      } else {
        if (!other.invoices_.isEmpty()) {
          if (invoicesBuilder_.isEmpty()) {
            invoicesBuilder_.dispose();
            invoicesBuilder_ = null;
            invoices_ = other.invoices_;
            bitField0_ = (bitField0_ & ~0x00000001);
            invoicesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getInvoicesFieldBuilder() : null;
          } else {
            invoicesBuilder_.addAllMessages(other.invoices_);
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
      com.google.ads.googleads.v3.services.ListInvoicesResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v3.services.ListInvoicesResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.google.ads.googleads.v3.resources.Invoice> invoices_ =
      java.util.Collections.emptyList();
    private void ensureInvoicesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        invoices_ = new java.util.ArrayList<com.google.ads.googleads.v3.resources.Invoice>(invoices_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.ads.googleads.v3.resources.Invoice, com.google.ads.googleads.v3.resources.Invoice.Builder, com.google.ads.googleads.v3.resources.InvoiceOrBuilder> invoicesBuilder_;

    /**
     * <pre>
     * The list of invoices that match the billing setup and time period.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v3.resources.Invoice invoices = 1;</code>
     */
    public java.util.List<com.google.ads.googleads.v3.resources.Invoice> getInvoicesList() {
      if (invoicesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(invoices_);
      } else {
        return invoicesBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * The list of invoices that match the billing setup and time period.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v3.resources.Invoice invoices = 1;</code>
     */
    public int getInvoicesCount() {
      if (invoicesBuilder_ == null) {
        return invoices_.size();
      } else {
        return invoicesBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * The list of invoices that match the billing setup and time period.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v3.resources.Invoice invoices = 1;</code>
     */
    public com.google.ads.googleads.v3.resources.Invoice getInvoices(int index) {
      if (invoicesBuilder_ == null) {
        return invoices_.get(index);
      } else {
        return invoicesBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * The list of invoices that match the billing setup and time period.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v3.resources.Invoice invoices = 1;</code>
     */
    public Builder setInvoices(
        int index, com.google.ads.googleads.v3.resources.Invoice value) {
      if (invoicesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureInvoicesIsMutable();
        invoices_.set(index, value);
        onChanged();
      } else {
        invoicesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The list of invoices that match the billing setup and time period.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v3.resources.Invoice invoices = 1;</code>
     */
    public Builder setInvoices(
        int index, com.google.ads.googleads.v3.resources.Invoice.Builder builderForValue) {
      if (invoicesBuilder_ == null) {
        ensureInvoicesIsMutable();
        invoices_.set(index, builderForValue.build());
        onChanged();
      } else {
        invoicesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The list of invoices that match the billing setup and time period.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v3.resources.Invoice invoices = 1;</code>
     */
    public Builder addInvoices(com.google.ads.googleads.v3.resources.Invoice value) {
      if (invoicesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureInvoicesIsMutable();
        invoices_.add(value);
        onChanged();
      } else {
        invoicesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * The list of invoices that match the billing setup and time period.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v3.resources.Invoice invoices = 1;</code>
     */
    public Builder addInvoices(
        int index, com.google.ads.googleads.v3.resources.Invoice value) {
      if (invoicesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureInvoicesIsMutable();
        invoices_.add(index, value);
        onChanged();
      } else {
        invoicesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The list of invoices that match the billing setup and time period.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v3.resources.Invoice invoices = 1;</code>
     */
    public Builder addInvoices(
        com.google.ads.googleads.v3.resources.Invoice.Builder builderForValue) {
      if (invoicesBuilder_ == null) {
        ensureInvoicesIsMutable();
        invoices_.add(builderForValue.build());
        onChanged();
      } else {
        invoicesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The list of invoices that match the billing setup and time period.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v3.resources.Invoice invoices = 1;</code>
     */
    public Builder addInvoices(
        int index, com.google.ads.googleads.v3.resources.Invoice.Builder builderForValue) {
      if (invoicesBuilder_ == null) {
        ensureInvoicesIsMutable();
        invoices_.add(index, builderForValue.build());
        onChanged();
      } else {
        invoicesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The list of invoices that match the billing setup and time period.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v3.resources.Invoice invoices = 1;</code>
     */
    public Builder addAllInvoices(
        java.lang.Iterable<? extends com.google.ads.googleads.v3.resources.Invoice> values) {
      if (invoicesBuilder_ == null) {
        ensureInvoicesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, invoices_);
        onChanged();
      } else {
        invoicesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * The list of invoices that match the billing setup and time period.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v3.resources.Invoice invoices = 1;</code>
     */
    public Builder clearInvoices() {
      if (invoicesBuilder_ == null) {
        invoices_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        invoicesBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * The list of invoices that match the billing setup and time period.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v3.resources.Invoice invoices = 1;</code>
     */
    public Builder removeInvoices(int index) {
      if (invoicesBuilder_ == null) {
        ensureInvoicesIsMutable();
        invoices_.remove(index);
        onChanged();
      } else {
        invoicesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * The list of invoices that match the billing setup and time period.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v3.resources.Invoice invoices = 1;</code>
     */
    public com.google.ads.googleads.v3.resources.Invoice.Builder getInvoicesBuilder(
        int index) {
      return getInvoicesFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * The list of invoices that match the billing setup and time period.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v3.resources.Invoice invoices = 1;</code>
     */
    public com.google.ads.googleads.v3.resources.InvoiceOrBuilder getInvoicesOrBuilder(
        int index) {
      if (invoicesBuilder_ == null) {
        return invoices_.get(index);  } else {
        return invoicesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * The list of invoices that match the billing setup and time period.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v3.resources.Invoice invoices = 1;</code>
     */
    public java.util.List<? extends com.google.ads.googleads.v3.resources.InvoiceOrBuilder> 
         getInvoicesOrBuilderList() {
      if (invoicesBuilder_ != null) {
        return invoicesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(invoices_);
      }
    }
    /**
     * <pre>
     * The list of invoices that match the billing setup and time period.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v3.resources.Invoice invoices = 1;</code>
     */
    public com.google.ads.googleads.v3.resources.Invoice.Builder addInvoicesBuilder() {
      return getInvoicesFieldBuilder().addBuilder(
          com.google.ads.googleads.v3.resources.Invoice.getDefaultInstance());
    }
    /**
     * <pre>
     * The list of invoices that match the billing setup and time period.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v3.resources.Invoice invoices = 1;</code>
     */
    public com.google.ads.googleads.v3.resources.Invoice.Builder addInvoicesBuilder(
        int index) {
      return getInvoicesFieldBuilder().addBuilder(
          index, com.google.ads.googleads.v3.resources.Invoice.getDefaultInstance());
    }
    /**
     * <pre>
     * The list of invoices that match the billing setup and time period.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v3.resources.Invoice invoices = 1;</code>
     */
    public java.util.List<com.google.ads.googleads.v3.resources.Invoice.Builder> 
         getInvoicesBuilderList() {
      return getInvoicesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.ads.googleads.v3.resources.Invoice, com.google.ads.googleads.v3.resources.Invoice.Builder, com.google.ads.googleads.v3.resources.InvoiceOrBuilder> 
        getInvoicesFieldBuilder() {
      if (invoicesBuilder_ == null) {
        invoicesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.ads.googleads.v3.resources.Invoice, com.google.ads.googleads.v3.resources.Invoice.Builder, com.google.ads.googleads.v3.resources.InvoiceOrBuilder>(
                invoices_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        invoices_ = null;
      }
      return invoicesBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v3.services.ListInvoicesResponse)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v3.services.ListInvoicesResponse)
  private static final com.google.ads.googleads.v3.services.ListInvoicesResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v3.services.ListInvoicesResponse();
  }

  public static com.google.ads.googleads.v3.services.ListInvoicesResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListInvoicesResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListInvoicesResponse>() {
    @java.lang.Override
    public ListInvoicesResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ListInvoicesResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ListInvoicesResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListInvoicesResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v3.services.ListInvoicesResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

