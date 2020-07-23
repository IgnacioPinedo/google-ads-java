// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v2/resources/campaign_budget.proto

package com.google.ads.googleads.v2.resources;

public interface CampaignBudgetOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v2.resources.CampaignBudget)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Immutable. The resource name of the campaign budget.
   * Campaign budget resource names have the form:
   * `customers/{customer_id}/campaignBudgets/{budget_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The resourceName.
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * Immutable. The resource name of the campaign budget.
   * Campaign budget resource names have the form:
   * `customers/{customer_id}/campaignBudgets/{budget_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for resourceName.
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * Output only. The ID of the campaign budget.
   * A campaign budget is created using the CampaignBudgetService create
   * operation and is assigned a budget ID. A budget ID can be shared across
   * different campaigns; the system will then allocate the campaign budget
   * among different campaigns to get optimum results.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value id = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the id field is set.
   */
  boolean hasId();
  /**
   * <pre>
   * Output only. The ID of the campaign budget.
   * A campaign budget is created using the CampaignBudgetService create
   * operation and is assigned a budget ID. A budget ID can be shared across
   * different campaigns; the system will then allocate the campaign budget
   * among different campaigns to get optimum results.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value id = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The id.
   */
  com.google.protobuf.Int64Value getId();
  /**
   * <pre>
   * Output only. The ID of the campaign budget.
   * A campaign budget is created using the CampaignBudgetService create
   * operation and is assigned a budget ID. A budget ID can be shared across
   * different campaigns; the system will then allocate the campaign budget
   * among different campaigns to get optimum results.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value id = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getIdOrBuilder();

  /**
   * <pre>
   * The name of the campaign budget.
   * When creating a campaign budget through CampaignBudgetService, every
   * explicitly shared campaign budget must have a non-null, non-empty name.
   * Campaign budgets that are not explicitly shared derive their name from the
   * attached campaign's name.
   * The length of this string must be between 1 and 255, inclusive,
   * in UTF-8 bytes, (trimmed).
   * </pre>
   *
   * <code>.google.protobuf.StringValue name = 4;</code>
   * @return Whether the name field is set.
   */
  boolean hasName();
  /**
   * <pre>
   * The name of the campaign budget.
   * When creating a campaign budget through CampaignBudgetService, every
   * explicitly shared campaign budget must have a non-null, non-empty name.
   * Campaign budgets that are not explicitly shared derive their name from the
   * attached campaign's name.
   * The length of this string must be between 1 and 255, inclusive,
   * in UTF-8 bytes, (trimmed).
   * </pre>
   *
   * <code>.google.protobuf.StringValue name = 4;</code>
   * @return The name.
   */
  com.google.protobuf.StringValue getName();
  /**
   * <pre>
   * The name of the campaign budget.
   * When creating a campaign budget through CampaignBudgetService, every
   * explicitly shared campaign budget must have a non-null, non-empty name.
   * Campaign budgets that are not explicitly shared derive their name from the
   * attached campaign's name.
   * The length of this string must be between 1 and 255, inclusive,
   * in UTF-8 bytes, (trimmed).
   * </pre>
   *
   * <code>.google.protobuf.StringValue name = 4;</code>
   */
  com.google.protobuf.StringValueOrBuilder getNameOrBuilder();

  /**
   * <pre>
   * The amount of the budget, in the local currency for the account.
   * Amount is specified in micros, where one million is equivalent to one
   * currency unit. Monthly spend is capped at 30.4 times this amount.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value amount_micros = 5;</code>
   * @return Whether the amountMicros field is set.
   */
  boolean hasAmountMicros();
  /**
   * <pre>
   * The amount of the budget, in the local currency for the account.
   * Amount is specified in micros, where one million is equivalent to one
   * currency unit. Monthly spend is capped at 30.4 times this amount.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value amount_micros = 5;</code>
   * @return The amountMicros.
   */
  com.google.protobuf.Int64Value getAmountMicros();
  /**
   * <pre>
   * The amount of the budget, in the local currency for the account.
   * Amount is specified in micros, where one million is equivalent to one
   * currency unit. Monthly spend is capped at 30.4 times this amount.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value amount_micros = 5;</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getAmountMicrosOrBuilder();

  /**
   * <pre>
   * The lifetime amount of the budget, in the local currency for the account.
   * Amount is specified in micros, where one million is equivalent to one
   * currency unit.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value total_amount_micros = 10;</code>
   * @return Whether the totalAmountMicros field is set.
   */
  boolean hasTotalAmountMicros();
  /**
   * <pre>
   * The lifetime amount of the budget, in the local currency for the account.
   * Amount is specified in micros, where one million is equivalent to one
   * currency unit.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value total_amount_micros = 10;</code>
   * @return The totalAmountMicros.
   */
  com.google.protobuf.Int64Value getTotalAmountMicros();
  /**
   * <pre>
   * The lifetime amount of the budget, in the local currency for the account.
   * Amount is specified in micros, where one million is equivalent to one
   * currency unit.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value total_amount_micros = 10;</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getTotalAmountMicrosOrBuilder();

  /**
   * <pre>
   * Output only. The status of this campaign budget. This field is read-only.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.enums.BudgetStatusEnum.BudgetStatus status = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   * <pre>
   * Output only. The status of this campaign budget. This field is read-only.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.enums.BudgetStatusEnum.BudgetStatus status = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The status.
   */
  com.google.ads.googleads.v2.enums.BudgetStatusEnum.BudgetStatus getStatus();

  /**
   * <pre>
   * The delivery method that determines the rate at which the campaign budget
   * is spent.
   * Defaults to STANDARD if unspecified in a create operation.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.enums.BudgetDeliveryMethodEnum.BudgetDeliveryMethod delivery_method = 7;</code>
   * @return The enum numeric value on the wire for deliveryMethod.
   */
  int getDeliveryMethodValue();
  /**
   * <pre>
   * The delivery method that determines the rate at which the campaign budget
   * is spent.
   * Defaults to STANDARD if unspecified in a create operation.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.enums.BudgetDeliveryMethodEnum.BudgetDeliveryMethod delivery_method = 7;</code>
   * @return The deliveryMethod.
   */
  com.google.ads.googleads.v2.enums.BudgetDeliveryMethodEnum.BudgetDeliveryMethod getDeliveryMethod();

  /**
   * <pre>
   * Specifies whether the budget is explicitly shared. Defaults to true if
   * unspecified in a create operation.
   * If true, the budget was created with the purpose of sharing
   * across one or more campaigns.
   * If false, the budget was created with the intention of only being used
   * with a single campaign. The budget's name and status will stay in sync
   * with the campaign's name and status. Attempting to share the budget with a
   * second campaign will result in an error.
   * A non-shared budget can become an explicitly shared. The same operation
   * must also assign the budget a name.
   * A shared campaign budget can never become non-shared.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue explicitly_shared = 8;</code>
   * @return Whether the explicitlyShared field is set.
   */
  boolean hasExplicitlyShared();
  /**
   * <pre>
   * Specifies whether the budget is explicitly shared. Defaults to true if
   * unspecified in a create operation.
   * If true, the budget was created with the purpose of sharing
   * across one or more campaigns.
   * If false, the budget was created with the intention of only being used
   * with a single campaign. The budget's name and status will stay in sync
   * with the campaign's name and status. Attempting to share the budget with a
   * second campaign will result in an error.
   * A non-shared budget can become an explicitly shared. The same operation
   * must also assign the budget a name.
   * A shared campaign budget can never become non-shared.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue explicitly_shared = 8;</code>
   * @return The explicitlyShared.
   */
  com.google.protobuf.BoolValue getExplicitlyShared();
  /**
   * <pre>
   * Specifies whether the budget is explicitly shared. Defaults to true if
   * unspecified in a create operation.
   * If true, the budget was created with the purpose of sharing
   * across one or more campaigns.
   * If false, the budget was created with the intention of only being used
   * with a single campaign. The budget's name and status will stay in sync
   * with the campaign's name and status. Attempting to share the budget with a
   * second campaign will result in an error.
   * A non-shared budget can become an explicitly shared. The same operation
   * must also assign the budget a name.
   * A shared campaign budget can never become non-shared.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue explicitly_shared = 8;</code>
   */
  com.google.protobuf.BoolValueOrBuilder getExplicitlySharedOrBuilder();

  /**
   * <pre>
   * Output only. The number of campaigns actively using the budget.
   * This field is read-only.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value reference_count = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the referenceCount field is set.
   */
  boolean hasReferenceCount();
  /**
   * <pre>
   * Output only. The number of campaigns actively using the budget.
   * This field is read-only.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value reference_count = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The referenceCount.
   */
  com.google.protobuf.Int64Value getReferenceCount();
  /**
   * <pre>
   * Output only. The number of campaigns actively using the budget.
   * This field is read-only.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value reference_count = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getReferenceCountOrBuilder();

  /**
   * <pre>
   * Output only. Indicates whether there is a recommended budget for this campaign budget.
   * This field is read-only.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue has_recommended_budget = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the hasRecommendedBudget field is set.
   */
  boolean hasHasRecommendedBudget();
  /**
   * <pre>
   * Output only. Indicates whether there is a recommended budget for this campaign budget.
   * This field is read-only.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue has_recommended_budget = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The hasRecommendedBudget.
   */
  com.google.protobuf.BoolValue getHasRecommendedBudget();
  /**
   * <pre>
   * Output only. Indicates whether there is a recommended budget for this campaign budget.
   * This field is read-only.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue has_recommended_budget = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.BoolValueOrBuilder getHasRecommendedBudgetOrBuilder();

  /**
   * <pre>
   * Output only. The recommended budget amount. If no recommendation is available, this will
   * be set to the budget amount.
   * Amount is specified in micros, where one million is equivalent to one
   * currency unit.
   * This field is read-only.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value recommended_budget_amount_micros = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the recommendedBudgetAmountMicros field is set.
   */
  boolean hasRecommendedBudgetAmountMicros();
  /**
   * <pre>
   * Output only. The recommended budget amount. If no recommendation is available, this will
   * be set to the budget amount.
   * Amount is specified in micros, where one million is equivalent to one
   * currency unit.
   * This field is read-only.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value recommended_budget_amount_micros = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The recommendedBudgetAmountMicros.
   */
  com.google.protobuf.Int64Value getRecommendedBudgetAmountMicros();
  /**
   * <pre>
   * Output only. The recommended budget amount. If no recommendation is available, this will
   * be set to the budget amount.
   * Amount is specified in micros, where one million is equivalent to one
   * currency unit.
   * This field is read-only.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value recommended_budget_amount_micros = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getRecommendedBudgetAmountMicrosOrBuilder();

  /**
   * <pre>
   * Immutable. Period over which to spend the budget. Defaults to DAILY if not specified.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.enums.BudgetPeriodEnum.BudgetPeriod period = 13 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The enum numeric value on the wire for period.
   */
  int getPeriodValue();
  /**
   * <pre>
   * Immutable. Period over which to spend the budget. Defaults to DAILY if not specified.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.enums.BudgetPeriodEnum.BudgetPeriod period = 13 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The period.
   */
  com.google.ads.googleads.v2.enums.BudgetPeriodEnum.BudgetPeriod getPeriod();

  /**
   * <pre>
   * Output only. The estimated change in weekly clicks if the recommended budget is applied.
   * This field is read-only.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value recommended_budget_estimated_change_weekly_clicks = 14 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the recommendedBudgetEstimatedChangeWeeklyClicks field is set.
   */
  boolean hasRecommendedBudgetEstimatedChangeWeeklyClicks();
  /**
   * <pre>
   * Output only. The estimated change in weekly clicks if the recommended budget is applied.
   * This field is read-only.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value recommended_budget_estimated_change_weekly_clicks = 14 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The recommendedBudgetEstimatedChangeWeeklyClicks.
   */
  com.google.protobuf.Int64Value getRecommendedBudgetEstimatedChangeWeeklyClicks();
  /**
   * <pre>
   * Output only. The estimated change in weekly clicks if the recommended budget is applied.
   * This field is read-only.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value recommended_budget_estimated_change_weekly_clicks = 14 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getRecommendedBudgetEstimatedChangeWeeklyClicksOrBuilder();

  /**
   * <pre>
   * Output only. The estimated change in weekly cost in micros if the recommended budget is
   * applied. One million is equivalent to one currency unit.
   * This field is read-only.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value recommended_budget_estimated_change_weekly_cost_micros = 15 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the recommendedBudgetEstimatedChangeWeeklyCostMicros field is set.
   */
  boolean hasRecommendedBudgetEstimatedChangeWeeklyCostMicros();
  /**
   * <pre>
   * Output only. The estimated change in weekly cost in micros if the recommended budget is
   * applied. One million is equivalent to one currency unit.
   * This field is read-only.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value recommended_budget_estimated_change_weekly_cost_micros = 15 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The recommendedBudgetEstimatedChangeWeeklyCostMicros.
   */
  com.google.protobuf.Int64Value getRecommendedBudgetEstimatedChangeWeeklyCostMicros();
  /**
   * <pre>
   * Output only. The estimated change in weekly cost in micros if the recommended budget is
   * applied. One million is equivalent to one currency unit.
   * This field is read-only.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value recommended_budget_estimated_change_weekly_cost_micros = 15 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getRecommendedBudgetEstimatedChangeWeeklyCostMicrosOrBuilder();

  /**
   * <pre>
   * Output only. The estimated change in weekly interactions if the recommended budget is
   * applied.
   * This field is read-only.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value recommended_budget_estimated_change_weekly_interactions = 16 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the recommendedBudgetEstimatedChangeWeeklyInteractions field is set.
   */
  boolean hasRecommendedBudgetEstimatedChangeWeeklyInteractions();
  /**
   * <pre>
   * Output only. The estimated change in weekly interactions if the recommended budget is
   * applied.
   * This field is read-only.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value recommended_budget_estimated_change_weekly_interactions = 16 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The recommendedBudgetEstimatedChangeWeeklyInteractions.
   */
  com.google.protobuf.Int64Value getRecommendedBudgetEstimatedChangeWeeklyInteractions();
  /**
   * <pre>
   * Output only. The estimated change in weekly interactions if the recommended budget is
   * applied.
   * This field is read-only.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value recommended_budget_estimated_change_weekly_interactions = 16 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getRecommendedBudgetEstimatedChangeWeeklyInteractionsOrBuilder();

  /**
   * <pre>
   * Output only. The estimated change in weekly views if the recommended budget is applied.
   * This field is read-only.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value recommended_budget_estimated_change_weekly_views = 17 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the recommendedBudgetEstimatedChangeWeeklyViews field is set.
   */
  boolean hasRecommendedBudgetEstimatedChangeWeeklyViews();
  /**
   * <pre>
   * Output only. The estimated change in weekly views if the recommended budget is applied.
   * This field is read-only.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value recommended_budget_estimated_change_weekly_views = 17 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The recommendedBudgetEstimatedChangeWeeklyViews.
   */
  com.google.protobuf.Int64Value getRecommendedBudgetEstimatedChangeWeeklyViews();
  /**
   * <pre>
   * Output only. The estimated change in weekly views if the recommended budget is applied.
   * This field is read-only.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value recommended_budget_estimated_change_weekly_views = 17 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getRecommendedBudgetEstimatedChangeWeeklyViewsOrBuilder();

  /**
   * <pre>
   * Immutable. The type of the campaign budget.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.enums.BudgetTypeEnum.BudgetType type = 18 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   * <pre>
   * Immutable. The type of the campaign budget.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.enums.BudgetTypeEnum.BudgetType type = 18 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The type.
   */
  com.google.ads.googleads.v2.enums.BudgetTypeEnum.BudgetType getType();
}
