package com.jeffmaury.aiven.intellij.api.me.account;

import com.jeffmaury.aiven.intellij.api.me.account.invites.InvitesRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /me/account
 */
public class AccountRequestBuilder extends BaseRequestBuilder {
    /** The invites property */
    @javax.annotation.Nonnull
    public InvitesRequestBuilder invites() {
        return new InvitesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new AccountRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public AccountRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/me/account", pathParameters);
    }
    /**
     * Instantiates a new AccountRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public AccountRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/me/account", rawUrl);
    }
}
