package com.jeffmaury.aiven.intellij.api.project.item.invite;

import com.jeffmaury.aiven.intellij.api.models.ProjectInviteRequestBody;
import com.jeffmaury.aiven.intellij.api.models.ProjectInviteResponse;
import com.jeffmaury.aiven.intellij.api.project.item.invite.item.InviteItemRequestBuilder;
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
 * Builds and executes requests for operations under /project/{project}/invite
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class InviteRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the com.jeffmaury.aiven.intellij.api.project.item.invite.item collection
     * @param inviteId Email address of user to be invited
     * @return a InviteItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public InviteItemRequestBuilder byInviteId(@jakarta.annotation.Nonnull final String inviteId) {
        Objects.requireNonNull(inviteId);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("invite%2Did", inviteId);
        return new InviteItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new InviteRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public InviteRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/invite", pathParameters);
    }
    /**
     * Instantiates a new InviteRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public InviteRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/invite", rawUrl);
    }
    /**
     * Send project membership invitation
     * @param body ProjectInviteRequestBody
     * @return a ProjectInviteResponse
     */
    @jakarta.annotation.Nullable
    public ProjectInviteResponse post(@jakarta.annotation.Nonnull final ProjectInviteRequestBody body) {
        return post(body, null);
    }
    /**
     * Send project membership invitation
     * @param body ProjectInviteRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a ProjectInviteResponse
     */
    @jakarta.annotation.Nullable
    public ProjectInviteResponse post(@jakarta.annotation.Nonnull final ProjectInviteRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, ProjectInviteResponse::createFromDiscriminatorValue);
    }
    /**
     * Send project membership invitation
     * @param body ProjectInviteRequestBody
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final ProjectInviteRequestBody body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Send project membership invitation
     * @param body ProjectInviteRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final ProjectInviteRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a InviteRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public InviteRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new InviteRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
