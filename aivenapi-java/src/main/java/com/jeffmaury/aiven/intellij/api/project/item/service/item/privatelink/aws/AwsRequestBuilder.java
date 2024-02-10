package com.jeffmaury.aiven.intellij.api.project.item.service.item.privatelink.aws;

import com.jeffmaury.aiven.intellij.api.models.ServicePrivatelinkAWSCreateRequestBody;
import com.jeffmaury.aiven.intellij.api.models.ServicePrivatelinkAWSCreateResponse;
import com.jeffmaury.aiven.intellij.api.models.ServicePrivatelinkAWSDeleteResponse;
import com.jeffmaury.aiven.intellij.api.models.ServicePrivatelinkAWSGetResponse;
import com.jeffmaury.aiven.intellij.api.models.ServicePrivatelinkAWSUpdateRequestBody;
import com.jeffmaury.aiven.intellij.api.models.ServicePrivatelinkAWSUpdateResponse;
import com.jeffmaury.aiven.intellij.api.project.item.service.item.privatelink.aws.connections.ConnectionsRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /project/{project}/service/{service_name}/privatelink/aws
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AwsRequestBuilder extends BaseRequestBuilder {
    /**
     * The connections property
     */
    @jakarta.annotation.Nonnull
    public ConnectionsRequestBuilder connections() {
        return new ConnectionsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new AwsRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AwsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/service/{service_name}/privatelink/aws", pathParameters);
    }
    /**
     * Instantiates a new AwsRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AwsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/service/{service_name}/privatelink/aws", rawUrl);
    }
    /**
     * Delete an AWS Privatelink Endpoint Service
     * @return a ServicePrivatelinkAWSDeleteResponse
     */
    @jakarta.annotation.Nullable
    public ServicePrivatelinkAWSDeleteResponse delete() {
        return delete(null);
    }
    /**
     * Delete an AWS Privatelink Endpoint Service
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a ServicePrivatelinkAWSDeleteResponse
     */
    @jakarta.annotation.Nullable
    public ServicePrivatelinkAWSDeleteResponse delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, ServicePrivatelinkAWSDeleteResponse::createFromDiscriminatorValue);
    }
    /**
     * Get AWS Privatelink Endpoint Service information
     * @return a ServicePrivatelinkAWSGetResponse
     */
    @jakarta.annotation.Nullable
    public ServicePrivatelinkAWSGetResponse get() {
        return get(null);
    }
    /**
     * Get AWS Privatelink Endpoint Service information
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a ServicePrivatelinkAWSGetResponse
     */
    @jakarta.annotation.Nullable
    public ServicePrivatelinkAWSGetResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, ServicePrivatelinkAWSGetResponse::createFromDiscriminatorValue);
    }
    /**
     * Create an AWS Privatelink Endpoint Service
     * @param body ServicePrivatelinkAWSCreateRequestBody
     * @return a ServicePrivatelinkAWSCreateResponse
     */
    @jakarta.annotation.Nullable
    public ServicePrivatelinkAWSCreateResponse post(@jakarta.annotation.Nonnull final ServicePrivatelinkAWSCreateRequestBody body) {
        return post(body, null);
    }
    /**
     * Create an AWS Privatelink Endpoint Service
     * @param body ServicePrivatelinkAWSCreateRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a ServicePrivatelinkAWSCreateResponse
     */
    @jakarta.annotation.Nullable
    public ServicePrivatelinkAWSCreateResponse post(@jakarta.annotation.Nonnull final ServicePrivatelinkAWSCreateRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, ServicePrivatelinkAWSCreateResponse::createFromDiscriminatorValue);
    }
    /**
     * Update an AWS Privatelink Endpoint Service
     * @param body ServicePrivatelinkAWSUpdateRequestBody
     * @return a ServicePrivatelinkAWSUpdateResponse
     */
    @jakarta.annotation.Nullable
    public ServicePrivatelinkAWSUpdateResponse put(@jakarta.annotation.Nonnull final ServicePrivatelinkAWSUpdateRequestBody body) {
        return put(body, null);
    }
    /**
     * Update an AWS Privatelink Endpoint Service
     * @param body ServicePrivatelinkAWSUpdateRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a ServicePrivatelinkAWSUpdateResponse
     */
    @jakarta.annotation.Nullable
    public ServicePrivatelinkAWSUpdateResponse put(@jakarta.annotation.Nonnull final ServicePrivatelinkAWSUpdateRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PutRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPutRequestInformation(body, requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, ServicePrivatelinkAWSUpdateResponse::createFromDiscriminatorValue);
    }
    /**
     * Delete an AWS Privatelink Endpoint Service
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete an AWS Privatelink Endpoint Service
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.DELETE, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, DeleteRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Get AWS Privatelink Endpoint Service information
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Get AWS Privatelink Endpoint Service information
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.GET, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, GetRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Create an AWS Privatelink Endpoint Service
     * @param body ServicePrivatelinkAWSCreateRequestBody
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final ServicePrivatelinkAWSCreateRequestBody body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Create an AWS Privatelink Endpoint Service
     * @param body ServicePrivatelinkAWSCreateRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final ServicePrivatelinkAWSCreateRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.POST, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PostRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Update an AWS Privatelink Endpoint Service
     * @param body ServicePrivatelinkAWSUpdateRequestBody
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPutRequestInformation(@jakarta.annotation.Nonnull final ServicePrivatelinkAWSUpdateRequestBody body) {
        return toPutRequestInformation(body, null);
    }
    /**
     * Update an AWS Privatelink Endpoint Service
     * @param body ServicePrivatelinkAWSUpdateRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPutRequestInformation(@jakarta.annotation.Nonnull final ServicePrivatelinkAWSUpdateRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PutRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.PUT, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PutRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a AwsRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public AwsRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new AwsRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PutRequestConfiguration extends BaseRequestConfiguration {
    }
}
