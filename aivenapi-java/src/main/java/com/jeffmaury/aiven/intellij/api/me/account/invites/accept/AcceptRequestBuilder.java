package com.jeffmaury.aiven.intellij.api.me.account.invites.accept;

import com.jeffmaury.aiven.intellij.api.models.UserAccountInvitesAcceptRequestBody;
import com.jeffmaury.aiven.intellij.api.models.UserAccountInvitesAcceptResponse;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /me/account/invites/accept
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AcceptRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new AcceptRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AcceptRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/me/account/invites/accept", pathParameters);
    }
    /**
     * Instantiates a new AcceptRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AcceptRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/me/account/invites/accept", rawUrl);
    }
    /**
     * Accept all invites for a single account
     * @param body UserAccountInvitesAcceptRequestBody
     * @return a UserAccountInvitesAcceptResponse
     */
    @jakarta.annotation.Nullable
    public UserAccountInvitesAcceptResponse post(@jakarta.annotation.Nonnull final UserAccountInvitesAcceptRequestBody body) {
        return post(body, null);
    }
    /**
     * Accept all invites for a single account
     * @param body UserAccountInvitesAcceptRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a UserAccountInvitesAcceptResponse
     */
    @jakarta.annotation.Nullable
    public UserAccountInvitesAcceptResponse post(@jakarta.annotation.Nonnull final UserAccountInvitesAcceptRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, UserAccountInvitesAcceptResponse::createFromDiscriminatorValue);
    }
    /**
     * Accept all invites for a single account
     * @param body UserAccountInvitesAcceptRequestBody
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final UserAccountInvitesAcceptRequestBody body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Accept all invites for a single account
     * @param body UserAccountInvitesAcceptRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final UserAccountInvitesAcceptRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.POST, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PostRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a AcceptRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public AcceptRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new AcceptRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
