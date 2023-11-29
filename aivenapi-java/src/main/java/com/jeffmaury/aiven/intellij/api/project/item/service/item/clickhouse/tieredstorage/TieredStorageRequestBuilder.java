package com.jeffmaury.aiven.intellij.api.project.item.service.item.clickhouse.tieredstorage;

import com.jeffmaury.aiven.intellij.api.project.item.service.item.clickhouse.tieredstorage.summary.SummaryRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /project/{project}/service/{service_name}/clickhouse/tiered-storage
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TieredStorageRequestBuilder extends BaseRequestBuilder {
    /**
     * The summary property
     */
    @jakarta.annotation.Nonnull
    public SummaryRequestBuilder summary() {
        return new SummaryRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new TieredStorageRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public TieredStorageRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/service/{service_name}/clickhouse/tiered-storage", pathParameters);
    }
    /**
     * Instantiates a new TieredStorageRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public TieredStorageRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/service/{service_name}/clickhouse/tiered-storage", rawUrl);
    }
}
