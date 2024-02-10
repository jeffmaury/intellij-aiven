package com.jeffmaury.aiven.intellij.api.card.item;

import com.jeffmaury.aiven.intellij.api.models.UserCreditCardDeleteResponse;
import com.jeffmaury.aiven.intellij.api.models.UserCreditCardUpdateRequestBody;
import com.jeffmaury.aiven.intellij.api.models.UserCreditCardUpdateResponse;
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
 * Builds and executes requests for operations under /card/{card_id}
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WithCardItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new WithCard_ItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithCardItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/card/{card_id}", pathParameters);
    }
    /**
     * Instantiates a new WithCard_ItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithCardItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/card/{card_id}", rawUrl);
    }
    /**
     * Delete user's credit card
     * @return a UserCreditCardDeleteResponse
     * @deprecated
     * 
     */
    @jakarta.annotation.Nullable
    @Deprecated
    public UserCreditCardDeleteResponse delete() {
        return delete(null);
    }
    /**
     * Delete user's credit card
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a UserCreditCardDeleteResponse
     * @deprecated
     * 
     */
    @jakarta.annotation.Nullable
    @Deprecated
    public UserCreditCardDeleteResponse delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, UserCreditCardDeleteResponse::createFromDiscriminatorValue);
    }
    /**
     * Update user's credit card
     * @param body UserCreditCardUpdateRequestBody
     * @return a UserCreditCardUpdateResponse
     * @deprecated
     * 
     */
    @jakarta.annotation.Nullable
    @Deprecated
    public UserCreditCardUpdateResponse put(@jakarta.annotation.Nonnull final UserCreditCardUpdateRequestBody body) {
        return put(body, null);
    }
    /**
     * Update user's credit card
     * @param body UserCreditCardUpdateRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a UserCreditCardUpdateResponse
     * @deprecated
     * 
     */
    @jakarta.annotation.Nullable
    @Deprecated
    public UserCreditCardUpdateResponse put(@jakarta.annotation.Nonnull final UserCreditCardUpdateRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PutRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPutRequestInformation(body, requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, UserCreditCardUpdateResponse::createFromDiscriminatorValue);
    }
    /**
     * Delete user's credit card
     * @return a RequestInformation
     * @deprecated
     * 
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete user's credit card
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     * @deprecated
     * 
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toDeleteRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.DELETE, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, DeleteRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Update user's credit card
     * @param body UserCreditCardUpdateRequestBody
     * @return a RequestInformation
     * @deprecated
     * 
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toPutRequestInformation(@jakarta.annotation.Nonnull final UserCreditCardUpdateRequestBody body) {
        return toPutRequestInformation(body, null);
    }
    /**
     * Update user's credit card
     * @param body UserCreditCardUpdateRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     * @deprecated
     * 
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toPutRequestInformation(@jakarta.annotation.Nonnull final UserCreditCardUpdateRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PutRequestConfiguration> requestConfiguration) {
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
     * @return a WithCardItemRequestBuilder
     * @deprecated
     * 
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public WithCardItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new WithCardItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PutRequestConfiguration extends BaseRequestConfiguration {
    }
}
