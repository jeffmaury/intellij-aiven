package com.jeffmaury.aiven.intellij.api.project.item.service.item.kms.keypairs;

import com.jeffmaury.aiven.intellij.api.project.item.service.item.kms.keypairs.item.WithKeypairNameItemRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /project/{project}/service/{service_name}/kms/keypairs
 */
public class KeypairsRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the com.jeffmaury.aiven.intellij.api.project.item.service.item.kms.keypairs.item collection
     * @param keypair_name Unique identifier of the item
     * @return a WithKeypairNameItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public WithKeypairNameItemRequestBuilder byKeypair_name(@javax.annotation.Nonnull final String keypair_name) {
        Objects.requireNonNull(keypair_name);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("keypair_name", keypair_name);
        return new WithKeypairNameItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new KeypairsRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public KeypairsRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/service/{service_name}/kms/keypairs", pathParameters);
    }
    /**
     * Instantiates a new KeypairsRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public KeypairsRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/service/{service_name}/kms/keypairs", rawUrl);
    }
}
