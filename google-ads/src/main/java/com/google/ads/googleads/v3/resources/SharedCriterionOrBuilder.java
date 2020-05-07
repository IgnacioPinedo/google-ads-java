// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v3/resources/shared_criterion.proto

package com.google.ads.googleads.v3.resources;

public interface SharedCriterionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v3.resources.SharedCriterion)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Immutable. The resource name of the shared criterion.
   * Shared set resource names have the form:
   * `customers/{customer_id}/sharedCriteria/{shared_set_id}~{criterion_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * Immutable. The resource name of the shared criterion.
   * Shared set resource names have the form:
   * `customers/{customer_id}/sharedCriteria/{shared_set_id}~{criterion_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * Immutable. The shared set to which the shared criterion belongs.
   * </pre>
   *
   * <code>.google.protobuf.StringValue shared_set = 2 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   */
  boolean hasSharedSet();
  /**
   * <pre>
   * Immutable. The shared set to which the shared criterion belongs.
   * </pre>
   *
   * <code>.google.protobuf.StringValue shared_set = 2 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   */
  com.google.protobuf.StringValue getSharedSet();
  /**
   * <pre>
   * Immutable. The shared set to which the shared criterion belongs.
   * </pre>
   *
   * <code>.google.protobuf.StringValue shared_set = 2 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   */
  com.google.protobuf.StringValueOrBuilder getSharedSetOrBuilder();

  /**
   * <pre>
   * Output only. The ID of the criterion.
   * This field is ignored for mutates.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value criterion_id = 26 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  boolean hasCriterionId();
  /**
   * <pre>
   * Output only. The ID of the criterion.
   * This field is ignored for mutates.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value criterion_id = 26 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.Int64Value getCriterionId();
  /**
   * <pre>
   * Output only. The ID of the criterion.
   * This field is ignored for mutates.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value criterion_id = 26 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getCriterionIdOrBuilder();

  /**
   * <pre>
   * Output only. The type of the criterion.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.enums.CriterionTypeEnum.CriterionType type = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  int getTypeValue();
  /**
   * <pre>
   * Output only. The type of the criterion.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.enums.CriterionTypeEnum.CriterionType type = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.ads.googleads.v3.enums.CriterionTypeEnum.CriterionType getType();

  /**
   * <pre>
   * Immutable. Keyword.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.KeywordInfo keyword = 3 [(.google.api.field_behavior) = IMMUTABLE];</code>
   */
  boolean hasKeyword();
  /**
   * <pre>
   * Immutable. Keyword.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.KeywordInfo keyword = 3 [(.google.api.field_behavior) = IMMUTABLE];</code>
   */
  com.google.ads.googleads.v3.common.KeywordInfo getKeyword();
  /**
   * <pre>
   * Immutable. Keyword.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.KeywordInfo keyword = 3 [(.google.api.field_behavior) = IMMUTABLE];</code>
   */
  com.google.ads.googleads.v3.common.KeywordInfoOrBuilder getKeywordOrBuilder();

  /**
   * <pre>
   * Immutable. YouTube Video.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.YouTubeVideoInfo youtube_video = 5 [(.google.api.field_behavior) = IMMUTABLE];</code>
   */
  boolean hasYoutubeVideo();
  /**
   * <pre>
   * Immutable. YouTube Video.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.YouTubeVideoInfo youtube_video = 5 [(.google.api.field_behavior) = IMMUTABLE];</code>
   */
  com.google.ads.googleads.v3.common.YouTubeVideoInfo getYoutubeVideo();
  /**
   * <pre>
   * Immutable. YouTube Video.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.YouTubeVideoInfo youtube_video = 5 [(.google.api.field_behavior) = IMMUTABLE];</code>
   */
  com.google.ads.googleads.v3.common.YouTubeVideoInfoOrBuilder getYoutubeVideoOrBuilder();

  /**
   * <pre>
   * Immutable. YouTube Channel.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.YouTubeChannelInfo youtube_channel = 6 [(.google.api.field_behavior) = IMMUTABLE];</code>
   */
  boolean hasYoutubeChannel();
  /**
   * <pre>
   * Immutable. YouTube Channel.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.YouTubeChannelInfo youtube_channel = 6 [(.google.api.field_behavior) = IMMUTABLE];</code>
   */
  com.google.ads.googleads.v3.common.YouTubeChannelInfo getYoutubeChannel();
  /**
   * <pre>
   * Immutable. YouTube Channel.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.YouTubeChannelInfo youtube_channel = 6 [(.google.api.field_behavior) = IMMUTABLE];</code>
   */
  com.google.ads.googleads.v3.common.YouTubeChannelInfoOrBuilder getYoutubeChannelOrBuilder();

  /**
   * <pre>
   * Immutable. Placement.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.PlacementInfo placement = 7 [(.google.api.field_behavior) = IMMUTABLE];</code>
   */
  boolean hasPlacement();
  /**
   * <pre>
   * Immutable. Placement.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.PlacementInfo placement = 7 [(.google.api.field_behavior) = IMMUTABLE];</code>
   */
  com.google.ads.googleads.v3.common.PlacementInfo getPlacement();
  /**
   * <pre>
   * Immutable. Placement.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.PlacementInfo placement = 7 [(.google.api.field_behavior) = IMMUTABLE];</code>
   */
  com.google.ads.googleads.v3.common.PlacementInfoOrBuilder getPlacementOrBuilder();

  /**
   * <pre>
   * Immutable. Mobile App Category.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.MobileAppCategoryInfo mobile_app_category = 8 [(.google.api.field_behavior) = IMMUTABLE];</code>
   */
  boolean hasMobileAppCategory();
  /**
   * <pre>
   * Immutable. Mobile App Category.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.MobileAppCategoryInfo mobile_app_category = 8 [(.google.api.field_behavior) = IMMUTABLE];</code>
   */
  com.google.ads.googleads.v3.common.MobileAppCategoryInfo getMobileAppCategory();
  /**
   * <pre>
   * Immutable. Mobile App Category.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.MobileAppCategoryInfo mobile_app_category = 8 [(.google.api.field_behavior) = IMMUTABLE];</code>
   */
  com.google.ads.googleads.v3.common.MobileAppCategoryInfoOrBuilder getMobileAppCategoryOrBuilder();

  /**
   * <pre>
   * Immutable. Mobile application.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.MobileApplicationInfo mobile_application = 9 [(.google.api.field_behavior) = IMMUTABLE];</code>
   */
  boolean hasMobileApplication();
  /**
   * <pre>
   * Immutable. Mobile application.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.MobileApplicationInfo mobile_application = 9 [(.google.api.field_behavior) = IMMUTABLE];</code>
   */
  com.google.ads.googleads.v3.common.MobileApplicationInfo getMobileApplication();
  /**
   * <pre>
   * Immutable. Mobile application.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.MobileApplicationInfo mobile_application = 9 [(.google.api.field_behavior) = IMMUTABLE];</code>
   */
  com.google.ads.googleads.v3.common.MobileApplicationInfoOrBuilder getMobileApplicationOrBuilder();

  public com.google.ads.googleads.v3.resources.SharedCriterion.CriterionCase getCriterionCase();
}
