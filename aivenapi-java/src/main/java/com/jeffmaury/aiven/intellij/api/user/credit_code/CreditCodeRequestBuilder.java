package com.jeffmaury.aiven.intellij.api.user.credit_code;

import com.jeffmaury.aiven.intellij.api.user.credit_code.item.WithCreditCodeItemRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /user/credit_code
 */
public class CreditCodeRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the com.jeffmaury.aiven.intellij.api.user.credit_code.item collection
     * @param credit_code Unique identifier of the item
     * @return a WithCreditCodeItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public WithCreditCodeItemRequestBuilder byCredit_code(@javax.annotation.Nonnull final String credit_code) {
        Objects.requireNonNull(credit_code);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("credit_code", credit_code);
        return new WithCreditCodeItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new Credit_codeRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public CreditCodeRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/user/credit_code", pathParameters);
    }
    /**
     * Instantiates a new Credit_codeRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public CreditCodeRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/user/credit_code", rawUrl);
    }
}
