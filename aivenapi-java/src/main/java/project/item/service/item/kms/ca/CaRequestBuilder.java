package com.jeffmaury.aiven.intellij.api.project.item.service.item.kms.ca;

import com.jeffmaury.aiven.intellij.api.project.item.service.item.kms.ca.item.WithCaNameItemRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /project/{project}/service/{service_name}/kms/ca
 */
public class CaRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the com.jeffmaury.aiven.intellij.api.project.item.service.item.kms.ca.item collection
     * @param ca_name Unique identifier of the item
     * @return a WithCaNameItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public WithCaNameItemRequestBuilder byCa_name(@javax.annotation.Nonnull final String ca_name) {
        Objects.requireNonNull(ca_name);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("ca_name", ca_name);
        return new WithCaNameItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new CaRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public CaRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/service/{service_name}/kms/ca", pathParameters);
    }
    /**
     * Instantiates a new CaRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public CaRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/service/{service_name}/kms/ca", rawUrl);
    }
}
