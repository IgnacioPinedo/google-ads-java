// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v3/resources/feed_mapping.proto

package com.google.ads.googleads.v3.resources;

public interface AttributeFieldMappingOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v3.resources.AttributeFieldMapping)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Immutable. Feed attribute from which to map.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value feed_attribute_id = 1 [(.google.api.field_behavior) = IMMUTABLE];</code>
   */
  boolean hasFeedAttributeId();
  /**
   * <pre>
   * Immutable. Feed attribute from which to map.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value feed_attribute_id = 1 [(.google.api.field_behavior) = IMMUTABLE];</code>
   */
  com.google.protobuf.Int64Value getFeedAttributeId();
  /**
   * <pre>
   * Immutable. Feed attribute from which to map.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value feed_attribute_id = 1 [(.google.api.field_behavior) = IMMUTABLE];</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getFeedAttributeIdOrBuilder();

  /**
   * <pre>
   * Output only. The placeholder field ID. If a placeholder field enum is not published in
   * the current API version, then this field will be populated and the field
   * oneof will be empty.
   * This field is read-only.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value field_id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  boolean hasFieldId();
  /**
   * <pre>
   * Output only. The placeholder field ID. If a placeholder field enum is not published in
   * the current API version, then this field will be populated and the field
   * oneof will be empty.
   * This field is read-only.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value field_id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.Int64Value getFieldId();
  /**
   * <pre>
   * Output only. The placeholder field ID. If a placeholder field enum is not published in
   * the current API version, then this field will be populated and the field
   * oneof will be empty.
   * This field is read-only.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value field_id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getFieldIdOrBuilder();

  /**
   * <pre>
   * Immutable. Sitelink Placeholder Fields.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.enums.SitelinkPlaceholderFieldEnum.SitelinkPlaceholderField sitelink_field = 3 [(.google.api.field_behavior) = IMMUTABLE];</code>
   */
  int getSitelinkFieldValue();
  /**
   * <pre>
   * Immutable. Sitelink Placeholder Fields.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.enums.SitelinkPlaceholderFieldEnum.SitelinkPlaceholderField sitelink_field = 3 [(.google.api.field_behavior) = IMMUTABLE];</code>
   */
  com.google.ads.googleads.v3.enums.SitelinkPlaceholderFieldEnum.SitelinkPlaceholderField getSitelinkField();

  /**
   * <pre>
   * Immutable. Call Placeholder Fields.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.enums.CallPlaceholderFieldEnum.CallPlaceholderField call_field = 4 [(.google.api.field_behavior) = IMMUTABLE];</code>
   */
  int getCallFieldValue();
  /**
   * <pre>
   * Immutable. Call Placeholder Fields.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.enums.CallPlaceholderFieldEnum.CallPlaceholderField call_field = 4 [(.google.api.field_behavior) = IMMUTABLE];</code>
   */
  com.google.ads.googleads.v3.enums.CallPlaceholderFieldEnum.CallPlaceholderField getCallField();

  /**
   * <pre>
   * Immutable. App Placeholder Fields.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.enums.AppPlaceholderFieldEnum.AppPlaceholderField app_field = 5 [(.google.api.field_behavior) = IMMUTABLE];</code>
   */
  int getAppFieldValue();
  /**
   * <pre>
   * Immutable. App Placeholder Fields.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.enums.AppPlaceholderFieldEnum.AppPlaceholderField app_field = 5 [(.google.api.field_behavior) = IMMUTABLE];</code>
   */
  com.google.ads.googleads.v3.enums.AppPlaceholderFieldEnum.AppPlaceholderField getAppField();

  /**
   * <pre>
   * Output only. Location Placeholder Fields. This field is read-only.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.enums.LocationPlaceholderFieldEnum.LocationPlaceholderField location_field = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  int getLocationFieldValue();
  /**
   * <pre>
   * Output only. Location Placeholder Fields. This field is read-only.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.enums.LocationPlaceholderFieldEnum.LocationPlaceholderField location_field = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.ads.googleads.v3.enums.LocationPlaceholderFieldEnum.LocationPlaceholderField getLocationField();

  /**
   * <pre>
   * Output only. Affiliate Location Placeholder Fields. This field is read-only.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.enums.AffiliateLocationPlaceholderFieldEnum.AffiliateLocationPlaceholderField affiliate_location_field = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  int getAffiliateLocationFieldValue();
  /**
   * <pre>
   * Output only. Affiliate Location Placeholder Fields. This field is read-only.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.enums.AffiliateLocationPlaceholderFieldEnum.AffiliateLocationPlaceholderField affiliate_location_field = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.ads.googleads.v3.enums.AffiliateLocationPlaceholderFieldEnum.AffiliateLocationPlaceholderField getAffiliateLocationField();

  /**
   * <pre>
   * Immutable. Callout Placeholder Fields.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.enums.CalloutPlaceholderFieldEnum.CalloutPlaceholderField callout_field = 8 [(.google.api.field_behavior) = IMMUTABLE];</code>
   */
  int getCalloutFieldValue();
  /**
   * <pre>
   * Immutable. Callout Placeholder Fields.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.enums.CalloutPlaceholderFieldEnum.CalloutPlaceholderField callout_field = 8 [(.google.api.field_behavior) = IMMUTABLE];</code>
   */
  com.google.ads.googleads.v3.enums.CalloutPlaceholderFieldEnum.CalloutPlaceholderField getCalloutField();

  /**
   * <pre>
   * Immutable. Structured Snippet Placeholder Fields.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.enums.StructuredSnippetPlaceholderFieldEnum.StructuredSnippetPlaceholderField structured_snippet_field = 9 [(.google.api.field_behavior) = IMMUTABLE];</code>
   */
  int getStructuredSnippetFieldValue();
  /**
   * <pre>
   * Immutable. Structured Snippet Placeholder Fields.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.enums.StructuredSnippetPlaceholderFieldEnum.StructuredSnippetPlaceholderField structured_snippet_field = 9 [(.google.api.field_behavior) = IMMUTABLE];</code>
   */
  com.google.ads.googleads.v3.enums.StructuredSnippetPlaceholderFieldEnum.StructuredSnippetPlaceholderField getStructuredSnippetField();

  /**
   * <pre>
   * Immutable. Message Placeholder Fields.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.enums.MessagePlaceholderFieldEnum.MessagePlaceholderField message_field = 10 [(.google.api.field_behavior) = IMMUTABLE];</code>
   */
  int getMessageFieldValue();
  /**
   * <pre>
   * Immutable. Message Placeholder Fields.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.enums.MessagePlaceholderFieldEnum.MessagePlaceholderField message_field = 10 [(.google.api.field_behavior) = IMMUTABLE];</code>
   */
  com.google.ads.googleads.v3.enums.MessagePlaceholderFieldEnum.MessagePlaceholderField getMessageField();

  /**
   * <pre>
   * Immutable. Price Placeholder Fields.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.enums.PricePlaceholderFieldEnum.PricePlaceholderField price_field = 11 [(.google.api.field_behavior) = IMMUTABLE];</code>
   */
  int getPriceFieldValue();
  /**
   * <pre>
   * Immutable. Price Placeholder Fields.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.enums.PricePlaceholderFieldEnum.PricePlaceholderField price_field = 11 [(.google.api.field_behavior) = IMMUTABLE];</code>
   */
  com.google.ads.googleads.v3.enums.PricePlaceholderFieldEnum.PricePlaceholderField getPriceField();

  /**
   * <pre>
   * Immutable. Promotion Placeholder Fields.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.enums.PromotionPlaceholderFieldEnum.PromotionPlaceholderField promotion_field = 12 [(.google.api.field_behavior) = IMMUTABLE];</code>
   */
  int getPromotionFieldValue();
  /**
   * <pre>
   * Immutable. Promotion Placeholder Fields.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.enums.PromotionPlaceholderFieldEnum.PromotionPlaceholderField promotion_field = 12 [(.google.api.field_behavior) = IMMUTABLE];</code>
   */
  com.google.ads.googleads.v3.enums.PromotionPlaceholderFieldEnum.PromotionPlaceholderField getPromotionField();

  /**
   * <pre>
   * Immutable. Ad Customizer Placeholder Fields
   * </pre>
   *
   * <code>.google.ads.googleads.v3.enums.AdCustomizerPlaceholderFieldEnum.AdCustomizerPlaceholderField ad_customizer_field = 13 [(.google.api.field_behavior) = IMMUTABLE];</code>
   */
  int getAdCustomizerFieldValue();
  /**
   * <pre>
   * Immutable. Ad Customizer Placeholder Fields
   * </pre>
   *
   * <code>.google.ads.googleads.v3.enums.AdCustomizerPlaceholderFieldEnum.AdCustomizerPlaceholderField ad_customizer_field = 13 [(.google.api.field_behavior) = IMMUTABLE];</code>
   */
  com.google.ads.googleads.v3.enums.AdCustomizerPlaceholderFieldEnum.AdCustomizerPlaceholderField getAdCustomizerField();

  /**
   * <pre>
   * Immutable. Dynamic Search Ad Page Feed Fields.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.enums.DsaPageFeedCriterionFieldEnum.DsaPageFeedCriterionField dsa_page_feed_field = 14 [(.google.api.field_behavior) = IMMUTABLE];</code>
   */
  int getDsaPageFeedFieldValue();
  /**
   * <pre>
   * Immutable. Dynamic Search Ad Page Feed Fields.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.enums.DsaPageFeedCriterionFieldEnum.DsaPageFeedCriterionField dsa_page_feed_field = 14 [(.google.api.field_behavior) = IMMUTABLE];</code>
   */
  com.google.ads.googleads.v3.enums.DsaPageFeedCriterionFieldEnum.DsaPageFeedCriterionField getDsaPageFeedField();

  /**
   * <pre>
   * Immutable. Location Target Fields.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.enums.LocationExtensionTargetingCriterionFieldEnum.LocationExtensionTargetingCriterionField location_extension_targeting_field = 15 [(.google.api.field_behavior) = IMMUTABLE];</code>
   */
  int getLocationExtensionTargetingFieldValue();
  /**
   * <pre>
   * Immutable. Location Target Fields.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.enums.LocationExtensionTargetingCriterionFieldEnum.LocationExtensionTargetingCriterionField location_extension_targeting_field = 15 [(.google.api.field_behavior) = IMMUTABLE];</code>
   */
  com.google.ads.googleads.v3.enums.LocationExtensionTargetingCriterionFieldEnum.LocationExtensionTargetingCriterionField getLocationExtensionTargetingField();

  /**
   * <pre>
   * Immutable. Education Placeholder Fields
   * </pre>
   *
   * <code>.google.ads.googleads.v3.enums.EducationPlaceholderFieldEnum.EducationPlaceholderField education_field = 16 [(.google.api.field_behavior) = IMMUTABLE];</code>
   */
  int getEducationFieldValue();
  /**
   * <pre>
   * Immutable. Education Placeholder Fields
   * </pre>
   *
   * <code>.google.ads.googleads.v3.enums.EducationPlaceholderFieldEnum.EducationPlaceholderField education_field = 16 [(.google.api.field_behavior) = IMMUTABLE];</code>
   */
  com.google.ads.googleads.v3.enums.EducationPlaceholderFieldEnum.EducationPlaceholderField getEducationField();

  /**
   * <pre>
   * Immutable. Flight Placeholder Fields
   * </pre>
   *
   * <code>.google.ads.googleads.v3.enums.FlightPlaceholderFieldEnum.FlightPlaceholderField flight_field = 17 [(.google.api.field_behavior) = IMMUTABLE];</code>
   */
  int getFlightFieldValue();
  /**
   * <pre>
   * Immutable. Flight Placeholder Fields
   * </pre>
   *
   * <code>.google.ads.googleads.v3.enums.FlightPlaceholderFieldEnum.FlightPlaceholderField flight_field = 17 [(.google.api.field_behavior) = IMMUTABLE];</code>
   */
  com.google.ads.googleads.v3.enums.FlightPlaceholderFieldEnum.FlightPlaceholderField getFlightField();

  /**
   * <pre>
   * Immutable. Custom Placeholder Fields
   * </pre>
   *
   * <code>.google.ads.googleads.v3.enums.CustomPlaceholderFieldEnum.CustomPlaceholderField custom_field = 18 [(.google.api.field_behavior) = IMMUTABLE];</code>
   */
  int getCustomFieldValue();
  /**
   * <pre>
   * Immutable. Custom Placeholder Fields
   * </pre>
   *
   * <code>.google.ads.googleads.v3.enums.CustomPlaceholderFieldEnum.CustomPlaceholderField custom_field = 18 [(.google.api.field_behavior) = IMMUTABLE];</code>
   */
  com.google.ads.googleads.v3.enums.CustomPlaceholderFieldEnum.CustomPlaceholderField getCustomField();

  /**
   * <pre>
   * Immutable. Hotel Placeholder Fields
   * </pre>
   *
   * <code>.google.ads.googleads.v3.enums.HotelPlaceholderFieldEnum.HotelPlaceholderField hotel_field = 19 [(.google.api.field_behavior) = IMMUTABLE];</code>
   */
  int getHotelFieldValue();
  /**
   * <pre>
   * Immutable. Hotel Placeholder Fields
   * </pre>
   *
   * <code>.google.ads.googleads.v3.enums.HotelPlaceholderFieldEnum.HotelPlaceholderField hotel_field = 19 [(.google.api.field_behavior) = IMMUTABLE];</code>
   */
  com.google.ads.googleads.v3.enums.HotelPlaceholderFieldEnum.HotelPlaceholderField getHotelField();

  /**
   * <pre>
   * Immutable. Real Estate Placeholder Fields
   * </pre>
   *
   * <code>.google.ads.googleads.v3.enums.RealEstatePlaceholderFieldEnum.RealEstatePlaceholderField real_estate_field = 20 [(.google.api.field_behavior) = IMMUTABLE];</code>
   */
  int getRealEstateFieldValue();
  /**
   * <pre>
   * Immutable. Real Estate Placeholder Fields
   * </pre>
   *
   * <code>.google.ads.googleads.v3.enums.RealEstatePlaceholderFieldEnum.RealEstatePlaceholderField real_estate_field = 20 [(.google.api.field_behavior) = IMMUTABLE];</code>
   */
  com.google.ads.googleads.v3.enums.RealEstatePlaceholderFieldEnum.RealEstatePlaceholderField getRealEstateField();

  /**
   * <pre>
   * Immutable. Travel Placeholder Fields
   * </pre>
   *
   * <code>.google.ads.googleads.v3.enums.TravelPlaceholderFieldEnum.TravelPlaceholderField travel_field = 21 [(.google.api.field_behavior) = IMMUTABLE];</code>
   */
  int getTravelFieldValue();
  /**
   * <pre>
   * Immutable. Travel Placeholder Fields
   * </pre>
   *
   * <code>.google.ads.googleads.v3.enums.TravelPlaceholderFieldEnum.TravelPlaceholderField travel_field = 21 [(.google.api.field_behavior) = IMMUTABLE];</code>
   */
  com.google.ads.googleads.v3.enums.TravelPlaceholderFieldEnum.TravelPlaceholderField getTravelField();

  /**
   * <pre>
   * Immutable. Local Placeholder Fields
   * </pre>
   *
   * <code>.google.ads.googleads.v3.enums.LocalPlaceholderFieldEnum.LocalPlaceholderField local_field = 22 [(.google.api.field_behavior) = IMMUTABLE];</code>
   */
  int getLocalFieldValue();
  /**
   * <pre>
   * Immutable. Local Placeholder Fields
   * </pre>
   *
   * <code>.google.ads.googleads.v3.enums.LocalPlaceholderFieldEnum.LocalPlaceholderField local_field = 22 [(.google.api.field_behavior) = IMMUTABLE];</code>
   */
  com.google.ads.googleads.v3.enums.LocalPlaceholderFieldEnum.LocalPlaceholderField getLocalField();

  /**
   * <pre>
   * Immutable. Job Placeholder Fields
   * </pre>
   *
   * <code>.google.ads.googleads.v3.enums.JobPlaceholderFieldEnum.JobPlaceholderField job_field = 23 [(.google.api.field_behavior) = IMMUTABLE];</code>
   */
  int getJobFieldValue();
  /**
   * <pre>
   * Immutable. Job Placeholder Fields
   * </pre>
   *
   * <code>.google.ads.googleads.v3.enums.JobPlaceholderFieldEnum.JobPlaceholderField job_field = 23 [(.google.api.field_behavior) = IMMUTABLE];</code>
   */
  com.google.ads.googleads.v3.enums.JobPlaceholderFieldEnum.JobPlaceholderField getJobField();

  public com.google.ads.googleads.v3.resources.AttributeFieldMapping.FieldCase getFieldCase();
}
