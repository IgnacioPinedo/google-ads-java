// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v1/resources/user_interest.proto

package com.google.ads.googleads.v1.resources;

public interface UserInterestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v1.resources.UserInterest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. The resource name of the user interest.
   * User interest resource names have the form:
   * `customers/{customer_id}/userInterests/{user_interest_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The resourceName.
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * Output only. The resource name of the user interest.
   * User interest resource names have the form:
   * `customers/{customer_id}/userInterests/{user_interest_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for resourceName.
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * Output only. Taxonomy type of the user interest.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.enums.UserInterestTaxonomyTypeEnum.UserInterestTaxonomyType taxonomy_type = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for taxonomyType.
   */
  int getTaxonomyTypeValue();
  /**
   * <pre>
   * Output only. Taxonomy type of the user interest.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.enums.UserInterestTaxonomyTypeEnum.UserInterestTaxonomyType taxonomy_type = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The taxonomyType.
   */
  com.google.ads.googleads.v1.enums.UserInterestTaxonomyTypeEnum.UserInterestTaxonomyType getTaxonomyType();

  /**
   * <pre>
   * Output only. The ID of the user interest.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value user_interest_id = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the userInterestId field is set.
   */
  boolean hasUserInterestId();
  /**
   * <pre>
   * Output only. The ID of the user interest.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value user_interest_id = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The userInterestId.
   */
  com.google.protobuf.Int64Value getUserInterestId();
  /**
   * <pre>
   * Output only. The ID of the user interest.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value user_interest_id = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getUserInterestIdOrBuilder();

  /**
   * <pre>
   * Output only. The name of the user interest.
   * </pre>
   *
   * <code>.google.protobuf.StringValue name = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the name field is set.
   */
  boolean hasName();
  /**
   * <pre>
   * Output only. The name of the user interest.
   * </pre>
   *
   * <code>.google.protobuf.StringValue name = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The name.
   */
  com.google.protobuf.StringValue getName();
  /**
   * <pre>
   * Output only. The name of the user interest.
   * </pre>
   *
   * <code>.google.protobuf.StringValue name = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.StringValueOrBuilder getNameOrBuilder();

  /**
   * <pre>
   * Output only. The parent of the user interest.
   * </pre>
   *
   * <code>.google.protobuf.StringValue user_interest_parent = 5 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return Whether the userInterestParent field is set.
   */
  boolean hasUserInterestParent();
  /**
   * <pre>
   * Output only. The parent of the user interest.
   * </pre>
   *
   * <code>.google.protobuf.StringValue user_interest_parent = 5 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The userInterestParent.
   */
  com.google.protobuf.StringValue getUserInterestParent();
  /**
   * <pre>
   * Output only. The parent of the user interest.
   * </pre>
   *
   * <code>.google.protobuf.StringValue user_interest_parent = 5 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   */
  com.google.protobuf.StringValueOrBuilder getUserInterestParentOrBuilder();

  /**
   * <pre>
   * Output only. True if the user interest is launched to all channels and locales.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue launched_to_all = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the launchedToAll field is set.
   */
  boolean hasLaunchedToAll();
  /**
   * <pre>
   * Output only. True if the user interest is launched to all channels and locales.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue launched_to_all = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The launchedToAll.
   */
  com.google.protobuf.BoolValue getLaunchedToAll();
  /**
   * <pre>
   * Output only. True if the user interest is launched to all channels and locales.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue launched_to_all = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.BoolValueOrBuilder getLaunchedToAllOrBuilder();

  /**
   * <pre>
   * Output only. Availability information of the user interest.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v1.common.CriterionCategoryAvailability availabilities = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  java.util.List<com.google.ads.googleads.v1.common.CriterionCategoryAvailability> 
      getAvailabilitiesList();
  /**
   * <pre>
   * Output only. Availability information of the user interest.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v1.common.CriterionCategoryAvailability availabilities = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.ads.googleads.v1.common.CriterionCategoryAvailability getAvailabilities(int index);
  /**
   * <pre>
   * Output only. Availability information of the user interest.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v1.common.CriterionCategoryAvailability availabilities = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  int getAvailabilitiesCount();
  /**
   * <pre>
   * Output only. Availability information of the user interest.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v1.common.CriterionCategoryAvailability availabilities = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  java.util.List<? extends com.google.ads.googleads.v1.common.CriterionCategoryAvailabilityOrBuilder> 
      getAvailabilitiesOrBuilderList();
  /**
   * <pre>
   * Output only. Availability information of the user interest.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v1.common.CriterionCategoryAvailability availabilities = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.ads.googleads.v1.common.CriterionCategoryAvailabilityOrBuilder getAvailabilitiesOrBuilder(
      int index);
}
