// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v1/resources/ad_group_label.proto

package com.google.ads.googleads.v1.resources;

public interface AdGroupLabelOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v1.resources.AdGroupLabel)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Immutable. The resource name of the ad group label.
   * Ad group label resource names have the form:
   * `customers/{customer_id}/adGroupLabels/{ad_group_id}~{label_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The resourceName.
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * Immutable. The resource name of the ad group label.
   * Ad group label resource names have the form:
   * `customers/{customer_id}/adGroupLabels/{ad_group_id}~{label_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for resourceName.
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * Immutable. The ad group to which the label is attached.
   * </pre>
   *
   * <code>.google.protobuf.StringValue ad_group = 2 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return Whether the adGroup field is set.
   */
  boolean hasAdGroup();
  /**
   * <pre>
   * Immutable. The ad group to which the label is attached.
   * </pre>
   *
   * <code>.google.protobuf.StringValue ad_group = 2 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The adGroup.
   */
  com.google.protobuf.StringValue getAdGroup();
  /**
   * <pre>
   * Immutable. The ad group to which the label is attached.
   * </pre>
   *
   * <code>.google.protobuf.StringValue ad_group = 2 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   */
  com.google.protobuf.StringValueOrBuilder getAdGroupOrBuilder();

  /**
   * <pre>
   * Immutable. The label assigned to the ad group.
   * </pre>
   *
   * <code>.google.protobuf.StringValue label = 3 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return Whether the label field is set.
   */
  boolean hasLabel();
  /**
   * <pre>
   * Immutable. The label assigned to the ad group.
   * </pre>
   *
   * <code>.google.protobuf.StringValue label = 3 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The label.
   */
  com.google.protobuf.StringValue getLabel();
  /**
   * <pre>
   * Immutable. The label assigned to the ad group.
   * </pre>
   *
   * <code>.google.protobuf.StringValue label = 3 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   */
  com.google.protobuf.StringValueOrBuilder getLabelOrBuilder();
}
