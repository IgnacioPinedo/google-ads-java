// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v3/resources/ad.proto

package com.google.ads.googleads.v3.resources;

public interface AdOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v3.resources.Ad)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Immutable. The resource name of the ad.
   * Ad resource names have the form:
   * `customers/{customer_id}/ads/{ad_id}`
   * </pre>
   *
   * <code>string resource_name = 37 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * Immutable. The resource name of the ad.
   * Ad resource names have the form:
   * `customers/{customer_id}/ads/{ad_id}`
   * </pre>
   *
   * <code>string resource_name = 37 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * Output only. The ID of the ad.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value id = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  boolean hasId();
  /**
   * <pre>
   * Output only. The ID of the ad.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value id = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.Int64Value getId();
  /**
   * <pre>
   * Output only. The ID of the ad.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value id = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getIdOrBuilder();

  /**
   * <pre>
   * The list of possible final URLs after all cross-domain redirects for the
   * ad.
   * </pre>
   *
   * <code>repeated .google.protobuf.StringValue final_urls = 2;</code>
   */
  java.util.List<com.google.protobuf.StringValue> 
      getFinalUrlsList();
  /**
   * <pre>
   * The list of possible final URLs after all cross-domain redirects for the
   * ad.
   * </pre>
   *
   * <code>repeated .google.protobuf.StringValue final_urls = 2;</code>
   */
  com.google.protobuf.StringValue getFinalUrls(int index);
  /**
   * <pre>
   * The list of possible final URLs after all cross-domain redirects for the
   * ad.
   * </pre>
   *
   * <code>repeated .google.protobuf.StringValue final_urls = 2;</code>
   */
  int getFinalUrlsCount();
  /**
   * <pre>
   * The list of possible final URLs after all cross-domain redirects for the
   * ad.
   * </pre>
   *
   * <code>repeated .google.protobuf.StringValue final_urls = 2;</code>
   */
  java.util.List<? extends com.google.protobuf.StringValueOrBuilder> 
      getFinalUrlsOrBuilderList();
  /**
   * <pre>
   * The list of possible final URLs after all cross-domain redirects for the
   * ad.
   * </pre>
   *
   * <code>repeated .google.protobuf.StringValue final_urls = 2;</code>
   */
  com.google.protobuf.StringValueOrBuilder getFinalUrlsOrBuilder(
      int index);

  /**
   * <pre>
   * A list of final app URLs that will be used on mobile if the user has the
   * specific app installed.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v3.common.FinalAppUrl final_app_urls = 35;</code>
   */
  java.util.List<com.google.ads.googleads.v3.common.FinalAppUrl> 
      getFinalAppUrlsList();
  /**
   * <pre>
   * A list of final app URLs that will be used on mobile if the user has the
   * specific app installed.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v3.common.FinalAppUrl final_app_urls = 35;</code>
   */
  com.google.ads.googleads.v3.common.FinalAppUrl getFinalAppUrls(int index);
  /**
   * <pre>
   * A list of final app URLs that will be used on mobile if the user has the
   * specific app installed.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v3.common.FinalAppUrl final_app_urls = 35;</code>
   */
  int getFinalAppUrlsCount();
  /**
   * <pre>
   * A list of final app URLs that will be used on mobile if the user has the
   * specific app installed.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v3.common.FinalAppUrl final_app_urls = 35;</code>
   */
  java.util.List<? extends com.google.ads.googleads.v3.common.FinalAppUrlOrBuilder> 
      getFinalAppUrlsOrBuilderList();
  /**
   * <pre>
   * A list of final app URLs that will be used on mobile if the user has the
   * specific app installed.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v3.common.FinalAppUrl final_app_urls = 35;</code>
   */
  com.google.ads.googleads.v3.common.FinalAppUrlOrBuilder getFinalAppUrlsOrBuilder(
      int index);

  /**
   * <pre>
   * The list of possible final mobile URLs after all cross-domain redirects
   * for the ad.
   * </pre>
   *
   * <code>repeated .google.protobuf.StringValue final_mobile_urls = 16;</code>
   */
  java.util.List<com.google.protobuf.StringValue> 
      getFinalMobileUrlsList();
  /**
   * <pre>
   * The list of possible final mobile URLs after all cross-domain redirects
   * for the ad.
   * </pre>
   *
   * <code>repeated .google.protobuf.StringValue final_mobile_urls = 16;</code>
   */
  com.google.protobuf.StringValue getFinalMobileUrls(int index);
  /**
   * <pre>
   * The list of possible final mobile URLs after all cross-domain redirects
   * for the ad.
   * </pre>
   *
   * <code>repeated .google.protobuf.StringValue final_mobile_urls = 16;</code>
   */
  int getFinalMobileUrlsCount();
  /**
   * <pre>
   * The list of possible final mobile URLs after all cross-domain redirects
   * for the ad.
   * </pre>
   *
   * <code>repeated .google.protobuf.StringValue final_mobile_urls = 16;</code>
   */
  java.util.List<? extends com.google.protobuf.StringValueOrBuilder> 
      getFinalMobileUrlsOrBuilderList();
  /**
   * <pre>
   * The list of possible final mobile URLs after all cross-domain redirects
   * for the ad.
   * </pre>
   *
   * <code>repeated .google.protobuf.StringValue final_mobile_urls = 16;</code>
   */
  com.google.protobuf.StringValueOrBuilder getFinalMobileUrlsOrBuilder(
      int index);

  /**
   * <pre>
   * The URL template for constructing a tracking URL.
   * </pre>
   *
   * <code>.google.protobuf.StringValue tracking_url_template = 12;</code>
   */
  boolean hasTrackingUrlTemplate();
  /**
   * <pre>
   * The URL template for constructing a tracking URL.
   * </pre>
   *
   * <code>.google.protobuf.StringValue tracking_url_template = 12;</code>
   */
  com.google.protobuf.StringValue getTrackingUrlTemplate();
  /**
   * <pre>
   * The URL template for constructing a tracking URL.
   * </pre>
   *
   * <code>.google.protobuf.StringValue tracking_url_template = 12;</code>
   */
  com.google.protobuf.StringValueOrBuilder getTrackingUrlTemplateOrBuilder();

  /**
   * <pre>
   * The suffix to use when constructing a final URL.
   * </pre>
   *
   * <code>.google.protobuf.StringValue final_url_suffix = 38;</code>
   */
  boolean hasFinalUrlSuffix();
  /**
   * <pre>
   * The suffix to use when constructing a final URL.
   * </pre>
   *
   * <code>.google.protobuf.StringValue final_url_suffix = 38;</code>
   */
  com.google.protobuf.StringValue getFinalUrlSuffix();
  /**
   * <pre>
   * The suffix to use when constructing a final URL.
   * </pre>
   *
   * <code>.google.protobuf.StringValue final_url_suffix = 38;</code>
   */
  com.google.protobuf.StringValueOrBuilder getFinalUrlSuffixOrBuilder();

  /**
   * <pre>
   * The list of mappings that can be used to substitute custom parameter tags
   * in a `tracking_url_template`, `final_urls`, or `mobile_final_urls`.
   * For mutates, please use url custom parameter operations.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v3.common.CustomParameter url_custom_parameters = 10;</code>
   */
  java.util.List<com.google.ads.googleads.v3.common.CustomParameter> 
      getUrlCustomParametersList();
  /**
   * <pre>
   * The list of mappings that can be used to substitute custom parameter tags
   * in a `tracking_url_template`, `final_urls`, or `mobile_final_urls`.
   * For mutates, please use url custom parameter operations.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v3.common.CustomParameter url_custom_parameters = 10;</code>
   */
  com.google.ads.googleads.v3.common.CustomParameter getUrlCustomParameters(int index);
  /**
   * <pre>
   * The list of mappings that can be used to substitute custom parameter tags
   * in a `tracking_url_template`, `final_urls`, or `mobile_final_urls`.
   * For mutates, please use url custom parameter operations.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v3.common.CustomParameter url_custom_parameters = 10;</code>
   */
  int getUrlCustomParametersCount();
  /**
   * <pre>
   * The list of mappings that can be used to substitute custom parameter tags
   * in a `tracking_url_template`, `final_urls`, or `mobile_final_urls`.
   * For mutates, please use url custom parameter operations.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v3.common.CustomParameter url_custom_parameters = 10;</code>
   */
  java.util.List<? extends com.google.ads.googleads.v3.common.CustomParameterOrBuilder> 
      getUrlCustomParametersOrBuilderList();
  /**
   * <pre>
   * The list of mappings that can be used to substitute custom parameter tags
   * in a `tracking_url_template`, `final_urls`, or `mobile_final_urls`.
   * For mutates, please use url custom parameter operations.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v3.common.CustomParameter url_custom_parameters = 10;</code>
   */
  com.google.ads.googleads.v3.common.CustomParameterOrBuilder getUrlCustomParametersOrBuilder(
      int index);

  /**
   * <pre>
   * The URL that appears in the ad description for some ad formats.
   * </pre>
   *
   * <code>.google.protobuf.StringValue display_url = 4;</code>
   */
  boolean hasDisplayUrl();
  /**
   * <pre>
   * The URL that appears in the ad description for some ad formats.
   * </pre>
   *
   * <code>.google.protobuf.StringValue display_url = 4;</code>
   */
  com.google.protobuf.StringValue getDisplayUrl();
  /**
   * <pre>
   * The URL that appears in the ad description for some ad formats.
   * </pre>
   *
   * <code>.google.protobuf.StringValue display_url = 4;</code>
   */
  com.google.protobuf.StringValueOrBuilder getDisplayUrlOrBuilder();

  /**
   * <pre>
   * Output only. The type of ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.enums.AdTypeEnum.AdType type = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  int getTypeValue();
  /**
   * <pre>
   * Output only. The type of ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.enums.AdTypeEnum.AdType type = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.ads.googleads.v3.enums.AdTypeEnum.AdType getType();

  /**
   * <pre>
   * Output only. Indicates if this ad was automatically added by Google Ads and not by a
   * user. For example, this could happen when ads are automatically created as
   * suggestions for new ads based on knowledge of how existing ads are
   * performing.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue added_by_google_ads = 19 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  boolean hasAddedByGoogleAds();
  /**
   * <pre>
   * Output only. Indicates if this ad was automatically added by Google Ads and not by a
   * user. For example, this could happen when ads are automatically created as
   * suggestions for new ads based on knowledge of how existing ads are
   * performing.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue added_by_google_ads = 19 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.BoolValue getAddedByGoogleAds();
  /**
   * <pre>
   * Output only. Indicates if this ad was automatically added by Google Ads and not by a
   * user. For example, this could happen when ads are automatically created as
   * suggestions for new ads based on knowledge of how existing ads are
   * performing.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue added_by_google_ads = 19 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.BoolValueOrBuilder getAddedByGoogleAdsOrBuilder();

  /**
   * <pre>
   * The device preference for the ad. You can only specify a preference for
   * mobile devices. When this preference is set the ad will be preferred over
   * other ads when being displayed on a mobile device. The ad can still be
   * displayed on other device types, e.g. if no other ads are available.
   * If unspecified (no device preference), all devices are targeted.
   * This is only supported by some ad types.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.enums.DeviceEnum.Device device_preference = 20;</code>
   */
  int getDevicePreferenceValue();
  /**
   * <pre>
   * The device preference for the ad. You can only specify a preference for
   * mobile devices. When this preference is set the ad will be preferred over
   * other ads when being displayed on a mobile device. The ad can still be
   * displayed on other device types, e.g. if no other ads are available.
   * If unspecified (no device preference), all devices are targeted.
   * This is only supported by some ad types.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.enums.DeviceEnum.Device device_preference = 20;</code>
   */
  com.google.ads.googleads.v3.enums.DeviceEnum.Device getDevicePreference();

  /**
   * <pre>
   * Additional URLs for the ad that are tagged with a unique identifier that
   * can be referenced from other fields in the ad.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v3.common.UrlCollection url_collections = 26;</code>
   */
  java.util.List<com.google.ads.googleads.v3.common.UrlCollection> 
      getUrlCollectionsList();
  /**
   * <pre>
   * Additional URLs for the ad that are tagged with a unique identifier that
   * can be referenced from other fields in the ad.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v3.common.UrlCollection url_collections = 26;</code>
   */
  com.google.ads.googleads.v3.common.UrlCollection getUrlCollections(int index);
  /**
   * <pre>
   * Additional URLs for the ad that are tagged with a unique identifier that
   * can be referenced from other fields in the ad.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v3.common.UrlCollection url_collections = 26;</code>
   */
  int getUrlCollectionsCount();
  /**
   * <pre>
   * Additional URLs for the ad that are tagged with a unique identifier that
   * can be referenced from other fields in the ad.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v3.common.UrlCollection url_collections = 26;</code>
   */
  java.util.List<? extends com.google.ads.googleads.v3.common.UrlCollectionOrBuilder> 
      getUrlCollectionsOrBuilderList();
  /**
   * <pre>
   * Additional URLs for the ad that are tagged with a unique identifier that
   * can be referenced from other fields in the ad.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v3.common.UrlCollection url_collections = 26;</code>
   */
  com.google.ads.googleads.v3.common.UrlCollectionOrBuilder getUrlCollectionsOrBuilder(
      int index);

  /**
   * <pre>
   * Immutable. The name of the ad. This is only used to be able to identify the ad. It
   * does not need to be unique and does not affect the served ad.
   * </pre>
   *
   * <code>.google.protobuf.StringValue name = 23 [(.google.api.field_behavior) = IMMUTABLE];</code>
   */
  boolean hasName();
  /**
   * <pre>
   * Immutable. The name of the ad. This is only used to be able to identify the ad. It
   * does not need to be unique and does not affect the served ad.
   * </pre>
   *
   * <code>.google.protobuf.StringValue name = 23 [(.google.api.field_behavior) = IMMUTABLE];</code>
   */
  com.google.protobuf.StringValue getName();
  /**
   * <pre>
   * Immutable. The name of the ad. This is only used to be able to identify the ad. It
   * does not need to be unique and does not affect the served ad.
   * </pre>
   *
   * <code>.google.protobuf.StringValue name = 23 [(.google.api.field_behavior) = IMMUTABLE];</code>
   */
  com.google.protobuf.StringValueOrBuilder getNameOrBuilder();

  /**
   * <pre>
   * Output only. If this ad is system managed, then this field will indicate the source.
   * This field is read-only.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.enums.SystemManagedResourceSourceEnum.SystemManagedResourceSource system_managed_resource_source = 27 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  int getSystemManagedResourceSourceValue();
  /**
   * <pre>
   * Output only. If this ad is system managed, then this field will indicate the source.
   * This field is read-only.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.enums.SystemManagedResourceSourceEnum.SystemManagedResourceSource system_managed_resource_source = 27 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.ads.googleads.v3.enums.SystemManagedResourceSourceEnum.SystemManagedResourceSource getSystemManagedResourceSource();

  /**
   * <pre>
   * Details pertaining to a text ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.TextAdInfo text_ad = 6;</code>
   */
  boolean hasTextAd();
  /**
   * <pre>
   * Details pertaining to a text ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.TextAdInfo text_ad = 6;</code>
   */
  com.google.ads.googleads.v3.common.TextAdInfo getTextAd();
  /**
   * <pre>
   * Details pertaining to a text ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.TextAdInfo text_ad = 6;</code>
   */
  com.google.ads.googleads.v3.common.TextAdInfoOrBuilder getTextAdOrBuilder();

  /**
   * <pre>
   * Details pertaining to an expanded text ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.ExpandedTextAdInfo expanded_text_ad = 7;</code>
   */
  boolean hasExpandedTextAd();
  /**
   * <pre>
   * Details pertaining to an expanded text ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.ExpandedTextAdInfo expanded_text_ad = 7;</code>
   */
  com.google.ads.googleads.v3.common.ExpandedTextAdInfo getExpandedTextAd();
  /**
   * <pre>
   * Details pertaining to an expanded text ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.ExpandedTextAdInfo expanded_text_ad = 7;</code>
   */
  com.google.ads.googleads.v3.common.ExpandedTextAdInfoOrBuilder getExpandedTextAdOrBuilder();

  /**
   * <pre>
   * Details pertaining to a call-only ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.CallOnlyAdInfo call_only_ad = 13;</code>
   */
  boolean hasCallOnlyAd();
  /**
   * <pre>
   * Details pertaining to a call-only ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.CallOnlyAdInfo call_only_ad = 13;</code>
   */
  com.google.ads.googleads.v3.common.CallOnlyAdInfo getCallOnlyAd();
  /**
   * <pre>
   * Details pertaining to a call-only ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.CallOnlyAdInfo call_only_ad = 13;</code>
   */
  com.google.ads.googleads.v3.common.CallOnlyAdInfoOrBuilder getCallOnlyAdOrBuilder();

  /**
   * <pre>
   * Details pertaining to an Expanded Dynamic Search Ad.
   * This type of ad has its headline, final URLs, and display URL
   * auto-generated at serving time according to domain name specific
   * information provided by `dynamic_search_ads_setting` linked at the
   * campaign level.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.ExpandedDynamicSearchAdInfo expanded_dynamic_search_ad = 14;</code>
   */
  boolean hasExpandedDynamicSearchAd();
  /**
   * <pre>
   * Details pertaining to an Expanded Dynamic Search Ad.
   * This type of ad has its headline, final URLs, and display URL
   * auto-generated at serving time according to domain name specific
   * information provided by `dynamic_search_ads_setting` linked at the
   * campaign level.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.ExpandedDynamicSearchAdInfo expanded_dynamic_search_ad = 14;</code>
   */
  com.google.ads.googleads.v3.common.ExpandedDynamicSearchAdInfo getExpandedDynamicSearchAd();
  /**
   * <pre>
   * Details pertaining to an Expanded Dynamic Search Ad.
   * This type of ad has its headline, final URLs, and display URL
   * auto-generated at serving time according to domain name specific
   * information provided by `dynamic_search_ads_setting` linked at the
   * campaign level.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.ExpandedDynamicSearchAdInfo expanded_dynamic_search_ad = 14;</code>
   */
  com.google.ads.googleads.v3.common.ExpandedDynamicSearchAdInfoOrBuilder getExpandedDynamicSearchAdOrBuilder();

  /**
   * <pre>
   * Details pertaining to a hotel ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.HotelAdInfo hotel_ad = 15;</code>
   */
  boolean hasHotelAd();
  /**
   * <pre>
   * Details pertaining to a hotel ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.HotelAdInfo hotel_ad = 15;</code>
   */
  com.google.ads.googleads.v3.common.HotelAdInfo getHotelAd();
  /**
   * <pre>
   * Details pertaining to a hotel ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.HotelAdInfo hotel_ad = 15;</code>
   */
  com.google.ads.googleads.v3.common.HotelAdInfoOrBuilder getHotelAdOrBuilder();

  /**
   * <pre>
   * Details pertaining to a Smart Shopping ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.ShoppingSmartAdInfo shopping_smart_ad = 17;</code>
   */
  boolean hasShoppingSmartAd();
  /**
   * <pre>
   * Details pertaining to a Smart Shopping ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.ShoppingSmartAdInfo shopping_smart_ad = 17;</code>
   */
  com.google.ads.googleads.v3.common.ShoppingSmartAdInfo getShoppingSmartAd();
  /**
   * <pre>
   * Details pertaining to a Smart Shopping ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.ShoppingSmartAdInfo shopping_smart_ad = 17;</code>
   */
  com.google.ads.googleads.v3.common.ShoppingSmartAdInfoOrBuilder getShoppingSmartAdOrBuilder();

  /**
   * <pre>
   * Details pertaining to a Shopping product ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.ShoppingProductAdInfo shopping_product_ad = 18;</code>
   */
  boolean hasShoppingProductAd();
  /**
   * <pre>
   * Details pertaining to a Shopping product ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.ShoppingProductAdInfo shopping_product_ad = 18;</code>
   */
  com.google.ads.googleads.v3.common.ShoppingProductAdInfo getShoppingProductAd();
  /**
   * <pre>
   * Details pertaining to a Shopping product ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.ShoppingProductAdInfo shopping_product_ad = 18;</code>
   */
  com.google.ads.googleads.v3.common.ShoppingProductAdInfoOrBuilder getShoppingProductAdOrBuilder();

  /**
   * <pre>
   * Details pertaining to a Gmail ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.GmailAdInfo gmail_ad = 21;</code>
   */
  boolean hasGmailAd();
  /**
   * <pre>
   * Details pertaining to a Gmail ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.GmailAdInfo gmail_ad = 21;</code>
   */
  com.google.ads.googleads.v3.common.GmailAdInfo getGmailAd();
  /**
   * <pre>
   * Details pertaining to a Gmail ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.GmailAdInfo gmail_ad = 21;</code>
   */
  com.google.ads.googleads.v3.common.GmailAdInfoOrBuilder getGmailAdOrBuilder();

  /**
   * <pre>
   * Details pertaining to an Image ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.ImageAdInfo image_ad = 22;</code>
   */
  boolean hasImageAd();
  /**
   * <pre>
   * Details pertaining to an Image ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.ImageAdInfo image_ad = 22;</code>
   */
  com.google.ads.googleads.v3.common.ImageAdInfo getImageAd();
  /**
   * <pre>
   * Details pertaining to an Image ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.ImageAdInfo image_ad = 22;</code>
   */
  com.google.ads.googleads.v3.common.ImageAdInfoOrBuilder getImageAdOrBuilder();

  /**
   * <pre>
   * Details pertaining to a Video ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.VideoAdInfo video_ad = 24;</code>
   */
  boolean hasVideoAd();
  /**
   * <pre>
   * Details pertaining to a Video ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.VideoAdInfo video_ad = 24;</code>
   */
  com.google.ads.googleads.v3.common.VideoAdInfo getVideoAd();
  /**
   * <pre>
   * Details pertaining to a Video ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.VideoAdInfo video_ad = 24;</code>
   */
  com.google.ads.googleads.v3.common.VideoAdInfoOrBuilder getVideoAdOrBuilder();

  /**
   * <pre>
   * Details pertaining to a responsive search ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.ResponsiveSearchAdInfo responsive_search_ad = 25;</code>
   */
  boolean hasResponsiveSearchAd();
  /**
   * <pre>
   * Details pertaining to a responsive search ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.ResponsiveSearchAdInfo responsive_search_ad = 25;</code>
   */
  com.google.ads.googleads.v3.common.ResponsiveSearchAdInfo getResponsiveSearchAd();
  /**
   * <pre>
   * Details pertaining to a responsive search ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.ResponsiveSearchAdInfo responsive_search_ad = 25;</code>
   */
  com.google.ads.googleads.v3.common.ResponsiveSearchAdInfoOrBuilder getResponsiveSearchAdOrBuilder();

  /**
   * <pre>
   * Details pertaining to a legacy responsive display ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.LegacyResponsiveDisplayAdInfo legacy_responsive_display_ad = 28;</code>
   */
  boolean hasLegacyResponsiveDisplayAd();
  /**
   * <pre>
   * Details pertaining to a legacy responsive display ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.LegacyResponsiveDisplayAdInfo legacy_responsive_display_ad = 28;</code>
   */
  com.google.ads.googleads.v3.common.LegacyResponsiveDisplayAdInfo getLegacyResponsiveDisplayAd();
  /**
   * <pre>
   * Details pertaining to a legacy responsive display ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.LegacyResponsiveDisplayAdInfo legacy_responsive_display_ad = 28;</code>
   */
  com.google.ads.googleads.v3.common.LegacyResponsiveDisplayAdInfoOrBuilder getLegacyResponsiveDisplayAdOrBuilder();

  /**
   * <pre>
   * Details pertaining to an app ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.AppAdInfo app_ad = 29;</code>
   */
  boolean hasAppAd();
  /**
   * <pre>
   * Details pertaining to an app ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.AppAdInfo app_ad = 29;</code>
   */
  com.google.ads.googleads.v3.common.AppAdInfo getAppAd();
  /**
   * <pre>
   * Details pertaining to an app ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.AppAdInfo app_ad = 29;</code>
   */
  com.google.ads.googleads.v3.common.AppAdInfoOrBuilder getAppAdOrBuilder();

  /**
   * <pre>
   * Immutable. Details pertaining to a legacy app install ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.LegacyAppInstallAdInfo legacy_app_install_ad = 30 [(.google.api.field_behavior) = IMMUTABLE];</code>
   */
  boolean hasLegacyAppInstallAd();
  /**
   * <pre>
   * Immutable. Details pertaining to a legacy app install ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.LegacyAppInstallAdInfo legacy_app_install_ad = 30 [(.google.api.field_behavior) = IMMUTABLE];</code>
   */
  com.google.ads.googleads.v3.common.LegacyAppInstallAdInfo getLegacyAppInstallAd();
  /**
   * <pre>
   * Immutable. Details pertaining to a legacy app install ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.LegacyAppInstallAdInfo legacy_app_install_ad = 30 [(.google.api.field_behavior) = IMMUTABLE];</code>
   */
  com.google.ads.googleads.v3.common.LegacyAppInstallAdInfoOrBuilder getLegacyAppInstallAdOrBuilder();

  /**
   * <pre>
   * Details pertaining to a responsive display ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.ResponsiveDisplayAdInfo responsive_display_ad = 31;</code>
   */
  boolean hasResponsiveDisplayAd();
  /**
   * <pre>
   * Details pertaining to a responsive display ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.ResponsiveDisplayAdInfo responsive_display_ad = 31;</code>
   */
  com.google.ads.googleads.v3.common.ResponsiveDisplayAdInfo getResponsiveDisplayAd();
  /**
   * <pre>
   * Details pertaining to a responsive display ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.ResponsiveDisplayAdInfo responsive_display_ad = 31;</code>
   */
  com.google.ads.googleads.v3.common.ResponsiveDisplayAdInfoOrBuilder getResponsiveDisplayAdOrBuilder();

  /**
   * <pre>
   * Details pertaining to a display upload ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.DisplayUploadAdInfo display_upload_ad = 33;</code>
   */
  boolean hasDisplayUploadAd();
  /**
   * <pre>
   * Details pertaining to a display upload ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.DisplayUploadAdInfo display_upload_ad = 33;</code>
   */
  com.google.ads.googleads.v3.common.DisplayUploadAdInfo getDisplayUploadAd();
  /**
   * <pre>
   * Details pertaining to a display upload ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.DisplayUploadAdInfo display_upload_ad = 33;</code>
   */
  com.google.ads.googleads.v3.common.DisplayUploadAdInfoOrBuilder getDisplayUploadAdOrBuilder();

  /**
   * <pre>
   * Details pertaining to an app engagement ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.AppEngagementAdInfo app_engagement_ad = 34;</code>
   */
  boolean hasAppEngagementAd();
  /**
   * <pre>
   * Details pertaining to an app engagement ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.AppEngagementAdInfo app_engagement_ad = 34;</code>
   */
  com.google.ads.googleads.v3.common.AppEngagementAdInfo getAppEngagementAd();
  /**
   * <pre>
   * Details pertaining to an app engagement ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.AppEngagementAdInfo app_engagement_ad = 34;</code>
   */
  com.google.ads.googleads.v3.common.AppEngagementAdInfoOrBuilder getAppEngagementAdOrBuilder();

  /**
   * <pre>
   * Details pertaining to a Shopping Comparison Listing ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.ShoppingComparisonListingAdInfo shopping_comparison_listing_ad = 36;</code>
   */
  boolean hasShoppingComparisonListingAd();
  /**
   * <pre>
   * Details pertaining to a Shopping Comparison Listing ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.ShoppingComparisonListingAdInfo shopping_comparison_listing_ad = 36;</code>
   */
  com.google.ads.googleads.v3.common.ShoppingComparisonListingAdInfo getShoppingComparisonListingAd();
  /**
   * <pre>
   * Details pertaining to a Shopping Comparison Listing ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.ShoppingComparisonListingAdInfo shopping_comparison_listing_ad = 36;</code>
   */
  com.google.ads.googleads.v3.common.ShoppingComparisonListingAdInfoOrBuilder getShoppingComparisonListingAdOrBuilder();

  public com.google.ads.googleads.v3.resources.Ad.AdDataCase getAdDataCase();
}
