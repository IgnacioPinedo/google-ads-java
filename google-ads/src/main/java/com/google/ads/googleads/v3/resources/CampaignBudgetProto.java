// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v3/resources/campaign_budget.proto

package com.google.ads.googleads.v3.resources;

public final class CampaignBudgetProto {
  private CampaignBudgetProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v3_resources_CampaignBudget_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v3_resources_CampaignBudget_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n7google/ads/googleads/v3/resources/camp" +
      "aign_budget.proto\022!google.ads.googleads." +
      "v3.resources\032:google/ads/googleads/v3/en" +
      "ums/budget_delivery_method.proto\0321google" +
      "/ads/googleads/v3/enums/budget_period.pr" +
      "oto\0321google/ads/googleads/v3/enums/budge" +
      "t_status.proto\032/google/ads/googleads/v3/" +
      "enums/budget_type.proto\032\037google/api/fiel" +
      "d_behavior.proto\032\031google/api/resource.pr" +
      "oto\032\036google/protobuf/wrappers.proto\032\034goo" +
      "gle/api/annotations.proto\"\335\n\n\016CampaignBu" +
      "dget\022F\n\rresource_name\030\001 \001(\tB/\340A\005\372A)\n\'goo" +
      "gleads.googleapis.com/CampaignBudget\022,\n\002" +
      "id\030\003 \001(\0132\033.google.protobuf.Int64ValueB\003\340" +
      "A\003\022*\n\004name\030\004 \001(\0132\034.google.protobuf.Strin" +
      "gValue\0222\n\ramount_micros\030\005 \001(\0132\033.google.p" +
      "rotobuf.Int64Value\0228\n\023total_amount_micro" +
      "s\030\n \001(\0132\033.google.protobuf.Int64Value\022Q\n\006" +
      "status\030\006 \001(\0162<.google.ads.googleads.v3.e" +
      "nums.BudgetStatusEnum.BudgetStatusB\003\340A\003\022" +
      "e\n\017delivery_method\030\007 \001(\0162L.google.ads.go" +
      "ogleads.v3.enums.BudgetDeliveryMethodEnu" +
      "m.BudgetDeliveryMethod\0225\n\021explicitly_sha" +
      "red\030\010 \001(\0132\032.google.protobuf.BoolValue\0229\n" +
      "\017reference_count\030\t \001(\0132\033.google.protobuf" +
      ".Int64ValueB\003\340A\003\022?\n\026has_recommended_budg" +
      "et\030\013 \001(\0132\032.google.protobuf.BoolValueB\003\340A" +
      "\003\022J\n recommended_budget_amount_micros\030\014 " +
      "\001(\0132\033.google.protobuf.Int64ValueB\003\340A\003\022Q\n" +
      "\006period\030\r \001(\0162<.google.ads.googleads.v3." +
      "enums.BudgetPeriodEnum.BudgetPeriodB\003\340A\005" +
      "\022[\n1recommended_budget_estimated_change_" +
      "weekly_clicks\030\016 \001(\0132\033.google.protobuf.In" +
      "t64ValueB\003\340A\003\022`\n6recommended_budget_esti" +
      "mated_change_weekly_cost_micros\030\017 \001(\0132\033." +
      "google.protobuf.Int64ValueB\003\340A\003\022a\n7recom" +
      "mended_budget_estimated_change_weekly_in" +
      "teractions\030\020 \001(\0132\033.google.protobuf.Int64" +
      "ValueB\003\340A\003\022Z\n0recommended_budget_estimat" +
      "ed_change_weekly_views\030\021 \001(\0132\033.google.pr" +
      "otobuf.Int64ValueB\003\340A\003\022K\n\004type\030\022 \001(\01628.g" +
      "oogle.ads.googleads.v3.enums.BudgetTypeE" +
      "num.BudgetTypeB\003\340A\005:d\352Aa\n\'googleads.goog" +
      "leapis.com/CampaignBudget\0226customers/{cu" +
      "stomer}/campaignBudgets/{campaign_budget" +
      "}B\200\002\n%com.google.ads.googleads.v3.resour" +
      "cesB\023CampaignBudgetProtoP\001ZJgoogle.golan" +
      "g.org/genproto/googleapis/ads/googleads/" +
      "v3/resources;resources\242\002\003GAA\252\002!Google.Ad" +
      "s.GoogleAds.V3.Resources\312\002!Google\\Ads\\Go" +
      "ogleAds\\V3\\Resources\352\002%Google::Ads::Goog" +
      "leAds::V3::Resourcesb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v3.enums.BudgetDeliveryMethodProto.getDescriptor(),
          com.google.ads.googleads.v3.enums.BudgetPeriodProto.getDescriptor(),
          com.google.ads.googleads.v3.enums.BudgetStatusProto.getDescriptor(),
          com.google.ads.googleads.v3.enums.BudgetTypeProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        }, assigner);
    internal_static_google_ads_googleads_v3_resources_CampaignBudget_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v3_resources_CampaignBudget_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v3_resources_CampaignBudget_descriptor,
        new java.lang.String[] { "ResourceName", "Id", "Name", "AmountMicros", "TotalAmountMicros", "Status", "DeliveryMethod", "ExplicitlyShared", "ReferenceCount", "HasRecommendedBudget", "RecommendedBudgetAmountMicros", "Period", "RecommendedBudgetEstimatedChangeWeeklyClicks", "RecommendedBudgetEstimatedChangeWeeklyCostMicros", "RecommendedBudgetEstimatedChangeWeeklyInteractions", "RecommendedBudgetEstimatedChangeWeeklyViews", "Type", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v3.enums.BudgetDeliveryMethodProto.getDescriptor();
    com.google.ads.googleads.v3.enums.BudgetPeriodProto.getDescriptor();
    com.google.ads.googleads.v3.enums.BudgetStatusProto.getDescriptor();
    com.google.ads.googleads.v3.enums.BudgetTypeProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
