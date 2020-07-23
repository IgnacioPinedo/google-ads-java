// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v1/services/keyword_plan_service.proto

package com.google.ads.googleads.v1.services;

public interface KeywordPlanKeywordHistoricalMetricsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v1.services.KeywordPlanKeywordHistoricalMetrics)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The text of the query associated with one or more ad_group_keywords in the
   * plan.
   * Note that we de-dupe your keywords list, eliminating close variants before
   * returning the plan's keywords as text. For example, if your plan originally
   * contained the keywords 'car' and 'cars', the returned search query will
   * only contain 'car'.
   * </pre>
   *
   * <code>.google.protobuf.StringValue search_query = 1;</code>
   * @return Whether the searchQuery field is set.
   */
  boolean hasSearchQuery();
  /**
   * <pre>
   * The text of the query associated with one or more ad_group_keywords in the
   * plan.
   * Note that we de-dupe your keywords list, eliminating close variants before
   * returning the plan's keywords as text. For example, if your plan originally
   * contained the keywords 'car' and 'cars', the returned search query will
   * only contain 'car'.
   * </pre>
   *
   * <code>.google.protobuf.StringValue search_query = 1;</code>
   * @return The searchQuery.
   */
  com.google.protobuf.StringValue getSearchQuery();
  /**
   * <pre>
   * The text of the query associated with one or more ad_group_keywords in the
   * plan.
   * Note that we de-dupe your keywords list, eliminating close variants before
   * returning the plan's keywords as text. For example, if your plan originally
   * contained the keywords 'car' and 'cars', the returned search query will
   * only contain 'car'.
   * </pre>
   *
   * <code>.google.protobuf.StringValue search_query = 1;</code>
   */
  com.google.protobuf.StringValueOrBuilder getSearchQueryOrBuilder();

  /**
   * <pre>
   * The historical metrics for the query associated with one or more
   * ad_group_keywords in the plan.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.common.KeywordPlanHistoricalMetrics keyword_metrics = 2;</code>
   * @return Whether the keywordMetrics field is set.
   */
  boolean hasKeywordMetrics();
  /**
   * <pre>
   * The historical metrics for the query associated with one or more
   * ad_group_keywords in the plan.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.common.KeywordPlanHistoricalMetrics keyword_metrics = 2;</code>
   * @return The keywordMetrics.
   */
  com.google.ads.googleads.v1.common.KeywordPlanHistoricalMetrics getKeywordMetrics();
  /**
   * <pre>
   * The historical metrics for the query associated with one or more
   * ad_group_keywords in the plan.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.common.KeywordPlanHistoricalMetrics keyword_metrics = 2;</code>
   */
  com.google.ads.googleads.v1.common.KeywordPlanHistoricalMetricsOrBuilder getKeywordMetricsOrBuilder();
}
