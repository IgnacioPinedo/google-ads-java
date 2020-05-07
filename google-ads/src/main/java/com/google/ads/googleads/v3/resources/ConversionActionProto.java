// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v3/resources/conversion_action.proto

package com.google.ads.googleads.v3.resources;

public final class ConversionActionProto {
  private ConversionActionProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v3_resources_ConversionAction_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v3_resources_ConversionAction_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v3_resources_ConversionAction_AttributionModelSettings_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v3_resources_ConversionAction_AttributionModelSettings_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v3_resources_ConversionAction_ValueSettings_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v3_resources_ConversionAction_ValueSettings_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n9google/ads/googleads/v3/resources/conv" +
      "ersion_action.proto\022!google.ads.googlead" +
      "s.v3.resources\0320google/ads/googleads/v3/" +
      "common/tag_snippet.proto\0325google/ads/goo" +
      "gleads/v3/enums/attribution_model.proto\032" +
      ">google/ads/googleads/v3/enums/conversio" +
      "n_action_category.proto\032Cgoogle/ads/goog" +
      "leads/v3/enums/conversion_action_countin" +
      "g_type.proto\032<google/ads/googleads/v3/en" +
      "ums/conversion_action_status.proto\032:goog" +
      "le/ads/googleads/v3/enums/conversion_act" +
      "ion_type.proto\032<google/ads/googleads/v3/" +
      "enums/data_driven_model_status.proto\032\037go" +
      "ogle/api/field_behavior.proto\032\031google/ap" +
      "i/resource.proto\032\036google/protobuf/wrappe" +
      "rs.proto\032\034google/api/annotations.proto\"\214" +
      "\016\n\020ConversionAction\022H\n\rresource_name\030\001 \001" +
      "(\tB1\340A\005\372A+\n)googleads.googleapis.com/Con" +
      "versionAction\022,\n\002id\030\002 \001(\0132\033.google.proto" +
      "buf.Int64ValueB\003\340A\003\022*\n\004name\030\003 \001(\0132\034.goog" +
      "le.protobuf.StringValue\022`\n\006status\030\004 \001(\0162" +
      "P.google.ads.googleads.v3.enums.Conversi" +
      "onActionStatusEnum.ConversionActionStatu" +
      "s\022_\n\004type\030\005 \001(\0162L.google.ads.googleads.v" +
      "3.enums.ConversionActionTypeEnum.Convers" +
      "ionActionTypeB\003\340A\005\022f\n\010category\030\006 \001(\0162T.g" +
      "oogle.ads.googleads.v3.enums.ConversionA" +
      "ctionCategoryEnum.ConversionActionCatego" +
      "ry\0229\n\016owner_customer\030\007 \001(\0132\034.google.prot" +
      "obuf.StringValueB\003\340A\003\022A\n\035include_in_conv" +
      "ersions_metric\030\010 \001(\0132\032.google.protobuf.B" +
      "oolValue\022G\n\"click_through_lookback_windo" +
      "w_days\030\t \001(\0132\033.google.protobuf.Int64Valu" +
      "e\022F\n!view_through_lookback_window_days\030\n" +
      " \001(\0132\033.google.protobuf.Int64Value\022Y\n\016val" +
      "ue_settings\030\013 \001(\0132A.google.ads.googleads" +
      ".v3.resources.ConversionAction.ValueSett" +
      "ings\022s\n\rcounting_type\030\014 \001(\0162\\.google.ads" +
      ".googleads.v3.enums.ConversionActionCoun" +
      "tingTypeEnum.ConversionActionCountingTyp" +
      "e\022p\n\032attribution_model_settings\030\r \001(\0132L." +
      "google.ads.googleads.v3.resources.Conver" +
      "sionAction.AttributionModelSettings\022E\n\014t" +
      "ag_snippets\030\016 \003(\0132*.google.ads.googleads" +
      ".v3.common.TagSnippetB\003\340A\003\022@\n\033phone_call" +
      "_duration_seconds\030\017 \001(\0132\033.google.protobu" +
      "f.Int64Value\022,\n\006app_id\030\020 \001(\0132\034.google.pr" +
      "otobuf.StringValue\032\362\001\n\030AttributionModelS" +
      "ettings\022_\n\021attribution_model\030\001 \001(\0162D.goo" +
      "gle.ads.googleads.v3.enums.AttributionMo" +
      "delEnum.AttributionModel\022u\n\030data_driven_" +
      "model_status\030\002 \001(\0162N.google.ads.googlead" +
      "s.v3.enums.DataDrivenModelStatusEnum.Dat" +
      "aDrivenModelStatusB\003\340A\003\032\277\001\n\rValueSetting" +
      "s\0223\n\rdefault_value\030\001 \001(\0132\034.google.protob" +
      "uf.DoubleValue\022;\n\025default_currency_code\030" +
      "\002 \001(\0132\034.google.protobuf.StringValue\022<\n\030a" +
      "lways_use_default_value\030\003 \001(\0132\032.google.p" +
      "rotobuf.BoolValue:j\352Ag\n)googleads.google" +
      "apis.com/ConversionAction\022:customers/{cu" +
      "stomer}/conversionActions/{conversion_ac" +
      "tion}B\202\002\n%com.google.ads.googleads.v3.re" +
      "sourcesB\025ConversionActionProtoP\001ZJgoogle" +
      ".golang.org/genproto/googleapis/ads/goog" +
      "leads/v3/resources;resources\242\002\003GAA\252\002!Goo" +
      "gle.Ads.GoogleAds.V3.Resources\312\002!Google\\" +
      "Ads\\GoogleAds\\V3\\Resources\352\002%Google::Ads" +
      "::GoogleAds::V3::Resourcesb\006proto3"
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
          com.google.ads.googleads.v3.common.TagSnippetProto.getDescriptor(),
          com.google.ads.googleads.v3.enums.AttributionModelProto.getDescriptor(),
          com.google.ads.googleads.v3.enums.ConversionActionCategoryProto.getDescriptor(),
          com.google.ads.googleads.v3.enums.ConversionActionCountingTypeProto.getDescriptor(),
          com.google.ads.googleads.v3.enums.ConversionActionStatusProto.getDescriptor(),
          com.google.ads.googleads.v3.enums.ConversionActionTypeProto.getDescriptor(),
          com.google.ads.googleads.v3.enums.DataDrivenModelStatusProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        }, assigner);
    internal_static_google_ads_googleads_v3_resources_ConversionAction_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v3_resources_ConversionAction_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v3_resources_ConversionAction_descriptor,
        new java.lang.String[] { "ResourceName", "Id", "Name", "Status", "Type", "Category", "OwnerCustomer", "IncludeInConversionsMetric", "ClickThroughLookbackWindowDays", "ViewThroughLookbackWindowDays", "ValueSettings", "CountingType", "AttributionModelSettings", "TagSnippets", "PhoneCallDurationSeconds", "AppId", });
    internal_static_google_ads_googleads_v3_resources_ConversionAction_AttributionModelSettings_descriptor =
      internal_static_google_ads_googleads_v3_resources_ConversionAction_descriptor.getNestedTypes().get(0);
    internal_static_google_ads_googleads_v3_resources_ConversionAction_AttributionModelSettings_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v3_resources_ConversionAction_AttributionModelSettings_descriptor,
        new java.lang.String[] { "AttributionModel", "DataDrivenModelStatus", });
    internal_static_google_ads_googleads_v3_resources_ConversionAction_ValueSettings_descriptor =
      internal_static_google_ads_googleads_v3_resources_ConversionAction_descriptor.getNestedTypes().get(1);
    internal_static_google_ads_googleads_v3_resources_ConversionAction_ValueSettings_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v3_resources_ConversionAction_ValueSettings_descriptor,
        new java.lang.String[] { "DefaultValue", "DefaultCurrencyCode", "AlwaysUseDefaultValue", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v3.common.TagSnippetProto.getDescriptor();
    com.google.ads.googleads.v3.enums.AttributionModelProto.getDescriptor();
    com.google.ads.googleads.v3.enums.ConversionActionCategoryProto.getDescriptor();
    com.google.ads.googleads.v3.enums.ConversionActionCountingTypeProto.getDescriptor();
    com.google.ads.googleads.v3.enums.ConversionActionStatusProto.getDescriptor();
    com.google.ads.googleads.v3.enums.ConversionActionTypeProto.getDescriptor();
    com.google.ads.googleads.v3.enums.DataDrivenModelStatusProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
