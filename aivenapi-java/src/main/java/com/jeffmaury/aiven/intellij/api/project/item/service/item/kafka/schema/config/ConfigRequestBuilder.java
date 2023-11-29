package com.jeffmaury.aiven.intellij.api.project.item.service.item.kafka.schema.config;

import com.jeffmaury.aiven.intellij.api.models.ServiceSchemaRegistryGlobalConfigGetResponse;
import com.jeffmaury.aiven.intellij.api.models.ServiceSchemaRegistryGlobalConfigPutRequestBody;
import com.jeffmaury.aiven.intellij.api.models.ServiceSchemaRegistryGlobalConfigPutResponse;
import com.jeffmaury.aiven.intellij.api.project.item.service.item.kafka.schema.config.item.WithSubjectNameItemRequestBuilder;
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
 * Builds and executes requests for operations under /project/{project}/service/{service_name}/kafka/schema/config
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ConfigRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the com.jeffmaury.aiven.intellij.api.project.item.service.item.kafka.schema.config.item collection
     * @param subject_name Subject name
     * @return a WithSubjectNameItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public WithSubjectNameItemRequestBuilder bySubject_name(@jakarta.annotation.Nonnull final String subject_name) {
        Objects.requireNonNull(subject_name);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("subject_name", subject_name);
        return new WithSubjectNameItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new ConfigRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ConfigRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/service/{service_name}/kafka/schema/config", pathParameters);
    }
    /**
     * Instantiates a new ConfigRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ConfigRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/service/{service_name}/kafka/schema/config", rawUrl);
    }
    /**
     * Get global configuration for Schema Registry
     * @return a CompletableFuture of ServiceSchemaRegistryGlobalConfigGetResponse
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ServiceSchemaRegistryGlobalConfigGetResponse> get() {
        return get(null);
    }
    /**
     * Get global configuration for Schema Registry
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of ServiceSchemaRegistryGlobalConfigGetResponse
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ServiceSchemaRegistryGlobalConfigGetResponse> get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.sendAsync(requestInfo, ServiceSchemaRegistryGlobalConfigGetResponse::createFromDiscriminatorValue, null);
    }
    /**
     * Edit global configuration for Schema Registry
     * @param body ServiceSchemaRegistryGlobalConfigPutRequestBody
     * @return a CompletableFuture of ServiceSchemaRegistryGlobalConfigPutResponse
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ServiceSchemaRegistryGlobalConfigPutResponse> put(@jakarta.annotation.Nonnull final ServiceSchemaRegistryGlobalConfigPutRequestBody body) {
        return put(body, null);
    }
    /**
     * Edit global configuration for Schema Registry
     * @param body ServiceSchemaRegistryGlobalConfigPutRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of ServiceSchemaRegistryGlobalConfigPutResponse
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ServiceSchemaRegistryGlobalConfigPutResponse> put(@jakarta.annotation.Nonnull final ServiceSchemaRegistryGlobalConfigPutRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PutRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPutRequestInformation(body, requestConfiguration);
        return this.requestAdapter.sendAsync(requestInfo, ServiceSchemaRegistryGlobalConfigPutResponse::createFromDiscriminatorValue, null);
    }
    /**
     * Get global configuration for Schema Registry
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Get global configuration for Schema Registry
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
     * Edit global configuration for Schema Registry
     * @param body ServiceSchemaRegistryGlobalConfigPutRequestBody
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPutRequestInformation(@jakarta.annotation.Nonnull final ServiceSchemaRegistryGlobalConfigPutRequestBody body) {
        return toPutRequestInformation(body, null);
    }
    /**
     * Edit global configuration for Schema Registry
     * @param body ServiceSchemaRegistryGlobalConfigPutRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPutRequestInformation(@jakarta.annotation.Nonnull final ServiceSchemaRegistryGlobalConfigPutRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PutRequestConfiguration> requestConfiguration) {
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
     * @return a ConfigRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public ConfigRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new ConfigRequestBuilder(rawUrl, requestAdapter);
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
