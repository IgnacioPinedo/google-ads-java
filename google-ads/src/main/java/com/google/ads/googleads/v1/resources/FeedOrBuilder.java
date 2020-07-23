// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v1/resources/feed.proto

package com.google.ads.googleads.v1.resources;

public interface FeedOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v1.resources.Feed)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Immutable. The resource name of the feed.
   * Feed resource names have the form:
   * `customers/{customer_id}/feeds/{feed_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The resourceName.
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * Immutable. The resource name of the feed.
   * Feed resource names have the form:
   * `customers/{customer_id}/feeds/{feed_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for resourceName.
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * Output only. The ID of the feed.
   * This field is read-only.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the id field is set.
   */
  boolean hasId();
  /**
   * <pre>
   * Output only. The ID of the feed.
   * This field is read-only.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The id.
   */
  com.google.protobuf.Int64Value getId();
  /**
   * <pre>
   * Output only. The ID of the feed.
   * This field is read-only.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getIdOrBuilder();

  /**
   * <pre>
   * Immutable. Name of the feed. Required.
   * </pre>
   *
   * <code>.google.protobuf.StringValue name = 3 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return Whether the name field is set.
   */
  boolean hasName();
  /**
   * <pre>
   * Immutable. Name of the feed. Required.
   * </pre>
   *
   * <code>.google.protobuf.StringValue name = 3 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The name.
   */
  com.google.protobuf.StringValue getName();
  /**
   * <pre>
   * Immutable. Name of the feed. Required.
   * </pre>
   *
   * <code>.google.protobuf.StringValue name = 3 [(.google.api.field_behavior) = IMMUTABLE];</code>
   */
  com.google.protobuf.StringValueOrBuilder getNameOrBuilder();

  /**
   * <pre>
   * The Feed's attributes. Required on CREATE, unless
   * system_feed_generation_data is provided, in which case Google Ads will
   * update the feed with the correct attributes.
   * Disallowed on UPDATE. Use attribute_operations to add new attributes.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v1.resources.FeedAttribute attributes = 4;</code>
   */
  java.util.List<com.google.ads.googleads.v1.resources.FeedAttribute> 
      getAttributesList();
  /**
   * <pre>
   * The Feed's attributes. Required on CREATE, unless
   * system_feed_generation_data is provided, in which case Google Ads will
   * update the feed with the correct attributes.
   * Disallowed on UPDATE. Use attribute_operations to add new attributes.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v1.resources.FeedAttribute attributes = 4;</code>
   */
  com.google.ads.googleads.v1.resources.FeedAttribute getAttributes(int index);
  /**
   * <pre>
   * The Feed's attributes. Required on CREATE, unless
   * system_feed_generation_data is provided, in which case Google Ads will
   * update the feed with the correct attributes.
   * Disallowed on UPDATE. Use attribute_operations to add new attributes.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v1.resources.FeedAttribute attributes = 4;</code>
   */
  int getAttributesCount();
  /**
   * <pre>
   * The Feed's attributes. Required on CREATE, unless
   * system_feed_generation_data is provided, in which case Google Ads will
   * update the feed with the correct attributes.
   * Disallowed on UPDATE. Use attribute_operations to add new attributes.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v1.resources.FeedAttribute attributes = 4;</code>
   */
  java.util.List<? extends com.google.ads.googleads.v1.resources.FeedAttributeOrBuilder> 
      getAttributesOrBuilderList();
  /**
   * <pre>
   * The Feed's attributes. Required on CREATE, unless
   * system_feed_generation_data is provided, in which case Google Ads will
   * update the feed with the correct attributes.
   * Disallowed on UPDATE. Use attribute_operations to add new attributes.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v1.resources.FeedAttribute attributes = 4;</code>
   */
  com.google.ads.googleads.v1.resources.FeedAttributeOrBuilder getAttributesOrBuilder(
      int index);

  /**
   * <pre>
   * The list of operations changing the feed attributes. Attributes can only
   * be added, not removed.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v1.resources.FeedAttributeOperation attribute_operations = 9;</code>
   */
  java.util.List<com.google.ads.googleads.v1.resources.FeedAttributeOperation> 
      getAttributeOperationsList();
  /**
   * <pre>
   * The list of operations changing the feed attributes. Attributes can only
   * be added, not removed.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v1.resources.FeedAttributeOperation attribute_operations = 9;</code>
   */
  com.google.ads.googleads.v1.resources.FeedAttributeOperation getAttributeOperations(int index);
  /**
   * <pre>
   * The list of operations changing the feed attributes. Attributes can only
   * be added, not removed.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v1.resources.FeedAttributeOperation attribute_operations = 9;</code>
   */
  int getAttributeOperationsCount();
  /**
   * <pre>
   * The list of operations changing the feed attributes. Attributes can only
   * be added, not removed.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v1.resources.FeedAttributeOperation attribute_operations = 9;</code>
   */
  java.util.List<? extends com.google.ads.googleads.v1.resources.FeedAttributeOperationOrBuilder> 
      getAttributeOperationsOrBuilderList();
  /**
   * <pre>
   * The list of operations changing the feed attributes. Attributes can only
   * be added, not removed.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v1.resources.FeedAttributeOperation attribute_operations = 9;</code>
   */
  com.google.ads.googleads.v1.resources.FeedAttributeOperationOrBuilder getAttributeOperationsOrBuilder(
      int index);

  /**
   * <pre>
   * Immutable. Specifies who manages the FeedAttributes for the Feed.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.enums.FeedOriginEnum.FeedOrigin origin = 5 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The enum numeric value on the wire for origin.
   */
  int getOriginValue();
  /**
   * <pre>
   * Immutable. Specifies who manages the FeedAttributes for the Feed.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.enums.FeedOriginEnum.FeedOrigin origin = 5 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The origin.
   */
  com.google.ads.googleads.v1.enums.FeedOriginEnum.FeedOrigin getOrigin();

  /**
   * <pre>
   * Output only. Status of the feed.
   * This field is read-only.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.enums.FeedStatusEnum.FeedStatus status = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   * <pre>
   * Output only. Status of the feed.
   * This field is read-only.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.enums.FeedStatusEnum.FeedStatus status = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The status.
   */
  com.google.ads.googleads.v1.enums.FeedStatusEnum.FeedStatus getStatus();

  /**
   * <pre>
   * Data used to configure a location feed populated from Google My Business
   * Locations.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.resources.Feed.PlacesLocationFeedData places_location_feed_data = 6;</code>
   * @return Whether the placesLocationFeedData field is set.
   */
  boolean hasPlacesLocationFeedData();
  /**
   * <pre>
   * Data used to configure a location feed populated from Google My Business
   * Locations.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.resources.Feed.PlacesLocationFeedData places_location_feed_data = 6;</code>
   * @return The placesLocationFeedData.
   */
  com.google.ads.googleads.v1.resources.Feed.PlacesLocationFeedData getPlacesLocationFeedData();
  /**
   * <pre>
   * Data used to configure a location feed populated from Google My Business
   * Locations.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.resources.Feed.PlacesLocationFeedData places_location_feed_data = 6;</code>
   */
  com.google.ads.googleads.v1.resources.Feed.PlacesLocationFeedDataOrBuilder getPlacesLocationFeedDataOrBuilder();

  /**
   * <pre>
   * Data used to configure an affiliate location feed populated with
   * the specified chains.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.resources.Feed.AffiliateLocationFeedData affiliate_location_feed_data = 7;</code>
   * @return Whether the affiliateLocationFeedData field is set.
   */
  boolean hasAffiliateLocationFeedData();
  /**
   * <pre>
   * Data used to configure an affiliate location feed populated with
   * the specified chains.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.resources.Feed.AffiliateLocationFeedData affiliate_location_feed_data = 7;</code>
   * @return The affiliateLocationFeedData.
   */
  com.google.ads.googleads.v1.resources.Feed.AffiliateLocationFeedData getAffiliateLocationFeedData();
  /**
   * <pre>
   * Data used to configure an affiliate location feed populated with
   * the specified chains.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.resources.Feed.AffiliateLocationFeedData affiliate_location_feed_data = 7;</code>
   */
  com.google.ads.googleads.v1.resources.Feed.AffiliateLocationFeedDataOrBuilder getAffiliateLocationFeedDataOrBuilder();

  public com.google.ads.googleads.v1.resources.Feed.SystemFeedGenerationDataCase getSystemFeedGenerationDataCase();
}
