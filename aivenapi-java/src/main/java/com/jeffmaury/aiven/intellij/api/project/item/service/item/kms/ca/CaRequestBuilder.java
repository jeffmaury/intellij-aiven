package com.jeffmaury.aiven.intellij.api.project.item.service.item.kms.ca;

import com.jeffmaury.aiven.intellij.api.project.item.service.item.kms.ca.item.WithCaNameItemRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /project/{project}/service/{service_name}/kms/ca
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CaRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the com.jeffmaury.aiven.intellij.api.project.item.service.item.kms.ca.item collection
     * @param ca_name CA name
     * @return a WithCaNameItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public WithCaNameItemRequestBuilder byCa_name(@jakarta.annotation.Nonnull final String ca_name) {
        Objects.requireNonNull(ca_name);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("ca_name", ca_name);
        return new WithCaNameItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new CaRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public CaRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/service/{service_name}/kms/ca", pathParameters);
    }
    /**
     * Instantiates a new CaRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public CaRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/service/{service_name}/kms/ca", rawUrl);
    }
}
