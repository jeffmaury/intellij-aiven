package com.jeffmaury.aiven.intellij.api.account.item.users;

import com.jeffmaury.aiven.intellij.api.account.item.users.search.SearchRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /account/{account_id}/users
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UsersRequestBuilder extends BaseRequestBuilder {
    /**
     * The search property
     */
    @jakarta.annotation.Nonnull
    public SearchRequestBuilder search() {
        return new SearchRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new UsersRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public UsersRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/account/{account_id}/users", pathParameters);
    }
    /**
     * Instantiates a new UsersRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public UsersRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/account/{account_id}/users", rawUrl);
    }
}
