package com.jeffmaury.aiven.intellij.api.project.item.invoice;

import com.jeffmaury.aiven.intellij.api.models.ProjectInvoiceListResponse;
import com.jeffmaury.aiven.intellij.api.project.item.invoice.item.WithInvoiceNumberItemRequestBuilder;
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
 * Builds and executes requests for operations under /project/{project}/invoice
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class InvoiceRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the com.jeffmaury.aiven.intellij.api.project.item.invoice.item collection
     * @param invoice_number Invoice number
     * @return a WithInvoiceNumberItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public WithInvoiceNumberItemRequestBuilder byInvoice_number(@jakarta.annotation.Nonnull final String invoice_number) {
        Objects.requireNonNull(invoice_number);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("invoice_number", invoice_number);
        return new WithInvoiceNumberItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new InvoiceRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public InvoiceRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/invoice", pathParameters);
    }
    /**
     * Instantiates a new InvoiceRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public InvoiceRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/invoice", rawUrl);
    }
    /**
     * List project invoices
     * @return a ProjectInvoiceListResponse
     */
    @jakarta.annotation.Nullable
    public ProjectInvoiceListResponse get() {
        return get(null);
    }
    /**
     * List project invoices
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a ProjectInvoiceListResponse
     */
    @jakarta.annotation.Nullable
    public ProjectInvoiceListResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, ProjectInvoiceListResponse::createFromDiscriminatorValue);
    }
    /**
     * List project invoices
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * List project invoices
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
     * @return a InvoiceRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public InvoiceRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new InvoiceRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
    }
}
