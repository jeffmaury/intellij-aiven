package com.jeffmaury.aiven.intellij.api.account.item.team.item.project.item;

import com.jeffmaury.aiven.intellij.api.models.AccountTeamProjectAssociateRequestBody;
import com.jeffmaury.aiven.intellij.api.models.AccountTeamProjectAssociateResponse;
import com.jeffmaury.aiven.intellij.api.models.AccountTeamProjectAssociationUpdateRequestBody;
import com.jeffmaury.aiven.intellij.api.models.AccountTeamProjectAssociationUpdateResponse;
import com.jeffmaury.aiven.intellij.api.models.AccountTeamProjectDisassociateResponse;
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
 * Builds and executes requests for operations under /account/{account_id}/team/{team_id}/project/{project}
 */
public class WithProjectItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new WithProjectItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public WithProjectItemRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/account/{account_id}/team/{team_id}/project/{project}", pathParameters);
    }
    /**
     * Instantiates a new WithProjectItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public WithProjectItemRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/account/{account_id}/team/{team_id}/project/{project}", rawUrl);
    }
    /**
     * Disassociate team from a project
     * @return a CompletableFuture of AccountTeamProjectDisassociateResponse
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<AccountTeamProjectDisassociateResponse> delete() {
        try {
            final RequestInformation requestInfo = toDeleteRequestInformation(null);
            return this.requestAdapter.sendAsync(requestInfo, AccountTeamProjectDisassociateResponse::createFromDiscriminatorValue, null);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<AccountTeamProjectDisassociateResponse> executionException = new java.util.concurrent.CompletableFuture<AccountTeamProjectDisassociateResponse>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Disassociate team from a project
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of AccountTeamProjectDisassociateResponse
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<AccountTeamProjectDisassociateResponse> delete(@javax.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
            return this.requestAdapter.sendAsync(requestInfo, AccountTeamProjectDisassociateResponse::createFromDiscriminatorValue, null);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<AccountTeamProjectDisassociateResponse> executionException = new java.util.concurrent.CompletableFuture<AccountTeamProjectDisassociateResponse>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Associate team to a project
     * @param body AccountTeamProjectAssociateRequestBody
     * @return a CompletableFuture of AccountTeamProjectAssociateResponse
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<AccountTeamProjectAssociateResponse> post(@javax.annotation.Nonnull final AccountTeamProjectAssociateRequestBody body) {
        try {
            final RequestInformation requestInfo = toPostRequestInformation(body, null);
            return this.requestAdapter.sendAsync(requestInfo, AccountTeamProjectAssociateResponse::createFromDiscriminatorValue, null);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<AccountTeamProjectAssociateResponse> executionException = new java.util.concurrent.CompletableFuture<AccountTeamProjectAssociateResponse>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Associate team to a project
     * @param body AccountTeamProjectAssociateRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of AccountTeamProjectAssociateResponse
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<AccountTeamProjectAssociateResponse> post(@javax.annotation.Nonnull final AccountTeamProjectAssociateRequestBody body, @javax.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        try {
            final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
            return this.requestAdapter.sendAsync(requestInfo, AccountTeamProjectAssociateResponse::createFromDiscriminatorValue, null);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<AccountTeamProjectAssociateResponse> executionException = new java.util.concurrent.CompletableFuture<AccountTeamProjectAssociateResponse>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * <p>Use PATCH /organization/{organization_id}/user-groups/{user_group_id}</p>
     * @param body AccountTeamProjectAssociationUpdateRequestBody
     * @return a CompletableFuture of AccountTeamProjectAssociationUpdateResponse
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<AccountTeamProjectAssociationUpdateResponse> put(@javax.annotation.Nonnull final AccountTeamProjectAssociationUpdateRequestBody body) {
        try {
            final RequestInformation requestInfo = toPutRequestInformation(body, null);
            return this.requestAdapter.sendAsync(requestInfo, AccountTeamProjectAssociationUpdateResponse::createFromDiscriminatorValue, null);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<AccountTeamProjectAssociationUpdateResponse> executionException = new java.util.concurrent.CompletableFuture<AccountTeamProjectAssociationUpdateResponse>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * <p>Use PATCH /organization/{organization_id}/user-groups/{user_group_id}</p>
     * @param body AccountTeamProjectAssociationUpdateRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of AccountTeamProjectAssociationUpdateResponse
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<AccountTeamProjectAssociationUpdateResponse> put(@javax.annotation.Nonnull final AccountTeamProjectAssociationUpdateRequestBody body, @javax.annotation.Nullable final java.util.function.Consumer<PutRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        try {
            final RequestInformation requestInfo = toPutRequestInformation(body, requestConfiguration);
            return this.requestAdapter.sendAsync(requestInfo, AccountTeamProjectAssociationUpdateResponse::createFromDiscriminatorValue, null);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<AccountTeamProjectAssociationUpdateResponse> executionException = new java.util.concurrent.CompletableFuture<AccountTeamProjectAssociationUpdateResponse>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Disassociate team from a project
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() throws URISyntaxException {
        return toDeleteRequestInformation(null);
    }
    /**
     * Disassociate team from a project
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation();
        requestInfo.httpMethod = HttpMethod.DELETE;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.headers.add("Accept", "application/json");
        if (requestConfiguration != null) {
            final DeleteRequestConfiguration requestConfig = new DeleteRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Associate team to a project
     * @param body AccountTeamProjectAssociateRequestBody
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@javax.annotation.Nonnull final AccountTeamProjectAssociateRequestBody body) throws URISyntaxException {
        return toPostRequestInformation(body, null);
    }
    /**
     * Associate team to a project
     * @param body AccountTeamProjectAssociateRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@javax.annotation.Nonnull final AccountTeamProjectAssociateRequestBody body, @javax.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) throws URISyntaxException {
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
     * <p>Use PATCH /organization/{organization_id}/user-groups/{user_group_id}</p>
     * @param body AccountTeamProjectAssociationUpdateRequestBody
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPutRequestInformation(@javax.annotation.Nonnull final AccountTeamProjectAssociationUpdateRequestBody body) throws URISyntaxException {
        return toPutRequestInformation(body, null);
    }
    /**
     * <p>Use PATCH /organization/{organization_id}/user-groups/{user_group_id}</p>
     * @param body AccountTeamProjectAssociationUpdateRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPutRequestInformation(@javax.annotation.Nonnull final AccountTeamProjectAssociationUpdateRequestBody body, @javax.annotation.Nullable final java.util.function.Consumer<PutRequestConfiguration> requestConfiguration) throws URISyntaxException {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation();
        requestInfo.httpMethod = HttpMethod.PUT;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.headers.add("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        if (requestConfiguration != null) {
            final PutRequestConfiguration requestConfig = new PutRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    public class PutRequestConfiguration extends BaseRequestConfiguration {
    }
}
