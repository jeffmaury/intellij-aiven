package com.jeffmaury.aiven.intellij.api.account.item.payment_method;

import com.jeffmaury.aiven.intellij.api.account.item.payment_method.item.WithCardItemRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /account/{account_id}/payment_method
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PaymentMethodRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the com.jeffmaury.aiven.intellij.api.account.item.payment_method.item collection
     * @param card_id Credit card ID
     * @return a WithCardItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public WithCardItemRequestBuilder byCard_id(@jakarta.annotation.Nonnull final String card_id) {
        Objects.requireNonNull(card_id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("card_id", card_id);
        return new WithCardItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new Payment_methodRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public PaymentMethodRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/account/{account_id}/payment_method", pathParameters);
    }
    /**
     * Instantiates a new Payment_methodRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public PaymentMethodRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/account/{account_id}/payment_method", rawUrl);
    }
}
