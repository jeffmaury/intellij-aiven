package com.jeffmaury.aiven.intellij.api.project.item.tags;

import com.jeffmaury.aiven.intellij.api.models.ProjectTagsListResponse;
import com.jeffmaury.aiven.intellij.api.models.ProjectTagsReplaceRequestBody;
import com.jeffmaury.aiven.intellij.api.models.ProjectTagsReplaceResponse;
import com.jeffmaury.aiven.intellij.api.models.ProjectTagsUpdateRequestBody;
import com.jeffmaury.aiven.intellij.api.models.ProjectTagsUpdateResponse;
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
 * Builds and executes requests for operations under /project/{project}/tags
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TagsRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new TagsRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public TagsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/tags", pathParameters);
    }
    /**
     * Instantiates a new TagsRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public TagsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/tags", rawUrl);
    }
    /**
     * List all tags attached to this project
     * @return a ProjectTagsListResponse
     */
    @jakarta.annotation.Nullable
    public ProjectTagsListResponse get() {
        return get(null);
    }
    /**
     * List all tags attached to this project
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a ProjectTagsListResponse
     */
    @jakarta.annotation.Nullable
    public ProjectTagsListResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, ProjectTagsListResponse::createFromDiscriminatorValue);
    }
    /**
     * Update one or more tags, creating ones that don't exist, and deleting ones given NULL value
     * @param body ProjectTagsUpdateRequestBody
     * @return a ProjectTagsUpdateResponse
     */
    @jakarta.annotation.Nullable
    public ProjectTagsUpdateResponse patch(@jakarta.annotation.Nonnull final ProjectTagsUpdateRequestBody body) {
        return patch(body, null);
    }
    /**
     * Update one or more tags, creating ones that don't exist, and deleting ones given NULL value
     * @param body ProjectTagsUpdateRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a ProjectTagsUpdateResponse
     */
    @jakarta.annotation.Nullable
    public ProjectTagsUpdateResponse patch(@jakarta.annotation.Nonnull final ProjectTagsUpdateRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, ProjectTagsUpdateResponse::createFromDiscriminatorValue);
    }
    /**
     * Replace all project tags with a new set of tags, deleting old ones
     * @param body ProjectTagsReplaceRequestBody
     * @return a ProjectTagsReplaceResponse
     */
    @jakarta.annotation.Nullable
    public ProjectTagsReplaceResponse put(@jakarta.annotation.Nonnull final ProjectTagsReplaceRequestBody body) {
        return put(body, null);
    }
    /**
     * Replace all project tags with a new set of tags, deleting old ones
     * @param body ProjectTagsReplaceRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a ProjectTagsReplaceResponse
     */
    @jakarta.annotation.Nullable
    public ProjectTagsReplaceResponse put(@jakarta.annotation.Nonnull final ProjectTagsReplaceRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PutRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPutRequestInformation(body, requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, ProjectTagsReplaceResponse::createFromDiscriminatorValue);
    }
    /**
     * List all tags attached to this project
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * List all tags attached to this project
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
     * Update one or more tags, creating ones that don't exist, and deleting ones given NULL value
     * @param body ProjectTagsUpdateRequestBody
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final ProjectTagsUpdateRequestBody body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update one or more tags, creating ones that don't exist, and deleting ones given NULL value
     * @param body ProjectTagsUpdateRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final ProjectTagsUpdateRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.PATCH, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PatchRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Replace all project tags with a new set of tags, deleting old ones
     * @param body ProjectTagsReplaceRequestBody
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPutRequestInformation(@jakarta.annotation.Nonnull final ProjectTagsReplaceRequestBody body) {
        return toPutRequestInformation(body, null);
    }
    /**
     * Replace all project tags with a new set of tags, deleting old ones
     * @param body ProjectTagsReplaceRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPutRequestInformation(@jakarta.annotation.Nonnull final ProjectTagsReplaceRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PutRequestConfiguration> requestConfiguration) {
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
     * @return a TagsRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public TagsRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new TagsRequestBuilder(rawUrl, requestAdapter);
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
    public class PatchRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PutRequestConfiguration extends BaseRequestConfiguration {
    }
}
