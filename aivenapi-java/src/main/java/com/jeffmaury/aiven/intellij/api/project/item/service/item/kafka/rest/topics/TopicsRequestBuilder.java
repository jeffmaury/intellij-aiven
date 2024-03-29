package com.jeffmaury.aiven.intellij.api.project.item.service.item.kafka.rest.topics;

import com.jeffmaury.aiven.intellij.api.project.item.service.item.kafka.rest.topics.item.WithTopicNameItemRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /project/{project}/service/{service_name}/kafka/rest/topics
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TopicsRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the com.jeffmaury.aiven.intellij.api.project.item.service.item.kafka.rest.topics.item collection
     * @param topic_name Kafka topic name
     * @return a WithTopicNameItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public WithTopicNameItemRequestBuilder byTopic_name(@jakarta.annotation.Nonnull final String topic_name) {
        Objects.requireNonNull(topic_name);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("topic_name", topic_name);
        return new WithTopicNameItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new TopicsRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public TopicsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/service/{service_name}/kafka/rest/topics", pathParameters);
    }
    /**
     * Instantiates a new TopicsRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public TopicsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/service/{service_name}/kafka/rest/topics", rawUrl);
    }
}
