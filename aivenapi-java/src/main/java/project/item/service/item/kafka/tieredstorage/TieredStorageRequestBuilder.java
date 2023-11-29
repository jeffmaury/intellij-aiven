package com.jeffmaury.aiven.intellij.api.project.item.service.item.kafka.tieredstorage;

import com.jeffmaury.aiven.intellij.api.project.item.service.item.kafka.tieredstorage.storageusage.StorageUsageRequestBuilder;
import com.jeffmaury.aiven.intellij.api.project.item.service.item.kafka.tieredstorage.summary.SummaryRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /project/{project}/service/{service_name}/kafka/tiered-storage
 */
public class TieredStorageRequestBuilder extends BaseRequestBuilder {
    /** The storageUsage property */
    @javax.annotation.Nonnull
    public StorageUsageRequestBuilder storageUsage() {
        return new StorageUsageRequestBuilder(pathParameters, requestAdapter);
    }
    /** The summary property */
    @javax.annotation.Nonnull
    public SummaryRequestBuilder summary() {
        return new SummaryRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new TieredStorageRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public TieredStorageRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/service/{service_name}/kafka/tiered-storage", pathParameters);
    }
    /**
     * Instantiates a new TieredStorageRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public TieredStorageRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/service/{service_name}/kafka/tiered-storage", rawUrl);
    }
}
