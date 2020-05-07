// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v3/resources/customer_manager_link.proto

package com.google.ads.googleads.v3.resources;

public interface CustomerManagerLinkOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v3.resources.CustomerManagerLink)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Immutable. Name of the resource.
   * CustomerManagerLink resource names have the form:
   * `customers/{customer_id}/customerManagerLinks/{manager_customer_id}~{manager_link_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * Immutable. Name of the resource.
   * CustomerManagerLink resource names have the form:
   * `customers/{customer_id}/customerManagerLinks/{manager_customer_id}~{manager_link_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * Output only. The manager customer linked to the customer.
   * </pre>
   *
   * <code>.google.protobuf.StringValue manager_customer = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  boolean hasManagerCustomer();
  /**
   * <pre>
   * Output only. The manager customer linked to the customer.
   * </pre>
   *
   * <code>.google.protobuf.StringValue manager_customer = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.StringValue getManagerCustomer();
  /**
   * <pre>
   * Output only. The manager customer linked to the customer.
   * </pre>
   *
   * <code>.google.protobuf.StringValue manager_customer = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.StringValueOrBuilder getManagerCustomerOrBuilder();

  /**
   * <pre>
   * Output only. ID of the customer-manager link. This field is read only.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value manager_link_id = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  boolean hasManagerLinkId();
  /**
   * <pre>
   * Output only. ID of the customer-manager link. This field is read only.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value manager_link_id = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.Int64Value getManagerLinkId();
  /**
   * <pre>
   * Output only. ID of the customer-manager link. This field is read only.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value manager_link_id = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getManagerLinkIdOrBuilder();

  /**
   * <pre>
   * Status of the link between the customer and the manager.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.enums.ManagerLinkStatusEnum.ManagerLinkStatus status = 5;</code>
   */
  int getStatusValue();
  /**
   * <pre>
   * Status of the link between the customer and the manager.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.enums.ManagerLinkStatusEnum.ManagerLinkStatus status = 5;</code>
   */
  com.google.ads.googleads.v3.enums.ManagerLinkStatusEnum.ManagerLinkStatus getStatus();
}
