package com.jeffmaury.aiven.intellij.api.project.item.user;

import com.jeffmaury.aiven.intellij.api.project.item.user.item.WithUserEmailItemRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /project/{project}/user
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UserRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the com.jeffmaury.aiven.intellij.api.project.item.user.item collection
     * @param user_email Email address
     * @return a WithUserEmailItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public WithUserEmailItemRequestBuilder byUser_email(@jakarta.annotation.Nonnull final String user_email) {
        Objects.requireNonNull(user_email);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("user_email", user_email);
        return new WithUserEmailItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new UserRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public UserRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/user", pathParameters);
    }
    /**
     * Instantiates a new UserRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public UserRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/user", rawUrl);
    }
}
