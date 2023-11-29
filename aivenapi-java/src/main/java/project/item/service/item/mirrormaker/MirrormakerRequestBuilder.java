package com.jeffmaury.aiven.intellij.api.project.item.service.item.mirrormaker;

import com.jeffmaury.aiven.intellij.api.project.item.service.item.mirrormaker.replicationflows.ReplicationFlowsRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /project/{project}/service/{service_name}/mirrormaker
 */
public class MirrormakerRequestBuilder extends BaseRequestBuilder {
    /** The replicationFlows property */
    @javax.annotation.Nonnull
    public ReplicationFlowsRequestBuilder replicationFlows() {
        return new ReplicationFlowsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new MirrormakerRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public MirrormakerRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/service/{service_name}/mirrormaker", pathParameters);
    }
    /**
     * Instantiates a new MirrormakerRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public MirrormakerRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/service/{service_name}/mirrormaker", rawUrl);
    }
}
