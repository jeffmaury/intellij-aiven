package com.jeffmaury.aiven.intellij.api.billinggroup.item.invoice.item;

import com.jeffmaury.aiven.intellij.api.billinggroup.item.invoice.item.download_cookie6.DownloadCookie6RequestBuilder;
import com.jeffmaury.aiven.intellij.api.billinggroup.item.invoice.item.lines.LinesRequestBuilder;
import com.jeffmaury.aiven.intellij.api.models.BillingGroupInvoiceGetResponse;
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
 * Builds and executes requests for operations under /billing-group/{billing_group_id}/invoice/{invoice_number}
 */
public class WithInvoiceNumberItemRequestBuilder extends BaseRequestBuilder {
    /** The csv property */
    @javax.annotation.Nonnull
    public CsvRequestBuilder csv() {
        return new CsvRequestBuilder(pathParameters, requestAdapter);
    }
    /** The lines property */
    @javax.annotation.Nonnull
    public LinesRequestBuilder lines() {
        return new LinesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new WithInvoice_numberItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public WithInvoiceNumberItemRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/billing-group/{billing_group_id}/invoice/{invoice_number}", pathParameters);
    }
    /**
     * Instantiates a new WithInvoice_numberItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public WithInvoiceNumberItemRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/billing-group/{billing_group_id}/invoice/{invoice_number}", rawUrl);
    }
    /**
     * Builds and executes requests for operations under /billing-group/{billing_group_id}/invoice/{invoice_number}/{download_cookie:.{6,}}
     * @return a DownloadCookie6RequestBuilder
     */
    @javax.annotation.Nonnull
    public DownloadCookie6RequestBuilder download_cookie6() {
        return new DownloadCookie6RequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Get a single invoice
     * @return a CompletableFuture of BillingGroupInvoiceGetResponse
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<BillingGroupInvoiceGetResponse> get() {
        try {
            final RequestInformation requestInfo = toGetRequestInformation(null);
            return this.requestAdapter.sendAsync(requestInfo, BillingGroupInvoiceGetResponse::createFromDiscriminatorValue, null);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<BillingGroupInvoiceGetResponse> executionException = new java.util.concurrent.CompletableFuture<BillingGroupInvoiceGetResponse>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Get a single invoice
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of BillingGroupInvoiceGetResponse
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<BillingGroupInvoiceGetResponse> get(@javax.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
            return this.requestAdapter.sendAsync(requestInfo, BillingGroupInvoiceGetResponse::createFromDiscriminatorValue, null);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<BillingGroupInvoiceGetResponse> executionException = new java.util.concurrent.CompletableFuture<BillingGroupInvoiceGetResponse>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Get a single invoice
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toGetRequestInformation() throws URISyntaxException {
        return toGetRequestInformation(null);
    }
    /**
     * Get a single invoice
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation();
        requestInfo.httpMethod = HttpMethod.GET;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.headers.add("Accept", "application/json");
        if (requestConfiguration != null) {
            final GetRequestConfiguration requestConfig = new GetRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    public class GetRequestConfiguration extends BaseRequestConfiguration {
    }
}
