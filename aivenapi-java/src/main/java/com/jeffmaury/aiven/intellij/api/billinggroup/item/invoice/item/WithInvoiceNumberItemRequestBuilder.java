package com.jeffmaury.aiven.intellij.api.billinggroup.item.invoice.item;

import com.jeffmaury.aiven.intellij.api.billinggroup.item.invoice.item.csvescaped.CsvRequestBuilder;
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
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /billing-group/{billing_group_id}/invoice/{invoice_number}
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WithInvoiceNumberItemRequestBuilder extends BaseRequestBuilder {
    /**
     * The csv property
     */
    @jakarta.annotation.Nonnull
    public CsvRequestBuilder csv() {
        return new CsvRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The lines property
     */
    @jakarta.annotation.Nonnull
    public LinesRequestBuilder lines() {
        return new LinesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new WithInvoice_numberItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithInvoiceNumberItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/billing-group/{billing_group_id}/invoice/{invoice_number}", pathParameters);
    }
    /**
     * Instantiates a new WithInvoice_numberItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithInvoiceNumberItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/billing-group/{billing_group_id}/invoice/{invoice_number}", rawUrl);
    }
    /**
     * Builds and executes requests for operations under /billing-group/{billing_group_id}/invoice/{invoice_number}/{download_cookie:.{6,}}
     * @return a DownloadCookie6RequestBuilder
     */
    @jakarta.annotation.Nonnull
    public DownloadCookie6RequestBuilder download_cookie6() {
        return new DownloadCookie6RequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Get a single invoice
     * @return a BillingGroupInvoiceGetResponse
     */
    @jakarta.annotation.Nullable
    public BillingGroupInvoiceGetResponse get() {
        return get(null);
    }
    /**
     * Get a single invoice
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a BillingGroupInvoiceGetResponse
     */
    @jakarta.annotation.Nullable
    public BillingGroupInvoiceGetResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, BillingGroupInvoiceGetResponse::createFromDiscriminatorValue);
    }
    /**
     * Get a single invoice
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Get a single invoice
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
     * @return a WithInvoiceNumberItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public WithInvoiceNumberItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new WithInvoiceNumberItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
    }
}
