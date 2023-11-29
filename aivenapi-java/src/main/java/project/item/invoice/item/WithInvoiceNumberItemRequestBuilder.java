package com.jeffmaury.aiven.intellij.api.project.item.invoice.item;

import com.jeffmaury.aiven.intellij.api.project.item.invoice.item.item.WithDownloadCookieItemRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /project/{project}/invoice/{invoice_number}
 */
public class WithInvoiceNumberItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the com.jeffmaury.aiven.intellij.api.project.item.invoice.item.item collection
     * @param download_cookie Unique identifier of the item
     * @return a WithDownloadCookieItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public WithDownloadCookieItemRequestBuilder byDownload_cookie(@javax.annotation.Nonnull final String download_cookie) {
        Objects.requireNonNull(download_cookie);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("download_cookie", download_cookie);
        return new WithDownloadCookieItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new WithInvoice_numberItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public WithInvoiceNumberItemRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/invoice/{invoice_number}", pathParameters);
    }
    /**
     * Instantiates a new WithInvoice_numberItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public WithInvoiceNumberItemRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/invoice/{invoice_number}", rawUrl);
    }
}
