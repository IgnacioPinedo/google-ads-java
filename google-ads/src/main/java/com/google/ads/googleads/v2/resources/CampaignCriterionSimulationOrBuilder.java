// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v2/resources/campaign_criterion_simulation.proto

package com.google.ads.googleads.v2.resources;

public interface CampaignCriterionSimulationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v2.resources.CampaignCriterionSimulation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. The resource name of the campaign criterion simulation.
   * Campaign criterion simulation resource names have the form:
   * `customers/{customer_id}/campaignCriterionSimulations/{campaign_id}~{criterion_id}~{type}~{modification_method}~{start_date}~{end_date}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The resourceName.
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * Output only. The resource name of the campaign criterion simulation.
   * Campaign criterion simulation resource names have the form:
   * `customers/{customer_id}/campaignCriterionSimulations/{campaign_id}~{criterion_id}~{type}~{modification_method}~{start_date}~{end_date}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for resourceName.
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * Output only. Campaign ID of the simulation.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value campaign_id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the campaignId field is set.
   */
  boolean hasCampaignId();
  /**
   * <pre>
   * Output only. Campaign ID of the simulation.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value campaign_id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The campaignId.
   */
  com.google.protobuf.Int64Value getCampaignId();
  /**
   * <pre>
   * Output only. Campaign ID of the simulation.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value campaign_id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getCampaignIdOrBuilder();

  /**
   * <pre>
   * Output only. Criterion ID of the simulation.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value criterion_id = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the criterionId field is set.
   */
  boolean hasCriterionId();
  /**
   * <pre>
   * Output only. Criterion ID of the simulation.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value criterion_id = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The criterionId.
   */
  com.google.protobuf.Int64Value getCriterionId();
  /**
   * <pre>
   * Output only. Criterion ID of the simulation.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value criterion_id = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getCriterionIdOrBuilder();

  /**
   * <pre>
   * Output only. The field that the simulation modifies.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.enums.SimulationTypeEnum.SimulationType type = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   * <pre>
   * Output only. The field that the simulation modifies.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.enums.SimulationTypeEnum.SimulationType type = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The type.
   */
  com.google.ads.googleads.v2.enums.SimulationTypeEnum.SimulationType getType();

  /**
   * <pre>
   * Output only. How the simulation modifies the field.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.enums.SimulationModificationMethodEnum.SimulationModificationMethod modification_method = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for modificationMethod.
   */
  int getModificationMethodValue();
  /**
   * <pre>
   * Output only. How the simulation modifies the field.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.enums.SimulationModificationMethodEnum.SimulationModificationMethod modification_method = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The modificationMethod.
   */
  com.google.ads.googleads.v2.enums.SimulationModificationMethodEnum.SimulationModificationMethod getModificationMethod();

  /**
   * <pre>
   * Output only. First day on which the simulation is based, in YYYY-MM-DD format.
   * </pre>
   *
   * <code>.google.protobuf.StringValue start_date = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the startDate field is set.
   */
  boolean hasStartDate();
  /**
   * <pre>
   * Output only. First day on which the simulation is based, in YYYY-MM-DD format.
   * </pre>
   *
   * <code>.google.protobuf.StringValue start_date = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The startDate.
   */
  com.google.protobuf.StringValue getStartDate();
  /**
   * <pre>
   * Output only. First day on which the simulation is based, in YYYY-MM-DD format.
   * </pre>
   *
   * <code>.google.protobuf.StringValue start_date = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.StringValueOrBuilder getStartDateOrBuilder();

  /**
   * <pre>
   * Output only. Last day on which the simulation is based, in YYYY-MM-DD format.
   * </pre>
   *
   * <code>.google.protobuf.StringValue end_date = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the endDate field is set.
   */
  boolean hasEndDate();
  /**
   * <pre>
   * Output only. Last day on which the simulation is based, in YYYY-MM-DD format.
   * </pre>
   *
   * <code>.google.protobuf.StringValue end_date = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The endDate.
   */
  com.google.protobuf.StringValue getEndDate();
  /**
   * <pre>
   * Output only. Last day on which the simulation is based, in YYYY-MM-DD format.
   * </pre>
   *
   * <code>.google.protobuf.StringValue end_date = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.StringValueOrBuilder getEndDateOrBuilder();

  /**
   * <pre>
   * Output only. Simulation points if the simulation type is BID_MODIFIER.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.common.BidModifierSimulationPointList bid_modifier_point_list = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the bidModifierPointList field is set.
   */
  boolean hasBidModifierPointList();
  /**
   * <pre>
   * Output only. Simulation points if the simulation type is BID_MODIFIER.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.common.BidModifierSimulationPointList bid_modifier_point_list = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bidModifierPointList.
   */
  com.google.ads.googleads.v2.common.BidModifierSimulationPointList getBidModifierPointList();
  /**
   * <pre>
   * Output only. Simulation points if the simulation type is BID_MODIFIER.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.common.BidModifierSimulationPointList bid_modifier_point_list = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.ads.googleads.v2.common.BidModifierSimulationPointListOrBuilder getBidModifierPointListOrBuilder();

  public com.google.ads.googleads.v2.resources.CampaignCriterionSimulation.PointListCase getPointListCase();
}
