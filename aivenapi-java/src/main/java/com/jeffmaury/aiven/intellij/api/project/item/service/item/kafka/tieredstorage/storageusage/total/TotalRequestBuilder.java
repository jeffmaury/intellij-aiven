package com.jeffmaury.aiven.intellij.api.project.item.service.item.kafka.tieredstorage.storageusage.total;

import com.jeffmaury.aiven.intellij.api.models.ServiceKafkaTieredStorageStorageUsageTotalResponse;
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
 * Builds and executes requests for operations under /project/{project}/service/{service_name}/kafka/tiered-storage/storage-usage/total
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TotalRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new TotalRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public TotalRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/service/{service_name}/kafka/tiered-storage/storage-usage/total", pathParameters);
    }
    /**
     * Instantiates a new TotalRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public TotalRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/service/{service_name}/kafka/tiered-storage/storage-usage/total", rawUrl);
    }
    /**
     * <p>Rarely, the data may be not available. In this case, &quot;503 Service Unavailable&quot; is returned and the client should try later.</p>
     * @return a ServiceKafkaTieredStorageStorageUsageTotalResponse
     */
    @jakarta.annotation.Nullable
    public ServiceKafkaTieredStorageStorageUsageTotalResponse get() {
        return get(null);
    }
    /**
     * <p>Rarely, the data may be not available. In this case, &quot;503 Service Unavailable&quot; is returned and the client should try later.</p>
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a ServiceKafkaTieredStorageStorageUsageTotalResponse
     */
    @jakarta.annotation.Nullable
    public ServiceKafkaTieredStorageStorageUsageTotalResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, ServiceKafkaTieredStorageStorageUsageTotalResponse::createFromDiscriminatorValue);
    }
    /**
     * <p>Rarely, the data may be not available. In this case, &quot;503 Service Unavailable&quot; is returned and the client should try later.</p>
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * <p>Rarely, the data may be not available. In this case, &quot;503 Service Unavailable&quot; is returned and the client should try later.</p>
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.GET, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, GetRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a TotalRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public TotalRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new TotalRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
    }
}
