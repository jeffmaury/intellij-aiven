package com.jeffmaury.aiven.intellij.api.project.item.service.item.privatelink.azure.connections.item.approve;

import com.jeffmaury.aiven.intellij.api.models.ServicePrivatelinkAzureConnectionApprovalResponse;
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
 * Builds and executes requests for operations under /project/{project}/service/{service_name}/privatelink/azure/connections/{privatelink_connection_id}/approve
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ApproveRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new ApproveRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ApproveRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/service/{service_name}/privatelink/azure/connections/{privatelink_connection_id}/approve", pathParameters);
    }
    /**
     * Instantiates a new ApproveRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ApproveRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/service/{service_name}/privatelink/azure/connections/{privatelink_connection_id}/approve", rawUrl);
    }
    /**
     * Approve an Azure private endpoint connection pending user approval
     * @return a ServicePrivatelinkAzureConnectionApprovalResponse
     */
    @jakarta.annotation.Nullable
    public ServicePrivatelinkAzureConnectionApprovalResponse post() {
        return post(null);
    }
    /**
     * Approve an Azure private endpoint connection pending user approval
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a ServicePrivatelinkAzureConnectionApprovalResponse
     */
    @jakarta.annotation.Nullable
    public ServicePrivatelinkAzureConnectionApprovalResponse post(@jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toPostRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, ServicePrivatelinkAzureConnectionApprovalResponse::createFromDiscriminatorValue);
    }
    /**
     * Approve an Azure private endpoint connection pending user approval
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation() {
        return toPostRequestInformation(null);
    }
    /**
     * Approve an Azure private endpoint connection pending user approval
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.POST, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PostRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a ApproveRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public ApproveRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new ApproveRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
