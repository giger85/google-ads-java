/*
 * Copyright 2021 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.ads.googleads.v7.services;

import com.google.ads.googleads.v7.resources.CustomAudience;
import com.google.ads.googleads.v7.resources.CustomAudienceName;
import com.google.ads.googleads.v7.services.stub.CustomAudienceServiceStub;
import com.google.ads.googleads.v7.services.stub.CustomAudienceServiceStubSettings;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Service Description: Service to manage custom audiences.
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <pre>{@code
 * try (CustomAudienceServiceClient customAudienceServiceClient =
 *     CustomAudienceServiceClient.create()) {
 *   CustomAudienceName resourceName =
 *       CustomAudienceName.of("[CUSTOMER_ID]", "[CUSTOM_AUDIENCE_ID]");
 *   CustomAudience response = customAudienceServiceClient.getCustomAudience(resourceName);
 * }
 * }</pre>
 *
 * <p>Note: close() needs to be called on the CustomAudienceServiceClient object to clean up
 * resources such as threads. In the example above, try-with-resources is used, which automatically
 * calls close().
 *
 * <p>The surface of this class includes several types of Java methods for each of the API's
 * methods:
 *
 * <ol>
 *   <li> A "flattened" method. With this type of method, the fields of the request type have been
 *       converted into function parameters. It may be the case that not all fields are available as
 *       parameters, and not every API method will have a flattened method entry point.
 *   <li> A "request object" method. This type of method only takes one parameter, a request object,
 *       which must be constructed before the call. Not every API method will have a request object
 *       method.
 *   <li> A "callable" method. This type of method takes no parameters and returns an immutable API
 *       callable object, which can be used to initiate calls to the service.
 * </ol>
 *
 * <p>See the individual methods for example code.
 *
 * <p>Many parameters require resource names to be formatted in a particular way. To assist with
 * these names, this class includes a format method for each type of name, and additionally a parse
 * method to extract the individual identifiers contained within names that are returned.
 *
 * <p>This class can be customized by passing in a custom instance of CustomAudienceServiceSettings
 * to create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>{@code
 * CustomAudienceServiceSettings customAudienceServiceSettings =
 *     CustomAudienceServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * CustomAudienceServiceClient customAudienceServiceClient =
 *     CustomAudienceServiceClient.create(customAudienceServiceSettings);
 * }</pre>
 *
 * <p>To customize the endpoint:
 *
 * <pre>{@code
 * CustomAudienceServiceSettings customAudienceServiceSettings =
 *     CustomAudienceServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * CustomAudienceServiceClient customAudienceServiceClient =
 *     CustomAudienceServiceClient.create(customAudienceServiceSettings);
 * }</pre>
 *
 * <p>Please refer to the GitHub repository's samples for more quickstart code snippets.
 */
@Generated("by gapic-generator-java")
public class CustomAudienceServiceClient implements BackgroundResource {
  private final CustomAudienceServiceSettings settings;
  private final CustomAudienceServiceStub stub;

