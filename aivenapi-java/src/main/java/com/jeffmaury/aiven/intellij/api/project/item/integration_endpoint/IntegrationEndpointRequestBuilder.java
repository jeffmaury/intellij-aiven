package com.jeffmaury.aiven.intellij.api.project.item.integration_endpoint;

import com.jeffmaury.aiven.intellij.api.models.ServiceIntegrationEndpointCreateRequestBody;
import com.jeffmaury.aiven.intellij.api.models.ServiceIntegrationEndpointCreateResponse;
import com.jeffmaury.aiven.intellij.api.models.ServiceIntegrationEndpointListResponse;
import com.jeffmaury.aiven.intellij.api.project.item.integration_endpoint.item.WithIntegrationEndpointItemRequestBuilder;
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
 * Builds and executes requests for operations under /project/{project}/integration_endpoint
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class IntegrationEndpointRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the com.jeffmaury.aiven.intellij.api.project.item.integration_endpoint.item collection
     * @param integration_endpoint_id Endpoint ID
     * @return a WithIntegrationEndpointItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public WithIntegrationEndpointItemRequestBuilder byIntegration_endpoint_id(@jakarta.annotation.Nonnull final String integration_endpoint_id) {
        Objects.requireNonNull(integration_endpoint_id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("integration_endpoint_id", integration_endpoint_id);
        return new WithIntegrationEndpointItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new Integration_endpointRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public IntegrationEndpointRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/integration_endpoint", pathParameters);
    }
    /**
     * Instantiates a new Integration_endpointRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public IntegrationEndpointRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/integration_endpoint", rawUrl);
    }
    /**
     * List available integration endpoints for project
     * @return a ServiceIntegrationEndpointListResponse
     */
    @jakarta.annotation.Nullable
    public ServiceIntegrationEndpointListResponse get() {
        return get(null);
    }
    /**
     * List available integration endpoints for project
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a ServiceIntegrationEndpointListResponse
     */
    @jakarta.annotation.Nullable
    public ServiceIntegrationEndpointListResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, ServiceIntegrationEndpointListResponse::createFromDiscriminatorValue);
    }
    /**
     * Create a new service integration endpoint
     * @param body ServiceIntegrationEndpointCreateRequestBody
     * @return a ServiceIntegrationEndpointCreateResponse
     */
    @jakarta.annotation.Nullable
    public ServiceIntegrationEndpointCreateResponse post(@jakarta.annotation.Nonnull final ServiceIntegrationEndpointCreateRequestBody body) {
        return post(body, null);
    }
    /**
     * Create a new service integration endpoint
     * @param body ServiceIntegrationEndpointCreateRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a ServiceIntegrationEndpointCreateResponse
     */
    @jakarta.annotation.Nullable
    public ServiceIntegrationEndpointCreateResponse post(@jakarta.annotation.Nonnull final ServiceIntegrationEndpointCreateRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, ServiceIntegrationEndpointCreateResponse::createFromDiscriminatorValue);
    }
    /**
     * List available integration endpoints for project
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * List available integration endpoints for project
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
     * Create a new service integration endpoint
     * @param body ServiceIntegrationEndpointCreateRequestBody
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final ServiceIntegrationEndpointCreateRequestBody body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Create a new service integration endpoint
     * @param body ServiceIntegrationEndpointCreateRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final ServiceIntegrationEndpointCreateRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.POST, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PostRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a IntegrationEndpointRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public IntegrationEndpointRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new IntegrationEndpointRequestBuilder(rawUrl, requestAdapter);
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
}
