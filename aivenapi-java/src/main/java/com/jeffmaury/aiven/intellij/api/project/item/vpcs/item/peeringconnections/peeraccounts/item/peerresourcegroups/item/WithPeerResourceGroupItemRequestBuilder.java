package com.jeffmaury.aiven.intellij.api.project.item.vpcs.item.peeringconnections.peeraccounts.item.peerresourcegroups.item;

import com.jeffmaury.aiven.intellij.api.project.item.vpcs.item.peeringconnections.peeraccounts.item.peerresourcegroups.item.peervpcs.PeerVpcsRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /project/{project}/vpcs/{project_vpc_id}/peering-connections/peer-accounts/{peer_cloud_account}/peer-resource-groups/{peer_resource_group}
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WithPeerResourceGroupItemRequestBuilder extends BaseRequestBuilder {
    /**
     * The peerVpcs property
     */
    @jakarta.annotation.Nonnull
    public PeerVpcsRequestBuilder peerVpcs() {
        return new PeerVpcsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new WithPeer_resource_groupItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithPeerResourceGroupItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/vpcs/{project_vpc_id}/peering-connections/peer-accounts/{peer_cloud_account}/peer-resource-groups/{peer_resource_group}", pathParameters);
    }
    /**
     * Instantiates a new WithPeer_resource_groupItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithPeerResourceGroupItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/vpcs/{project_vpc_id}/peering-connections/peer-accounts/{peer_cloud_account}/peer-resource-groups/{peer_resource_group}", rawUrl);
    }
}
