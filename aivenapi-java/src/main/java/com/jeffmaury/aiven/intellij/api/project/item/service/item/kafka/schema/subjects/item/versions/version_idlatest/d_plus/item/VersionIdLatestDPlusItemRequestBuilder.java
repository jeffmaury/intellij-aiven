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
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /project/{project}/service/{service_name}/kafka/schema/subjects/{subject_name}/versions/{version_id:latest|/d+}
 */
public class VersionIdLatestDPlusItemRequestBuilder extends BaseRequestBuilder {
    /** The schema property */
    @javax.annotation.Nonnull
    public SchemaRequestBuilder schema() {
        return new SchemaRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new Version_idLatestD_plus_ItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public VersionIdLatestDPlusItemRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/service/{service_name}/kafka/schema/subjects/{subject_name}/versions/{version_id%3Alatest%7C%2Fd%2B}", pathParameters);
    }
    /**
     * Instantiates a new Version_idLatestD_plus_ItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public VersionIdLatestDPlusItemRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/service/{service_name}/kafka/schema/subjects/{subject_name}/versions/{version_id%3Alatest%7C%2Fd%2B}", rawUrl);
    }
    /**
     * Delete Schema Registry subject version
     * @return a CompletableFuture of ServiceSchemaRegistrySubjectVersionDeleteResponse
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ServiceSchemaRegistrySubjectVersionDeleteResponse> delete() {
        try {
            final RequestInformation requestInfo = toDeleteRequestInformation(null);
            return this.requestAdapter.sendAsync(requestInfo, ServiceSchemaRegistrySubjectVersionDeleteResponse::createFromDiscriminatorValue, null);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<ServiceSchemaRegistrySubjectVersionDeleteResponse> executionException = new java.util.concurrent.CompletableFuture<ServiceSchemaRegistrySubjectVersionDeleteResponse>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Delete Schema Registry subject version
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of ServiceSchemaRegistrySubjectVersionDeleteResponse
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ServiceSchemaRegistrySubjectVersionDeleteResponse> delete(@javax.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
            return this.requestAdapter.sendAsync(requestInfo, ServiceSchemaRegistrySubjectVersionDeleteResponse::createFromDiscriminatorValue, null);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<ServiceSchemaRegistrySubjectVersionDeleteResponse> executionException = new java.util.concurrent.CompletableFuture<ServiceSchemaRegistrySubjectVersionDeleteResponse>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Get Schema Registry Subject version
     * @return a CompletableFuture of ServiceSchemaRegistrySubjectVersionGetResponse
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ServiceSchemaRegistrySubjectVersionGetResponse> get() {
        try {
            final RequestInformation requestInfo = toGetRequestInformation(null);
            return this.requestAdapter.sendAsync(requestInfo, ServiceSchemaRegistrySubjectVersionGetResponse::createFromDiscriminatorValue, null);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<ServiceSchemaRegistrySubjectVersionGetResponse> executionException = new java.util.concurrent.CompletableFuture<ServiceSchemaRegistrySubjectVersionGetResponse>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Get Schema Registry Subject version
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of ServiceSchemaRegistrySubjectVersionGetResponse
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ServiceSchemaRegistrySubjectVersionGetResponse> get(@javax.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
            return this.requestAdapter.sendAsync(requestInfo, ServiceSchemaRegistrySubjectVersionGetResponse::createFromDiscriminatorValue, null);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<ServiceSchemaRegistrySubjectVersionGetResponse> executionException = new java.util.concurrent.CompletableFuture<ServiceSchemaRegistrySubjectVersionGetResponse>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Delete Schema Registry subject version
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() throws URISyntaxException {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete Schema Registry subject version
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
     * Get Schema Registry Subject version
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toGetRequestInformation() throws URISyntaxException {
        return toGetRequestInformation(null);
    }
    /**
     * Get Schema Registry Subject version
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
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    public class GetRequestConfiguration extends BaseRequestConfiguration {
    }
}
