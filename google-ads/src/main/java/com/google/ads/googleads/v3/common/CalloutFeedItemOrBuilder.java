// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v3/common/extensions.proto

package com.google.ads.googleads.v3.common;

public interface CalloutFeedItemOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v3.common.CalloutFeedItem)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The callout text.
   * The length of this string should be between 1 and 25, inclusive.
   * </pre>
   *
   * <code>.google.protobuf.StringValue callout_text = 1;</code>
   * @return Whether the calloutText field is set.
   */
  boolean hasCalloutText();
  /**
   * <pre>
   * The callout text.
   * The length of this string should be between 1 and 25, inclusive.
   * </pre>
   *
   * <code>.google.protobuf.StringValue callout_text = 1;</code>
   * @return The calloutText.
   */
  com.google.protobuf.StringValue getCalloutText();
  /**
   * <pre>
   * The callout text.
   * The length of this string should be between 1 and 25, inclusive.
   * </pre>
   *
   * <code>.google.protobuf.StringValue callout_text = 1;</code>
   */
  com.google.protobuf.StringValueOrBuilder getCalloutTextOrBuilder();
}
