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
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /project/{project}/integration_endpoint/{integration_endpoint_id}
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WithIntegrationEndpointItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new WithIntegration_endpoint_ItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithIntegrationEndpointItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/integration_endpoint/{integration_endpoint_id}", pathParameters);
    }
    /**
     * Instantiates a new WithIntegration_endpoint_ItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithIntegrationEndpointItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/integration_endpoint/{integration_endpoint_id}", rawUrl);
    }
    /**
     * Delete a service integration endpoint
     * @return a ServiceIntegrationEndpointDeleteResponse
     */
    @jakarta.annotation.Nullable
    public ServiceIntegrationEndpointDeleteResponse delete() {
        return delete(null);
    }
    /**
     * Delete a service integration endpoint
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a ServiceIntegrationEndpointDeleteResponse
     */
    @jakarta.annotation.Nullable
    public ServiceIntegrationEndpointDeleteResponse delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, ServiceIntegrationEndpointDeleteResponse::createFromDiscriminatorValue);
    }
    /**
     * Get service integration endpoint
     * @return a ServiceIntegrationEndpointGetResponse
     */
    @jakarta.annotation.Nullable
    public ServiceIntegrationEndpointGetResponse get() {
        return get(null);
    }
    /**
     * Get service integration endpoint
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a ServiceIntegrationEndpointGetResponse
     */
    @jakarta.annotation.Nullable
    public ServiceIntegrationEndpointGetResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, ServiceIntegrationEndpointGetResponse::createFromDiscriminatorValue);
    }
    /**
     * Update service integration endpoint
     * @param body ServiceIntegrationEndpointUpdateRequestBody
     * @return a ServiceIntegrationEndpointUpdateResponse
     */
    @jakarta.annotation.Nullable
    public ServiceIntegrationEndpointUpdateResponse put(@jakarta.annotation.Nonnull final ServiceIntegrationEndpointUpdateRequestBody body) {
        return put(body, null);
    }
    /**
     * Update service integration endpoint
     * @param body ServiceIntegrationEndpointUpdateRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a ServiceIntegrationEndpointUpdateResponse
     */
    @jakarta.annotation.Nullable
    public ServiceIntegrationEndpointUpdateResponse put(@jakarta.annotation.Nonnull final ServiceIntegrationEndpointUpdateRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PutRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPutRequestInformation(body, requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, ServiceIntegrationEndpointUpdateResponse::createFromDiscriminatorValue);
    }
    /**
     * Delete a service integration endpoint
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete a service integration endpoint
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
     * Get service integration endpoint
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Get service integration endpoint
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
     * Update service integration endpoint
     * @param body ServiceIntegrationEndpointUpdateRequestBody
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPutRequestInformation(@jakarta.annotation.Nonnull final ServiceIntegrationEndpointUpdateRequestBody body) {
        return toPutRequestInformation(body, null);
    }
    /**
     * Update service integration endpoint
     * @param body ServiceIntegrationEndpointUpdateRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPutRequestInformation(@jakarta.annotation.Nonnull final ServiceIntegrationEndpointUpdateRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PutRequestConfiguration> requestConfiguration) {
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
     * @return a WithIntegrationEndpointItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public WithIntegrationEndpointItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new WithIntegrationEndpointItemRequestBuilder(rawUrl, requestAdapter);
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
    public class PutRequestConfiguration extends BaseRequestConfiguration {
    }
}
