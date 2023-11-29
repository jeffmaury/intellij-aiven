package com.jeffmaury.aiven.intellij.api.project.item.tickets.item;

import com.jeffmaury.aiven.intellij.api.project.item.tickets.item.invite.InviteRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /project/{project}/tickets/{ticket_id}
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WithTicketItemRequestBuilder extends BaseRequestBuilder {
    /**
     * The invite property
     */
    @jakarta.annotation.Nonnull
    public InviteRequestBuilder invite() {
        return new InviteRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new WithTicket_ItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithTicketItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/tickets/{ticket_id}", pathParameters);
    }
    /**
     * Instantiates a new WithTicket_ItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithTicketItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/tickets/{ticket_id}", rawUrl);
    }
}
