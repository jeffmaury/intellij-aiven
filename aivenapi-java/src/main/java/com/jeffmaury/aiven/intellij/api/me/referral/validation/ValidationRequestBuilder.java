package com.jeffmaury.aiven.intellij.api.me.referral.validation;

import com.jeffmaury.aiven.intellij.api.me.referral.validation.item.WithReferralCodeItemRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /me/referral/validation
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ValidationRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the com.jeffmaury.aiven.intellij.api.me.referral.validation.item collection
     * @param referral_code Referral Code
     * @return a WithReferralCodeItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public WithReferralCodeItemRequestBuilder byReferral_code(@jakarta.annotation.Nonnull final String referral_code) {
        Objects.requireNonNull(referral_code);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("referral_code", referral_code);
        return new WithReferralCodeItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new ValidationRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ValidationRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/me/referral/validation", pathParameters);
    }
    /**
     * Instantiates a new ValidationRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ValidationRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/me/referral/validation", rawUrl);
    }
}
