// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v3/resources/customer.proto

package com.google.ads.googleads.v3.resources;

public final class CustomerProto {
  private CustomerProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v3_resources_Customer_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v3_resources_Customer_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v3_resources_CallReportingSetting_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v3_resources_CallReportingSetting_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v3_resources_ConversionTrackingSetting_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v3_resources_ConversionTrackingSetting_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v3_resources_RemarketingSetting_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v3_resources_RemarketingSetting_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n0google/ads/googleads/v3/resources/cust" +
      "omer.proto\022!google.ads.googleads.v3.reso" +
      "urces\032Zgoogle/ads/googleads/v3/enums/cus" +
      "tomer_pay_per_conversion_eligibility_fai" +
      "lure_reason.proto\032\037google/api/field_beha" +
      "vior.proto\032\031google/api/resource.proto\032\036g" +
      "oogle/protobuf/wrappers.proto\032\034google/ap" +
      "i/annotations.proto\"\224\t\n\010Customer\022@\n\rreso" +
      "urce_name\030\001 \001(\tB)\340A\005\372A#\n!googleads.googl" +
      "eapis.com/Customer\022,\n\002id\030\003 \001(\0132\033.google." +
      "protobuf.Int64ValueB\003\340A\003\0226\n\020descriptive_" +
      "name\030\004 \001(\0132\034.google.protobuf.StringValue" +
      "\0228\n\rcurrency_code\030\005 \001(\0132\034.google.protobu" +
      "f.StringValueB\003\340A\005\0224\n\ttime_zone\030\006 \001(\0132\034." +
      "google.protobuf.StringValueB\003\340A\005\022;\n\025trac" +
      "king_url_template\030\007 \001(\0132\034.google.protobu" +
      "f.StringValue\0226\n\020final_url_suffix\030\013 \001(\0132" +
      "\034.google.protobuf.StringValue\0228\n\024auto_ta" +
      "gging_enabled\030\010 \001(\0132\032.google.protobuf.Bo" +
      "olValue\022;\n\022has_partners_badge\030\t \001(\0132\032.go" +
      "ogle.protobuf.BoolValueB\003\340A\003\0220\n\007manager\030" +
      "\014 \001(\0132\032.google.protobuf.BoolValueB\003\340A\003\0225" +
      "\n\014test_account\030\r \001(\0132\032.google.protobuf.B" +
      "oolValueB\003\340A\003\022W\n\026call_reporting_setting\030" +
      "\n \001(\01327.google.ads.googleads.v3.resource" +
      "s.CallReportingSetting\022f\n\033conversion_tra" +
      "cking_setting\030\016 \001(\0132<.google.ads.googlea" +
      "ds.v3.resources.ConversionTrackingSettin" +
      "gB\003\340A\003\022W\n\023remarketing_setting\030\017 \001(\01325.go" +
      "ogle.ads.googleads.v3.resources.Remarket" +
      "ingSettingB\003\340A\003\022\302\001\n.pay_per_conversion_e" +
      "ligibility_failure_reasons\030\020 \003(\0162\204\001.goog" +
      "le.ads.googleads.v3.enums.CustomerPayPer" +
      "ConversionEligibilityFailureReasonEnum.C" +
      "ustomerPayPerConversionEligibilityFailur" +
      "eReasonB\003\340A\003:<\352A9\n!googleads.googleapis." +
      "com/Customer\022\024customers/{customer}\"\207\002\n\024C" +
      "allReportingSetting\022:\n\026call_reporting_en" +
      "abled\030\001 \001(\0132\032.google.protobuf.BoolValue\022" +
      "E\n!call_conversion_reporting_enabled\030\002 \001" +
      "(\0132\032.google.protobuf.BoolValue\022l\n\026call_c" +
      "onversion_action\030\t \001(\0132\034.google.protobuf" +
      ".StringValueB.\372A+\n)googleads.googleapis." +
      "com/ConversionAction\"\255\001\n\031ConversionTrack" +
      "ingSetting\022@\n\026conversion_tracking_id\030\001 \001" +
      "(\0132\033.google.protobuf.Int64ValueB\003\340A\003\022N\n$" +
      "cross_account_conversion_tracking_id\030\002 \001" +
      "(\0132\033.google.protobuf.Int64ValueB\003\340A\003\"W\n\022" +
      "RemarketingSetting\022A\n\026google_global_site" +
      "_tag\030\001 \001(\0132\034.google.protobuf.StringValue" +
      "B\003\340A\003B\372\001\n%com.google.ads.googleads.v3.re" +
      "sourcesB\rCustomerProtoP\001ZJgoogle.golang." +
      "org/genproto/googleapis/ads/googleads/v3" +
      "/resources;resources\242\002\003GAA\252\002!Google.Ads." +
      "GoogleAds.V3.Resources\312\002!Google\\Ads\\Goog" +
      "leAds\\V3\\Resources\352\002%Google::Ads::Google" +
      "Ads::V3::Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v3.enums.CustomerPayPerConversionEligibilityFailureReasonProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v3_resources_Customer_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v3_resources_Customer_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v3_resources_Customer_descriptor,
        new java.lang.String[] { "ResourceName", "Id", "DescriptiveName", "CurrencyCode", "TimeZone", "TrackingUrlTemplate", "FinalUrlSuffix", "AutoTaggingEnabled", "HasPartnersBadge", "Manager", "TestAccount", "CallReportingSetting", "ConversionTrackingSetting", "RemarketingSetting", "PayPerConversionEligibilityFailureReasons", });
    internal_static_google_ads_googleads_v3_resources_CallReportingSetting_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v3_resources_CallReportingSetting_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v3_resources_CallReportingSetting_descriptor,
        new java.lang.String[] { "CallReportingEnabled", "CallConversionReportingEnabled", "CallConversionAction", });
    internal_static_google_ads_googleads_v3_resources_ConversionTrackingSetting_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v3_resources_ConversionTrackingSetting_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v3_resources_ConversionTrackingSetting_descriptor,
        new java.lang.String[] { "ConversionTrackingId", "CrossAccountConversionTrackingId", });
    internal_static_google_ads_googleads_v3_resources_RemarketingSetting_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v3_resources_RemarketingSetting_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v3_resources_RemarketingSetting_descriptor,
        new java.lang.String[] { "GoogleGlobalSiteTag", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v3.enums.CustomerPayPerConversionEligibilityFailureReasonProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
