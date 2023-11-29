package com.jeffmaury.aiven.intellij.api.project.item.service.item.mirrormaker.replicationflows.item;

import com.jeffmaury.aiven.intellij.api.project.item.service.item.mirrormaker.replicationflows.item.item.WithTargetClusterItemRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /project/{project}/service/{service_name}/mirrormaker/replication-flows/{source_cluster}
 */
public class WithSourceClusterItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the com.jeffmaury.aiven.intellij.api.project.item.service.item.mirrormaker.replicationFlows.item.item collection
     * @param target_cluster Unique identifier of the item
     * @return a WithTargetClusterItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public WithTargetClusterItemRequestBuilder byTarget_cluster(@javax.annotation.Nonnull final String target_cluster) {
        Objects.requireNonNull(target_cluster);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("target_cluster", target_cluster);
        return new WithTargetClusterItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new WithSource_clusterItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public WithSourceClusterItemRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/service/{service_name}/mirrormaker/replication-flows/{source_cluster}", pathParameters);
    }
    /**
     * Instantiates a new WithSource_clusterItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public WithSourceClusterItemRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/service/{service_name}/mirrormaker/replication-flows/{source_cluster}", rawUrl);
    }
}
