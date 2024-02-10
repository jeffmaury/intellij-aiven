package com.jeffmaury.aiven.intellij.api.project.item.service.item.logs;

import com.jeffmaury.aiven.intellij.api.models.ProjectGetServiceLogsRequestBody;
import com.jeffmaury.aiven.intellij.api.models.ProjectGetServiceLogsResponse;
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
 * Builds and executes requests for operations under /project/{project}/service/{service_name}/logs
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class LogsRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new LogsRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public LogsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/service/{service_name}/logs", pathParameters);
    }
    /**
     * Instantiates a new LogsRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public LogsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/service/{service_name}/logs", rawUrl);
    }
    /**
     * Get service log entries
     * @param body ProjectGetServiceLogsRequestBody
     * @return a ProjectGetServiceLogsResponse
     */
    @jakarta.annotation.Nullable
    public ProjectGetServiceLogsResponse post(@jakarta.annotation.Nonnull final ProjectGetServiceLogsRequestBody body) {
        return post(body, null);
    }
    /**
     * Get service log entries
     * @param body ProjectGetServiceLogsRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a ProjectGetServiceLogsResponse
     */
    @jakarta.annotation.Nullable
    public ProjectGetServiceLogsResponse post(@jakarta.annotation.Nonnull final ProjectGetServiceLogsRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, ProjectGetServiceLogsResponse::createFromDiscriminatorValue);
    }
    /**
     * Get service log entries
     * @param body ProjectGetServiceLogsRequestBody
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final ProjectGetServiceLogsRequestBody body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Get service log entries
     * @param body ProjectGetServiceLogsRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final ProjectGetServiceLogsRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a LogsRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public LogsRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new LogsRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
