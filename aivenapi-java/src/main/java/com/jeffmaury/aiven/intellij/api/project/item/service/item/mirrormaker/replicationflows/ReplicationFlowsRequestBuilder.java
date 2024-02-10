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
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /project/{project}/service/{service_name}/mirrormaker/replication-flows
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ReplicationFlowsRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the com.jeffmaury.aiven.intellij.api.project.item.service.item.mirrormaker.replicationFlows.item collection
     * @param source_cluster Source cluster alias
     * @return a WithSourceClusterItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public WithSourceClusterItemRequestBuilder bySource_cluster(@jakarta.annotation.Nonnull final String source_cluster) {
        Objects.requireNonNull(source_cluster);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("source_cluster", source_cluster);
        return new WithSourceClusterItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new ReplicationFlowsRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ReplicationFlowsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/service/{service_name}/mirrormaker/replication-flows", pathParameters);
    }
    /**
     * Instantiates a new ReplicationFlowsRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ReplicationFlowsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/service/{service_name}/mirrormaker/replication-flows", rawUrl);
    }
    /**
     * Get replication flows
     * @return a ServiceKafkaMirrorMakerGetReplicationFlowsResponse
     */
    @jakarta.annotation.Nullable
    public ServiceKafkaMirrorMakerGetReplicationFlowsResponse get() {
        return get(null);
    }
    /**
     * Get replication flows
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a ServiceKafkaMirrorMakerGetReplicationFlowsResponse
     */
    @jakarta.annotation.Nullable
    public ServiceKafkaMirrorMakerGetReplicationFlowsResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, ServiceKafkaMirrorMakerGetReplicationFlowsResponse::createFromDiscriminatorValue);
    }
    /**
     * Create a replication flow
     * @param body ServiceKafkaMirrorMakerCreateReplicationFlowRequestBody
     * @return a ServiceKafkaMirrorMakerCreateReplicationFlowResponse
     */
    @jakarta.annotation.Nullable
    public ServiceKafkaMirrorMakerCreateReplicationFlowResponse post(@jakarta.annotation.Nonnull final ServiceKafkaMirrorMakerCreateReplicationFlowRequestBody body) {
        return post(body, null);
    }
    /**
     * Create a replication flow
     * @param body ServiceKafkaMirrorMakerCreateReplicationFlowRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a ServiceKafkaMirrorMakerCreateReplicationFlowResponse
     */
    @jakarta.annotation.Nullable
    public ServiceKafkaMirrorMakerCreateReplicationFlowResponse post(@jakarta.annotation.Nonnull final ServiceKafkaMirrorMakerCreateReplicationFlowRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, ServiceKafkaMirrorMakerCreateReplicationFlowResponse::createFromDiscriminatorValue);
    }
    /**
     * Get replication flows
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Get replication flows
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
     * Create a replication flow
     * @param body ServiceKafkaMirrorMakerCreateReplicationFlowRequestBody
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final ServiceKafkaMirrorMakerCreateReplicationFlowRequestBody body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Create a replication flow
     * @param body ServiceKafkaMirrorMakerCreateReplicationFlowRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final ServiceKafkaMirrorMakerCreateReplicationFlowRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a ReplicationFlowsRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public ReplicationFlowsRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new ReplicationFlowsRequestBuilder(rawUrl, requestAdapter);
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
