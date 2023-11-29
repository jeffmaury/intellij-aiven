package com.jeffmaury.aiven.intellij.api.project.item.vpcs.item.peeringconnections;

import com.jeffmaury.aiven.intellij.api.models.VpcPeeringConnectionCreateRequestBody;
import com.jeffmaury.aiven.intellij.api.models.VpcPeeringConnectionCreateResponse;
import com.jeffmaury.aiven.intellij.api.project.item.vpcs.item.peeringconnections.peeraccounts.PeerAccountsRequestBuilder;
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
 * Builds and executes requests for operations under /project/{project}/vpcs/{project_vpc_id}/peering-connections
 */
public class PeeringConnectionsRequestBuilder extends BaseRequestBuilder {
    /** The peerAccounts property */
    @javax.annotation.Nonnull
    public PeerAccountsRequestBuilder peerAccounts() {
        return new PeerAccountsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new PeeringConnectionsRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public PeeringConnectionsRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/vpcs/{project_vpc_id}/peering-connections", pathParameters);
    }
    /**
     * Instantiates a new PeeringConnectionsRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public PeeringConnectionsRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/vpcs/{project_vpc_id}/peering-connections", rawUrl);
    }
    /**
     * Create a peering connection for a project VPC
     * @param body VpcPeeringConnectionCreateRequestBody
     * @return a CompletableFuture of VpcPeeringConnectionCreateResponse
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<VpcPeeringConnectionCreateResponse> post(@javax.annotation.Nonnull final VpcPeeringConnectionCreateRequestBody body) {
        try {
            final RequestInformation requestInfo = toPostRequestInformation(body, null);
            return this.requestAdapter.sendAsync(requestInfo, VpcPeeringConnectionCreateResponse::createFromDiscriminatorValue, null);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<VpcPeeringConnectionCreateResponse> executionException = new java.util.concurrent.CompletableFuture<VpcPeeringConnectionCreateResponse>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Create a peering connection for a project VPC
     * @param body VpcPeeringConnectionCreateRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of VpcPeeringConnectionCreateResponse
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<VpcPeeringConnectionCreateResponse> post(@javax.annotation.Nonnull final VpcPeeringConnectionCreateRequestBody body, @javax.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        try {
            final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
            return this.requestAdapter.sendAsync(requestInfo, VpcPeeringConnectionCreateResponse::createFromDiscriminatorValue, null);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<VpcPeeringConnectionCreateResponse> executionException = new java.util.concurrent.CompletableFuture<VpcPeeringConnectionCreateResponse>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Create a peering connection for a project VPC
     * @param body VpcPeeringConnectionCreateRequestBody
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@javax.annotation.Nonnull final VpcPeeringConnectionCreateRequestBody body) throws URISyntaxException {
        return toPostRequestInformation(body, null);
    }
    /**
     * Create a peering connection for a project VPC
     * @param body VpcPeeringConnectionCreateRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@javax.annotation.Nonnull final VpcPeeringConnectionCreateRequestBody body, @javax.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) throws URISyntaxException {
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
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
