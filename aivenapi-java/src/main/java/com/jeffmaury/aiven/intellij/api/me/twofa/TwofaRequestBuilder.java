package com.jeffmaury.aiven.intellij.api.me.twofa;

import com.jeffmaury.aiven.intellij.api.me.twofa.otp.OtpRequestBuilder;
import com.jeffmaury.aiven.intellij.api.models.TwoFactorAuthConfigureRequestBody;
import com.jeffmaury.aiven.intellij.api.models.TwoFactorAuthConfigureResponse;
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
 * Builds and executes requests for operations under /me/2fa
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TwofaRequestBuilder extends BaseRequestBuilder {
    /**
     * The otp property
     */
    @jakarta.annotation.Nonnull
    public OtpRequestBuilder otp() {
        return new OtpRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new TwofaRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public TwofaRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/me/2fa", pathParameters);
    }
    /**
     * Instantiates a new TwofaRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public TwofaRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/me/2fa", rawUrl);
    }
    /**
     * Configure two-factor authentication
     * @param body TwoFactorAuthConfigureRequestBody
     * @return a TwoFactorAuthConfigureResponse
     */
    @jakarta.annotation.Nullable
    public TwoFactorAuthConfigureResponse put(@jakarta.annotation.Nonnull final TwoFactorAuthConfigureRequestBody body) {
        return put(body, null);
    }
    /**
     * Configure two-factor authentication
     * @param body TwoFactorAuthConfigureRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a TwoFactorAuthConfigureResponse
     */
    @jakarta.annotation.Nullable
    public TwoFactorAuthConfigureResponse put(@jakarta.annotation.Nonnull final TwoFactorAuthConfigureRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PutRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPutRequestInformation(body, requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, TwoFactorAuthConfigureResponse::createFromDiscriminatorValue);
    }
    /**
     * Configure two-factor authentication
     * @param body TwoFactorAuthConfigureRequestBody
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPutRequestInformation(@jakarta.annotation.Nonnull final TwoFactorAuthConfigureRequestBody body) {
        return toPutRequestInformation(body, null);
    }
    /**
     * Configure two-factor authentication
     * @param body TwoFactorAuthConfigureRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPutRequestInformation(@jakarta.annotation.Nonnull final TwoFactorAuthConfigureRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PutRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.PUT, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PutRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a TwofaRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public TwofaRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new TwofaRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PutRequestConfiguration extends BaseRequestConfiguration {
    }
}
