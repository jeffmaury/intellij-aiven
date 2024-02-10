package com.jeffmaury.aiven.intellij.api.project.item.vpcs.item.peeringconnections.peeraccounts.item.peerresourcegroups;

import com.jeffmaury.aiven.intellij.api.project.item.vpcs.item.peeringconnections.peeraccounts.item.peerresourcegroups.item.WithPeerResourceGroupItemRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /project/{project}/vpcs/{project_vpc_id}/peering-connections/peer-accounts/{peer_cloud_account}/peer-resource-groups
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PeerResourceGroupsRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the com.jeffmaury.aiven.intellij.api.project.item.vpcs.item.peeringConnections.peerAccounts.item.peerResourceGroups.item collection
     * @param peer_resource_group Azure resource group
     * @return a WithPeerResourceGroupItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public WithPeerResourceGroupItemRequestBuilder byPeer_resource_group(@jakarta.annotation.Nonnull final String peer_resource_group) {
        Objects.requireNonNull(peer_resource_group);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("peer_resource_group", peer_resource_group);
        return new WithPeerResourceGroupItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new PeerResourceGroupsRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public PeerResourceGroupsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/vpcs/{project_vpc_id}/peering-connections/peer-accounts/{peer_cloud_account}/peer-resource-groups", pathParameters);
    }
    /**
     * Instantiates a new PeerResourceGroupsRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public PeerResourceGroupsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/vpcs/{project_vpc_id}/peering-connections/peer-accounts/{peer_cloud_account}/peer-resource-groups", rawUrl);
    }
}
