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
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /project/{project}/service/{service_name}/backup_to_another_region/report
 */
public class ReportRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new ReportRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public ReportRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/service/{service_name}/backup_to_another_region/report", pathParameters);
    }
    /**
     * Instantiates a new ReportRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public ReportRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/service/{service_name}/backup_to_another_region/report", rawUrl);
    }
    /**
     * Get service's backup to another region information
     * @param body ServiceBackupToAnotherRegionReportRequestBody
     * @return a CompletableFuture of ServiceBackupToAnotherRegionReportResponse
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ServiceBackupToAnotherRegionReportResponse> post(@javax.annotation.Nonnull final ServiceBackupToAnotherRegionReportRequestBody body) {
        try {
            final RequestInformation requestInfo = toPostRequestInformation(body, null);
            return this.requestAdapter.sendAsync(requestInfo, ServiceBackupToAnotherRegionReportResponse::createFromDiscriminatorValue, null);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<ServiceBackupToAnotherRegionReportResponse> executionException = new java.util.concurrent.CompletableFuture<ServiceBackupToAnotherRegionReportResponse>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Get service's backup to another region information
     * @param body ServiceBackupToAnotherRegionReportRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of ServiceBackupToAnotherRegionReportResponse
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ServiceBackupToAnotherRegionReportResponse> post(@javax.annotation.Nonnull final ServiceBackupToAnotherRegionReportRequestBody body, @javax.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        try {
            final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
            return this.requestAdapter.sendAsync(requestInfo, ServiceBackupToAnotherRegionReportResponse::createFromDiscriminatorValue, null);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<ServiceBackupToAnotherRegionReportResponse> executionException = new java.util.concurrent.CompletableFuture<ServiceBackupToAnotherRegionReportResponse>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Get service's backup to another region information
     * @param body ServiceBackupToAnotherRegionReportRequestBody
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@javax.annotation.Nonnull final ServiceBackupToAnotherRegionReportRequestBody body) throws URISyntaxException {
        return toPostRequestInformation(body, null);
    }
    /**
     * Get service's backup to another region information
     * @param body ServiceBackupToAnotherRegionReportRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@javax.annotation.Nonnull final ServiceBackupToAnotherRegionReportRequestBody body, @javax.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) throws URISyntaxException {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation();
        requestInfo.httpMethod = HttpMethod.POST;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.headers.add("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        if (requestConfiguration != null) {
            final PostRequestConfiguration requestConfig = new PostRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
