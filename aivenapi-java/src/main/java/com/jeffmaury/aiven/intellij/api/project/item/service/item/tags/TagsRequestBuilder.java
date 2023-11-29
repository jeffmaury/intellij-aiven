package com.jeffmaury.aiven.intellij.api.project.item.service.item.tags;

import com.jeffmaury.aiven.intellij.api.models.ProjectServiceTagsListResponse;
import com.jeffmaury.aiven.intellij.api.models.ProjectServiceTagsReplaceRequestBody;
import com.jeffmaury.aiven.intellij.api.models.ProjectServiceTagsReplaceResponse;
import com.jeffmaury.aiven.intellij.api.models.ProjectServiceTagsUpdateRequestBody;
import com.jeffmaury.aiven.intellij.api.models.ProjectServiceTagsUpdateResponse;
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
 * Builds and executes requests for operations under /project/{project}/service/{service_name}/tags
 */
public class TagsRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new TagsRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public TagsRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/service/{service_name}/tags", pathParameters);
    }
    /**
     * Instantiates a new TagsRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public TagsRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/service/{service_name}/tags", rawUrl);
    }
    /**
     * List all tags attached to the service
     * @return a CompletableFuture of ProjectServiceTagsListResponse
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ProjectServiceTagsListResponse> get() {
        try {
            final RequestInformation requestInfo = toGetRequestInformation(null);
            return this.requestAdapter.sendAsync(requestInfo, ProjectServiceTagsListResponse::createFromDiscriminatorValue, null);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<ProjectServiceTagsListResponse> executionException = new java.util.concurrent.CompletableFuture<ProjectServiceTagsListResponse>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * List all tags attached to the service
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of ProjectServiceTagsListResponse
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ProjectServiceTagsListResponse> get(@javax.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
            return this.requestAdapter.sendAsync(requestInfo, ProjectServiceTagsListResponse::createFromDiscriminatorValue, null);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<ProjectServiceTagsListResponse> executionException = new java.util.concurrent.CompletableFuture<ProjectServiceTagsListResponse>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Update one or more tags, creating ones that don't exist, and deleting ones given NULL value
     * @param body ProjectServiceTagsUpdateRequestBody
     * @return a CompletableFuture of ProjectServiceTagsUpdateResponse
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ProjectServiceTagsUpdateResponse> patch(@javax.annotation.Nonnull final ProjectServiceTagsUpdateRequestBody body) {
        try {
            final RequestInformation requestInfo = toPatchRequestInformation(body, null);
            return this.requestAdapter.sendAsync(requestInfo, ProjectServiceTagsUpdateResponse::createFromDiscriminatorValue, null);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<ProjectServiceTagsUpdateResponse> executionException = new java.util.concurrent.CompletableFuture<ProjectServiceTagsUpdateResponse>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Update one or more tags, creating ones that don't exist, and deleting ones given NULL value
     * @param body ProjectServiceTagsUpdateRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of ProjectServiceTagsUpdateResponse
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ProjectServiceTagsUpdateResponse> patch(@javax.annotation.Nonnull final ProjectServiceTagsUpdateRequestBody body, @javax.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        try {
            final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
            return this.requestAdapter.sendAsync(requestInfo, ProjectServiceTagsUpdateResponse::createFromDiscriminatorValue, null);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<ProjectServiceTagsUpdateResponse> executionException = new java.util.concurrent.CompletableFuture<ProjectServiceTagsUpdateResponse>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Replace all project tags with a new set of tags, deleting old ones
     * @param body ProjectServiceTagsReplaceRequestBody
     * @return a CompletableFuture of ProjectServiceTagsReplaceResponse
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ProjectServiceTagsReplaceResponse> put(@javax.annotation.Nonnull final ProjectServiceTagsReplaceRequestBody body) {
        try {
            final RequestInformation requestInfo = toPutRequestInformation(body, null);
            return this.requestAdapter.sendAsync(requestInfo, ProjectServiceTagsReplaceResponse::createFromDiscriminatorValue, null);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<ProjectServiceTagsReplaceResponse> executionException = new java.util.concurrent.CompletableFuture<ProjectServiceTagsReplaceResponse>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Replace all project tags with a new set of tags, deleting old ones
     * @param body ProjectServiceTagsReplaceRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of ProjectServiceTagsReplaceResponse
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ProjectServiceTagsReplaceResponse> put(@javax.annotation.Nonnull final ProjectServiceTagsReplaceRequestBody body, @javax.annotation.Nullable final java.util.function.Consumer<PutRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        try {
            final RequestInformation requestInfo = toPutRequestInformation(body, requestConfiguration);
            return this.requestAdapter.sendAsync(requestInfo, ProjectServiceTagsReplaceResponse::createFromDiscriminatorValue, null);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<ProjectServiceTagsReplaceResponse> executionException = new java.util.concurrent.CompletableFuture<ProjectServiceTagsReplaceResponse>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * List all tags attached to the service
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toGetRequestInformation() throws URISyntaxException {
        return toGetRequestInformation(null);
    }
    /**
     * List all tags attached to the service
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
     * Update one or more tags, creating ones that don't exist, and deleting ones given NULL value
     * @param body ProjectServiceTagsUpdateRequestBody
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@javax.annotation.Nonnull final ProjectServiceTagsUpdateRequestBody body) throws URISyntaxException {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update one or more tags, creating ones that don't exist, and deleting ones given NULL value
     * @param body ProjectServiceTagsUpdateRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@javax.annotation.Nonnull final ProjectServiceTagsUpdateRequestBody body, @javax.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) throws URISyntaxException {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation();
        requestInfo.httpMethod = HttpMethod.PATCH;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.headers.add("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        if (requestConfiguration != null) {
            final PatchRequestConfiguration requestConfig = new PatchRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Replace all project tags with a new set of tags, deleting old ones
     * @param body ProjectServiceTagsReplaceRequestBody
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPutRequestInformation(@javax.annotation.Nonnull final ProjectServiceTagsReplaceRequestBody body) throws URISyntaxException {
        return toPutRequestInformation(body, null);
    }
    /**
     * Replace all project tags with a new set of tags, deleting old ones
     * @param body ProjectServiceTagsReplaceRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPutRequestInformation(@javax.annotation.Nonnull final ProjectServiceTagsReplaceRequestBody body, @javax.annotation.Nullable final java.util.function.Consumer<PutRequestConfiguration> requestConfiguration) throws URISyntaxException {
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
    public class GetRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    public class PatchRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    public class PutRequestConfiguration extends BaseRequestConfiguration {
    }
}
