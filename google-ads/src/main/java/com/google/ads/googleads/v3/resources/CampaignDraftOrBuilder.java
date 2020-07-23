// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v3/resources/campaign_draft.proto

package com.google.ads.googleads.v3.resources;

public interface CampaignDraftOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v3.resources.CampaignDraft)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Immutable. The resource name of the campaign draft.
   * Campaign draft resource names have the form:
   * `customers/{customer_id}/campaignDrafts/{base_campaign_id}~{draft_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The resourceName.
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * Immutable. The resource name of the campaign draft.
   * Campaign draft resource names have the form:
   * `customers/{customer_id}/campaignDrafts/{base_campaign_id}~{draft_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for resourceName.
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * Output only. The ID of the draft.
   * This field is read-only.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value draft_id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the draftId field is set.
   */
  boolean hasDraftId();
  /**
   * <pre>
   * Output only. The ID of the draft.
   * This field is read-only.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value draft_id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The draftId.
   */
  com.google.protobuf.Int64Value getDraftId();
  /**
   * <pre>
   * Output only. The ID of the draft.
   * This field is read-only.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value draft_id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getDraftIdOrBuilder();

  /**
   * <pre>
   * Immutable. The base campaign to which the draft belongs.
   * </pre>
   *
   * <code>.google.protobuf.StringValue base_campaign = 3 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return Whether the baseCampaign field is set.
   */
  boolean hasBaseCampaign();
  /**
   * <pre>
   * Immutable. The base campaign to which the draft belongs.
   * </pre>
   *
   * <code>.google.protobuf.StringValue base_campaign = 3 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The baseCampaign.
   */
  com.google.protobuf.StringValue getBaseCampaign();
  /**
   * <pre>
   * Immutable. The base campaign to which the draft belongs.
   * </pre>
   *
   * <code>.google.protobuf.StringValue base_campaign = 3 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   */
  com.google.protobuf.StringValueOrBuilder getBaseCampaignOrBuilder();

  /**
   * <pre>
   * The name of the campaign draft.
   * This field is required and should not be empty when creating new
   * campaign drafts.
   * It must not contain any null (code point 0x0), NL line feed
   * (code point 0xA) or carriage return (code point 0xD) characters.
   * </pre>
   *
   * <code>.google.protobuf.StringValue name = 4;</code>
   * @return Whether the name field is set.
   */
  boolean hasName();
  /**
   * <pre>
   * The name of the campaign draft.
   * This field is required and should not be empty when creating new
   * campaign drafts.
   * It must not contain any null (code point 0x0), NL line feed
   * (code point 0xA) or carriage return (code point 0xD) characters.
   * </pre>
   *
   * <code>.google.protobuf.StringValue name = 4;</code>
   * @return The name.
   */
  com.google.protobuf.StringValue getName();
  /**
   * <pre>
   * The name of the campaign draft.
   * This field is required and should not be empty when creating new
   * campaign drafts.
   * It must not contain any null (code point 0x0), NL line feed
   * (code point 0xA) or carriage return (code point 0xD) characters.
   * </pre>
   *
   * <code>.google.protobuf.StringValue name = 4;</code>
   */
  com.google.protobuf.StringValueOrBuilder getNameOrBuilder();

  /**
   * <pre>
   * Output only. Resource name of the Campaign that results from overlaying the draft
   * changes onto the base campaign.
   * This field is read-only.
   * </pre>
   *
   * <code>.google.protobuf.StringValue draft_campaign = 5 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return Whether the draftCampaign field is set.
   */
  boolean hasDraftCampaign();
  /**
   * <pre>
   * Output only. Resource name of the Campaign that results from overlaying the draft
   * changes onto the base campaign.
   * This field is read-only.
   * </pre>
   *
   * <code>.google.protobuf.StringValue draft_campaign = 5 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The draftCampaign.
   */
  com.google.protobuf.StringValue getDraftCampaign();
  /**
   * <pre>
   * Output only. Resource name of the Campaign that results from overlaying the draft
   * changes onto the base campaign.
   * This field is read-only.
   * </pre>
   *
   * <code>.google.protobuf.StringValue draft_campaign = 5 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   */
  com.google.protobuf.StringValueOrBuilder getDraftCampaignOrBuilder();

  /**
   * <pre>
   * Output only. The status of the campaign draft. This field is read-only.
   * When a new campaign draft is added, the status defaults to PROPOSED.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.enums.CampaignDraftStatusEnum.CampaignDraftStatus status = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   * <pre>
   * Output only. The status of the campaign draft. This field is read-only.
   * When a new campaign draft is added, the status defaults to PROPOSED.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.enums.CampaignDraftStatusEnum.CampaignDraftStatus status = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The status.
   */
  com.google.ads.googleads.v3.enums.CampaignDraftStatusEnum.CampaignDraftStatus getStatus();

  /**
   * <pre>
   * Output only. Whether there is an experiment based on this draft currently serving.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue has_experiment_running = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the hasExperimentRunning field is set.
   */
  boolean hasHasExperimentRunning();
  /**
   * <pre>
   * Output only. Whether there is an experiment based on this draft currently serving.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue has_experiment_running = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The hasExperimentRunning.
   */
  com.google.protobuf.BoolValue getHasExperimentRunning();
  /**
   * <pre>
   * Output only. Whether there is an experiment based on this draft currently serving.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue has_experiment_running = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.BoolValueOrBuilder getHasExperimentRunningOrBuilder();

  /**
   * <pre>
   * Output only. The resource name of the long-running operation that can be used to poll
   * for completion of draft promotion. This is only set if the draft promotion
   * is in progress or finished.
   * </pre>
   *
   * <code>.google.protobuf.StringValue long_running_operation = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the longRunningOperation field is set.
   */
  boolean hasLongRunningOperation();
  /**
   * <pre>
   * Output only. The resource name of the long-running operation that can be used to poll
   * for completion of draft promotion. This is only set if the draft promotion
   * is in progress or finished.
   * </pre>
   *
   * <code>.google.protobuf.StringValue long_running_operation = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The longRunningOperation.
   */
  com.google.protobuf.StringValue getLongRunningOperation();
  /**
   * <pre>
   * Output only. The resource name of the long-running operation that can be used to poll
   * for completion of draft promotion. This is only set if the draft promotion
   * is in progress or finished.
   * </pre>
   *
   * <code>.google.protobuf.StringValue long_running_operation = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.StringValueOrBuilder getLongRunningOperationOrBuilder();
}
