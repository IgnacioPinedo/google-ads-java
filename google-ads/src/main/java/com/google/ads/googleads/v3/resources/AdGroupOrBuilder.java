// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v3/resources/ad_group.proto

package com.google.ads.googleads.v3.resources;

public interface AdGroupOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v3.resources.AdGroup)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Immutable. The resource name of the ad group.
   * Ad group resource names have the form:
   * `customers/{customer_id}/adGroups/{ad_group_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * Immutable. The resource name of the ad group.
   * Ad group resource names have the form:
   * `customers/{customer_id}/adGroups/{ad_group_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * Output only. The ID of the ad group.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value id = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  boolean hasId();
  /**
   * <pre>
   * Output only. The ID of the ad group.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value id = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.Int64Value getId();
  /**
   * <pre>
   * Output only. The ID of the ad group.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value id = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getIdOrBuilder();

  /**
   * <pre>
   * The name of the ad group.
   * This field is required and should not be empty when creating new ad
   * groups.
   * It must contain fewer than 255 UTF-8 full-width characters.
   * It must not contain any null (code point 0x0), NL line feed
   * (code point 0xA) or carriage return (code point 0xD) characters.
   * </pre>
   *
   * <code>.google.protobuf.StringValue name = 4;</code>
   */
  boolean hasName();
  /**
   * <pre>
   * The name of the ad group.
   * This field is required and should not be empty when creating new ad
   * groups.
   * It must contain fewer than 255 UTF-8 full-width characters.
   * It must not contain any null (code point 0x0), NL line feed
   * (code point 0xA) or carriage return (code point 0xD) characters.
   * </pre>
   *
   * <code>.google.protobuf.StringValue name = 4;</code>
   */
  com.google.protobuf.StringValue getName();
  /**
   * <pre>
   * The name of the ad group.
   * This field is required and should not be empty when creating new ad
   * groups.
   * It must contain fewer than 255 UTF-8 full-width characters.
   * It must not contain any null (code point 0x0), NL line feed
   * (code point 0xA) or carriage return (code point 0xD) characters.
   * </pre>
   *
   * <code>.google.protobuf.StringValue name = 4;</code>
   */
  com.google.protobuf.StringValueOrBuilder getNameOrBuilder();

  /**
   * <pre>
   * The status of the ad group.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.enums.AdGroupStatusEnum.AdGroupStatus status = 5;</code>
   */
  int getStatusValue();
  /**
   * <pre>
   * The status of the ad group.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.enums.AdGroupStatusEnum.AdGroupStatus status = 5;</code>
   */
  com.google.ads.googleads.v3.enums.AdGroupStatusEnum.AdGroupStatus getStatus();

  /**
   * <pre>
   * Immutable. The type of the ad group.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.enums.AdGroupTypeEnum.AdGroupType type = 12 [(.google.api.field_behavior) = IMMUTABLE];</code>
   */
  int getTypeValue();
  /**
   * <pre>
   * Immutable. The type of the ad group.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.enums.AdGroupTypeEnum.AdGroupType type = 12 [(.google.api.field_behavior) = IMMUTABLE];</code>
   */
  com.google.ads.googleads.v3.enums.AdGroupTypeEnum.AdGroupType getType();

  /**
   * <pre>
   * The ad rotation mode of the ad group.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.enums.AdGroupAdRotationModeEnum.AdGroupAdRotationMode ad_rotation_mode = 22;</code>
   */
  int getAdRotationModeValue();
  /**
   * <pre>
   * The ad rotation mode of the ad group.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.enums.AdGroupAdRotationModeEnum.AdGroupAdRotationMode ad_rotation_mode = 22;</code>
   */
  com.google.ads.googleads.v3.enums.AdGroupAdRotationModeEnum.AdGroupAdRotationMode getAdRotationMode();

  /**
   * <pre>
   * Output only. For draft or experiment ad groups, this field is the resource name of the
   * base ad group from which this ad group was created. If a draft or
   * experiment ad group does not have a base ad group, then this field is null.
   * For base ad groups, this field equals the ad group resource name.
   * This field is read-only.
   * </pre>
   *
   * <code>.google.protobuf.StringValue base_ad_group = 18 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   */
  boolean hasBaseAdGroup();
  /**
   * <pre>
   * Output only. For draft or experiment ad groups, this field is the resource name of the
   * base ad group from which this ad group was created. If a draft or
   * experiment ad group does not have a base ad group, then this field is null.
   * For base ad groups, this field equals the ad group resource name.
   * This field is read-only.
   * </pre>
   *
   * <code>.google.protobuf.StringValue base_ad_group = 18 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   */
  com.google.protobuf.StringValue getBaseAdGroup();
  /**
   * <pre>
   * Output only. For draft or experiment ad groups, this field is the resource name of the
   * base ad group from which this ad group was created. If a draft or
   * experiment ad group does not have a base ad group, then this field is null.
   * For base ad groups, this field equals the ad group resource name.
   * This field is read-only.
   * </pre>
   *
   * <code>.google.protobuf.StringValue base_ad_group = 18 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   */
  com.google.protobuf.StringValueOrBuilder getBaseAdGroupOrBuilder();

  /**
   * <pre>
   * The URL template for constructing a tracking URL.
   * </pre>
   *
   * <code>.google.protobuf.StringValue tracking_url_template = 13;</code>
   */
  boolean hasTrackingUrlTemplate();
  /**
   * <pre>
   * The URL template for constructing a tracking URL.
   * </pre>
   *
   * <code>.google.protobuf.StringValue tracking_url_template = 13;</code>
   */
  com.google.protobuf.StringValue getTrackingUrlTemplate();
  /**
   * <pre>
   * The URL template for constructing a tracking URL.
   * </pre>
   *
   * <code>.google.protobuf.StringValue tracking_url_template = 13;</code>
   */
  com.google.protobuf.StringValueOrBuilder getTrackingUrlTemplateOrBuilder();

  /**
   * <pre>
   * The list of mappings used to substitute custom parameter tags in a
   * `tracking_url_template`, `final_urls`, or `mobile_final_urls`.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v3.common.CustomParameter url_custom_parameters = 6;</code>
   */
  java.util.List<com.google.ads.googleads.v3.common.CustomParameter> 
      getUrlCustomParametersList();
  /**
   * <pre>
   * The list of mappings used to substitute custom parameter tags in a
   * `tracking_url_template`, `final_urls`, or `mobile_final_urls`.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v3.common.CustomParameter url_custom_parameters = 6;</code>
   */
  com.google.ads.googleads.v3.common.CustomParameter getUrlCustomParameters(int index);
  /**
   * <pre>
   * The list of mappings used to substitute custom parameter tags in a
   * `tracking_url_template`, `final_urls`, or `mobile_final_urls`.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v3.common.CustomParameter url_custom_parameters = 6;</code>
   */
  int getUrlCustomParametersCount();
  /**
   * <pre>
   * The list of mappings used to substitute custom parameter tags in a
   * `tracking_url_template`, `final_urls`, or `mobile_final_urls`.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v3.common.CustomParameter url_custom_parameters = 6;</code>
   */
  java.util.List<? extends com.google.ads.googleads.v3.common.CustomParameterOrBuilder> 
      getUrlCustomParametersOrBuilderList();
  /**
   * <pre>
   * The list of mappings used to substitute custom parameter tags in a
   * `tracking_url_template`, `final_urls`, or `mobile_final_urls`.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v3.common.CustomParameter url_custom_parameters = 6;</code>
   */
  com.google.ads.googleads.v3.common.CustomParameterOrBuilder getUrlCustomParametersOrBuilder(
      int index);

  /**
   * <pre>
   * Immutable. The campaign to which the ad group belongs.
   * </pre>
   *
   * <code>.google.protobuf.StringValue campaign = 10 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   */
  boolean hasCampaign();
  /**
   * <pre>
   * Immutable. The campaign to which the ad group belongs.
   * </pre>
   *
   * <code>.google.protobuf.StringValue campaign = 10 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   */
  com.google.protobuf.StringValue getCampaign();
  /**
   * <pre>
   * Immutable. The campaign to which the ad group belongs.
   * </pre>
   *
   * <code>.google.protobuf.StringValue campaign = 10 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   */
  com.google.protobuf.StringValueOrBuilder getCampaignOrBuilder();

  /**
   * <pre>
   * The maximum CPC (cost-per-click) bid.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value cpc_bid_micros = 14;</code>
   */
  boolean hasCpcBidMicros();
  /**
   * <pre>
   * The maximum CPC (cost-per-click) bid.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value cpc_bid_micros = 14;</code>
   */
  com.google.protobuf.Int64Value getCpcBidMicros();
  /**
   * <pre>
   * The maximum CPC (cost-per-click) bid.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value cpc_bid_micros = 14;</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getCpcBidMicrosOrBuilder();

  /**
   * <pre>
   * The maximum CPM (cost-per-thousand viewable impressions) bid.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value cpm_bid_micros = 15;</code>
   */
  boolean hasCpmBidMicros();
  /**
   * <pre>
   * The maximum CPM (cost-per-thousand viewable impressions) bid.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value cpm_bid_micros = 15;</code>
   */
  com.google.protobuf.Int64Value getCpmBidMicros();
  /**
   * <pre>
   * The maximum CPM (cost-per-thousand viewable impressions) bid.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value cpm_bid_micros = 15;</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getCpmBidMicrosOrBuilder();

  /**
   * <pre>
   * The target CPA (cost-per-acquisition).
   * </pre>
   *
   * <code>.google.protobuf.Int64Value target_cpa_micros = 27;</code>
   */
  boolean hasTargetCpaMicros();
  /**
   * <pre>
   * The target CPA (cost-per-acquisition).
   * </pre>
   *
   * <code>.google.protobuf.Int64Value target_cpa_micros = 27;</code>
   */
  com.google.protobuf.Int64Value getTargetCpaMicros();
  /**
   * <pre>
   * The target CPA (cost-per-acquisition).
   * </pre>
   *
   * <code>.google.protobuf.Int64Value target_cpa_micros = 27;</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getTargetCpaMicrosOrBuilder();

  /**
   * <pre>
   * Output only. The CPV (cost-per-view) bid.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value cpv_bid_micros = 17 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  boolean hasCpvBidMicros();
  /**
   * <pre>
   * Output only. The CPV (cost-per-view) bid.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value cpv_bid_micros = 17 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.Int64Value getCpvBidMicros();
  /**
   * <pre>
   * Output only. The CPV (cost-per-view) bid.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value cpv_bid_micros = 17 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getCpvBidMicrosOrBuilder();

  /**
   * <pre>
   * Average amount in micros that the advertiser is willing to pay for every
   * thousand times the ad is shown.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value target_cpm_micros = 26;</code>
   */
  boolean hasTargetCpmMicros();
  /**
   * <pre>
   * Average amount in micros that the advertiser is willing to pay for every
   * thousand times the ad is shown.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value target_cpm_micros = 26;</code>
   */
  com.google.protobuf.Int64Value getTargetCpmMicros();
  /**
   * <pre>
   * Average amount in micros that the advertiser is willing to pay for every
   * thousand times the ad is shown.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value target_cpm_micros = 26;</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getTargetCpmMicrosOrBuilder();

  /**
   * <pre>
   * The target ROAS (return-on-ad-spend) override. If the ad group's campaign
   * bidding strategy is a standard Target ROAS strategy, then this field
   * overrides the target ROAS specified in the campaign's bidding strategy.
   * Otherwise, this value is ignored.
   * </pre>
   *
   * <code>.google.protobuf.DoubleValue target_roas = 30;</code>
   */
  boolean hasTargetRoas();
  /**
   * <pre>
   * The target ROAS (return-on-ad-spend) override. If the ad group's campaign
   * bidding strategy is a standard Target ROAS strategy, then this field
   * overrides the target ROAS specified in the campaign's bidding strategy.
   * Otherwise, this value is ignored.
   * </pre>
   *
   * <code>.google.protobuf.DoubleValue target_roas = 30;</code>
   */
  com.google.protobuf.DoubleValue getTargetRoas();
  /**
   * <pre>
   * The target ROAS (return-on-ad-spend) override. If the ad group's campaign
   * bidding strategy is a standard Target ROAS strategy, then this field
   * overrides the target ROAS specified in the campaign's bidding strategy.
   * Otherwise, this value is ignored.
   * </pre>
   *
   * <code>.google.protobuf.DoubleValue target_roas = 30;</code>
   */
  com.google.protobuf.DoubleValueOrBuilder getTargetRoasOrBuilder();

  /**
   * <pre>
   * The percent cpc bid amount, expressed as a fraction of the advertised price
   * for some good or service. The valid range for the fraction is [0,1) and the
   * value stored here is 1,000,000 * [fraction].
   * </pre>
   *
   * <code>.google.protobuf.Int64Value percent_cpc_bid_micros = 20;</code>
   */
  boolean hasPercentCpcBidMicros();
  /**
   * <pre>
   * The percent cpc bid amount, expressed as a fraction of the advertised price
   * for some good or service. The valid range for the fraction is [0,1) and the
   * value stored here is 1,000,000 * [fraction].
   * </pre>
   *
   * <code>.google.protobuf.Int64Value percent_cpc_bid_micros = 20;</code>
   */
  com.google.protobuf.Int64Value getPercentCpcBidMicros();
  /**
   * <pre>
   * The percent cpc bid amount, expressed as a fraction of the advertised price
   * for some good or service. The valid range for the fraction is [0,1) and the
   * value stored here is 1,000,000 * [fraction].
   * </pre>
   *
   * <code>.google.protobuf.Int64Value percent_cpc_bid_micros = 20;</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getPercentCpcBidMicrosOrBuilder();

  /**
   * <pre>
   * Settings for the Display Campaign Optimizer, initially termed "Explorer".
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.ExplorerAutoOptimizerSetting explorer_auto_optimizer_setting = 21;</code>
   */
  boolean hasExplorerAutoOptimizerSetting();
  /**
   * <pre>
   * Settings for the Display Campaign Optimizer, initially termed "Explorer".
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.ExplorerAutoOptimizerSetting explorer_auto_optimizer_setting = 21;</code>
   */
  com.google.ads.googleads.v3.common.ExplorerAutoOptimizerSetting getExplorerAutoOptimizerSetting();
  /**
   * <pre>
   * Settings for the Display Campaign Optimizer, initially termed "Explorer".
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.ExplorerAutoOptimizerSetting explorer_auto_optimizer_setting = 21;</code>
   */
  com.google.ads.googleads.v3.common.ExplorerAutoOptimizerSettingOrBuilder getExplorerAutoOptimizerSettingOrBuilder();

  /**
   * <pre>
   * Allows advertisers to specify a targeting dimension on which to place
   * absolute bids. This is only applicable for campaigns that target only the
   * display network and not search.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.enums.TargetingDimensionEnum.TargetingDimension display_custom_bid_dimension = 23;</code>
   */
  int getDisplayCustomBidDimensionValue();
  /**
   * <pre>
   * Allows advertisers to specify a targeting dimension on which to place
   * absolute bids. This is only applicable for campaigns that target only the
   * display network and not search.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.enums.TargetingDimensionEnum.TargetingDimension display_custom_bid_dimension = 23;</code>
   */
  com.google.ads.googleads.v3.enums.TargetingDimensionEnum.TargetingDimension getDisplayCustomBidDimension();

  /**
   * <pre>
   * URL template for appending params to Final URL.
   * </pre>
   *
   * <code>.google.protobuf.StringValue final_url_suffix = 24;</code>
   */
  boolean hasFinalUrlSuffix();
  /**
   * <pre>
   * URL template for appending params to Final URL.
   * </pre>
   *
   * <code>.google.protobuf.StringValue final_url_suffix = 24;</code>
   */
  com.google.protobuf.StringValue getFinalUrlSuffix();
  /**
   * <pre>
   * URL template for appending params to Final URL.
   * </pre>
   *
   * <code>.google.protobuf.StringValue final_url_suffix = 24;</code>
   */
  com.google.protobuf.StringValueOrBuilder getFinalUrlSuffixOrBuilder();

  /**
   * <pre>
   * Setting for targeting related features.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.TargetingSetting targeting_setting = 25;</code>
   */
  boolean hasTargetingSetting();
  /**
   * <pre>
   * Setting for targeting related features.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.TargetingSetting targeting_setting = 25;</code>
   */
  com.google.ads.googleads.v3.common.TargetingSetting getTargetingSetting();
  /**
   * <pre>
   * Setting for targeting related features.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.TargetingSetting targeting_setting = 25;</code>
   */
  com.google.ads.googleads.v3.common.TargetingSettingOrBuilder getTargetingSettingOrBuilder();

  /**
   * <pre>
   * Output only. The effective target CPA (cost-per-acquisition).
   * This field is read-only.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value effective_target_cpa_micros = 28 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  boolean hasEffectiveTargetCpaMicros();
  /**
   * <pre>
   * Output only. The effective target CPA (cost-per-acquisition).
   * This field is read-only.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value effective_target_cpa_micros = 28 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.Int64Value getEffectiveTargetCpaMicros();
  /**
   * <pre>
   * Output only. The effective target CPA (cost-per-acquisition).
   * This field is read-only.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value effective_target_cpa_micros = 28 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getEffectiveTargetCpaMicrosOrBuilder();

  /**
   * <pre>
   * Output only. Source of the effective target CPA.
   * This field is read-only.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.enums.BiddingSourceEnum.BiddingSource effective_target_cpa_source = 29 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  int getEffectiveTargetCpaSourceValue();
  /**
   * <pre>
   * Output only. Source of the effective target CPA.
   * This field is read-only.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.enums.BiddingSourceEnum.BiddingSource effective_target_cpa_source = 29 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.ads.googleads.v3.enums.BiddingSourceEnum.BiddingSource getEffectiveTargetCpaSource();

  /**
   * <pre>
   * Output only. The effective target ROAS (return-on-ad-spend).
   * This field is read-only.
   * </pre>
   *
   * <code>.google.protobuf.DoubleValue effective_target_roas = 31 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  boolean hasEffectiveTargetRoas();
  /**
   * <pre>
   * Output only. The effective target ROAS (return-on-ad-spend).
   * This field is read-only.
   * </pre>
   *
   * <code>.google.protobuf.DoubleValue effective_target_roas = 31 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.DoubleValue getEffectiveTargetRoas();
  /**
   * <pre>
   * Output only. The effective target ROAS (return-on-ad-spend).
   * This field is read-only.
   * </pre>
   *
   * <code>.google.protobuf.DoubleValue effective_target_roas = 31 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.DoubleValueOrBuilder getEffectiveTargetRoasOrBuilder();

  /**
   * <pre>
   * Output only. Source of the effective target ROAS.
   * This field is read-only.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.enums.BiddingSourceEnum.BiddingSource effective_target_roas_source = 32 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  int getEffectiveTargetRoasSourceValue();
  /**
   * <pre>
   * Output only. Source of the effective target ROAS.
   * This field is read-only.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.enums.BiddingSourceEnum.BiddingSource effective_target_roas_source = 32 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.ads.googleads.v3.enums.BiddingSourceEnum.BiddingSource getEffectiveTargetRoasSource();

  /**
   * <pre>
   * Output only. The resource names of labels attached to this ad group.
   * </pre>
   *
   * <code>repeated .google.protobuf.StringValue labels = 33 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   */
  java.util.List<com.google.protobuf.StringValue> 
      getLabelsList();
  /**
   * <pre>
   * Output only. The resource names of labels attached to this ad group.
   * </pre>
   *
   * <code>repeated .google.protobuf.StringValue labels = 33 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   */
  com.google.protobuf.StringValue getLabels(int index);
  /**
   * <pre>
   * Output only. The resource names of labels attached to this ad group.
   * </pre>
   *
   * <code>repeated .google.protobuf.StringValue labels = 33 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   */
  int getLabelsCount();
  /**
   * <pre>
   * Output only. The resource names of labels attached to this ad group.
   * </pre>
   *
   * <code>repeated .google.protobuf.StringValue labels = 33 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   */
  java.util.List<? extends com.google.protobuf.StringValueOrBuilder> 
      getLabelsOrBuilderList();
  /**
   * <pre>
   * Output only. The resource names of labels attached to this ad group.
   * </pre>
   *
   * <code>repeated .google.protobuf.StringValue labels = 33 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   */
  com.google.protobuf.StringValueOrBuilder getLabelsOrBuilder(
      int index);
}
