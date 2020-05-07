// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v3/resources/keyword_plan.proto

package com.google.ads.googleads.v3.resources;

public interface KeywordPlanOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v3.resources.KeywordPlan)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Immutable. The resource name of the Keyword Planner plan.
   * KeywordPlan resource names have the form:
   * `customers/{customer_id}/keywordPlans/{kp_plan_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * Immutable. The resource name of the Keyword Planner plan.
   * KeywordPlan resource names have the form:
   * `customers/{customer_id}/keywordPlans/{kp_plan_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * Output only. The ID of the keyword plan.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  boolean hasId();
  /**
   * <pre>
   * Output only. The ID of the keyword plan.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.Int64Value getId();
  /**
   * <pre>
   * Output only. The ID of the keyword plan.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getIdOrBuilder();

  /**
   * <pre>
   * The name of the keyword plan.
   * This field is required and should not be empty when creating new keyword
   * plans.
   * </pre>
   *
   * <code>.google.protobuf.StringValue name = 3;</code>
   */
  boolean hasName();
  /**
   * <pre>
   * The name of the keyword plan.
   * This field is required and should not be empty when creating new keyword
   * plans.
   * </pre>
   *
   * <code>.google.protobuf.StringValue name = 3;</code>
   */
  com.google.protobuf.StringValue getName();
  /**
   * <pre>
   * The name of the keyword plan.
   * This field is required and should not be empty when creating new keyword
   * plans.
   * </pre>
   *
   * <code>.google.protobuf.StringValue name = 3;</code>
   */
  com.google.protobuf.StringValueOrBuilder getNameOrBuilder();

  /**
   * <pre>
   * The date period used for forecasting the plan.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.resources.KeywordPlanForecastPeriod forecast_period = 4;</code>
   */
  boolean hasForecastPeriod();
  /**
   * <pre>
   * The date period used for forecasting the plan.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.resources.KeywordPlanForecastPeriod forecast_period = 4;</code>
   */
  com.google.ads.googleads.v3.resources.KeywordPlanForecastPeriod getForecastPeriod();
  /**
   * <pre>
   * The date period used for forecasting the plan.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.resources.KeywordPlanForecastPeriod forecast_period = 4;</code>
   */
  com.google.ads.googleads.v3.resources.KeywordPlanForecastPeriodOrBuilder getForecastPeriodOrBuilder();
}
