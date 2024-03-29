package com.jeffmaury.aiven.intellij.api.project.item.service.item.opensearch;

import com.jeffmaury.aiven.intellij.api.project.item.service.item.opensearch.acl.AclRequestBuilder;
import com.jeffmaury.aiven.intellij.api.project.item.service.item.opensearch.security.SecurityRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /project/{project}/service/{service_name}/opensearch
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class OpensearchRequestBuilder extends BaseRequestBuilder {
    /**
     * The acl property
     */
    @jakarta.annotation.Nonnull
    public AclRequestBuilder acl() {
        return new AclRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The security property
     */
    @jakarta.annotation.Nonnull
    public SecurityRequestBuilder security() {
        return new SecurityRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new OpensearchRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public OpensearchRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/service/{service_name}/opensearch", pathParameters);
    }
    /**
     * Instantiates a new OpensearchRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public OpensearchRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/service/{service_name}/opensearch", rawUrl);
    }
}
