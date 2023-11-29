package com.jeffmaury.aiven.intellij.api.project.item.user.item;

import com.jeffmaury.aiven.intellij.api.models.ProjectUserRemoveResponse;
import com.jeffmaury.aiven.intellij.api.models.ProjectUserUpdateRequestBody;
import com.jeffmaury.aiven.intellij.api.models.ProjectUserUpdateResponse;
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
 * Builds and executes requests for operations under /project/{project}/user/{user_email}
 */
public class WithUserEmailItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new WithUser_emailItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public WithUserEmailItemRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/user/{user_email}", pathParameters);
    }
    /**
     * Instantiates a new WithUser_emailItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public WithUserEmailItemRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/user/{user_email}", rawUrl);
    }
    /**
     * Remove user from the project
     * @return a CompletableFuture of ProjectUserRemoveResponse
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ProjectUserRemoveResponse> delete() {
        try {
            final RequestInformation requestInfo = toDeleteRequestInformation(null);
            return this.requestAdapter.sendAsync(requestInfo, ProjectUserRemoveResponse::createFromDiscriminatorValue, null);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<ProjectUserRemoveResponse> executionException = new java.util.concurrent.CompletableFuture<ProjectUserRemoveResponse>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Remove user from the project
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of ProjectUserRemoveResponse
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ProjectUserRemoveResponse> delete(@javax.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
            return this.requestAdapter.sendAsync(requestInfo, ProjectUserRemoveResponse::createFromDiscriminatorValue, null);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<ProjectUserRemoveResponse> executionException = new java.util.concurrent.CompletableFuture<ProjectUserRemoveResponse>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Update a project user
     * @param body ProjectUserUpdateRequestBody
     * @return a CompletableFuture of ProjectUserUpdateResponse
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ProjectUserUpdateResponse> put(@javax.annotation.Nonnull final ProjectUserUpdateRequestBody body) {
        try {
            final RequestInformation requestInfo = toPutRequestInformation(body, null);
            return this.requestAdapter.sendAsync(requestInfo, ProjectUserUpdateResponse::createFromDiscriminatorValue, null);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<ProjectUserUpdateResponse> executionException = new java.util.concurrent.CompletableFuture<ProjectUserUpdateResponse>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Update a project user
     * @param body ProjectUserUpdateRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of ProjectUserUpdateResponse
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ProjectUserUpdateResponse> put(@javax.annotation.Nonnull final ProjectUserUpdateRequestBody body, @javax.annotation.Nullable final java.util.function.Consumer<PutRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        try {
            final RequestInformation requestInfo = toPutRequestInformation(body, requestConfiguration);
            return this.requestAdapter.sendAsync(requestInfo, ProjectUserUpdateResponse::createFromDiscriminatorValue, null);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<ProjectUserUpdateResponse> executionException = new java.util.concurrent.CompletableFuture<ProjectUserUpdateResponse>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Remove user from the project
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() throws URISyntaxException {
        return toDeleteRequestInformation(null);
    }
    /**
     * Remove user from the project
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
     * Update a project user
     * @param body ProjectUserUpdateRequestBody
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPutRequestInformation(@javax.annotation.Nonnull final ProjectUserUpdateRequestBody body) throws URISyntaxException {
        return toPutRequestInformation(body, null);
    }
    /**
     * Update a project user
     * @param body ProjectUserUpdateRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPutRequestInformation(@javax.annotation.Nonnull final ProjectUserUpdateRequestBody body, @javax.annotation.Nullable final java.util.function.Consumer<PutRequestConfiguration> requestConfiguration) throws URISyntaxException {
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
    public class PutRequestConfiguration extends BaseRequestConfiguration {
    }
}
