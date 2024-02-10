package com.jeffmaury.aiven.intellij.api.account.item.parent_account;

import com.jeffmaury.aiven.intellij.api.models.AccountMoveRequestBody;
import com.jeffmaury.aiven.intellij.api.models.AccountMoveResponse;
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
 * Builds and executes requests for operations under /account/{account_id}/parent_account
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ParentAccountRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new Parent_accountRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ParentAccountRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/account/{account_id}/parent_account", pathParameters);
    }
    /**
     * Instantiates a new Parent_accountRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ParentAccountRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/account/{account_id}/parent_account", rawUrl);
    }
    /**
     * Move an existing organization unitself
     * @param body AccountMoveRequestBody
     * @return a AccountMoveResponse
     */
    @jakarta.annotation.Nullable
    public AccountMoveResponse put(@jakarta.annotation.Nonnull final AccountMoveRequestBody body) {
        return put(body, null);
    }
    /**
     * Move an existing organization unitself
     * @param body AccountMoveRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a AccountMoveResponse
     */
    @jakarta.annotation.Nullable
    public AccountMoveResponse put(@jakarta.annotation.Nonnull final AccountMoveRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PutRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPutRequestInformation(body, requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, AccountMoveResponse::createFromDiscriminatorValue);
    }
    /**
     * Move an existing organization unitself
     * @param body AccountMoveRequestBody
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPutRequestInformation(@jakarta.annotation.Nonnull final AccountMoveRequestBody body) {
        return toPutRequestInformation(body, null);
    }
    /**
     * Move an existing organization unitself
     * @param body AccountMoveRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPutRequestInformation(@jakarta.annotation.Nonnull final AccountMoveRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PutRequestConfiguration> requestConfiguration) {
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
     * @return a ParentAccountRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public ParentAccountRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new ParentAccountRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PutRequestConfiguration extends BaseRequestConfiguration {
    }
}
