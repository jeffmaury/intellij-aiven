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
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /project/{project}/user/{user_email}
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WithUserEmailItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new WithUser_emailItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithUserEmailItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/user/{user_email}", pathParameters);
    }
    /**
     * Instantiates a new WithUser_emailItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithUserEmailItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/user/{user_email}", rawUrl);
    }
    /**
     * Remove user from the project
     * @return a CompletableFuture of ProjectUserRemoveResponse
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ProjectUserRemoveResponse> delete() {
        return delete(null);
    }
    /**
     * Remove user from the project
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of ProjectUserRemoveResponse
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ProjectUserRemoveResponse> delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
        return this.requestAdapter.sendAsync(requestInfo, ProjectUserRemoveResponse::createFromDiscriminatorValue, null);
    }
    /**
     * Update a project user
     * @param body ProjectUserUpdateRequestBody
     * @return a CompletableFuture of ProjectUserUpdateResponse
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ProjectUserUpdateResponse> put(@jakarta.annotation.Nonnull final ProjectUserUpdateRequestBody body) {
        return put(body, null);
    }
    /**
     * Update a project user
     * @param body ProjectUserUpdateRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of ProjectUserUpdateResponse
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ProjectUserUpdateResponse> put(@jakarta.annotation.Nonnull final ProjectUserUpdateRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PutRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPutRequestInformation(body, requestConfiguration);
        return this.requestAdapter.sendAsync(requestInfo, ProjectUserUpdateResponse::createFromDiscriminatorValue, null);
    }
    /**
     * Remove user from the project
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Remove user from the project
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation();
        if (requestConfiguration != null) {
            final DeleteRequestConfiguration requestConfig = new DeleteRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        requestInfo.httpMethod = HttpMethod.DELETE;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Update a project user
     * @param body ProjectUserUpdateRequestBody
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPutRequestInformation(@jakarta.annotation.Nonnull final ProjectUserUpdateRequestBody body) {
        return toPutRequestInformation(body, null);
    }
    /**
     * Update a project user
     * @param body ProjectUserUpdateRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPutRequestInformation(@jakarta.annotation.Nonnull final ProjectUserUpdateRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PutRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation();
        if (requestConfiguration != null) {
            final PutRequestConfiguration requestConfig = new PutRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        requestInfo.httpMethod = HttpMethod.PUT;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a WithUserEmailItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public WithUserEmailItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new WithUserEmailItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PutRequestConfiguration extends BaseRequestConfiguration {
    }
}