  /** Constructs an instance of CustomAudienceServiceClient with default settings. */
  public static final CustomAudienceServiceClient create() throws IOException {
    return create(CustomAudienceServiceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of CustomAudienceServiceClient, using the given settings. The channels
   * are created based on the settings passed in, or defaults for any settings that are not set.
   */
  public static final CustomAudienceServiceClient create(CustomAudienceServiceSettings settings)
      throws IOException {
    return new CustomAudienceServiceClient(settings);
  }

  /**
   * Constructs an instance of CustomAudienceServiceClient, using the given stub for making calls.
   * This is for advanced usage - prefer using create(CustomAudienceServiceSettings).
   */
  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public static final CustomAudienceServiceClient create(CustomAudienceServiceStub stub) {
    return new CustomAudienceServiceClient(stub);
  }

  /**
   * Constructs an instance of CustomAudienceServiceClient, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected CustomAudienceServiceClient(CustomAudienceServiceSettings settings) throws IOException {
    this.settings = settings;
    this.stub = ((CustomAudienceServiceStubSettings) settings.getStubSettings()).createStub();
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  protected CustomAudienceServiceClient(CustomAudienceServiceStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final CustomAudienceServiceSettings getSettings() {
    return settings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public CustomAudienceServiceStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the requested custom audience in full detail.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [HeaderError]()
   * [InternalError]() [QuotaError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (CustomAudienceServiceClient customAudienceServiceClient =
   *     CustomAudienceServiceClient.create()) {
   *   CustomAudienceName resourceName =
   *       CustomAudienceName.of("[CUSTOMER_ID]", "[CUSTOM_AUDIENCE_ID]");
   *   CustomAudience response = customAudienceServiceClient.getCustomAudience(resourceName);
   * }
   * }</pre>
   *
   * @param resourceName Required. The resource name of the custom audience to fetch.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final CustomAudience getCustomAudience(CustomAudienceName resourceName) {
    GetCustomAudienceRequest request =
        GetCustomAudienceRequest.newBuilder()
            .setResourceName(resourceName == null ? null : resourceName.toString())
            .build();
    return getCustomAudience(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the requested custom audience in full detail.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [HeaderError]()
   * [InternalError]() [QuotaError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (CustomAudienceServiceClient customAudienceServiceClient =
   *     CustomAudienceServiceClient.create()) {
   *   String resourceName =
   *       CustomAudienceName.of("[CUSTOMER_ID]", "[CUSTOM_AUDIENCE_ID]").toString();
   *   CustomAudience response = customAudienceServiceClient.getCustomAudience(resourceName);
   * }
   * }</pre>
   *
   * @param resourceName Required. The resource name of the custom audience to fetch.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final CustomAudience getCustomAudience(String resourceName) {
    GetCustomAudienceRequest request =
        GetCustomAudienceRequest.newBuilder().setResourceName(resourceName).build();
    return getCustomAudience(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the requested custom audience in full detail.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [HeaderError]()
   * [InternalError]() [QuotaError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (CustomAudienceServiceClient customAudienceServiceClient =
   *     CustomAudienceServiceClient.create()) {
   *   GetCustomAudienceRequest request =
   *       GetCustomAudienceRequest.newBuilder()
   *           .setResourceName(
   *               CustomAudienceName.of("[CUSTOMER_ID]", "[CUSTOM_AUDIENCE_ID]").toString())
   *           .build();
   *   CustomAudience response = customAudienceServiceClient.getCustomAudience(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final CustomAudience getCustomAudience(GetCustomAudienceRequest request) {
    return getCustomAudienceCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the requested custom audience in full detail.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [HeaderError]()
   * [InternalError]() [QuotaError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (CustomAudienceServiceClient customAudienceServiceClient =
   *     CustomAudienceServiceClient.create()) {
   *   GetCustomAudienceRequest request =
   *       GetCustomAudienceRequest.newBuilder()
   *           .setResourceName(
   *               CustomAudienceName.of("[CUSTOMER_ID]", "[CUSTOM_AUDIENCE_ID]").toString())
   *           .build();
   *   ApiFuture<CustomAudience> future =
   *       customAudienceServiceClient.getCustomAudienceCallable().futureCall(request);
   *   // Do something.
   *   CustomAudience response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<GetCustomAudienceRequest, CustomAudience> getCustomAudienceCallable() {
    return stub.getCustomAudienceCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates or updates custom audiences. Operation statuses are returned.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]()
   * [CustomAudienceError]() [CustomInterestError]() [FieldError]() [FieldMaskError]()
   * [HeaderError]() [InternalError]() [MutateError]() [OperationAccessDeniedError]()
   * [PolicyViolationError]() [QuotaError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (CustomAudienceServiceClient customAudienceServiceClient =
   *     CustomAudienceServiceClient.create()) {
   *   String customerId = "customerId-1581184615";
   *   List<CustomAudienceOperation> operations = new ArrayList<>();
   *   MutateCustomAudiencesResponse response =
   *       customAudienceServiceClient.mutateCustomAudiences(customerId, operations);
   * }
   * }</pre>
   *
   * @param customerId Required. The ID of the customer whose custom audiences are being modified.
   * @param operations Required. The list of operations to perform on individual custom audiences.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateCustomAudiencesResponse mutateCustomAudiences(
      String customerId, List<CustomAudienceOperation> operations) {
    MutateCustomAudiencesRequest request =
        MutateCustomAudiencesRequest.newBuilder()
            .setCustomerId(customerId)
            .addAllOperations(operations)
            .build();
    return mutateCustomAudiences(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates or updates custom audiences. Operation statuses are returned.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]()
   * [CustomAudienceError]() [CustomInterestError]() [FieldError]() [FieldMaskError]()
   * [HeaderError]() [InternalError]() [MutateError]() [OperationAccessDeniedError]()
   * [PolicyViolationError]() [QuotaError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (CustomAudienceServiceClient customAudienceServiceClient =
   *     CustomAudienceServiceClient.create()) {
   *   MutateCustomAudiencesRequest request =
   *       MutateCustomAudiencesRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .addAllOperations(new ArrayList<CustomAudienceOperation>())
   *           .setValidateOnly(true)
   *           .build();
   *   MutateCustomAudiencesResponse response =
   *       customAudienceServiceClient.mutateCustomAudiences(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateCustomAudiencesResponse mutateCustomAudiences(
      MutateCustomAudiencesRequest request) {
    return mutateCustomAudiencesCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates or updates custom audiences. Operation statuses are returned.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]()
   * [CustomAudienceError]() [CustomInterestError]() [FieldError]() [FieldMaskError]()
   * [HeaderError]() [InternalError]() [MutateError]() [OperationAccessDeniedError]()
   * [PolicyViolationError]() [QuotaError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (CustomAudienceServiceClient customAudienceServiceClient =
   *     CustomAudienceServiceClient.create()) {
   *   MutateCustomAudiencesRequest request =
   *       MutateCustomAudiencesRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .addAllOperations(new ArrayList<CustomAudienceOperation>())
   *           .setValidateOnly(true)
   *           .build();
   *   ApiFuture<MutateCustomAudiencesResponse> future =
   *       customAudienceServiceClient.mutateCustomAudiencesCallable().futureCall(request);
   *   // Do something.
   *   MutateCustomAudiencesResponse response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<MutateCustomAudiencesRequest, MutateCustomAudiencesResponse>
      mutateCustomAudiencesCallable() {
    return stub.mutateCustomAudiencesCallable();
  }

  @Override
  public final void close() {
    stub.close();
  }

  @Override
  public void shutdown() {
    stub.shutdown();
  }

  @Override
  public boolean isShutdown() {
    return stub.isShutdown();
  }

  @Override
  public boolean isTerminated() {
    return stub.isTerminated();
  }

  @Override
  public void shutdownNow() {
    stub.shutdownNow();
  }

  @Override
  public boolean awaitTermination(long duration, TimeUnit unit) throws InterruptedException {
    return stub.awaitTermination(duration, unit);
  }
}
