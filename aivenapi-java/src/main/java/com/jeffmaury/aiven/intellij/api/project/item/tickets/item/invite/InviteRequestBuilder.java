package com.jeffmaury.aiven.intellij.api.project.item.tickets.item.invite;

import com.jeffmaury.aiven.intellij.api.models.ProjectTicketInviteRequestBody;
import com.jeffmaury.aiven.intellij.api.models.ProjectTicketInviteResponse;
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
 * Builds and executes requests for operations under /project/{project}/tickets/{ticket_id}/invite
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class InviteRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new InviteRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public InviteRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/tickets/{ticket_id}/invite", pathParameters);
    }
    /**
     * Instantiates a new InviteRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public InviteRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/tickets/{ticket_id}/invite", rawUrl);
    }
    /**
     * Invite a user to a ticket
     * @param body ProjectTicketInviteRequestBody
     * @return a ProjectTicketInviteResponse
     */
    @jakarta.annotation.Nullable
    public ProjectTicketInviteResponse post(@jakarta.annotation.Nonnull final ProjectTicketInviteRequestBody body) {
        return post(body, null);
    }
    /**
     * Invite a user to a ticket
     * @param body ProjectTicketInviteRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a ProjectTicketInviteResponse
     */
    @jakarta.annotation.Nullable
    public ProjectTicketInviteResponse post(@jakarta.annotation.Nonnull final ProjectTicketInviteRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, ProjectTicketInviteResponse::createFromDiscriminatorValue);
    }
    /**
     * Invite a user to a ticket
     * @param body ProjectTicketInviteRequestBody
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final ProjectTicketInviteRequestBody body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Invite a user to a ticket
     * @param body ProjectTicketInviteRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final ProjectTicketInviteRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
