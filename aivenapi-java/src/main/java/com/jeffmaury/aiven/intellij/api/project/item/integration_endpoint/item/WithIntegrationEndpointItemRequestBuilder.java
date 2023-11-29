package com.jeffmaury.aiven.intellij.api.project.item.integration_endpoint.item;

import com.jeffmaury.aiven.intellij.api.models.ServiceIntegrationEndpointDeleteResponse;
import com.jeffmaury.aiven.intellij.api.models.ServiceIntegrationEndpointGetResponse;
import com.jeffmaury.aiven.intellij.api.models.ServiceIntegrationEndpointUpdateRequestBody;
import com.jeffmaury.aiven.intellij.api.models.ServiceIntegrationEndpointUpdateResponse;
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
 * Builds and executes requests for operations under /project/{project}/integration_endpoint/{integration_endpoint_id}
 */
public class WithIntegrationEndpointItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new WithIntegration_endpoint_ItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public WithIntegrationEndpointItemRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/integration_endpoint/{integration_endpoint_id}", pathParameters);
    }
    /**
     * Instantiates a new WithIntegration_endpoint_ItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public WithIntegrationEndpointItemRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/integration_endpoint/{integration_endpoint_id}", rawUrl);
    }
    /**
     * Delete a service integration endpoint
     * @return a CompletableFuture of ServiceIntegrationEndpointDeleteResponse
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ServiceIntegrationEndpointDeleteResponse> delete() {
        try {
            final RequestInformation requestInfo = toDeleteRequestInformation(null);
            return this.requestAdapter.sendAsync(requestInfo, ServiceIntegrationEndpointDeleteResponse::createFromDiscriminatorValue, null);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<ServiceIntegrationEndpointDeleteResponse> executionException = new java.util.concurrent.CompletableFuture<ServiceIntegrationEndpointDeleteResponse>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Delete a service integration endpoint
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of ServiceIntegrationEndpointDeleteResponse
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ServiceIntegrationEndpointDeleteResponse> delete(@javax.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
            return this.requestAdapter.sendAsync(requestInfo, ServiceIntegrationEndpointDeleteResponse::createFromDiscriminatorValue, null);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<ServiceIntegrationEndpointDeleteResponse> executionException = new java.util.concurrent.CompletableFuture<ServiceIntegrationEndpointDeleteResponse>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Get service integration endpoint
     * @return a CompletableFuture of ServiceIntegrationEndpointGetResponse
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ServiceIntegrationEndpointGetResponse> get() {
        try {
            final RequestInformation requestInfo = toGetRequestInformation(null);
            return this.requestAdapter.sendAsync(requestInfo, ServiceIntegrationEndpointGetResponse::createFromDiscriminatorValue, null);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<ServiceIntegrationEndpointGetResponse> executionException = new java.util.concurrent.CompletableFuture<ServiceIntegrationEndpointGetResponse>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Get service integration endpoint
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of ServiceIntegrationEndpointGetResponse
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ServiceIntegrationEndpointGetResponse> get(@javax.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
            return this.requestAdapter.sendAsync(requestInfo, ServiceIntegrationEndpointGetResponse::createFromDiscriminatorValue, null);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<ServiceIntegrationEndpointGetResponse> executionException = new java.util.concurrent.CompletableFuture<ServiceIntegrationEndpointGetResponse>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Update service integration endpoint
     * @param body ServiceIntegrationEndpointUpdateRequestBody
     * @return a CompletableFuture of ServiceIntegrationEndpointUpdateResponse
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ServiceIntegrationEndpointUpdateResponse> put(@javax.annotation.Nonnull final ServiceIntegrationEndpointUpdateRequestBody body) {
        try {
            final RequestInformation requestInfo = toPutRequestInformation(body, null);
            return this.requestAdapter.sendAsync(requestInfo, ServiceIntegrationEndpointUpdateResponse::createFromDiscriminatorValue, null);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<ServiceIntegrationEndpointUpdateResponse> executionException = new java.util.concurrent.CompletableFuture<ServiceIntegrationEndpointUpdateResponse>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Update service integration endpoint
     * @param body ServiceIntegrationEndpointUpdateRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of ServiceIntegrationEndpointUpdateResponse
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ServiceIntegrationEndpointUpdateResponse> put(@javax.annotation.Nonnull final ServiceIntegrationEndpointUpdateRequestBody body, @javax.annotation.Nullable final java.util.function.Consumer<PutRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        try {
            final RequestInformation requestInfo = toPutRequestInformation(body, requestConfiguration);
            return this.requestAdapter.sendAsync(requestInfo, ServiceIntegrationEndpointUpdateResponse::createFromDiscriminatorValue, null);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<ServiceIntegrationEndpointUpdateResponse> executionException = new java.util.concurrent.CompletableFuture<ServiceIntegrationEndpointUpdateResponse>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Delete a service integration endpoint
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() throws URISyntaxException {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete a service integration endpoint
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
     * Get service integration endpoint
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toGetRequestInformation() throws URISyntaxException {
        return toGetRequestInformation(null);
    }
    /**
     * Get service integration endpoint
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
     * Update service integration endpoint
     * @param body ServiceIntegrationEndpointUpdateRequestBody
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPutRequestInformation(@javax.annotation.Nonnull final ServiceIntegrationEndpointUpdateRequestBody body) throws URISyntaxException {
        return toPutRequestInformation(body, null);
    }
    /**
     * Update service integration endpoint
     * @param body ServiceIntegrationEndpointUpdateRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPutRequestInformation(@javax.annotation.Nonnull final ServiceIntegrationEndpointUpdateRequestBody body, @javax.annotation.Nullable final java.util.function.Consumer<PutRequestConfiguration> requestConfiguration) throws URISyntaxException {
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
    public class PutRequestConfiguration extends BaseRequestConfiguration {
    }
}
