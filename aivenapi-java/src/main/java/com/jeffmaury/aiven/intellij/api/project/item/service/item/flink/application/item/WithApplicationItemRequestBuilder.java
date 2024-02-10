package com.jeffmaury.aiven.intellij.api.project.item.service.item.flink.application.item;

import com.jeffmaury.aiven.intellij.api.models.ServiceFlinkDeleteApplicationResponse;
import com.jeffmaury.aiven.intellij.api.models.ServiceFlinkGetApplicationResponse;
import com.jeffmaury.aiven.intellij.api.models.ServiceFlinkUpdateApplicationRequestBody;
import com.jeffmaury.aiven.intellij.api.models.ServiceFlinkUpdateApplicationResponse;
import com.jeffmaury.aiven.intellij.api.project.item.service.item.flink.application.item.deployment.DeploymentRequestBuilder;
import com.jeffmaury.aiven.intellij.api.project.item.service.item.flink.application.item.version.VersionRequestBuilder;
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
 * Builds and executes requests for operations under /project/{project}/service/{service_name}/flink/application/{application_id}
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WithApplicationItemRequestBuilder extends BaseRequestBuilder {
    /**
     * The deployment property
     */
    @jakarta.annotation.Nonnull
    public DeploymentRequestBuilder deployment() {
        return new DeploymentRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The version property
     */
    @jakarta.annotation.Nonnull
    public VersionRequestBuilder version() {
        return new VersionRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new WithApplication_ItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithApplicationItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/service/{service_name}/flink/application/{application_id}", pathParameters);
    }
    /**
     * Instantiates a new WithApplication_ItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithApplicationItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/service/{service_name}/flink/application/{application_id}", rawUrl);
    }
    /**
     * Delete a Flink Application
     * @return a ServiceFlinkDeleteApplicationResponse
     */
    @jakarta.annotation.Nullable
    public ServiceFlinkDeleteApplicationResponse delete() {
        return delete(null);
    }
    /**
     * Delete a Flink Application
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a ServiceFlinkDeleteApplicationResponse
     */
    @jakarta.annotation.Nullable
    public ServiceFlinkDeleteApplicationResponse delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, ServiceFlinkDeleteApplicationResponse::createFromDiscriminatorValue);
    }
    /**
     * Get a Flink Application
     * @return a ServiceFlinkGetApplicationResponse
     */
    @jakarta.annotation.Nullable
    public ServiceFlinkGetApplicationResponse get() {
        return get(null);
    }
    /**
     * Get a Flink Application
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a ServiceFlinkGetApplicationResponse
     */
    @jakarta.annotation.Nullable
    public ServiceFlinkGetApplicationResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, ServiceFlinkGetApplicationResponse::createFromDiscriminatorValue);
    }
    /**
     * Update a Flink Application
     * @param body ServiceFlinkUpdateApplicationRequestBody
     * @return a ServiceFlinkUpdateApplicationResponse
     */
    @jakarta.annotation.Nullable
    public ServiceFlinkUpdateApplicationResponse put(@jakarta.annotation.Nonnull final ServiceFlinkUpdateApplicationRequestBody body) {
        return put(body, null);
    }
    /**
     * Update a Flink Application
     * @param body ServiceFlinkUpdateApplicationRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a ServiceFlinkUpdateApplicationResponse
     */
    @jakarta.annotation.Nullable
    public ServiceFlinkUpdateApplicationResponse put(@jakarta.annotation.Nonnull final ServiceFlinkUpdateApplicationRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PutRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPutRequestInformation(body, requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, ServiceFlinkUpdateApplicationResponse::createFromDiscriminatorValue);
    }
    /**
     * Delete a Flink Application
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete a Flink Application
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.DELETE, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, DeleteRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Get a Flink Application
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Get a Flink Application
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
     * Update a Flink Application
     * @param body ServiceFlinkUpdateApplicationRequestBody
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPutRequestInformation(@jakarta.annotation.Nonnull final ServiceFlinkUpdateApplicationRequestBody body) {
        return toPutRequestInformation(body, null);
    }
    /**
     * Update a Flink Application
     * @param body ServiceFlinkUpdateApplicationRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPutRequestInformation(@jakarta.annotation.Nonnull final ServiceFlinkUpdateApplicationRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PutRequestConfiguration> requestConfiguration) {
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
     * @return a WithApplicationItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public WithApplicationItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new WithApplicationItemRequestBuilder(rawUrl, requestAdapter);
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
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PutRequestConfiguration extends BaseRequestConfiguration {
    }
}
