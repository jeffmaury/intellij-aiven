package com.jeffmaury.aiven.intellij.api.project.item.service.item.kafka.schema.compatibility.subjects.item.versions.version_idlatest.d_plus.item;

import com.jeffmaury.aiven.intellij.api.models.ServiceSchemaRegistryCompatibilityRequestBody;
import com.jeffmaury.aiven.intellij.api.models.ServiceSchemaRegistryCompatibilityResponse;
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
 * Builds and executes requests for operations under /project/{project}/service/{service_name}/kafka/schema/compatibility/subjects/{subject_name}/versions/{version_id:latest|/d+}
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class VersionIdLatestDPlusItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new Version_idLatestD_plus_ItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public VersionIdLatestDPlusItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/service/{service_name}/kafka/schema/compatibility/subjects/{subject_name}/versions/{version_id%3Alatest%7C%2Fd%2B}", pathParameters);
    }
    /**
     * Instantiates a new Version_idLatestD_plus_ItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public VersionIdLatestDPlusItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/service/{service_name}/kafka/schema/compatibility/subjects/{subject_name}/versions/{version_id%3Alatest%7C%2Fd%2B}", rawUrl);
    }
    /**
     * Check compatibility of schema in Schema Registry
     * @param body ServiceSchemaRegistryCompatibilityRequestBody
     * @return a ServiceSchemaRegistryCompatibilityResponse
     */
    @jakarta.annotation.Nullable
    public ServiceSchemaRegistryCompatibilityResponse post(@jakarta.annotation.Nonnull final ServiceSchemaRegistryCompatibilityRequestBody body) {
        return post(body, null);
    }
    /**
     * Check compatibility of schema in Schema Registry
     * @param body ServiceSchemaRegistryCompatibilityRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a ServiceSchemaRegistryCompatibilityResponse
     */
    @jakarta.annotation.Nullable
    public ServiceSchemaRegistryCompatibilityResponse post(@jakarta.annotation.Nonnull final ServiceSchemaRegistryCompatibilityRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, ServiceSchemaRegistryCompatibilityResponse::createFromDiscriminatorValue);
    }
    /**
     * Check compatibility of schema in Schema Registry
     * @param body ServiceSchemaRegistryCompatibilityRequestBody
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final ServiceSchemaRegistryCompatibilityRequestBody body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Check compatibility of schema in Schema Registry
     * @param body ServiceSchemaRegistryCompatibilityRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final ServiceSchemaRegistryCompatibilityRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.POST, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PostRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
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
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
