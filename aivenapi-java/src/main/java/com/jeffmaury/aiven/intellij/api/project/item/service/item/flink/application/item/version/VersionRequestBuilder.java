package com.jeffmaury.aiven.intellij.api.project.item.service.item.flink.application.item.version;

import com.jeffmaury.aiven.intellij.api.models.ServiceFlinkCreateApplicationVersionRequestBody;
import com.jeffmaury.aiven.intellij.api.models.ServiceFlinkCreateApplicationVersionResponse;
import com.jeffmaury.aiven.intellij.api.project.item.service.item.flink.application.item.version.item.WithApplicationVersionItemRequestBuilder;
import com.jeffmaury.aiven.intellij.api.project.item.service.item.flink.application.item.version.validate.ValidateRequestBuilder;
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
 * Builds and executes requests for operations under /project/{project}/service/{service_name}/flink/application/{application_id}/version
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class VersionRequestBuilder extends BaseRequestBuilder {
    /**
     * The validate property
     */
    @jakarta.annotation.Nonnull
    public ValidateRequestBuilder validate() {
        return new ValidateRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Gets an item from the com.jeffmaury.aiven.intellij.api.project.item.service.item.flink.application.item.version.item collection
     * @param application_version_id ApplicationVersion Id
     * @return a WithApplicationVersionItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public WithApplicationVersionItemRequestBuilder byApplication_version_id(@jakarta.annotation.Nonnull final String application_version_id) {
        Objects.requireNonNull(application_version_id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("application_version_id", application_version_id);
        return new WithApplicationVersionItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new VersionRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public VersionRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/service/{service_name}/flink/application/{application_id}/version", pathParameters);
    }
    /**
     * Instantiates a new VersionRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public VersionRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/service/{service_name}/flink/application/{application_id}/version", rawUrl);
    }
    /**
     * Create a Flink ApplicationVersion
     * @param body ServiceFlinkCreateApplicationVersionRequestBody
     * @return a ServiceFlinkCreateApplicationVersionResponse
     */
    @jakarta.annotation.Nullable
    public ServiceFlinkCreateApplicationVersionResponse post(@jakarta.annotation.Nonnull final ServiceFlinkCreateApplicationVersionRequestBody body) {
        return post(body, null);
    }
    /**
     * Create a Flink ApplicationVersion
     * @param body ServiceFlinkCreateApplicationVersionRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a ServiceFlinkCreateApplicationVersionResponse
     */
    @jakarta.annotation.Nullable
    public ServiceFlinkCreateApplicationVersionResponse post(@jakarta.annotation.Nonnull final ServiceFlinkCreateApplicationVersionRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, ServiceFlinkCreateApplicationVersionResponse::createFromDiscriminatorValue);
    }
    /**
     * Create a Flink ApplicationVersion
     * @param body ServiceFlinkCreateApplicationVersionRequestBody
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final ServiceFlinkCreateApplicationVersionRequestBody body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Create a Flink ApplicationVersion
     * @param body ServiceFlinkCreateApplicationVersionRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final ServiceFlinkCreateApplicationVersionRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a VersionRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public VersionRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new VersionRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
