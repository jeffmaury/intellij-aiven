package com.jeffmaury.aiven.intellij.api.project.item.service.item.query.activity;

import com.jeffmaury.aiven.intellij.api.models.ServiceQueryActivityRequestBody;
import com.jeffmaury.aiven.intellij.api.models.ServiceQueryActivityResponse;
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
 * Builds and executes requests for operations under /project/{project}/service/{service_name}/query/activity
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ActivityRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new ActivityRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ActivityRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/service/{service_name}/query/activity", pathParameters);
    }
    /**
     * Instantiates a new ActivityRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ActivityRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/service/{service_name}/query/activity", rawUrl);
    }
    /**
     * Fetch current queries for the service
     * @param body ServiceQueryActivityRequestBody
     * @return a ServiceQueryActivityResponse
     */
    @jakarta.annotation.Nullable
    public ServiceQueryActivityResponse post(@jakarta.annotation.Nonnull final ServiceQueryActivityRequestBody body) {
        return post(body, null);
    }
    /**
     * Fetch current queries for the service
     * @param body ServiceQueryActivityRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a ServiceQueryActivityResponse
     */
    @jakarta.annotation.Nullable
    public ServiceQueryActivityResponse post(@jakarta.annotation.Nonnull final ServiceQueryActivityRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, ServiceQueryActivityResponse::createFromDiscriminatorValue);
    }
    /**
     * Fetch current queries for the service
     * @param body ServiceQueryActivityRequestBody
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final ServiceQueryActivityRequestBody body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Fetch current queries for the service
     * @param body ServiceQueryActivityRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final ServiceQueryActivityRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a ActivityRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public ActivityRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new ActivityRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
