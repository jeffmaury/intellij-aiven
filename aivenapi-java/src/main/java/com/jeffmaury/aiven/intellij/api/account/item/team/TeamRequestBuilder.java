package com.jeffmaury.aiven.intellij.api.account.item.team;

import com.jeffmaury.aiven.intellij.api.account.item.team.item.WithTeamItemRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /account/{account_id}/team
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TeamRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the com.jeffmaury.aiven.intellij.api.account.item.team.item collection
     * @param team_id Team ID
     * @return a WithTeamItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public WithTeamItemRequestBuilder byTeam_id(@jakarta.annotation.Nonnull final String team_id) {
        Objects.requireNonNull(team_id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("team_id", team_id);
        return new WithTeamItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new TeamRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public TeamRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/account/{account_id}/team", pathParameters);
    }
    /**
     * Instantiates a new TeamRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public TeamRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/account/{account_id}/team", rawUrl);
    }
}
