package com.jeffmaury.aiven.intellij.api.account.item.teams;

import com.jeffmaury.aiven.intellij.api.models.AccountTeamCreateRequestBody;
import com.jeffmaury.aiven.intellij.api.models.AccountTeamCreateResponse;
import com.jeffmaury.aiven.intellij.api.models.AccountTeamListResponse;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /account/{account_id}/teams
 */
public class TeamsRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new TeamsRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public TeamsRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/account/{account_id}/teams", pathParameters);
    }
    /**
     * Instantiates a new TeamsRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public TeamsRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/account/{account_id}/teams", rawUrl);
    }
    /**
     * List teams belonging to an account
     * @return a CompletableFuture of AccountTeamListResponse
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<AccountTeamListResponse> get() {
        try {
            final RequestInformation requestInfo = toGetRequestInformation(null);
            return this.requestAdapter.sendAsync(requestInfo, AccountTeamListResponse::createFromDiscriminatorValue, null);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<AccountTeamListResponse> executionException = new java.util.concurrent.CompletableFuture<AccountTeamListResponse>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * List teams belonging to an account
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of AccountTeamListResponse
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<AccountTeamListResponse> get(@javax.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
            return this.requestAdapter.sendAsync(requestInfo, AccountTeamListResponse::createFromDiscriminatorValue, null);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<AccountTeamListResponse> executionException = new java.util.concurrent.CompletableFuture<AccountTeamListResponse>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * <p>Use POST /organization/{organization_id}/user-groups</p>
     * @param body AccountTeamCreateRequestBody
     * @return a CompletableFuture of AccountTeamCreateResponse
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<AccountTeamCreateResponse> post(@javax.annotation.Nonnull final AccountTeamCreateRequestBody body) {
        try {
            final RequestInformation requestInfo = toPostRequestInformation(body, null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("400", AccountTeamCreateResponse400Error::createFromDiscriminatorValue);
            errorMapping.put("403", AccountTeamCreateResponse403Error::createFromDiscriminatorValue);
            errorMapping.put("404", AccountTeamCreateResponse404Error::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, AccountTeamCreateResponse::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<AccountTeamCreateResponse> executionException = new java.util.concurrent.CompletableFuture<AccountTeamCreateResponse>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * <p>Use POST /organization/{organization_id}/user-groups</p>
     * @param body AccountTeamCreateRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of AccountTeamCreateResponse
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<AccountTeamCreateResponse> post(@javax.annotation.Nonnull final AccountTeamCreateRequestBody body, @javax.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        try {
            final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("400", AccountTeamCreateResponse400Error::createFromDiscriminatorValue);
            errorMapping.put("403", AccountTeamCreateResponse403Error::createFromDiscriminatorValue);
            errorMapping.put("404", AccountTeamCreateResponse404Error::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, AccountTeamCreateResponse::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<AccountTeamCreateResponse> executionException = new java.util.concurrent.CompletableFuture<AccountTeamCreateResponse>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * List teams belonging to an account
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toGetRequestInformation() throws URISyntaxException {
        return toGetRequestInformation(null);
    }
    /**
     * List teams belonging to an account
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation();
        requestInfo.httpMethod = HttpMethod.GET;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.headers.add("Accept", "application/json");
        if (requestConfiguration != null) {
            final GetRequestConfiguration requestConfig = new GetRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * <p>Use POST /organization/{organization_id}/user-groups</p>
     * @param body AccountTeamCreateRequestBody
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@javax.annotation.Nonnull final AccountTeamCreateRequestBody body) throws URISyntaxException {
        return toPostRequestInformation(body, null);
    }
    /**
     * <p>Use POST /organization/{organization_id}/user-groups</p>
     * @param body AccountTeamCreateRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@javax.annotation.Nonnull final AccountTeamCreateRequestBody body, @javax.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) throws URISyntaxException {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation();
        requestInfo.httpMethod = HttpMethod.POST;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.headers.add("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        if (requestConfiguration != null) {
            final PostRequestConfiguration requestConfig = new PostRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    public class GetRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
