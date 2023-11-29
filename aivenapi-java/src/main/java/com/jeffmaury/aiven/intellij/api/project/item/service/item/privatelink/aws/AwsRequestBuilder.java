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
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /project/{project}/service/{service_name}/privatelink/aws
 */
public class AwsRequestBuilder extends BaseRequestBuilder {
    /** The connections property */
    @javax.annotation.Nonnull
    public ConnectionsRequestBuilder connections() {
        return new ConnectionsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new AwsRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public AwsRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/service/{service_name}/privatelink/aws", pathParameters);
    }
    /**
     * Instantiates a new AwsRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public AwsRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/service/{service_name}/privatelink/aws", rawUrl);
    }
    /**
     * Delete an AWS Privatelink Endpoint Service
     * @return a CompletableFuture of ServicePrivatelinkAWSDeleteResponse
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ServicePrivatelinkAWSDeleteResponse> delete() {
        try {
            final RequestInformation requestInfo = toDeleteRequestInformation(null);
            return this.requestAdapter.sendAsync(requestInfo, ServicePrivatelinkAWSDeleteResponse::createFromDiscriminatorValue, null);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<ServicePrivatelinkAWSDeleteResponse> executionException = new java.util.concurrent.CompletableFuture<ServicePrivatelinkAWSDeleteResponse>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Delete an AWS Privatelink Endpoint Service
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of ServicePrivatelinkAWSDeleteResponse
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ServicePrivatelinkAWSDeleteResponse> delete(@javax.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
            return this.requestAdapter.sendAsync(requestInfo, ServicePrivatelinkAWSDeleteResponse::createFromDiscriminatorValue, null);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<ServicePrivatelinkAWSDeleteResponse> executionException = new java.util.concurrent.CompletableFuture<ServicePrivatelinkAWSDeleteResponse>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Get AWS Privatelink Endpoint Service information
     * @return a CompletableFuture of ServicePrivatelinkAWSGetResponse
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ServicePrivatelinkAWSGetResponse> get() {
        try {
            final RequestInformation requestInfo = toGetRequestInformation(null);
            return this.requestAdapter.sendAsync(requestInfo, ServicePrivatelinkAWSGetResponse::createFromDiscriminatorValue, null);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<ServicePrivatelinkAWSGetResponse> executionException = new java.util.concurrent.CompletableFuture<ServicePrivatelinkAWSGetResponse>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Get AWS Privatelink Endpoint Service information
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of ServicePrivatelinkAWSGetResponse
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ServicePrivatelinkAWSGetResponse> get(@javax.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
            return this.requestAdapter.sendAsync(requestInfo, ServicePrivatelinkAWSGetResponse::createFromDiscriminatorValue, null);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<ServicePrivatelinkAWSGetResponse> executionException = new java.util.concurrent.CompletableFuture<ServicePrivatelinkAWSGetResponse>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Create an AWS Privatelink Endpoint Service
     * @param body ServicePrivatelinkAWSCreateRequestBody
     * @return a CompletableFuture of ServicePrivatelinkAWSCreateResponse
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ServicePrivatelinkAWSCreateResponse> post(@javax.annotation.Nonnull final ServicePrivatelinkAWSCreateRequestBody body) {
        try {
            final RequestInformation requestInfo = toPostRequestInformation(body, null);
            return this.requestAdapter.sendAsync(requestInfo, ServicePrivatelinkAWSCreateResponse::createFromDiscriminatorValue, null);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<ServicePrivatelinkAWSCreateResponse> executionException = new java.util.concurrent.CompletableFuture<ServicePrivatelinkAWSCreateResponse>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Create an AWS Privatelink Endpoint Service
     * @param body ServicePrivatelinkAWSCreateRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of ServicePrivatelinkAWSCreateResponse
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ServicePrivatelinkAWSCreateResponse> post(@javax.annotation.Nonnull final ServicePrivatelinkAWSCreateRequestBody body, @javax.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        try {
            final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
            return this.requestAdapter.sendAsync(requestInfo, ServicePrivatelinkAWSCreateResponse::createFromDiscriminatorValue, null);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<ServicePrivatelinkAWSCreateResponse> executionException = new java.util.concurrent.CompletableFuture<ServicePrivatelinkAWSCreateResponse>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Update an AWS Privatelink Endpoint Service
     * @param body ServicePrivatelinkAWSUpdateRequestBody
     * @return a CompletableFuture of ServicePrivatelinkAWSUpdateResponse
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ServicePrivatelinkAWSUpdateResponse> put(@javax.annotation.Nonnull final ServicePrivatelinkAWSUpdateRequestBody body) {
        try {
            final RequestInformation requestInfo = toPutRequestInformation(body, null);
            return this.requestAdapter.sendAsync(requestInfo, ServicePrivatelinkAWSUpdateResponse::createFromDiscriminatorValue, null);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<ServicePrivatelinkAWSUpdateResponse> executionException = new java.util.concurrent.CompletableFuture<ServicePrivatelinkAWSUpdateResponse>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Update an AWS Privatelink Endpoint Service
     * @param body ServicePrivatelinkAWSUpdateRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of ServicePrivatelinkAWSUpdateResponse
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ServicePrivatelinkAWSUpdateResponse> put(@javax.annotation.Nonnull final ServicePrivatelinkAWSUpdateRequestBody body, @javax.annotation.Nullable final java.util.function.Consumer<PutRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        try {
            final RequestInformation requestInfo = toPutRequestInformation(body, requestConfiguration);
            return this.requestAdapter.sendAsync(requestInfo, ServicePrivatelinkAWSUpdateResponse::createFromDiscriminatorValue, null);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<ServicePrivatelinkAWSUpdateResponse> executionException = new java.util.concurrent.CompletableFuture<ServicePrivatelinkAWSUpdateResponse>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Delete an AWS Privatelink Endpoint Service
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() throws URISyntaxException {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete an AWS Privatelink Endpoint Service
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation();
        requestInfo.httpMethod = HttpMethod.DELETE;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.headers.add("Accept", "application/json");
        if (requestConfiguration != null) {
            final DeleteRequestConfiguration requestConfig = new DeleteRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Get AWS Privatelink Endpoint Service information
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toGetRequestInformation() throws URISyntaxException {
        return toGetRequestInformation(null);
    }
    /**
     * Get AWS Privatelink Endpoint Service information
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation();
        requestInfo.httpMethod = HttpMethod.GET;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.headers.add("Accept", "application/json");
        if (requestConfiguration != null) {
            final GetRequestConfiguration requestConfig = new GetRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Create an AWS Privatelink Endpoint Service
     * @param body ServicePrivatelinkAWSCreateRequestBody
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@javax.annotation.Nonnull final ServicePrivatelinkAWSCreateRequestBody body) throws URISyntaxException {
        return toPostRequestInformation(body, null);
    }
    /**
     * Create an AWS Privatelink Endpoint Service
     * @param body ServicePrivatelinkAWSCreateRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@javax.annotation.Nonnull final ServicePrivatelinkAWSCreateRequestBody body, @javax.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) throws URISyntaxException {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation();
        requestInfo.httpMethod = HttpMethod.POST;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.headers.add("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        if (requestConfiguration != null) {
            final PostRequestConfiguration requestConfig = new PostRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Update an AWS Privatelink Endpoint Service
     * @param body ServicePrivatelinkAWSUpdateRequestBody
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPutRequestInformation(@javax.annotation.Nonnull final ServicePrivatelinkAWSUpdateRequestBody body) throws URISyntaxException {
        return toPutRequestInformation(body, null);
    }
    /**
     * Update an AWS Privatelink Endpoint Service
     * @param body ServicePrivatelinkAWSUpdateRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPutRequestInformation(@javax.annotation.Nonnull final ServicePrivatelinkAWSUpdateRequestBody body, @javax.annotation.Nullable final java.util.function.Consumer<PutRequestConfiguration> requestConfiguration) throws URISyntaxException {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation();
        requestInfo.httpMethod = HttpMethod.PUT;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.headers.add("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        if (requestConfiguration != null) {
            final PutRequestConfiguration requestConfig = new PutRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    public class GetRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    public class PutRequestConfiguration extends BaseRequestConfiguration {
    }
}
