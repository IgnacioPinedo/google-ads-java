// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v2/resources/ad_group_criterion_simulation.proto

package com.google.ads.googleads.v2.resources;

public final class AdGroupCriterionSimulationProto {
  private AdGroupCriterionSimulationProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v2_resources_AdGroupCriterionSimulation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v2_resources_AdGroupCriterionSimulation_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nEgoogle/ads/googleads/v2/resources/ad_g" +
      "roup_criterion_simulation.proto\022!google." +
      "ads.googleads.v2.resources\032/google/ads/g" +
      "oogleads/v2/common/simulation.proto\032Bgoo" +
      "gle/ads/googleads/v2/enums/simulation_mo" +
      "dification_method.proto\0323google/ads/goog" +
      "leads/v2/enums/simulation_type.proto\032\037go" +
      "ogle/api/field_behavior.proto\032\031google/ap" +
      "i/resource.proto\032\036google/protobuf/wrappe" +
      "rs.proto\032\034google/api/annotations.proto\"\232" +
      "\006\n\032AdGroupCriterionSimulation\022R\n\rresourc" +
      "e_name\030\001 \001(\tB;\340A\003\372A5\n3googleads.googleap" +
      "is.com/AdGroupCriterionSimulation\0225\n\013ad_" +
      "group_id\030\002 \001(\0132\033.google.protobuf.Int64Va" +
      "lueB\003\340A\003\0226\n\014criterion_id\030\003 \001(\0132\033.google." +
      "protobuf.Int64ValueB\003\340A\003\022S\n\004type\030\004 \001(\0162@" +
      ".google.ads.googleads.v2.enums.Simulatio" +
      "nTypeEnum.SimulationTypeB\003\340A\003\022~\n\023modific" +
      "ation_method\030\005 \001(\0162\\.google.ads.googlead" +
      "s.v2.enums.SimulationModificationMethodE" +
      "num.SimulationModificationMethodB\003\340A\003\0225\n" +
      "\nstart_date\030\006 \001(\0132\034.google.protobuf.Stri" +
      "ngValueB\003\340A\003\0223\n\010end_date\030\007 \001(\0132\034.google." +
      "protobuf.StringValueB\003\340A\003\022\\\n\022cpc_bid_poi" +
      "nt_list\030\010 \001(\01329.google.ads.googleads.v2." +
      "common.CpcBidSimulationPointListB\003\340A\003H\000:" +
      "\213\001\352A\207\001\n3googleads.googleapis.com/AdGroup" +
      "CriterionSimulation\022Pcustomers/{customer" +
      "}/adGroupCriterionSimulations/{ad_group_" +
      "criterion_simulation}B\014\n\npoint_listB\214\002\n%" +
      "com.google.ads.googleads.v2.resourcesB\037A" +
      "dGroupCriterionSimulationProtoP\001ZJgoogle" +
      ".golang.org/genproto/googleapis/ads/goog" +
      "leads/v2/resources;resources\242\002\003GAA\252\002!Goo" +
      "gle.Ads.GoogleAds.V2.Resources\312\002!Google\\" +
      "Ads\\GoogleAds\\V2\\Resources\352\002%Google::Ads" +
      "::GoogleAds::V2::Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v2.common.SimulationProto.getDescriptor(),
          com.google.ads.googleads.v2.enums.SimulationModificationMethodProto.getDescriptor(),
          com.google.ads.googleads.v2.enums.SimulationTypeProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v2_resources_AdGroupCriterionSimulation_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v2_resources_AdGroupCriterionSimulation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v2_resources_AdGroupCriterionSimulation_descriptor,
        new java.lang.String[] { "ResourceName", "AdGroupId", "CriterionId", "Type", "ModificationMethod", "StartDate", "EndDate", "CpcBidPointList", "PointList", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v2.common.SimulationProto.getDescriptor();
    com.google.ads.googleads.v2.enums.SimulationModificationMethodProto.getDescriptor();
    com.google.ads.googleads.v2.enums.SimulationTypeProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
