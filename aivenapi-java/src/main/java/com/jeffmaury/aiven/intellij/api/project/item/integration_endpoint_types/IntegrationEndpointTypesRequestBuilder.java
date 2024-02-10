package com.jeffmaury.aiven.intellij.api.project.item.integration_endpoint_types;

import com.jeffmaury.aiven.intellij.api.models.ServiceIntegrationEndpointTypesResponse;
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
 * Builds and executes requests for operations under /project/{project}/integration_endpoint_types
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class IntegrationEndpointTypesRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new Integration_endpoint_typesRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public IntegrationEndpointTypesRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/integration_endpoint_types", pathParameters);
    }
    /**
     * Instantiates a new Integration_endpoint_typesRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public IntegrationEndpointTypesRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/integration_endpoint_types", rawUrl);
    }
    /**
     * List available service integration endpoint types
     * @return a ServiceIntegrationEndpointTypesResponse
     */
    @jakarta.annotation.Nullable
    public ServiceIntegrationEndpointTypesResponse get() {
        return get(null);
    }
    /**
     * List available service integration endpoint types
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a ServiceIntegrationEndpointTypesResponse
     */
    @jakarta.annotation.Nullable
    public ServiceIntegrationEndpointTypesResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, ServiceIntegrationEndpointTypesResponse::createFromDiscriminatorValue);
    }
    /**
     * List available service integration endpoint types
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * List available service integration endpoint types
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
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a IntegrationEndpointTypesRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public IntegrationEndpointTypesRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new IntegrationEndpointTypesRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
    }
}
