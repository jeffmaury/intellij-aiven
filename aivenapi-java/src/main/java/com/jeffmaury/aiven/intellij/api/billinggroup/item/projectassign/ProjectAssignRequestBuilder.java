package com.jeffmaury.aiven.intellij.api.billinggroup.item.projectassign;

import com.jeffmaury.aiven.intellij.api.billinggroup.item.projectassign.item.WithProjectItemRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /billing-group/{billing_group_id}/project-assign
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ProjectAssignRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the com.jeffmaury.aiven.intellij.api.billingGroup.item.projectAssign.item collection
     * @param project Project name
     * @return a WithProjectItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public WithProjectItemRequestBuilder byProject(@jakarta.annotation.Nonnull final String project) {
        Objects.requireNonNull(project);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("project", project);
        return new WithProjectItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new ProjectAssignRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ProjectAssignRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/billing-group/{billing_group_id}/project-assign", pathParameters);
    }
    /**
     * Instantiates a new ProjectAssignRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ProjectAssignRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/billing-group/{billing_group_id}/project-assign", rawUrl);
    }
}
