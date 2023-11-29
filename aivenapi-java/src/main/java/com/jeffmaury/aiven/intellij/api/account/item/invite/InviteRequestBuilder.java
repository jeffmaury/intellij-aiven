package com.jeffmaury.aiven.intellij.api.account.item.invite;

import com.jeffmaury.aiven.intellij.api.account.item.invite.item.WithInviteVerificationCodeItemRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /account/{account_id}/invite
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class InviteRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the com.jeffmaury.aiven.intellij.api.account.item.invite.item collection
     * @param invite_verification_code Unique identifier of the item
     * @return a WithInviteVerificationCodeItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public WithInviteVerificationCodeItemRequestBuilder byInvite_verification_code(@jakarta.annotation.Nonnull final String invite_verification_code) {
        Objects.requireNonNull(invite_verification_code);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("invite_verification_code", invite_verification_code);
        return new WithInviteVerificationCodeItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new InviteRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public InviteRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/account/{account_id}/invite", pathParameters);
    }
    /**
     * Instantiates a new InviteRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public InviteRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/account/{account_id}/invite", rawUrl);
    }
}
