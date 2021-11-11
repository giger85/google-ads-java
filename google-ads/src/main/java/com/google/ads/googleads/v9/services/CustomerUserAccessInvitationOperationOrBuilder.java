// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v9/services/customer_user_access_invitation_service.proto

package com.google.ads.googleads.v9.services;

public interface CustomerUserAccessInvitationOperationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v9.services.CustomerUserAccessInvitationOperation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Create operation: No resource name is expected for the new access
   * invitation.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.resources.CustomerUserAccessInvitation create = 1;</code>
   * @return Whether the create field is set.
   */
  boolean hasCreate();
  /**
   * <pre>
   * Create operation: No resource name is expected for the new access
   * invitation.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.resources.CustomerUserAccessInvitation create = 1;</code>
   * @return The create.
   */
  com.google.ads.googleads.v9.resources.CustomerUserAccessInvitation getCreate();
  /**
   * <pre>
   * Create operation: No resource name is expected for the new access
   * invitation.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.resources.CustomerUserAccessInvitation create = 1;</code>
   */
  com.google.ads.googleads.v9.resources.CustomerUserAccessInvitationOrBuilder getCreateOrBuilder();

  /**
   * <pre>
   * Remove operation: A resource name for the revoke invitation is
   * expected, in this format:
   * `customers/{customer_id}/customerUserAccessInvitations/{invitation_id}`
   * </pre>
   *
   * <code>string remove = 2;</code>
   * @return Whether the remove field is set.
   */
  boolean hasRemove();
  /**
   * <pre>
   * Remove operation: A resource name for the revoke invitation is
   * expected, in this format:
   * `customers/{customer_id}/customerUserAccessInvitations/{invitation_id}`
   * </pre>
   *
   * <code>string remove = 2;</code>
   * @return The remove.
   */
  java.lang.String getRemove();
  /**
   * <pre>
   * Remove operation: A resource name for the revoke invitation is
   * expected, in this format:
   * `customers/{customer_id}/customerUserAccessInvitations/{invitation_id}`
   * </pre>
   *
   * <code>string remove = 2;</code>
   * @return The bytes for remove.
   */
  com.google.protobuf.ByteString
      getRemoveBytes();

  public com.google.ads.googleads.v9.services.CustomerUserAccessInvitationOperation.OperationCase getOperationCase();
}
