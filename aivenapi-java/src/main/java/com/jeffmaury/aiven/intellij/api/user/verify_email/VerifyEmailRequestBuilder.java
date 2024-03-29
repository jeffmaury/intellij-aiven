package com.jeffmaury.aiven.intellij.api.user.verify_email;

import com.jeffmaury.aiven.intellij.api.user.verify_email.item.WithVerificationCodeItemRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /user/verify_email
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class VerifyEmailRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the com.jeffmaury.aiven.intellij.api.user.verify_email.item collection
     * @param verification_code Verification code received via email
     * @return a WithVerificationCodeItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public WithVerificationCodeItemRequestBuilder byVerification_code(@jakarta.annotation.Nonnull final String verification_code) {
        Objects.requireNonNull(verification_code);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("verification_code", verification_code);
        return new WithVerificationCodeItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new Verify_emailRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public VerifyEmailRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/user/verify_email", pathParameters);
    }
    /**
     * Instantiates a new Verify_emailRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public VerifyEmailRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/user/verify_email", rawUrl);
    }
}
