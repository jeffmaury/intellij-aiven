package com.jeffmaury.aiven.intellij.api.project.item.vpcs.item.peeringconnections.peeraccounts;

import com.jeffmaury.aiven.intellij.api.project.item.vpcs.item.peeringconnections.peeraccounts.item.WithPeerCloudAccountItemRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /project/{project}/vpcs/{project_vpc_id}/peering-connections/peer-accounts
 */
public class PeerAccountsRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the com.jeffmaury.aiven.intellij.api.project.item.vpcs.item.peeringConnections.peerAccounts.item collection
     * @param peer_cloud_account Unique identifier of the item
     * @return a WithPeerCloudAccountItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public WithPeerCloudAccountItemRequestBuilder byPeer_cloud_account(@javax.annotation.Nonnull final String peer_cloud_account) {
        Objects.requireNonNull(peer_cloud_account);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("peer_cloud_account", peer_cloud_account);
        return new WithPeerCloudAccountItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new PeerAccountsRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public PeerAccountsRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/vpcs/{project_vpc_id}/peering-connections/peer-accounts", pathParameters);
    }
    /**
     * Instantiates a new PeerAccountsRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public PeerAccountsRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/vpcs/{project_vpc_id}/peering-connections/peer-accounts", rawUrl);
    }
}
