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
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /project/{project}/service/{service_name}/privatelink/azure/connections/{privatelink_connection_id}/approve
 */
public class ApproveRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new ApproveRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public ApproveRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/service/{service_name}/privatelink/azure/connections/{privatelink_connection_id}/approve", pathParameters);
    }
    /**
     * Instantiates a new ApproveRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public ApproveRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/service/{service_name}/privatelink/azure/connections/{privatelink_connection_id}/approve", rawUrl);
    }
    /**
     * Approve an Azure private endpoint connection pending user approval
     * @return a CompletableFuture of ServicePrivatelinkAzureConnectionApprovalResponse
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ServicePrivatelinkAzureConnectionApprovalResponse> post() {
        try {
            final RequestInformation requestInfo = toPostRequestInformation(null);
            return this.requestAdapter.sendAsync(requestInfo, ServicePrivatelinkAzureConnectionApprovalResponse::createFromDiscriminatorValue, null);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<ServicePrivatelinkAzureConnectionApprovalResponse> executionException = new java.util.concurrent.CompletableFuture<ServicePrivatelinkAzureConnectionApprovalResponse>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Approve an Azure private endpoint connection pending user approval
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of ServicePrivatelinkAzureConnectionApprovalResponse
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ServicePrivatelinkAzureConnectionApprovalResponse> post(@javax.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = toPostRequestInformation(requestConfiguration);
            return this.requestAdapter.sendAsync(requestInfo, ServicePrivatelinkAzureConnectionApprovalResponse::createFromDiscriminatorValue, null);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<ServicePrivatelinkAzureConnectionApprovalResponse> executionException = new java.util.concurrent.CompletableFuture<ServicePrivatelinkAzureConnectionApprovalResponse>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Approve an Azure private endpoint connection pending user approval
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPostRequestInformation() throws URISyntaxException {
        return toPostRequestInformation(null);
    }
    /**
     * Approve an Azure private endpoint connection pending user approval
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation();
        requestInfo.httpMethod = HttpMethod.POST;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.headers.add("Accept", "application/json");
        if (requestConfiguration != null) {
            final PostRequestConfiguration requestConfig = new PostRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
