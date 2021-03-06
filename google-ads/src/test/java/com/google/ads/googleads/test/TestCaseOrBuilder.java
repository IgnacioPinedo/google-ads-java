// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google-ads/src/test/proto/google/ads/googleads/test/tester.proto

package com.google.ads.googleads.test;

public interface TestCaseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.test.TestCase)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string description = 1;</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <code>string description = 1;</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <code>.google.ads.googleads.test.Resource original_resource = 2;</code>
   * @return Whether the originalResource field is set.
   */
  boolean hasOriginalResource();
  /**
   * <code>.google.ads.googleads.test.Resource original_resource = 2;</code>
   * @return The originalResource.
   */
  com.google.ads.googleads.test.Resource getOriginalResource();
  /**
   * <code>.google.ads.googleads.test.Resource original_resource = 2;</code>
   */
  com.google.ads.googleads.test.ResourceOrBuilder getOriginalResourceOrBuilder();

  /**
   * <code>.google.ads.googleads.test.Resource modified_resource = 3;</code>
   * @return Whether the modifiedResource field is set.
   */
  boolean hasModifiedResource();
  /**
   * <code>.google.ads.googleads.test.Resource modified_resource = 3;</code>
   * @return The modifiedResource.
   */
  com.google.ads.googleads.test.Resource getModifiedResource();
  /**
   * <code>.google.ads.googleads.test.Resource modified_resource = 3;</code>
   */
  com.google.ads.googleads.test.ResourceOrBuilder getModifiedResourceOrBuilder();

  /**
   * <code>.google.protobuf.FieldMask expected_mask = 4;</code>
   * @return Whether the expectedMask field is set.
   */
  boolean hasExpectedMask();
  /**
   * <code>.google.protobuf.FieldMask expected_mask = 4;</code>
   * @return The expectedMask.
   */
  com.google.protobuf.FieldMask getExpectedMask();
  /**
   * <code>.google.protobuf.FieldMask expected_mask = 4;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getExpectedMaskOrBuilder();
}
