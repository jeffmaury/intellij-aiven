package com.jeffmaury.aiven.intellij.api.account.item.team.item.project;

import com.jeffmaury.aiven.intellij.api.account.item.team.item.project.item.WithProjectItemRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /account/{account_id}/team/{team_id}/project
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ProjectRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the com.jeffmaury.aiven.intellij.api.account.item.team.item.project.item collection
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
     * Instantiates a new ProjectRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ProjectRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/account/{account_id}/team/{team_id}/project", pathParameters);
    }
    /**
     * Instantiates a new ProjectRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ProjectRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/account/{account_id}/team/{team_id}/project", rawUrl);
    }
}
