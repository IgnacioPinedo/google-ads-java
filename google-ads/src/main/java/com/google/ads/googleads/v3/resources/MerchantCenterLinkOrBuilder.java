// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v3/resources/merchant_center_link.proto

package com.google.ads.googleads.v3.resources;

public interface MerchantCenterLinkOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v3.resources.MerchantCenterLink)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Immutable. The resource name of the merchant center link.
   * Merchant center link resource names have the form:
   * `customers/{customer_id}/merchantCenterLinks/{merchant_center_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * Immutable. The resource name of the merchant center link.
   * Merchant center link resource names have the form:
   * `customers/{customer_id}/merchantCenterLinks/{merchant_center_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * Output only. The ID of the Merchant Center account.
   * This field is readonly.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value id = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  boolean hasId();
  /**
   * <pre>
   * Output only. The ID of the Merchant Center account.
   * This field is readonly.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value id = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.Int64Value getId();
  /**
   * <pre>
   * Output only. The ID of the Merchant Center account.
   * This field is readonly.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value id = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getIdOrBuilder();

  /**
   * <pre>
   * Output only. The name of the Merchant Center account.
   * This field is readonly.
   * </pre>
   *
   * <code>.google.protobuf.StringValue merchant_center_account_name = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  boolean hasMerchantCenterAccountName();
  /**
   * <pre>
   * Output only. The name of the Merchant Center account.
   * This field is readonly.
   * </pre>
   *
   * <code>.google.protobuf.StringValue merchant_center_account_name = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.StringValue getMerchantCenterAccountName();
  /**
   * <pre>
   * Output only. The name of the Merchant Center account.
   * This field is readonly.
   * </pre>
   *
   * <code>.google.protobuf.StringValue merchant_center_account_name = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.StringValueOrBuilder getMerchantCenterAccountNameOrBuilder();

  /**
   * <pre>
   * The status of the link.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.enums.MerchantCenterLinkStatusEnum.MerchantCenterLinkStatus status = 5;</code>
   */
  int getStatusValue();
  /**
   * <pre>
   * The status of the link.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.enums.MerchantCenterLinkStatusEnum.MerchantCenterLinkStatus status = 5;</code>
   */
  com.google.ads.googleads.v3.enums.MerchantCenterLinkStatusEnum.MerchantCenterLinkStatus getStatus();
}
