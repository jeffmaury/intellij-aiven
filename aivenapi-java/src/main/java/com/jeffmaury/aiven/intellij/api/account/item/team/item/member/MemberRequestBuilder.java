package com.jeffmaury.aiven.intellij.api.account.item.team.item.member;

import com.jeffmaury.aiven.intellij.api.account.item.team.item.member.item.WithUserItemRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /account/{account_id}/team/{team_id}/member
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MemberRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the com.jeffmaury.aiven.intellij.api.account.item.team.item.member.item collection
     * @param user_id User ID
     * @return a WithUserItemRequestBuilder
     * @deprecated
     * 
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public WithUserItemRequestBuilder byUser_id(@jakarta.annotation.Nonnull final String user_id) {
        Objects.requireNonNull(user_id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("user_id", user_id);
        return new WithUserItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new MemberRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public MemberRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/account/{account_id}/team/{team_id}/member", pathParameters);
    }
    /**
     * Instantiates a new MemberRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public MemberRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/account/{account_id}/team/{team_id}/member", rawUrl);
    }
}
