package com.jeffmaury.aiven.intellij.api.project.item.service.item.privatelink;

import com.jeffmaury.aiven.intellij.api.project.item.service.item.privatelink.aws.AwsRequestBuilder;
import com.jeffmaury.aiven.intellij.api.project.item.service.item.privatelink.azure.AzureRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /project/{project}/service/{service_name}/privatelink
 */
public class PrivatelinkRequestBuilder extends BaseRequestBuilder {
    /** The aws property */
    @javax.annotation.Nonnull
    public AwsRequestBuilder aws() {
        return new AwsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The azure property */
    @javax.annotation.Nonnull
    public AzureRequestBuilder azure() {
        return new AzureRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new PrivatelinkRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public PrivatelinkRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/service/{service_name}/privatelink", pathParameters);
    }
    /**
     * Instantiates a new PrivatelinkRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public PrivatelinkRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/service/{service_name}/privatelink", rawUrl);
    }
}
