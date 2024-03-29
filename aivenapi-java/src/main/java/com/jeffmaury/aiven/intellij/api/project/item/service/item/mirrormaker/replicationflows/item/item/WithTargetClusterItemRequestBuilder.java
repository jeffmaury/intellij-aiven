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
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /project/{project}/service/{service_name}/mirrormaker/replication-flows/{source_cluster}/{target_cluster}
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WithTargetClusterItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new WithTarget_clusterItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithTargetClusterItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/service/{service_name}/mirrormaker/replication-flows/{source_cluster}/{target_cluster}", pathParameters);
    }
    /**
     * Instantiates a new WithTarget_clusterItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithTargetClusterItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/service/{service_name}/mirrormaker/replication-flows/{source_cluster}/{target_cluster}", rawUrl);
    }
    /**
     * Delete a replication flow
     * @return a ServiceKafkaMirrorMakerDeleteReplicationFlowResponse
     */
    @jakarta.annotation.Nullable
    public ServiceKafkaMirrorMakerDeleteReplicationFlowResponse delete() {
        return delete(null);
    }
    /**
     * Delete a replication flow
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a ServiceKafkaMirrorMakerDeleteReplicationFlowResponse
     */
    @jakarta.annotation.Nullable
    public ServiceKafkaMirrorMakerDeleteReplicationFlowResponse delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, ServiceKafkaMirrorMakerDeleteReplicationFlowResponse::createFromDiscriminatorValue);
    }
    /**
     * Get a replication flow
     * @return a ServiceKafkaMirrorMakerGetReplicationFlowResponse
     */
    @jakarta.annotation.Nullable
    public ServiceKafkaMirrorMakerGetReplicationFlowResponse get() {
        return get(null);
    }
    /**
     * Get a replication flow
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a ServiceKafkaMirrorMakerGetReplicationFlowResponse
     */
    @jakarta.annotation.Nullable
    public ServiceKafkaMirrorMakerGetReplicationFlowResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, ServiceKafkaMirrorMakerGetReplicationFlowResponse::createFromDiscriminatorValue);
    }
    /**
     * Update a replication flow
     * @param body ServiceKafkaMirrorMakerPatchReplicationFlowRequestBody
     * @return a ServiceKafkaMirrorMakerPatchReplicationFlowResponse
     */
    @jakarta.annotation.Nullable
    public ServiceKafkaMirrorMakerPatchReplicationFlowResponse put(@jakarta.annotation.Nonnull final ServiceKafkaMirrorMakerPatchReplicationFlowRequestBody body) {
        return put(body, null);
    }
    /**
     * Update a replication flow
     * @param body ServiceKafkaMirrorMakerPatchReplicationFlowRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a ServiceKafkaMirrorMakerPatchReplicationFlowResponse
     */
    @jakarta.annotation.Nullable
    public ServiceKafkaMirrorMakerPatchReplicationFlowResponse put(@jakarta.annotation.Nonnull final ServiceKafkaMirrorMakerPatchReplicationFlowRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PutRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPutRequestInformation(body, requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, ServiceKafkaMirrorMakerPatchReplicationFlowResponse::createFromDiscriminatorValue);
    }
    /**
     * Delete a replication flow
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete a replication flow
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
     * Get a replication flow
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Get a replication flow
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
     * Update a replication flow
     * @param body ServiceKafkaMirrorMakerPatchReplicationFlowRequestBody
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPutRequestInformation(@jakarta.annotation.Nonnull final ServiceKafkaMirrorMakerPatchReplicationFlowRequestBody body) {
        return toPutRequestInformation(body, null);
    }
    /**
     * Update a replication flow
     * @param body ServiceKafkaMirrorMakerPatchReplicationFlowRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPutRequestInformation(@jakarta.annotation.Nonnull final ServiceKafkaMirrorMakerPatchReplicationFlowRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PutRequestConfiguration> requestConfiguration) {
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
     * @return a WithTargetClusterItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public WithTargetClusterItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new WithTargetClusterItemRequestBuilder(rawUrl, requestAdapter);
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
