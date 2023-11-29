package com.jeffmaury.aiven.intellij.api.project.item.service.item.flink.application.item.version.validate;

import com.jeffmaury.aiven.intellij.api.models.ServiceFlinkValidateApplicationVersionRequestBody;
import com.jeffmaury.aiven.intellij.api.models.ServiceFlinkValidateApplicationVersionResponse;
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
 * Builds and executes requests for operations under /project/{project}/service/{service_name}/flink/application/{application_id}/version/validate
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ValidateRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new ValidateRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ValidateRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/service/{service_name}/flink/application/{application_id}/version/validate", pathParameters);
    }
    /**
     * Instantiates a new ValidateRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ValidateRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/service/{service_name}/flink/application/{application_id}/version/validate", rawUrl);
    }
    /**
     * Validate a Flink ApplicationVersion
     * @param body ServiceFlinkValidateApplicationVersionRequestBody
     * @return a CompletableFuture of ServiceFlinkValidateApplicationVersionResponse
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ServiceFlinkValidateApplicationVersionResponse> post(@jakarta.annotation.Nonnull final ServiceFlinkValidateApplicationVersionRequestBody body) {
        return post(body, null);
    }
    /**
     * Validate a Flink ApplicationVersion
     * @param body ServiceFlinkValidateApplicationVersionRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of ServiceFlinkValidateApplicationVersionResponse
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ServiceFlinkValidateApplicationVersionResponse> post(@jakarta.annotation.Nonnull final ServiceFlinkValidateApplicationVersionRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        return this.requestAdapter.sendAsync(requestInfo, ServiceFlinkValidateApplicationVersionResponse::createFromDiscriminatorValue, null);
    }
    /**
     * Validate a Flink ApplicationVersion
     * @param body ServiceFlinkValidateApplicationVersionRequestBody
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final ServiceFlinkValidateApplicationVersionRequestBody body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Validate a Flink ApplicationVersion
     * @param body ServiceFlinkValidateApplicationVersionRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final ServiceFlinkValidateApplicationVersionRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a ValidateRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public ValidateRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new ValidateRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}