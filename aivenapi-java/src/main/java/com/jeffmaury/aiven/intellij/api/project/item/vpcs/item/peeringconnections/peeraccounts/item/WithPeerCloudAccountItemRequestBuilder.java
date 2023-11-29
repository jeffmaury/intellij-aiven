package com.jeffmaury.aiven.intellij.api.project.item.vpcs.item.peeringconnections.peeraccounts.item;

import com.jeffmaury.aiven.intellij.api.project.item.vpcs.item.peeringconnections.peeraccounts.item.peerresourcegroups.PeerResourceGroupsRequestBuilder;
import com.jeffmaury.aiven.intellij.api.project.item.vpcs.item.peeringconnections.peeraccounts.item.peervpcs.PeerVpcsRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /project/{project}/vpcs/{project_vpc_id}/peering-connections/peer-accounts/{peer_cloud_account}
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WithPeerCloudAccountItemRequestBuilder extends BaseRequestBuilder {
    /**
     * The peerResourceGroups property
     */
    @jakarta.annotation.Nonnull
    public PeerResourceGroupsRequestBuilder peerResourceGroups() {
        return new PeerResourceGroupsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The peerVpcs property
     */
    @jakarta.annotation.Nonnull
    public PeerVpcsRequestBuilder peerVpcs() {
        return new PeerVpcsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new WithPeer_cloud_accountItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithPeerCloudAccountItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/vpcs/{project_vpc_id}/peering-connections/peer-accounts/{peer_cloud_account}", pathParameters);
    }
    /**
     * Instantiates a new WithPeer_cloud_accountItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithPeerCloudAccountItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/vpcs/{project_vpc_id}/peering-connections/peer-accounts/{peer_cloud_account}", rawUrl);
    }
}
