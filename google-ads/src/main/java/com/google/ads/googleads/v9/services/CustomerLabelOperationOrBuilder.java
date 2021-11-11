// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v9/services/customer_label_service.proto

package com.google.ads.googleads.v9.services;

public interface CustomerLabelOperationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v9.services.CustomerLabelOperation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Create operation: No resource name is expected for the new customer-label
   * relationship.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.resources.CustomerLabel create = 1;</code>
   * @return Whether the create field is set.
   */
  boolean hasCreate();
  /**
   * <pre>
   * Create operation: No resource name is expected for the new customer-label
   * relationship.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.resources.CustomerLabel create = 1;</code>
   * @return The create.
   */
  com.google.ads.googleads.v9.resources.CustomerLabel getCreate();
  /**
   * <pre>
   * Create operation: No resource name is expected for the new customer-label
   * relationship.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.resources.CustomerLabel create = 1;</code>
   */
  com.google.ads.googleads.v9.resources.CustomerLabelOrBuilder getCreateOrBuilder();

  /**
   * <pre>
   * Remove operation: A resource name for the customer-label relationship
   * being removed, in this format:
   * `customers/{customer_id}/customerLabels/{label_id}`
   * </pre>
   *
   * <code>string remove = 2;</code>
   * @return Whether the remove field is set.
   */
  boolean hasRemove();
  /**
   * <pre>
   * Remove operation: A resource name for the customer-label relationship
   * being removed, in this format:
   * `customers/{customer_id}/customerLabels/{label_id}`
   * </pre>
   *
   * <code>string remove = 2;</code>
   * @return The remove.
   */
  java.lang.String getRemove();
  /**
   * <pre>
   * Remove operation: A resource name for the customer-label relationship
   * being removed, in this format:
   * `customers/{customer_id}/customerLabels/{label_id}`
   * </pre>
   *
   * <code>string remove = 2;</code>
   * @return The bytes for remove.
   */
  com.google.protobuf.ByteString
      getRemoveBytes();

  public com.google.ads.googleads.v9.services.CustomerLabelOperation.OperationCase getOperationCase();
}
