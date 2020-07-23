// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v1/resources/feed.proto

package com.google.ads.googleads.v1.resources;

public interface FeedAttributeOperationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v1.resources.FeedAttributeOperation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. Type of list operation to perform.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.resources.FeedAttributeOperation.Operator operator = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for operator.
   */
  int getOperatorValue();
  /**
   * <pre>
   * Output only. Type of list operation to perform.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.resources.FeedAttributeOperation.Operator operator = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The operator.
   */
  com.google.ads.googleads.v1.resources.FeedAttributeOperation.Operator getOperator();

  /**
   * <pre>
   * Output only. The feed attribute being added to the list.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.resources.FeedAttribute value = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the value field is set.
   */
  boolean hasValue();
  /**
   * <pre>
   * Output only. The feed attribute being added to the list.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.resources.FeedAttribute value = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The value.
   */
  com.google.ads.googleads.v1.resources.FeedAttribute getValue();
  /**
   * <pre>
   * Output only. The feed attribute being added to the list.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.resources.FeedAttribute value = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.ads.googleads.v1.resources.FeedAttributeOrBuilder getValueOrBuilder();
}
