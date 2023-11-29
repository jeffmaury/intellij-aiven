package com.jeffmaury.aiven.intellij.api.project.item.service.item.kafka.schema.config.item;

import com.jeffmaury.aiven.intellij.api.models.ServiceSchemaRegistrySubjectConfigGetResponse;
import com.jeffmaury.aiven.intellij.api.models.ServiceSchemaRegistrySubjectConfigPutRequestBody;
import com.jeffmaury.aiven.intellij.api.models.ServiceSchemaRegistrySubjectConfigPutResponse;
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
 * Builds and executes requests for operations under /project/{project}/service/{service_name}/kafka/schema/config/{subject_name}
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WithSubjectNameItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new WithSubject_nameItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithSubjectNameItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/service/{service_name}/kafka/schema/config/{subject_name}", pathParameters);
    }
    /**
     * Instantiates a new WithSubject_nameItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithSubjectNameItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/service/{service_name}/kafka/schema/config/{subject_name}", rawUrl);
    }
    /**
     * Get configuration for Schema Registry subject
     * @return a CompletableFuture of ServiceSchemaRegistrySubjectConfigGetResponse
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ServiceSchemaRegistrySubjectConfigGetResponse> get() {
        return get(null);
    }
    /**
     * Get configuration for Schema Registry subject
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of ServiceSchemaRegistrySubjectConfigGetResponse
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ServiceSchemaRegistrySubjectConfigGetResponse> get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.sendAsync(requestInfo, ServiceSchemaRegistrySubjectConfigGetResponse::createFromDiscriminatorValue, null);
    }
    /**
     * Edit configuration for Schema Registry subject
     * @param body ServiceSchemaRegistrySubjectConfigPutRequestBody
     * @return a CompletableFuture of ServiceSchemaRegistrySubjectConfigPutResponse
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ServiceSchemaRegistrySubjectConfigPutResponse> put(@jakarta.annotation.Nonnull final ServiceSchemaRegistrySubjectConfigPutRequestBody body) {
        return put(body, null);
    }
    /**
     * Edit configuration for Schema Registry subject
     * @param body ServiceSchemaRegistrySubjectConfigPutRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of ServiceSchemaRegistrySubjectConfigPutResponse
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ServiceSchemaRegistrySubjectConfigPutResponse> put(@jakarta.annotation.Nonnull final ServiceSchemaRegistrySubjectConfigPutRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PutRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPutRequestInformation(body, requestConfiguration);
        return this.requestAdapter.sendAsync(requestInfo, ServiceSchemaRegistrySubjectConfigPutResponse::createFromDiscriminatorValue, null);
    }
    /**
     * Get configuration for Schema Registry subject
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Get configuration for Schema Registry subject
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
     * Edit configuration for Schema Registry subject
     * @param body ServiceSchemaRegistrySubjectConfigPutRequestBody
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPutRequestInformation(@jakarta.annotation.Nonnull final ServiceSchemaRegistrySubjectConfigPutRequestBody body) {
        return toPutRequestInformation(body, null);
    }
    /**
     * Edit configuration for Schema Registry subject
     * @param body ServiceSchemaRegistrySubjectConfigPutRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPutRequestInformation(@jakarta.annotation.Nonnull final ServiceSchemaRegistrySubjectConfigPutRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PutRequestConfiguration> requestConfiguration) {
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
     * @return a WithSubjectNameItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public WithSubjectNameItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new WithSubjectNameItemRequestBuilder(rawUrl, requestAdapter);
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
    public class PutRequestConfiguration extends BaseRequestConfiguration {
    }
}
