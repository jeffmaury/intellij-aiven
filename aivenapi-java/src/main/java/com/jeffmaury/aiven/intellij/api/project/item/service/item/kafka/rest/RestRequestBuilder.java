package com.jeffmaury.aiven.intellij.api.project.item.service.item.kafka.rest;

import com.jeffmaury.aiven.intellij.api.project.item.service.item.kafka.rest.topics.TopicsRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /project/{project}/service/{service_name}/kafka/rest
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class RestRequestBuilder extends BaseRequestBuilder {
    /**
     * The topics property
     */
    @jakarta.annotation.Nonnull
    public TopicsRequestBuilder topics() {
        return new TopicsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new RestRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public RestRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/service/{service_name}/kafka/rest", pathParameters);
    }
    /**
     * Instantiates a new RestRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public RestRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/service/{service_name}/kafka/rest", rawUrl);
    }
}
