package com.jeffmaury.aiven.intellij.api.project.item.service.item.user.item.credentials;

import com.jeffmaury.aiven.intellij.api.project.item.service.item.user.item.credentials.reset.ResetRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /project/{project}/service/{service_name}/user/{service_username}/credentials
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CredentialsRequestBuilder extends BaseRequestBuilder {
    /**
     * The reset property
     */
    @jakarta.annotation.Nonnull
    public ResetRequestBuilder reset() {
        return new ResetRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new CredentialsRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public CredentialsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/service/{service_name}/user/{service_username}/credentials", pathParameters);
    }
    /**
     * Instantiates a new CredentialsRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public CredentialsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/service/{service_name}/user/{service_username}/credentials", rawUrl);
    }
}
