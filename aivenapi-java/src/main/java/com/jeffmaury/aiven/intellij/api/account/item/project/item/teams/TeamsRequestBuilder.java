package com.jeffmaury.aiven.intellij.api.account.item.project.item.teams;

import com.jeffmaury.aiven.intellij.api.models.AccountProjectsTeamsListResponse;
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
 * Builds and executes requests for operations under /account/{account_id}/project/{project_name}/teams
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TeamsRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new TeamsRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public TeamsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/account/{account_id}/project/{project_name}/teams", pathParameters);
    }
    /**
     * Instantiates a new TeamsRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public TeamsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/account/{account_id}/project/{project_name}/teams", rawUrl);
    }
    /**
     * <p>Use GET /organization/{organization_id}/user-groups</p>
     * @return a CompletableFuture of AccountProjectsTeamsListResponse
     * @deprecated
     * 
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public java.util.concurrent.CompletableFuture<AccountProjectsTeamsListResponse> get() {
        return get(null);
    }
    /**
     * <p>Use GET /organization/{organization_id}/user-groups</p>
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of AccountProjectsTeamsListResponse
     * @deprecated
     * 
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public java.util.concurrent.CompletableFuture<AccountProjectsTeamsListResponse> get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.sendAsync(requestInfo, AccountProjectsTeamsListResponse::createFromDiscriminatorValue, null);
    }
    /**
     * <p>Use GET /organization/{organization_id}/user-groups</p>
     * @return a RequestInformation
     * @deprecated
     * 
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * <p>Use GET /organization/{organization_id}/user-groups</p>
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     * @deprecated
     * 
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation();
        if (requestConfiguration != null) {
            final GetRequestConfiguration requestConfig = new GetRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        requestInfo.httpMethod = HttpMethod.GET;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a TeamsRequestBuilder
     * @deprecated
     * 
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public TeamsRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new TeamsRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
    }
}
