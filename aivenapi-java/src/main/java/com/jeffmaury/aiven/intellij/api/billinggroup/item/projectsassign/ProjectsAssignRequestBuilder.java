package com.jeffmaury.aiven.intellij.api.billinggroup.item.projectsassign;

import com.jeffmaury.aiven.intellij.api.models.BillingGroupProjectsAssignRequestBody;
import com.jeffmaury.aiven.intellij.api.models.BillingGroupProjectsAssignResponse;
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
 * Builds and executes requests for operations under /billing-group/{billing_group_id}/projects-assign
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ProjectsAssignRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new ProjectsAssignRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ProjectsAssignRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/billing-group/{billing_group_id}/projects-assign", pathParameters);
    }
    /**
     * Instantiates a new ProjectsAssignRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ProjectsAssignRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/billing-group/{billing_group_id}/projects-assign", rawUrl);
    }
    /**
     * Assign projects to billing group
     * @param body BillingGroupProjectsAssignRequestBody
     * @return a BillingGroupProjectsAssignResponse
     */
    @jakarta.annotation.Nullable
    public BillingGroupProjectsAssignResponse post(@jakarta.annotation.Nonnull final BillingGroupProjectsAssignRequestBody body) {
        return post(body, null);
    }
    /**
     * Assign projects to billing group
     * @param body BillingGroupProjectsAssignRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a BillingGroupProjectsAssignResponse
     */
    @jakarta.annotation.Nullable
    public BillingGroupProjectsAssignResponse post(@jakarta.annotation.Nonnull final BillingGroupProjectsAssignRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, BillingGroupProjectsAssignResponse::createFromDiscriminatorValue);
    }
    /**
     * Assign projects to billing group
     * @param body BillingGroupProjectsAssignRequestBody
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final BillingGroupProjectsAssignRequestBody body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Assign projects to billing group
     * @param body BillingGroupProjectsAssignRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final BillingGroupProjectsAssignRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a ProjectsAssignRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public ProjectsAssignRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new ProjectsAssignRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
