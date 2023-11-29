package com.jeffmaury.aiven.intellij.api.project.item.service.item.privatelink.azure.connections.item;

import com.jeffmaury.aiven.intellij.api.models.ServicePrivatelinkAzureConnectionUpdateRequestBody;
import com.jeffmaury.aiven.intellij.api.models.ServicePrivatelinkAzureConnectionUpdateResponse;
import com.jeffmaury.aiven.intellij.api.project.item.service.item.privatelink.azure.connections.item.approve.ApproveRequestBuilder;
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
 * Builds and executes requests for operations under /project/{project}/service/{service_name}/privatelink/azure/connections/{privatelink_connection_id}
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WithPrivatelinkConnectionItemRequestBuilder extends BaseRequestBuilder {
    /**
     * The approve property
     */
    @jakarta.annotation.Nonnull
    public ApproveRequestBuilder approve() {
        return new ApproveRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new WithPrivatelink_connection_ItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithPrivatelinkConnectionItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/service/{service_name}/privatelink/azure/connections/{privatelink_connection_id}", pathParameters);
    }
    /**
     * Instantiates a new WithPrivatelink_connection_ItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithPrivatelinkConnectionItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/service/{service_name}/privatelink/azure/connections/{privatelink_connection_id}", rawUrl);
    }
    /**
     * Update a private endpoint connection for an Azure Privatelink Service
     * @param body ServicePrivatelinkAzureConnectionUpdateRequestBody
     * @return a CompletableFuture of ServicePrivatelinkAzureConnectionUpdateResponse
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ServicePrivatelinkAzureConnectionUpdateResponse> put(@jakarta.annotation.Nonnull final ServicePrivatelinkAzureConnectionUpdateRequestBody body) {
        return put(body, null);
    }
    /**
     * Update a private endpoint connection for an Azure Privatelink Service
     * @param body ServicePrivatelinkAzureConnectionUpdateRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of ServicePrivatelinkAzureConnectionUpdateResponse
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ServicePrivatelinkAzureConnectionUpdateResponse> put(@jakarta.annotation.Nonnull final ServicePrivatelinkAzureConnectionUpdateRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PutRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPutRequestInformation(body, requestConfiguration);
        return this.requestAdapter.sendAsync(requestInfo, ServicePrivatelinkAzureConnectionUpdateResponse::createFromDiscriminatorValue, null);
    }
    /**
     * Update a private endpoint connection for an Azure Privatelink Service
     * @param body ServicePrivatelinkAzureConnectionUpdateRequestBody
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPutRequestInformation(@jakarta.annotation.Nonnull final ServicePrivatelinkAzureConnectionUpdateRequestBody body) {
        return toPutRequestInformation(body, null);
    }
    /**
     * Update a private endpoint connection for an Azure Privatelink Service
     * @param body ServicePrivatelinkAzureConnectionUpdateRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPutRequestInformation(@jakarta.annotation.Nonnull final ServicePrivatelinkAzureConnectionUpdateRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PutRequestConfiguration> requestConfiguration) {
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
     * @return a WithPrivatelinkConnectionItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public WithPrivatelinkConnectionItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new WithPrivatelinkConnectionItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PutRequestConfiguration extends BaseRequestConfiguration {
    }
}
