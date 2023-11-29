package com.jeffmaury.aiven.intellij.api.user.credit_code;

import com.jeffmaury.aiven.intellij.api.user.credit_code.item.WithCreditCodeItemRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /user/credit_code
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CreditCodeRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the com.jeffmaury.aiven.intellij.api.user.credit_code.item collection
     * @param credit_code Credit Code
     * @return a WithCreditCodeItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public WithCreditCodeItemRequestBuilder byCredit_code(@jakarta.annotation.Nonnull final String credit_code) {
        Objects.requireNonNull(credit_code);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("credit_code", credit_code);
        return new WithCreditCodeItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new Credit_codeRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public CreditCodeRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/user/credit_code", pathParameters);
    }
    /**
     * Instantiates a new Credit_codeRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public CreditCodeRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/user/credit_code", rawUrl);
    }
}
