package com.jeffmaury.aiven.intellij.api.project.item.service.item.privatelink.azure.connections;

import com.jeffmaury.aiven.intellij.api.models.ServicePrivatelinkAzureConnectionListResponse;
import com.jeffmaury.aiven.intellij.api.project.item.service.item.privatelink.azure.connections.item.WithPrivatelinkConnectionItemRequestBuilder;
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
 * Builds and executes requests for operations under /project/{project}/service/{service_name}/privatelink/azure/connections
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ConnectionsRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the com.jeffmaury.aiven.intellij.api.project.item.service.item.privatelink.azure.connections.item collection
     * @param privatelink_connection_id Privatelink connection ID
     * @return a WithPrivatelinkConnectionItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public WithPrivatelinkConnectionItemRequestBuilder byPrivatelink_connection_id(@jakarta.annotation.Nonnull final String privatelink_connection_id) {
        Objects.requireNonNull(privatelink_connection_id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("privatelink_connection_id", privatelink_connection_id);
        return new WithPrivatelinkConnectionItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new ConnectionsRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ConnectionsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/service/{service_name}/privatelink/azure/connections", pathParameters);
    }
    /**
     * Instantiates a new ConnectionsRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ConnectionsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/service/{service_name}/privatelink/azure/connections", rawUrl);
    }
    /**
     * List private endpoint connections for an Azure Privatelink Service
     * @return a ServicePrivatelinkAzureConnectionListResponse
     */
    @jakarta.annotation.Nullable
    public ServicePrivatelinkAzureConnectionListResponse get() {
        return get(null);
    }
    /**
     * List private endpoint connections for an Azure Privatelink Service
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a ServicePrivatelinkAzureConnectionListResponse
     */
    @jakarta.annotation.Nullable
    public ServicePrivatelinkAzureConnectionListResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, ServicePrivatelinkAzureConnectionListResponse::createFromDiscriminatorValue);
    }
    /**
     * List private endpoint connections for an Azure Privatelink Service
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * List private endpoint connections for an Azure Privatelink Service
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
     * @return a ConnectionsRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public ConnectionsRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new ConnectionsRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
    }
}
