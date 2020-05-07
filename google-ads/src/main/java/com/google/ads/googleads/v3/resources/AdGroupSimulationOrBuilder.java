// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v3/resources/ad_group_simulation.proto

package com.google.ads.googleads.v3.resources;

public interface AdGroupSimulationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v3.resources.AdGroupSimulation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. The resource name of the ad group simulation.
   * Ad group simulation resource names have the form:
   * `customers/{customer_id}/adGroupSimulations/{ad_group_id}~{type}~{modification_method}~{start_date}~{end_date}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * Output only. The resource name of the ad group simulation.
   * Ad group simulation resource names have the form:
   * `customers/{customer_id}/adGroupSimulations/{ad_group_id}~{type}~{modification_method}~{start_date}~{end_date}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * Output only. Ad group id of the simulation.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value ad_group_id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  boolean hasAdGroupId();
  /**
   * <pre>
   * Output only. Ad group id of the simulation.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value ad_group_id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.Int64Value getAdGroupId();
  /**
   * <pre>
   * Output only. Ad group id of the simulation.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value ad_group_id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getAdGroupIdOrBuilder();

  /**
   * <pre>
   * Output only. The field that the simulation modifies.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.enums.SimulationTypeEnum.SimulationType type = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  int getTypeValue();
  /**
   * <pre>
   * Output only. The field that the simulation modifies.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.enums.SimulationTypeEnum.SimulationType type = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.ads.googleads.v3.enums.SimulationTypeEnum.SimulationType getType();

  /**
   * <pre>
   * Output only. How the simulation modifies the field.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.enums.SimulationModificationMethodEnum.SimulationModificationMethod modification_method = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  int getModificationMethodValue();
  /**
   * <pre>
   * Output only. How the simulation modifies the field.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.enums.SimulationModificationMethodEnum.SimulationModificationMethod modification_method = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.ads.googleads.v3.enums.SimulationModificationMethodEnum.SimulationModificationMethod getModificationMethod();

  /**
   * <pre>
   * Output only. First day on which the simulation is based, in YYYY-MM-DD format.
   * </pre>
   *
   * <code>.google.protobuf.StringValue start_date = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  boolean hasStartDate();
  /**
   * <pre>
   * Output only. First day on which the simulation is based, in YYYY-MM-DD format.
   * </pre>
   *
   * <code>.google.protobuf.StringValue start_date = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.StringValue getStartDate();
  /**
   * <pre>
   * Output only. First day on which the simulation is based, in YYYY-MM-DD format.
   * </pre>
   *
   * <code>.google.protobuf.StringValue start_date = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.StringValueOrBuilder getStartDateOrBuilder();

  /**
   * <pre>
   * Output only. Last day on which the simulation is based, in YYYY-MM-DD format
   * </pre>
   *
   * <code>.google.protobuf.StringValue end_date = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  boolean hasEndDate();
  /**
   * <pre>
   * Output only. Last day on which the simulation is based, in YYYY-MM-DD format
   * </pre>
   *
   * <code>.google.protobuf.StringValue end_date = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.StringValue getEndDate();
  /**
   * <pre>
   * Output only. Last day on which the simulation is based, in YYYY-MM-DD format
   * </pre>
   *
   * <code>.google.protobuf.StringValue end_date = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.StringValueOrBuilder getEndDateOrBuilder();

  /**
   * <pre>
   * Output only. Simulation points if the simulation type is CPC_BID.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.CpcBidSimulationPointList cpc_bid_point_list = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  boolean hasCpcBidPointList();
  /**
   * <pre>
   * Output only. Simulation points if the simulation type is CPC_BID.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.CpcBidSimulationPointList cpc_bid_point_list = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.ads.googleads.v3.common.CpcBidSimulationPointList getCpcBidPointList();
  /**
   * <pre>
   * Output only. Simulation points if the simulation type is CPC_BID.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.CpcBidSimulationPointList cpc_bid_point_list = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.ads.googleads.v3.common.CpcBidSimulationPointListOrBuilder getCpcBidPointListOrBuilder();

  /**
   * <pre>
   * Output only. Simulation points if the simulation type is CPV_BID.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.CpvBidSimulationPointList cpv_bid_point_list = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  boolean hasCpvBidPointList();
  /**
   * <pre>
   * Output only. Simulation points if the simulation type is CPV_BID.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.CpvBidSimulationPointList cpv_bid_point_list = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.ads.googleads.v3.common.CpvBidSimulationPointList getCpvBidPointList();
  /**
   * <pre>
   * Output only. Simulation points if the simulation type is CPV_BID.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.CpvBidSimulationPointList cpv_bid_point_list = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.ads.googleads.v3.common.CpvBidSimulationPointListOrBuilder getCpvBidPointListOrBuilder();

  /**
   * <pre>
   * Output only. Simulation points if the simulation type is TARGET_CPA.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.TargetCpaSimulationPointList target_cpa_point_list = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  boolean hasTargetCpaPointList();
  /**
   * <pre>
   * Output only. Simulation points if the simulation type is TARGET_CPA.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.TargetCpaSimulationPointList target_cpa_point_list = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.ads.googleads.v3.common.TargetCpaSimulationPointList getTargetCpaPointList();
  /**
   * <pre>
   * Output only. Simulation points if the simulation type is TARGET_CPA.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.TargetCpaSimulationPointList target_cpa_point_list = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.ads.googleads.v3.common.TargetCpaSimulationPointListOrBuilder getTargetCpaPointListOrBuilder();

  public com.google.ads.googleads.v3.resources.AdGroupSimulation.PointListCase getPointListCase();
}
