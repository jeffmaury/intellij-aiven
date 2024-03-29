package com.jeffmaury.aiven.intellij.api.project.item.service.item.kafka.tieredstorage.storageusage;

import com.jeffmaury.aiven.intellij.api.project.item.service.item.kafka.tieredstorage.storageusage.bytopic.ByTopicRequestBuilder;
import com.jeffmaury.aiven.intellij.api.project.item.service.item.kafka.tieredstorage.storageusage.total.TotalRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /project/{project}/service/{service_name}/kafka/tiered-storage/storage-usage
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class StorageUsageRequestBuilder extends BaseRequestBuilder {
    /**
     * The byTopic property
     */
    @jakarta.annotation.Nonnull
    public ByTopicRequestBuilder byTopic() {
        return new ByTopicRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The total property
     */
    @jakarta.annotation.Nonnull
    public TotalRequestBuilder total() {
        return new TotalRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new StorageUsageRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public StorageUsageRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/service/{service_name}/kafka/tiered-storage/storage-usage", pathParameters);
    }
    /**
     * Instantiates a new StorageUsageRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public StorageUsageRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/service/{service_name}/kafka/tiered-storage/storage-usage", rawUrl);
    }
}
