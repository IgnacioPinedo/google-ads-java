// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v3/services/keyword_plan_campaign_service.proto

package com.google.ads.googleads.v3.services;

public interface KeywordPlanCampaignOperationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v3.services.KeywordPlanCampaignOperation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The FieldMask that determines which resource fields are modified in an
   * update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 4;</code>
   */
  boolean hasUpdateMask();
  /**
   * <pre>
   * The FieldMask that determines which resource fields are modified in an
   * update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 4;</code>
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   * <pre>
   * The FieldMask that determines which resource fields are modified in an
   * update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 4;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();

  /**
   * <pre>
   * Create operation: No resource name is expected for the new Keyword Plan
   * campaign.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.resources.KeywordPlanCampaign create = 1;</code>
   */
  boolean hasCreate();
  /**
   * <pre>
   * Create operation: No resource name is expected for the new Keyword Plan
   * campaign.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.resources.KeywordPlanCampaign create = 1;</code>
   */
  com.google.ads.googleads.v3.resources.KeywordPlanCampaign getCreate();
  /**
   * <pre>
   * Create operation: No resource name is expected for the new Keyword Plan
   * campaign.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.resources.KeywordPlanCampaign create = 1;</code>
   */
  com.google.ads.googleads.v3.resources.KeywordPlanCampaignOrBuilder getCreateOrBuilder();

  /**
   * <pre>
   * Update operation: The Keyword Plan campaign is expected to have a valid
   * resource name.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.resources.KeywordPlanCampaign update = 2;</code>
   */
  boolean hasUpdate();
  /**
   * <pre>
   * Update operation: The Keyword Plan campaign is expected to have a valid
   * resource name.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.resources.KeywordPlanCampaign update = 2;</code>
   */
  com.google.ads.googleads.v3.resources.KeywordPlanCampaign getUpdate();
  /**
   * <pre>
   * Update operation: The Keyword Plan campaign is expected to have a valid
   * resource name.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.resources.KeywordPlanCampaign update = 2;</code>
   */
  com.google.ads.googleads.v3.resources.KeywordPlanCampaignOrBuilder getUpdateOrBuilder();

  /**
   * <pre>
   * Remove operation: A resource name for the removed Keyword Plan campaign
   * is expected, in this format:
   * `customers/{customer_id}/keywordPlanCampaigns/{keywordPlan_campaign_id}`
   * </pre>
   *
   * <code>string remove = 3;</code>
   */
  java.lang.String getRemove();
  /**
   * <pre>
   * Remove operation: A resource name for the removed Keyword Plan campaign
   * is expected, in this format:
   * `customers/{customer_id}/keywordPlanCampaigns/{keywordPlan_campaign_id}`
   * </pre>
   *
   * <code>string remove = 3;</code>
   */
  com.google.protobuf.ByteString
      getRemoveBytes();

  public com.google.ads.googleads.v3.services.KeywordPlanCampaignOperation.OperationCase getOperationCase();
}