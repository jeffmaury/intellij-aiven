package com.jeffmaury.aiven.intellij.api.project.item.service.item.mirrormaker.replicationflows.item.item;

import com.jeffmaury.aiven.intellij.api.models.ServiceKafkaMirrorMakerDeleteReplicationFlowResponse;
import com.jeffmaury.aiven.intellij.api.models.ServiceKafkaMirrorMakerGetReplicationFlowResponse;
import com.jeffmaury.aiven.intellij.api.models.ServiceKafkaMirrorMakerPatchReplicationFlowRequestBody;
import com.jeffmaury.aiven.intellij.api.models.ServiceKafkaMirrorMakerPatchReplicationFlowResponse;
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
 * Builds and executes requests for operations under /project/{project}/service/{service_name}/mirrormaker/replication-flows/{source_cluster}/{target_cluster}
 */
public class WithTargetClusterItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new WithTarget_clusterItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public WithTargetClusterItemRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/service/{service_name}/mirrormaker/replication-flows/{source_cluster}/{target_cluster}", pathParameters);
    }
    /**
     * Instantiates a new WithTarget_clusterItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public WithTargetClusterItemRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/service/{service_name}/mirrormaker/replication-flows/{source_cluster}/{target_cluster}", rawUrl);
    }
    /**
     * Delete a replication flow
     * @return a CompletableFuture of ServiceKafkaMirrorMakerDeleteReplicationFlowResponse
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ServiceKafkaMirrorMakerDeleteReplicationFlowResponse> delete() {
        try {
            final RequestInformation requestInfo = toDeleteRequestInformation(null);
            return this.requestAdapter.sendAsync(requestInfo, ServiceKafkaMirrorMakerDeleteReplicationFlowResponse::createFromDiscriminatorValue, null);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<ServiceKafkaMirrorMakerDeleteReplicationFlowResponse> executionException = new java.util.concurrent.CompletableFuture<ServiceKafkaMirrorMakerDeleteReplicationFlowResponse>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Delete a replication flow
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of ServiceKafkaMirrorMakerDeleteReplicationFlowResponse
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ServiceKafkaMirrorMakerDeleteReplicationFlowResponse> delete(@javax.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
            return this.requestAdapter.sendAsync(requestInfo, ServiceKafkaMirrorMakerDeleteReplicationFlowResponse::createFromDiscriminatorValue, null);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<ServiceKafkaMirrorMakerDeleteReplicationFlowResponse> executionException = new java.util.concurrent.CompletableFuture<ServiceKafkaMirrorMakerDeleteReplicationFlowResponse>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Get a replication flow
     * @return a CompletableFuture of ServiceKafkaMirrorMakerGetReplicationFlowResponse
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ServiceKafkaMirrorMakerGetReplicationFlowResponse> get() {
        try {
            final RequestInformation requestInfo = toGetRequestInformation(null);
            return this.requestAdapter.sendAsync(requestInfo, ServiceKafkaMirrorMakerGetReplicationFlowResponse::createFromDiscriminatorValue, null);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<ServiceKafkaMirrorMakerGetReplicationFlowResponse> executionException = new java.util.concurrent.CompletableFuture<ServiceKafkaMirrorMakerGetReplicationFlowResponse>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Get a replication flow
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of ServiceKafkaMirrorMakerGetReplicationFlowResponse
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ServiceKafkaMirrorMakerGetReplicationFlowResponse> get(@javax.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
            return this.requestAdapter.sendAsync(requestInfo, ServiceKafkaMirrorMakerGetReplicationFlowResponse::createFromDiscriminatorValue, null);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<ServiceKafkaMirrorMakerGetReplicationFlowResponse> executionException = new java.util.concurrent.CompletableFuture<ServiceKafkaMirrorMakerGetReplicationFlowResponse>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Update a replication flow
     * @param body ServiceKafkaMirrorMakerPatchReplicationFlowRequestBody
     * @return a CompletableFuture of ServiceKafkaMirrorMakerPatchReplicationFlowResponse
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ServiceKafkaMirrorMakerPatchReplicationFlowResponse> put(@javax.annotation.Nonnull final ServiceKafkaMirrorMakerPatchReplicationFlowRequestBody body) {
        try {
            final RequestInformation requestInfo = toPutRequestInformation(body, null);
            return this.requestAdapter.sendAsync(requestInfo, ServiceKafkaMirrorMakerPatchReplicationFlowResponse::createFromDiscriminatorValue, null);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<ServiceKafkaMirrorMakerPatchReplicationFlowResponse> executionException = new java.util.concurrent.CompletableFuture<ServiceKafkaMirrorMakerPatchReplicationFlowResponse>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Update a replication flow
     * @param body ServiceKafkaMirrorMakerPatchReplicationFlowRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of ServiceKafkaMirrorMakerPatchReplicationFlowResponse
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ServiceKafkaMirrorMakerPatchReplicationFlowResponse> put(@javax.annotation.Nonnull final ServiceKafkaMirrorMakerPatchReplicationFlowRequestBody body, @javax.annotation.Nullable final java.util.function.Consumer<PutRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        try {
            final RequestInformation requestInfo = toPutRequestInformation(body, requestConfiguration);
            return this.requestAdapter.sendAsync(requestInfo, ServiceKafkaMirrorMakerPatchReplicationFlowResponse::createFromDiscriminatorValue, null);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<ServiceKafkaMirrorMakerPatchReplicationFlowResponse> executionException = new java.util.concurrent.CompletableFuture<ServiceKafkaMirrorMakerPatchReplicationFlowResponse>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Delete a replication flow
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() throws URISyntaxException {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete a replication flow
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
     * Get a replication flow
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toGetRequestInformation() throws URISyntaxException {
        return toGetRequestInformation(null);
    }
    /**
     * Get a replication flow
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
     * Update a replication flow
     * @param body ServiceKafkaMirrorMakerPatchReplicationFlowRequestBody
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPutRequestInformation(@javax.annotation.Nonnull final ServiceKafkaMirrorMakerPatchReplicationFlowRequestBody body) throws URISyntaxException {
        return toPutRequestInformation(body, null);
    }
    /**
     * Update a replication flow
     * @param body ServiceKafkaMirrorMakerPatchReplicationFlowRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPutRequestInformation(@javax.annotation.Nonnull final ServiceKafkaMirrorMakerPatchReplicationFlowRequestBody body, @javax.annotation.Nullable final java.util.function.Consumer<PutRequestConfiguration> requestConfiguration) throws URISyntaxException {
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
