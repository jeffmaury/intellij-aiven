package com.jeffmaury.aiven.intellij.api.me.referral;

import com.jeffmaury.aiven.intellij.api.me.referral.validation.ValidationRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /me/referral
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ReferralRequestBuilder extends BaseRequestBuilder {
    /**
     * The validation property
     */
    @jakarta.annotation.Nonnull
    public ValidationRequestBuilder validation() {
        return new ValidationRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new ReferralRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ReferralRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/me/referral", pathParameters);
    }
    /**
     * Instantiates a new ReferralRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ReferralRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/me/referral", rawUrl);
    }
}
