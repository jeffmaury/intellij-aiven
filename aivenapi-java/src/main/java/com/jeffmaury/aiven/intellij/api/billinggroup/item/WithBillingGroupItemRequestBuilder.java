package com.jeffmaury.aiven.intellij.api.billinggroup.item;

import com.jeffmaury.aiven.intellij.api.billinggroup.item.credits.CreditsRequestBuilder;
import com.jeffmaury.aiven.intellij.api.billinggroup.item.events.EventsRequestBuilder;
import com.jeffmaury.aiven.intellij.api.billinggroup.item.invoice.InvoiceRequestBuilder;
import com.jeffmaury.aiven.intellij.api.billinggroup.item.projectassign.ProjectAssignRequestBuilder;
import com.jeffmaury.aiven.intellij.api.billinggroup.item.projects.ProjectsRequestBuilder;
import com.jeffmaury.aiven.intellij.api.billinggroup.item.projectsassign.ProjectsAssignRequestBuilder;
import com.jeffmaury.aiven.intellij.api.models.BillingGroupDeleteResponse;
import com.jeffmaury.aiven.intellij.api.models.BillingGroupGetResponse;
import com.jeffmaury.aiven.intellij.api.models.BillingGroupUpdateRequestBody;
import com.jeffmaury.aiven.intellij.api.models.BillingGroupUpdateResponse;
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
 * Builds and executes requests for operations under /billing-group/{billing_group_id}
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WithBillingGroupItemRequestBuilder extends BaseRequestBuilder {
    /**
     * The credits property
     */
    @jakarta.annotation.Nonnull
    public CreditsRequestBuilder credits() {
        return new CreditsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The events property
     */
    @jakarta.annotation.Nonnull
    public EventsRequestBuilder events() {
        return new EventsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The invoice property
     */
    @jakarta.annotation.Nonnull
    public InvoiceRequestBuilder invoice() {
        return new InvoiceRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The projectAssign property
     */
    @jakarta.annotation.Nonnull
    public ProjectAssignRequestBuilder projectAssign() {
        return new ProjectAssignRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The projects property
     */
    @jakarta.annotation.Nonnull
    public ProjectsRequestBuilder projects() {
        return new ProjectsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The projectsAssign property
     */
    @jakarta.annotation.Nonnull
    public ProjectsAssignRequestBuilder projectsAssign() {
        return new ProjectsAssignRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new WithBilling_group_ItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithBillingGroupItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/billing-group/{billing_group_id}", pathParameters);
    }
    /**
     * Instantiates a new WithBilling_group_ItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithBillingGroupItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/billing-group/{billing_group_id}", rawUrl);
    }
    /**
     * Delete billing group
     * @return a BillingGroupDeleteResponse
     */
    @jakarta.annotation.Nullable
    public BillingGroupDeleteResponse delete() {
        return delete(null);
    }
    /**
     * Delete billing group
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a BillingGroupDeleteResponse
     */
    @jakarta.annotation.Nullable
    public BillingGroupDeleteResponse delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, BillingGroupDeleteResponse::createFromDiscriminatorValue);
    }
    /**
     * Get billing group details
     * @return a BillingGroupGetResponse
     */
    @jakarta.annotation.Nullable
    public BillingGroupGetResponse get() {
        return get(null);
    }
    /**
     * Get billing group details
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a BillingGroupGetResponse
     */
    @jakarta.annotation.Nullable
    public BillingGroupGetResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, BillingGroupGetResponse::createFromDiscriminatorValue);
    }
    /**
     * Update billing group
     * @param body BillingGroupUpdateRequestBody
     * @return a BillingGroupUpdateResponse
     */
    @jakarta.annotation.Nullable
    public BillingGroupUpdateResponse put(@jakarta.annotation.Nonnull final BillingGroupUpdateRequestBody body) {
        return put(body, null);
    }
    /**
     * Update billing group
     * @param body BillingGroupUpdateRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a BillingGroupUpdateResponse
     */
    @jakarta.annotation.Nullable
    public BillingGroupUpdateResponse put(@jakarta.annotation.Nonnull final BillingGroupUpdateRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PutRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPutRequestInformation(body, requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, BillingGroupUpdateResponse::createFromDiscriminatorValue);
    }
    /**
     * Delete billing group
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete billing group
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.DELETE, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, DeleteRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Get billing group details
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Get billing group details
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.GET, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, GetRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Update billing group
     * @param body BillingGroupUpdateRequestBody
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPutRequestInformation(@jakarta.annotation.Nonnull final BillingGroupUpdateRequestBody body) {
        return toPutRequestInformation(body, null);
    }
    /**
     * Update billing group
     * @param body BillingGroupUpdateRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPutRequestInformation(@jakarta.annotation.Nonnull final BillingGroupUpdateRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PutRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.PUT, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PutRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a WithBillingGroupItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public WithBillingGroupItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new WithBillingGroupItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PutRequestConfiguration extends BaseRequestConfiguration {
    }
}
