package com.jeffmaury.aiven.intellij.api.account.item.user.item;

import com.jeffmaury.aiven.intellij.api.account.item.user.item.projects.ProjectsRequestBuilder;
import com.jeffmaury.aiven.intellij.api.account.item.user.item.teams.TeamsRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /account/{account_id}/user/{user_id}
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WithUserItemRequestBuilder extends BaseRequestBuilder {
    /**
     * The projects property
     */
    @jakarta.annotation.Nonnull
    public ProjectsRequestBuilder projects() {
        return new ProjectsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The teams property
     */
    @jakarta.annotation.Nonnull
    public TeamsRequestBuilder teams() {
        return new TeamsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new WithUser_ItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithUserItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/account/{account_id}/user/{user_id}", pathParameters);
    }
    /**
     * Instantiates a new WithUser_ItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithUserItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/account/{account_id}/user/{user_id}", rawUrl);
    }
}
