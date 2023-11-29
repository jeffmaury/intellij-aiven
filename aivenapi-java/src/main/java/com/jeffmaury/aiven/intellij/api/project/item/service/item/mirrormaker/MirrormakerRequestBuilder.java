package com.jeffmaury.aiven.intellij.api.project.item.service.item.mirrormaker;

import com.jeffmaury.aiven.intellij.api.project.item.service.item.mirrormaker.replicationflows.ReplicationFlowsRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /project/{project}/service/{service_name}/mirrormaker
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MirrormakerRequestBuilder extends BaseRequestBuilder {
    /**
     * The replicationFlows property
     */
    @jakarta.annotation.Nonnull
    public ReplicationFlowsRequestBuilder replicationFlows() {
        return new ReplicationFlowsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new MirrormakerRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public MirrormakerRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/service/{service_name}/mirrormaker", pathParameters);
    }
    /**
     * Instantiates a new MirrormakerRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public MirrormakerRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/service/{service_name}/mirrormaker", rawUrl);
    }
}
