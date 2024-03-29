package com.jeffmaury.aiven.intellij.api.account.item.project.item;

import com.jeffmaury.aiven.intellij.api.account.item.project.item.teams.TeamsRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /account/{account_id}/project/{project_name}
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WithProjectNameItemRequestBuilder extends BaseRequestBuilder {
    /**
     * The teams property
     */
    @jakarta.annotation.Nonnull
    public TeamsRequestBuilder teams() {
        return new TeamsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new WithProject_nameItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithProjectNameItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/account/{account_id}/project/{project_name}", pathParameters);
    }
    /**
     * Instantiates a new WithProject_nameItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithProjectNameItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/account/{account_id}/project/{project_name}", rawUrl);
    }
}
