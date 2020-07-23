// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v1/services/remarketing_action_service.proto

package com.google.ads.googleads.v1.services;

public interface RemarketingActionOperationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v1.services.RemarketingActionOperation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * FieldMask that determines which resource fields are modified in an update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 4;</code>
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   * <pre>
   * FieldMask that determines which resource fields are modified in an update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 4;</code>
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   * <pre>
   * FieldMask that determines which resource fields are modified in an update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 4;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();

  /**
   * <pre>
   * Create operation: No resource name is expected for the new remarketing
   * action.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.resources.RemarketingAction create = 1;</code>
   * @return Whether the create field is set.
   */
  boolean hasCreate();
  /**
   * <pre>
   * Create operation: No resource name is expected for the new remarketing
   * action.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.resources.RemarketingAction create = 1;</code>
   * @return The create.
   */
  com.google.ads.googleads.v1.resources.RemarketingAction getCreate();
  /**
   * <pre>
   * Create operation: No resource name is expected for the new remarketing
   * action.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.resources.RemarketingAction create = 1;</code>
   */
  com.google.ads.googleads.v1.resources.RemarketingActionOrBuilder getCreateOrBuilder();

  /**
   * <pre>
   * Update operation: The remarketing action is expected to have a valid
   * resource name.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.resources.RemarketingAction update = 2;</code>
   * @return Whether the update field is set.
   */
  boolean hasUpdate();
  /**
   * <pre>
   * Update operation: The remarketing action is expected to have a valid
   * resource name.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.resources.RemarketingAction update = 2;</code>
   * @return The update.
   */
  com.google.ads.googleads.v1.resources.RemarketingAction getUpdate();
  /**
   * <pre>
   * Update operation: The remarketing action is expected to have a valid
   * resource name.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.resources.RemarketingAction update = 2;</code>
   */
  com.google.ads.googleads.v1.resources.RemarketingActionOrBuilder getUpdateOrBuilder();

  public com.google.ads.googleads.v1.services.RemarketingActionOperation.OperationCase getOperationCase();
}
