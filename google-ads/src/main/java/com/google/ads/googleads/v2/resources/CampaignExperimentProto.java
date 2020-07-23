// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v2/resources/campaign_experiment.proto

package com.google.ads.googleads.v2.resources;

public final class CampaignExperimentProto {
  private CampaignExperimentProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v2_resources_CampaignExperiment_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v2_resources_CampaignExperiment_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n;google/ads/googleads/v2/resources/camp" +
      "aign_experiment.proto\022!google.ads.google" +
      "ads.v2.resources\032>google/ads/googleads/v" +
      "2/enums/campaign_experiment_status.proto" +
      "\032Jgoogle/ads/googleads/v2/enums/campaign" +
      "_experiment_traffic_split_type.proto\032\037go" +
      "ogle/api/field_behavior.proto\032\031google/ap" +
      "i/resource.proto\032\036google/protobuf/wrappe" +
      "rs.proto\032\034google/api/annotations.proto\"\210" +
      "\010\n\022CampaignExperiment\022J\n\rresource_name\030\001" +
      " \001(\tB3\340A\005\372A-\n+googleads.googleapis.com/C" +
      "ampaignExperiment\022,\n\002id\030\002 \001(\0132\033.google.p" +
      "rotobuf.Int64ValueB\003\340A\003\022d\n\016campaign_draf" +
      "t\030\003 \001(\0132\034.google.protobuf.StringValueB.\340" +
      "A\005\372A(\n&googleads.googleapis.com/Campaign" +
      "Draft\022*\n\004name\030\004 \001(\0132\034.google.protobuf.St" +
      "ringValue\0221\n\013description\030\005 \001(\0132\034.google." +
      "protobuf.StringValue\022?\n\025traffic_split_pe" +
      "rcent\030\006 \001(\0132\033.google.protobuf.Int64Value" +
      "B\003\340A\005\022\211\001\n\022traffic_split_type\030\007 \001(\0162h.goo" +
      "gle.ads.googleads.v2.enums.CampaignExper" +
      "imentTrafficSplitTypeEnum.CampaignExperi" +
      "mentTrafficSplitTypeB\003\340A\005\022d\n\023experiment_" +
      "campaign\030\010 \001(\0132\034.google.protobuf.StringV" +
      "alueB)\340A\003\372A#\n!googleads.googleapis.com/C" +
      "ampaign\022i\n\006status\030\t \001(\0162T.google.ads.goo" +
      "gleads.v2.enums.CampaignExperimentStatus" +
      "Enum.CampaignExperimentStatusB\003\340A\003\022A\n\026lo" +
      "ng_running_operation\030\n \001(\0132\034.google.prot" +
      "obuf.StringValueB\003\340A\003\0220\n\nstart_date\030\013 \001(" +
      "\0132\034.google.protobuf.StringValue\022.\n\010end_d" +
      "ate\030\014 \001(\0132\034.google.protobuf.StringValue:" +
      "p\352Am\n+googleads.googleapis.com/CampaignE" +
      "xperiment\022>customers/{customer}/campaign" +
      "Experiments/{campaign_experiment}B\204\002\n%co" +
      "m.google.ads.googleads.v2.resourcesB\027Cam" +
      "paignExperimentProtoP\001ZJgoogle.golang.or" +
      "g/genproto/googleapis/ads/googleads/v2/r" +
      "esources;resources\242\002\003GAA\252\002!Google.Ads.Go" +
      "ogleAds.V2.Resources\312\002!Google\\Ads\\Google" +
      "Ads\\V2\\Resources\352\002%Google::Ads::GoogleAd" +
      "s::V2::Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v2.enums.CampaignExperimentStatusProto.getDescriptor(),
          com.google.ads.googleads.v2.enums.CampaignExperimentTrafficSplitTypeProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v2_resources_CampaignExperiment_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v2_resources_CampaignExperiment_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v2_resources_CampaignExperiment_descriptor,
        new java.lang.String[] { "ResourceName", "Id", "CampaignDraft", "Name", "Description", "TrafficSplitPercent", "TrafficSplitType", "ExperimentCampaign", "Status", "LongRunningOperation", "StartDate", "EndDate", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v2.enums.CampaignExperimentStatusProto.getDescriptor();
    com.google.ads.googleads.v2.enums.CampaignExperimentTrafficSplitTypeProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
