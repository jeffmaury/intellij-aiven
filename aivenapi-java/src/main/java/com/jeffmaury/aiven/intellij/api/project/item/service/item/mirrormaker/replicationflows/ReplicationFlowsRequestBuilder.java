package com.jeffmaury.aiven.intellij.api.project.item.service.item.mirrormaker.replicationflows;

import com.jeffmaury.aiven.intellij.api.models.ServiceKafkaMirrorMakerCreateReplicationFlowRequestBody;
import com.jeffmaury.aiven.intellij.api.models.ServiceKafkaMirrorMakerCreateReplicationFlowResponse;
import com.jeffmaury.aiven.intellij.api.models.ServiceKafkaMirrorMakerGetReplicationFlowsResponse;
import com.jeffmaury.aiven.intellij.api.project.item.service.item.mirrormaker.replicationflows.item.WithSourceClusterItemRequestBuilder;
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
 * Builds and executes requests for operations under /project/{project}/service/{service_name}/mirrormaker/replication-flows
 */
public class ReplicationFlowsRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the com.jeffmaury.aiven.intellij.api.project.item.service.item.mirrormaker.replicationFlows.item collection
     * @param source_cluster Unique identifier of the item
     * @return a WithSourceClusterItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public WithSourceClusterItemRequestBuilder bySource_cluster(@javax.annotation.Nonnull final String source_cluster) {
        Objects.requireNonNull(source_cluster);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("source_cluster", source_cluster);
        return new WithSourceClusterItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new ReplicationFlowsRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public ReplicationFlowsRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/service/{service_name}/mirrormaker/replication-flows", pathParameters);
    }
    /**
     * Instantiates a new ReplicationFlowsRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public ReplicationFlowsRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/service/{service_name}/mirrormaker/replication-flows", rawUrl);
    }
    /**
     * Get replication flows
     * @return a CompletableFuture of ServiceKafkaMirrorMakerGetReplicationFlowsResponse
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ServiceKafkaMirrorMakerGetReplicationFlowsResponse> get() {
        try {
            final RequestInformation requestInfo = toGetRequestInformation(null);
            return this.requestAdapter.sendAsync(requestInfo, ServiceKafkaMirrorMakerGetReplicationFlowsResponse::createFromDiscriminatorValue, null);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<ServiceKafkaMirrorMakerGetReplicationFlowsResponse> executionException = new java.util.concurrent.CompletableFuture<ServiceKafkaMirrorMakerGetReplicationFlowsResponse>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Get replication flows
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of ServiceKafkaMirrorMakerGetReplicationFlowsResponse
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ServiceKafkaMirrorMakerGetReplicationFlowsResponse> get(@javax.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
            return this.requestAdapter.sendAsync(requestInfo, ServiceKafkaMirrorMakerGetReplicationFlowsResponse::createFromDiscriminatorValue, null);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<ServiceKafkaMirrorMakerGetReplicationFlowsResponse> executionException = new java.util.concurrent.CompletableFuture<ServiceKafkaMirrorMakerGetReplicationFlowsResponse>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Create a replication flow
     * @param body ServiceKafkaMirrorMakerCreateReplicationFlowRequestBody
     * @return a CompletableFuture of ServiceKafkaMirrorMakerCreateReplicationFlowResponse
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ServiceKafkaMirrorMakerCreateReplicationFlowResponse> post(@javax.annotation.Nonnull final ServiceKafkaMirrorMakerCreateReplicationFlowRequestBody body) {
        try {
            final RequestInformation requestInfo = toPostRequestInformation(body, null);
            return this.requestAdapter.sendAsync(requestInfo, ServiceKafkaMirrorMakerCreateReplicationFlowResponse::createFromDiscriminatorValue, null);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<ServiceKafkaMirrorMakerCreateReplicationFlowResponse> executionException = new java.util.concurrent.CompletableFuture<ServiceKafkaMirrorMakerCreateReplicationFlowResponse>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Create a replication flow
     * @param body ServiceKafkaMirrorMakerCreateReplicationFlowRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of ServiceKafkaMirrorMakerCreateReplicationFlowResponse
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ServiceKafkaMirrorMakerCreateReplicationFlowResponse> post(@javax.annotation.Nonnull final ServiceKafkaMirrorMakerCreateReplicationFlowRequestBody body, @javax.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        try {
            final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
            return this.requestAdapter.sendAsync(requestInfo, ServiceKafkaMirrorMakerCreateReplicationFlowResponse::createFromDiscriminatorValue, null);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<ServiceKafkaMirrorMakerCreateReplicationFlowResponse> executionException = new java.util.concurrent.CompletableFuture<ServiceKafkaMirrorMakerCreateReplicationFlowResponse>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Get replication flows
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toGetRequestInformation() throws URISyntaxException {
        return toGetRequestInformation(null);
    }
    /**
     * Get replication flows
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
     * Create a replication flow
     * @param body ServiceKafkaMirrorMakerCreateReplicationFlowRequestBody
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@javax.annotation.Nonnull final ServiceKafkaMirrorMakerCreateReplicationFlowRequestBody body) throws URISyntaxException {
        return toPostRequestInformation(body, null);
    }
    /**
     * Create a replication flow
     * @param body ServiceKafkaMirrorMakerCreateReplicationFlowRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@javax.annotation.Nonnull final ServiceKafkaMirrorMakerCreateReplicationFlowRequestBody body, @javax.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) throws URISyntaxException {
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
    public class GetRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
