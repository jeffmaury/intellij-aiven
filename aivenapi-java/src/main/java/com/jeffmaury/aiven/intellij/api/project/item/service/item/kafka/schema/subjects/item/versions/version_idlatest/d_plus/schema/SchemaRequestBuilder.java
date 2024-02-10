package com.jeffmaury.aiven.intellij.api.project.item.service.item.kafka.schema.subjects.item.versions.version_idlatest.d_plus.schema;

import com.jeffmaury.aiven.intellij.api.models.ServiceSchemaRegistrySubjectVersionSchemaGetResponse;
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
 * Builds and executes requests for operations under /project/{project}/service/{service_name}/kafka/schema/subjects/{subject_name}/versions/{version_id:latest|/d+}/schema
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SchemaRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new SchemaRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public SchemaRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/service/{service_name}/kafka/schema/subjects/{subject_name}/versions/{version_id%3Alatest%7C%2Fd%2B}/schema", pathParameters);
    }
    /**
     * Instantiates a new SchemaRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public SchemaRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/service/{service_name}/kafka/schema/subjects/{subject_name}/versions/{version_id%3Alatest%7C%2Fd%2B}/schema", rawUrl);
    }
    /**
     * DEPRECATED: Get raw schema of a specific version in Schema Registry
     * @return a ServiceSchemaRegistrySubjectVersionSchemaGetResponse
     * @deprecated
     * 
     */
    @jakarta.annotation.Nullable
    @Deprecated
    public ServiceSchemaRegistrySubjectVersionSchemaGetResponse get() {
        return get(null);
    }
    /**
     * DEPRECATED: Get raw schema of a specific version in Schema Registry
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a ServiceSchemaRegistrySubjectVersionSchemaGetResponse
     * @deprecated
     * 
     */
    @jakarta.annotation.Nullable
    @Deprecated
    public ServiceSchemaRegistrySubjectVersionSchemaGetResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, ServiceSchemaRegistrySubjectVersionSchemaGetResponse::createFromDiscriminatorValue);
    }
    /**
     * DEPRECATED: Get raw schema of a specific version in Schema Registry
     * @return a RequestInformation
     * @deprecated
     * 
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * DEPRECATED: Get raw schema of a specific version in Schema Registry
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     * @deprecated
     * 
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.GET, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, GetRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a SchemaRequestBuilder
     * @deprecated
     * 
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public SchemaRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new SchemaRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
    }
}
