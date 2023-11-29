package com.jeffmaury.aiven.intellij.api.project.item.service.item.kafka.schema.subjects.item.versions;

import com.jeffmaury.aiven.intellij.api.models.ServiceSchemaRegistrySubjectVersionPostRequestBody;
import com.jeffmaury.aiven.intellij.api.models.ServiceSchemaRegistrySubjectVersionPostResponse;
import com.jeffmaury.aiven.intellij.api.models.ServiceSchemaRegistrySubjectVersionsGetResponse;
import com.jeffmaury.aiven.intellij.api.project.item.service.item.kafka.schema.subjects.item.versions.version_idlatest.d_plus.item.VersionIdLatestDPlusItemRequestBuilder;
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
 * Builds and executes requests for operations under /project/{project}/service/{service_name}/kafka/schema/subjects/{subject_name}/versions
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class VersionsRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the com.jeffmaury.aiven.intellij.api.project.item.service.item.kafka.schema.subjects.item.versions.Version_idLatest.d_plus collection
     * @param version_idLatestD_plus Unique identifier of the item
     * @return a VersionIdLatestDPlusItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public VersionIdLatestDPlusItemRequestBuilder byVersion_idLatestD_plus(@jakarta.annotation.Nonnull final String version_idLatestD_plus) {
        Objects.requireNonNull(version_idLatestD_plus);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("version_id%3Alatest%7C%5Cd%2B", version_idLatestD_plus);
        return new VersionIdLatestDPlusItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new VersionsRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public VersionsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/service/{service_name}/kafka/schema/subjects/{subject_name}/versions", pathParameters);
    }
    /**
     * Instantiates a new VersionsRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public VersionsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/service/{service_name}/kafka/schema/subjects/{subject_name}/versions", rawUrl);
    }
    /**
     * Get Schema Registry subject versions
     * @return a CompletableFuture of ServiceSchemaRegistrySubjectVersionsGetResponse
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ServiceSchemaRegistrySubjectVersionsGetResponse> get() {
        return get(null);
    }
    /**
     * Get Schema Registry subject versions
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of ServiceSchemaRegistrySubjectVersionsGetResponse
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ServiceSchemaRegistrySubjectVersionsGetResponse> get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.sendAsync(requestInfo, ServiceSchemaRegistrySubjectVersionsGetResponse::createFromDiscriminatorValue, null);
    }
    /**
     * Register a new Schema in Schema Registry
     * @param body ServiceSchemaRegistrySubjectVersionPostRequestBody
     * @return a CompletableFuture of ServiceSchemaRegistrySubjectVersionPostResponse
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ServiceSchemaRegistrySubjectVersionPostResponse> post(@jakarta.annotation.Nonnull final ServiceSchemaRegistrySubjectVersionPostRequestBody body) {
        return post(body, null);
    }
    /**
     * Register a new Schema in Schema Registry
     * @param body ServiceSchemaRegistrySubjectVersionPostRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of ServiceSchemaRegistrySubjectVersionPostResponse
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ServiceSchemaRegistrySubjectVersionPostResponse> post(@jakarta.annotation.Nonnull final ServiceSchemaRegistrySubjectVersionPostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        return this.requestAdapter.sendAsync(requestInfo, ServiceSchemaRegistrySubjectVersionPostResponse::createFromDiscriminatorValue, null);
    }
    /**
     * Get Schema Registry subject versions
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Get Schema Registry subject versions
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
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
     * Register a new Schema in Schema Registry
     * @param body ServiceSchemaRegistrySubjectVersionPostRequestBody
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final ServiceSchemaRegistrySubjectVersionPostRequestBody body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Register a new Schema in Schema Registry
     * @param body ServiceSchemaRegistrySubjectVersionPostRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final ServiceSchemaRegistrySubjectVersionPostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation();
        if (requestConfiguration != null) {
            final PostRequestConfiguration requestConfig = new PostRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        requestInfo.httpMethod = HttpMethod.POST;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a VersionsRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public VersionsRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new VersionsRequestBuilder(rawUrl, requestAdapter);
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
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
