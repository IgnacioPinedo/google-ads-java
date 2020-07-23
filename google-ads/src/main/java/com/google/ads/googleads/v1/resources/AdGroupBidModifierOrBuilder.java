// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v1/resources/ad_group_bid_modifier.proto

package com.google.ads.googleads.v1.resources;

public interface AdGroupBidModifierOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v1.resources.AdGroupBidModifier)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Immutable. The resource name of the ad group bid modifier.
   * Ad group bid modifier resource names have the form:
   * `customers/{customer_id}/adGroupBidModifiers/{ad_group_id}~{criterion_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The resourceName.
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * Immutable. The resource name of the ad group bid modifier.
   * Ad group bid modifier resource names have the form:
   * `customers/{customer_id}/adGroupBidModifiers/{ad_group_id}~{criterion_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for resourceName.
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * Immutable. The ad group to which this criterion belongs.
   * </pre>
   *
   * <code>.google.protobuf.StringValue ad_group = 2 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return Whether the adGroup field is set.
   */
  boolean hasAdGroup();
  /**
   * <pre>
   * Immutable. The ad group to which this criterion belongs.
   * </pre>
   *
   * <code>.google.protobuf.StringValue ad_group = 2 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The adGroup.
   */
  com.google.protobuf.StringValue getAdGroup();
  /**
   * <pre>
   * Immutable. The ad group to which this criterion belongs.
   * </pre>
   *
   * <code>.google.protobuf.StringValue ad_group = 2 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   */
  com.google.protobuf.StringValueOrBuilder getAdGroupOrBuilder();

  /**
   * <pre>
   * Output only. The ID of the criterion to bid modify.
   * This field is ignored for mutates.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value criterion_id = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the criterionId field is set.
   */
  boolean hasCriterionId();
  /**
   * <pre>
   * Output only. The ID of the criterion to bid modify.
   * This field is ignored for mutates.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value criterion_id = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The criterionId.
   */
  com.google.protobuf.Int64Value getCriterionId();
  /**
   * <pre>
   * Output only. The ID of the criterion to bid modify.
   * This field is ignored for mutates.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value criterion_id = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getCriterionIdOrBuilder();

  /**
   * <pre>
   * The modifier for the bid when the criterion matches. The modifier must be
   * in the range: 0.1 - 10.0. The range is 1.0 - 6.0 for PreferredContent.
   * Use 0 to opt out of a Device type.
   * </pre>
   *
   * <code>.google.protobuf.DoubleValue bid_modifier = 4;</code>
   * @return Whether the bidModifier field is set.
   */
  boolean hasBidModifier();
  /**
   * <pre>
   * The modifier for the bid when the criterion matches. The modifier must be
   * in the range: 0.1 - 10.0. The range is 1.0 - 6.0 for PreferredContent.
   * Use 0 to opt out of a Device type.
   * </pre>
   *
   * <code>.google.protobuf.DoubleValue bid_modifier = 4;</code>
   * @return The bidModifier.
   */
  com.google.protobuf.DoubleValue getBidModifier();
  /**
   * <pre>
   * The modifier for the bid when the criterion matches. The modifier must be
   * in the range: 0.1 - 10.0. The range is 1.0 - 6.0 for PreferredContent.
   * Use 0 to opt out of a Device type.
   * </pre>
   *
   * <code>.google.protobuf.DoubleValue bid_modifier = 4;</code>
   */
  com.google.protobuf.DoubleValueOrBuilder getBidModifierOrBuilder();

  /**
   * <pre>
   * Output only. The base ad group from which this draft/trial adgroup bid modifier was
   * created. If ad_group is a base ad group then this field will be equal to
   * ad_group. If the ad group was created in the draft or trial and has no
   * corresponding base ad group, then this field will be null.
   * This field is readonly.
   * </pre>
   *
   * <code>.google.protobuf.StringValue base_ad_group = 9 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return Whether the baseAdGroup field is set.
   */
  boolean hasBaseAdGroup();
  /**
   * <pre>
   * Output only. The base ad group from which this draft/trial adgroup bid modifier was
   * created. If ad_group is a base ad group then this field will be equal to
   * ad_group. If the ad group was created in the draft or trial and has no
   * corresponding base ad group, then this field will be null.
   * This field is readonly.
   * </pre>
   *
   * <code>.google.protobuf.StringValue base_ad_group = 9 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The baseAdGroup.
   */
  com.google.protobuf.StringValue getBaseAdGroup();
  /**
   * <pre>
   * Output only. The base ad group from which this draft/trial adgroup bid modifier was
   * created. If ad_group is a base ad group then this field will be equal to
   * ad_group. If the ad group was created in the draft or trial and has no
   * corresponding base ad group, then this field will be null.
   * This field is readonly.
   * </pre>
   *
   * <code>.google.protobuf.StringValue base_ad_group = 9 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   */
  com.google.protobuf.StringValueOrBuilder getBaseAdGroupOrBuilder();

  /**
   * <pre>
   * Output only. Bid modifier source.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.enums.BidModifierSourceEnum.BidModifierSource bid_modifier_source = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for bidModifierSource.
   */
  int getBidModifierSourceValue();
  /**
   * <pre>
   * Output only. Bid modifier source.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.enums.BidModifierSourceEnum.BidModifierSource bid_modifier_source = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bidModifierSource.
   */
  com.google.ads.googleads.v1.enums.BidModifierSourceEnum.BidModifierSource getBidModifierSource();

  /**
   * <pre>
   * Immutable. Criterion for hotel date selection (default dates vs. user selected).
   * </pre>
   *
   * <code>.google.ads.googleads.v1.common.HotelDateSelectionTypeInfo hotel_date_selection_type = 5 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return Whether the hotelDateSelectionType field is set.
   */
  boolean hasHotelDateSelectionType();
  /**
   * <pre>
   * Immutable. Criterion for hotel date selection (default dates vs. user selected).
   * </pre>
   *
   * <code>.google.ads.googleads.v1.common.HotelDateSelectionTypeInfo hotel_date_selection_type = 5 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The hotelDateSelectionType.
   */
  com.google.ads.googleads.v1.common.HotelDateSelectionTypeInfo getHotelDateSelectionType();
  /**
   * <pre>
   * Immutable. Criterion for hotel date selection (default dates vs. user selected).
   * </pre>
   *
   * <code>.google.ads.googleads.v1.common.HotelDateSelectionTypeInfo hotel_date_selection_type = 5 [(.google.api.field_behavior) = IMMUTABLE];</code>
   */
  com.google.ads.googleads.v1.common.HotelDateSelectionTypeInfoOrBuilder getHotelDateSelectionTypeOrBuilder();

  /**
   * <pre>
   * Immutable. Criterion for number of days prior to the stay the booking is being made.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.common.HotelAdvanceBookingWindowInfo hotel_advance_booking_window = 6 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return Whether the hotelAdvanceBookingWindow field is set.
   */
  boolean hasHotelAdvanceBookingWindow();
  /**
   * <pre>
   * Immutable. Criterion for number of days prior to the stay the booking is being made.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.common.HotelAdvanceBookingWindowInfo hotel_advance_booking_window = 6 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The hotelAdvanceBookingWindow.
   */
  com.google.ads.googleads.v1.common.HotelAdvanceBookingWindowInfo getHotelAdvanceBookingWindow();
  /**
   * <pre>
   * Immutable. Criterion for number of days prior to the stay the booking is being made.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.common.HotelAdvanceBookingWindowInfo hotel_advance_booking_window = 6 [(.google.api.field_behavior) = IMMUTABLE];</code>
   */
  com.google.ads.googleads.v1.common.HotelAdvanceBookingWindowInfoOrBuilder getHotelAdvanceBookingWindowOrBuilder();

  /**
   * <pre>
   * Immutable. Criterion for length of hotel stay in nights.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.common.HotelLengthOfStayInfo hotel_length_of_stay = 7 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return Whether the hotelLengthOfStay field is set.
   */
  boolean hasHotelLengthOfStay();
  /**
   * <pre>
   * Immutable. Criterion for length of hotel stay in nights.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.common.HotelLengthOfStayInfo hotel_length_of_stay = 7 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The hotelLengthOfStay.
   */
  com.google.ads.googleads.v1.common.HotelLengthOfStayInfo getHotelLengthOfStay();
  /**
   * <pre>
   * Immutable. Criterion for length of hotel stay in nights.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.common.HotelLengthOfStayInfo hotel_length_of_stay = 7 [(.google.api.field_behavior) = IMMUTABLE];</code>
   */
  com.google.ads.googleads.v1.common.HotelLengthOfStayInfoOrBuilder getHotelLengthOfStayOrBuilder();

  /**
   * <pre>
   * Immutable. Criterion for day of the week the booking is for.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.common.HotelCheckInDayInfo hotel_check_in_day = 8 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return Whether the hotelCheckInDay field is set.
   */
  boolean hasHotelCheckInDay();
  /**
   * <pre>
   * Immutable. Criterion for day of the week the booking is for.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.common.HotelCheckInDayInfo hotel_check_in_day = 8 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The hotelCheckInDay.
   */
  com.google.ads.googleads.v1.common.HotelCheckInDayInfo getHotelCheckInDay();
  /**
   * <pre>
   * Immutable. Criterion for day of the week the booking is for.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.common.HotelCheckInDayInfo hotel_check_in_day = 8 [(.google.api.field_behavior) = IMMUTABLE];</code>
   */
  com.google.ads.googleads.v1.common.HotelCheckInDayInfoOrBuilder getHotelCheckInDayOrBuilder();

  /**
   * <pre>
   * Immutable. A device criterion.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.common.DeviceInfo device = 11 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return Whether the device field is set.
   */
  boolean hasDevice();
  /**
   * <pre>
   * Immutable. A device criterion.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.common.DeviceInfo device = 11 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The device.
   */
  com.google.ads.googleads.v1.common.DeviceInfo getDevice();
  /**
   * <pre>
   * Immutable. A device criterion.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.common.DeviceInfo device = 11 [(.google.api.field_behavior) = IMMUTABLE];</code>
   */
  com.google.ads.googleads.v1.common.DeviceInfoOrBuilder getDeviceOrBuilder();

  /**
   * <pre>
   * Immutable. A preferred content criterion.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.common.PreferredContentInfo preferred_content = 12 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return Whether the preferredContent field is set.
   */
  boolean hasPreferredContent();
  /**
   * <pre>
   * Immutable. A preferred content criterion.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.common.PreferredContentInfo preferred_content = 12 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The preferredContent.
   */
  com.google.ads.googleads.v1.common.PreferredContentInfo getPreferredContent();
  /**
   * <pre>
   * Immutable. A preferred content criterion.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.common.PreferredContentInfo preferred_content = 12 [(.google.api.field_behavior) = IMMUTABLE];</code>
   */
  com.google.ads.googleads.v1.common.PreferredContentInfoOrBuilder getPreferredContentOrBuilder();

  public com.google.ads.googleads.v1.resources.AdGroupBidModifier.CriterionCase getCriterionCase();
}
