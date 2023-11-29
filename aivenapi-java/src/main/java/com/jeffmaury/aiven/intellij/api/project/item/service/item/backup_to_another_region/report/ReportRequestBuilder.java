package com.jeffmaury.aiven.intellij.api.project.item.service.item.backup_to_another_region.report;

import com.jeffmaury.aiven.intellij.api.models.ServiceBackupToAnotherRegionReportRequestBody;
import com.jeffmaury.aiven.intellij.api.models.ServiceBackupToAnotherRegionReportResponse;
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
 * Builds and executes requests for operations under /project/{project}/service/{service_name}/backup_to_another_region/report
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ReportRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new ReportRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ReportRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/service/{service_name}/backup_to_another_region/report", pathParameters);
    }
    /**
     * Instantiates a new ReportRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ReportRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/service/{service_name}/backup_to_another_region/report", rawUrl);
    }
    /**
     * Get service's backup to another region information
     * @param body ServiceBackupToAnotherRegionReportRequestBody
     * @return a CompletableFuture of ServiceBackupToAnotherRegionReportResponse
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ServiceBackupToAnotherRegionReportResponse> post(@jakarta.annotation.Nonnull final ServiceBackupToAnotherRegionReportRequestBody body) {
        return post(body, null);
    }
    /**
     * Get service's backup to another region information
     * @param body ServiceBackupToAnotherRegionReportRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of ServiceBackupToAnotherRegionReportResponse
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ServiceBackupToAnotherRegionReportResponse> post(@jakarta.annotation.Nonnull final ServiceBackupToAnotherRegionReportRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        return this.requestAdapter.sendAsync(requestInfo, ServiceBackupToAnotherRegionReportResponse::createFromDiscriminatorValue, null);
    }
    /**
     * Get service's backup to another region information
     * @param body ServiceBackupToAnotherRegionReportRequestBody
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final ServiceBackupToAnotherRegionReportRequestBody body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Get service's backup to another region information
     * @param body ServiceBackupToAnotherRegionReportRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final ServiceBackupToAnotherRegionReportRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a ReportRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public ReportRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new ReportRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
