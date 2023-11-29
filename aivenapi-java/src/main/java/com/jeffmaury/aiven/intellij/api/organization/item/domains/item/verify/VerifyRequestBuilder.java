package com.jeffmaury.aiven.intellij.api.organization.item.domains.item.verify;

import com.jeffmaury.aiven.intellij.api.models.OrganizationDomainVerifyResponse;
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
 * Builds and executes requests for operations under /organization/{organization_id}/domains/{domain_id}/verify
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class VerifyRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new VerifyRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public VerifyRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/organization/{organization_id}/domains/{domain_id}/verify", pathParameters);
    }
    /**
     * Instantiates a new VerifyRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public VerifyRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/organization/{organization_id}/domains/{domain_id}/verify", rawUrl);
    }
    /**
     * <p>Verifies a domain in an organization. If a user signs up to the Aiven platform with a verified domain, they are automatically added as managed users to the organization that has this domain verified.</p>
     * @return a CompletableFuture of OrganizationDomainVerifyResponse
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<OrganizationDomainVerifyResponse> post() {
        return post(null);
    }
    /**
     * <p>Verifies a domain in an organization. If a user signs up to the Aiven platform with a verified domain, they are automatically added as managed users to the organization that has this domain verified.</p>
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of OrganizationDomainVerifyResponse
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<OrganizationDomainVerifyResponse> post(@jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toPostRequestInformation(requestConfiguration);
        return this.requestAdapter.sendAsync(requestInfo, OrganizationDomainVerifyResponse::createFromDiscriminatorValue, null);
    }
    /**
     * <p>Verifies a domain in an organization. If a user signs up to the Aiven platform with a verified domain, they are automatically added as managed users to the organization that has this domain verified.</p>
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation() {
        return toPostRequestInformation(null);
    }
    /**
     * <p>Verifies a domain in an organization. If a user signs up to the Aiven platform with a verified domain, they are automatically added as managed users to the organization that has this domain verified.</p>
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation();
        if (requestConfiguration != null) {
            final PostRequestConfiguration requestConfig = new PostRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        requestInfo.httpMethod = HttpMethod.POST;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a VerifyRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public VerifyRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new VerifyRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
