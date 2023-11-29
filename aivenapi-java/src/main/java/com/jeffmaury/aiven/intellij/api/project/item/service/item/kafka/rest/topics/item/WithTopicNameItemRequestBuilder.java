package com.jeffmaury.aiven.intellij.api.project.item.service.item.kafka.rest.topics.item;

import com.jeffmaury.aiven.intellij.api.project.item.service.item.kafka.rest.topics.item.messages.MessagesRequestBuilder;
import com.jeffmaury.aiven.intellij.api.project.item.service.item.kafka.rest.topics.item.produce.ProduceRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /project/{project}/service/{service_name}/kafka/rest/topics/{topic_name}
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WithTopicNameItemRequestBuilder extends BaseRequestBuilder {
    /**
     * The messages property
     */
    @jakarta.annotation.Nonnull
    public MessagesRequestBuilder messages() {
        return new MessagesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The produce property
     */
    @jakarta.annotation.Nonnull
    public ProduceRequestBuilder produce() {
        return new ProduceRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new WithTopic_nameItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithTopicNameItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/service/{service_name}/kafka/rest/topics/{topic_name}", pathParameters);
    }
    /**
     * Instantiates a new WithTopic_nameItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithTopicNameItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/service/{service_name}/kafka/rest/topics/{topic_name}", rawUrl);
    }
}
