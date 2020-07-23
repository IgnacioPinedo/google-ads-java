// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v3/services/reach_plan_service.proto

package com.google.ads.googleads.v3.services;

public interface GenerateProductMixIdeasRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v3.services.GenerateProductMixIdeasRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The ID of the customer.
   * </pre>
   *
   * <code>string customer_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The customerId.
   */
  java.lang.String getCustomerId();
  /**
   * <pre>
   * Required. The ID of the customer.
   * </pre>
   *
   * <code>string customer_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for customerId.
   */
  com.google.protobuf.ByteString
      getCustomerIdBytes();

  /**
   * <pre>
   * Required. The ID of the location, this is one of the ids returned by
   * ListPlannableLocations.
   * </pre>
   *
   * <code>.google.protobuf.StringValue plannable_location_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the plannableLocationId field is set.
   */
  boolean hasPlannableLocationId();
  /**
   * <pre>
   * Required. The ID of the location, this is one of the ids returned by
   * ListPlannableLocations.
   * </pre>
   *
   * <code>.google.protobuf.StringValue plannable_location_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The plannableLocationId.
   */
  com.google.protobuf.StringValue getPlannableLocationId();
  /**
   * <pre>
   * Required. The ID of the location, this is one of the ids returned by
   * ListPlannableLocations.
   * </pre>
   *
   * <code>.google.protobuf.StringValue plannable_location_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.protobuf.StringValueOrBuilder getPlannableLocationIdOrBuilder();

  /**
   * <pre>
   * Required. Currency code.
   * Three-character ISO 4217 currency code.
   * </pre>
   *
   * <code>.google.protobuf.StringValue currency_code = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the currencyCode field is set.
   */
  boolean hasCurrencyCode();
  /**
   * <pre>
   * Required. Currency code.
   * Three-character ISO 4217 currency code.
   * </pre>
   *
   * <code>.google.protobuf.StringValue currency_code = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The currencyCode.
   */
  com.google.protobuf.StringValue getCurrencyCode();
  /**
   * <pre>
   * Required. Currency code.
   * Three-character ISO 4217 currency code.
   * </pre>
   *
   * <code>.google.protobuf.StringValue currency_code = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.protobuf.StringValueOrBuilder getCurrencyCodeOrBuilder();

  /**
   * <pre>
   * Required. Total budget.
   * Amount in micros. One million is equivalent to one unit.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value budget_micros = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the budgetMicros field is set.
   */
  boolean hasBudgetMicros();
  /**
   * <pre>
   * Required. Total budget.
   * Amount in micros. One million is equivalent to one unit.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value budget_micros = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The budgetMicros.
   */
  com.google.protobuf.Int64Value getBudgetMicros();
  /**
   * <pre>
   * Required. Total budget.
   * Amount in micros. One million is equivalent to one unit.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value budget_micros = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getBudgetMicrosOrBuilder();

  /**
   * <pre>
   * The preferences of the suggested product mix.
   * An unset preference is interpreted as all possible values are allowed,
   * unless explicitly specified.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.services.Preferences preferences = 5;</code>
   * @return Whether the preferences field is set.
   */
  boolean hasPreferences();
  /**
   * <pre>
   * The preferences of the suggested product mix.
   * An unset preference is interpreted as all possible values are allowed,
   * unless explicitly specified.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.services.Preferences preferences = 5;</code>
   * @return The preferences.
   */
  com.google.ads.googleads.v3.services.Preferences getPreferences();
  /**
   * <pre>
   * The preferences of the suggested product mix.
   * An unset preference is interpreted as all possible values are allowed,
   * unless explicitly specified.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.services.Preferences preferences = 5;</code>
   */
  com.google.ads.googleads.v3.services.PreferencesOrBuilder getPreferencesOrBuilder();
}
