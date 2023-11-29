package com.jeffmaury.aiven.intellij.api.project.item.service.item.kms;

import com.jeffmaury.aiven.intellij.api.project.item.service.item.kms.ca.CaRequestBuilder;
import com.jeffmaury.aiven.intellij.api.project.item.service.item.kms.keypairs.KeypairsRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /project/{project}/service/{service_name}/kms
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class KmsRequestBuilder extends BaseRequestBuilder {
    /**
     * The ca property
     */
    @jakarta.annotation.Nonnull
    public CaRequestBuilder ca() {
        return new CaRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The keypairs property
     */
    @jakarta.annotation.Nonnull
    public KeypairsRequestBuilder keypairs() {
        return new KeypairsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new KmsRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public KmsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/service/{service_name}/kms", pathParameters);
    }
    /**
     * Instantiates a new KmsRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public KmsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/service/{service_name}/kms", rawUrl);
    }
}
