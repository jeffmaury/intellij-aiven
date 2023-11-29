package com.jeffmaury.aiven.intellij.api.me.twofa.otp;

import com.jeffmaury.aiven.intellij.api.models.TwoFactorAuthConfigureOTPRequestBody;
import com.jeffmaury.aiven.intellij.api.models.TwoFactorAuthConfigureOTPResponse;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /me/2fa/otp
 */
public class OtpRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new OtpRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public OtpRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/me/2fa/otp", pathParameters);
    }
    /**
     * Instantiates a new OtpRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public OtpRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/me/2fa/otp", rawUrl);
    }
    /**
     * Complete one-time password configuration
     * @param body TwoFactorAuthConfigureOTPRequestBody
     * @return a CompletableFuture of TwoFactorAuthConfigureOTPResponse
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<TwoFactorAuthConfigureOTPResponse> put(@javax.annotation.Nonnull final TwoFactorAuthConfigureOTPRequestBody body) {
        try {
            final RequestInformation requestInfo = toPutRequestInformation(body, null);
            return this.requestAdapter.sendAsync(requestInfo, TwoFactorAuthConfigureOTPResponse::createFromDiscriminatorValue, null);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<TwoFactorAuthConfigureOTPResponse> executionException = new java.util.concurrent.CompletableFuture<TwoFactorAuthConfigureOTPResponse>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Complete one-time password configuration
     * @param body TwoFactorAuthConfigureOTPRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of TwoFactorAuthConfigureOTPResponse
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<TwoFactorAuthConfigureOTPResponse> put(@javax.annotation.Nonnull final TwoFactorAuthConfigureOTPRequestBody body, @javax.annotation.Nullable final java.util.function.Consumer<PutRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        try {
            final RequestInformation requestInfo = toPutRequestInformation(body, requestConfiguration);
            return this.requestAdapter.sendAsync(requestInfo, TwoFactorAuthConfigureOTPResponse::createFromDiscriminatorValue, null);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<TwoFactorAuthConfigureOTPResponse> executionException = new java.util.concurrent.CompletableFuture<TwoFactorAuthConfigureOTPResponse>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Complete one-time password configuration
     * @param body TwoFactorAuthConfigureOTPRequestBody
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPutRequestInformation(@javax.annotation.Nonnull final TwoFactorAuthConfigureOTPRequestBody body) throws URISyntaxException {
        return toPutRequestInformation(body, null);
    }
    /**
     * Complete one-time password configuration
     * @param body TwoFactorAuthConfigureOTPRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPutRequestInformation(@javax.annotation.Nonnull final TwoFactorAuthConfigureOTPRequestBody body, @javax.annotation.Nullable final java.util.function.Consumer<PutRequestConfiguration> requestConfiguration) throws URISyntaxException {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation();
        requestInfo.httpMethod = HttpMethod.PUT;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.headers.add("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        if (requestConfiguration != null) {
            final PutRequestConfiguration requestConfig = new PutRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    public class PutRequestConfiguration extends BaseRequestConfiguration {
    }
}
