package com.jeffmaury.aiven.intellij.api.project.item.service.item.kafka.schema.subjects.item.versions.version_idlatest.d_plus.item;

import com.jeffmaury.aiven.intellij.api.models.ServiceSchemaRegistrySubjectVersionDeleteResponse;
import com.jeffmaury.aiven.intellij.api.models.ServiceSchemaRegistrySubjectVersionGetResponse;
import com.jeffmaury.aiven.intellij.api.project.item.service.item.kafka.schema.subjects.item.versions.version_idlatest.d_plus.schema.SchemaRequestBuilder;
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
 * Builds and executes requests for operations under /project/{project}/service/{service_name}/kafka/schema/subjects/{subject_name}/versions/{version_id:latest|/d+}
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class VersionIdLatestDPlusItemRequestBuilder extends BaseRequestBuilder {
    /**
     * The schema property
     */
    @jakarta.annotation.Nonnull
    public SchemaRequestBuilder schema() {
        return new SchemaRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new Version_idLatestD_plus_ItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public VersionIdLatestDPlusItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/service/{service_name}/kafka/schema/subjects/{subject_name}/versions/{version_id%3Alatest%7C%2Fd%2B}", pathParameters);
    }
    /**
     * Instantiates a new Version_idLatestD_plus_ItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public VersionIdLatestDPlusItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/service/{service_name}/kafka/schema/subjects/{subject_name}/versions/{version_id%3Alatest%7C%2Fd%2B}", rawUrl);
    }
    /**
     * Delete Schema Registry subject version
     * @return a CompletableFuture of ServiceSchemaRegistrySubjectVersionDeleteResponse
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ServiceSchemaRegistrySubjectVersionDeleteResponse> delete() {
        return delete(null);
    }
    /**
     * Delete Schema Registry subject version
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of ServiceSchemaRegistrySubjectVersionDeleteResponse
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ServiceSchemaRegistrySubjectVersionDeleteResponse> delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
        return this.requestAdapter.sendAsync(requestInfo, ServiceSchemaRegistrySubjectVersionDeleteResponse::createFromDiscriminatorValue, null);
    }
    /**
     * Get Schema Registry Subject version
     * @return a CompletableFuture of ServiceSchemaRegistrySubjectVersionGetResponse
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ServiceSchemaRegistrySubjectVersionGetResponse> get() {
        return get(null);
    }
    /**
     * Get Schema Registry Subject version
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of ServiceSchemaRegistrySubjectVersionGetResponse
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ServiceSchemaRegistrySubjectVersionGetResponse> get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.sendAsync(requestInfo, ServiceSchemaRegistrySubjectVersionGetResponse::createFromDiscriminatorValue, null);
    }
    /**
     * Delete Schema Registry subject version
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete Schema Registry subject version
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
     * Get Schema Registry Subject version
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Get Schema Registry Subject version
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
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a VersionIdLatestDPlusItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public VersionIdLatestDPlusItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new VersionIdLatestDPlusItemRequestBuilder(rawUrl, requestAdapter);
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
    public class GetRequestConfiguration extends BaseRequestConfiguration {
    }
}
