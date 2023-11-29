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
     * @return a CompletableFuture of ServicePrivatelinkAWSDeleteResponse
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ServicePrivatelinkAWSDeleteResponse> delete() {
        return delete(null);
    }
    /**
     * Delete an AWS Privatelink Endpoint Service
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of ServicePrivatelinkAWSDeleteResponse
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ServicePrivatelinkAWSDeleteResponse> delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
        return this.requestAdapter.sendAsync(requestInfo, ServicePrivatelinkAWSDeleteResponse::createFromDiscriminatorValue, null);
    }
    /**
     * Get AWS Privatelink Endpoint Service information
     * @return a CompletableFuture of ServicePrivatelinkAWSGetResponse
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ServicePrivatelinkAWSGetResponse> get() {
        return get(null);
    }
    /**
     * Get AWS Privatelink Endpoint Service information
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of ServicePrivatelinkAWSGetResponse
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ServicePrivatelinkAWSGetResponse> get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.sendAsync(requestInfo, ServicePrivatelinkAWSGetResponse::createFromDiscriminatorValue, null);
    }
    /**
     * Create an AWS Privatelink Endpoint Service
     * @param body ServicePrivatelinkAWSCreateRequestBody
     * @return a CompletableFuture of ServicePrivatelinkAWSCreateResponse
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ServicePrivatelinkAWSCreateResponse> post(@jakarta.annotation.Nonnull final ServicePrivatelinkAWSCreateRequestBody body) {
        return post(body, null);
    }
    /**
     * Create an AWS Privatelink Endpoint Service
     * @param body ServicePrivatelinkAWSCreateRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of ServicePrivatelinkAWSCreateResponse
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ServicePrivatelinkAWSCreateResponse> post(@jakarta.annotation.Nonnull final ServicePrivatelinkAWSCreateRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        return this.requestAdapter.sendAsync(requestInfo, ServicePrivatelinkAWSCreateResponse::createFromDiscriminatorValue, null);
    }
    /**
     * Update an AWS Privatelink Endpoint Service
     * @param body ServicePrivatelinkAWSUpdateRequestBody
     * @return a CompletableFuture of ServicePrivatelinkAWSUpdateResponse
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ServicePrivatelinkAWSUpdateResponse> put(@jakarta.annotation.Nonnull final ServicePrivatelinkAWSUpdateRequestBody body) {
        return put(body, null);
    }
    /**
     * Update an AWS Privatelink Endpoint Service
     * @param body ServicePrivatelinkAWSUpdateRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of ServicePrivatelinkAWSUpdateResponse
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ServicePrivatelinkAWSUpdateResponse> put(@jakarta.annotation.Nonnull final ServicePrivatelinkAWSUpdateRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PutRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPutRequestInformation(body, requestConfiguration);
        return this.requestAdapter.sendAsync(requestInfo, ServicePrivatelinkAWSUpdateResponse::createFromDiscriminatorValue, null);
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
        final RequestInformation requestInfo = new RequestInformation();
        if (requestConfiguration != null) {
            final DeleteRequestConfiguration requestConfig = new DeleteRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        requestInfo.httpMethod = HttpMethod.DELETE;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
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
        final RequestInformation requestInfo = new RequestInformation();
        if (requestConfiguration != null) {
            final GetRequestConfiguration requestConfig = new GetRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        requestInfo.httpMethod = HttpMethod.GET;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
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
        final RequestInformation requestInfo = new RequestInformation();
        if (requestConfiguration != null) {
            final PostRequestConfiguration requestConfig = new PostRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        requestInfo.httpMethod = HttpMethod.POST;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
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
        final RequestInformation requestInfo = new RequestInformation();
        if (requestConfiguration != null) {
            final PutRequestConfiguration requestConfig = new PutRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        requestInfo.httpMethod = HttpMethod.PUT;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
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
