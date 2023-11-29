package com.jeffmaury.aiven.intellij.api.project.item.service.item.maintenance;

import com.jeffmaury.aiven.intellij.api.project.item.service.item.maintenance.start.StartRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /project/{project}/service/{service_name}/maintenance
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MaintenanceRequestBuilder extends BaseRequestBuilder {
    /**
     * The start property
     */
    @jakarta.annotation.Nonnull
    public StartRequestBuilder start() {
        return new StartRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new MaintenanceRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public MaintenanceRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/service/{service_name}/maintenance", pathParameters);
    }
    /**
     * Instantiates a new MaintenanceRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public MaintenanceRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/service/{service_name}/maintenance", rawUrl);
    }
}
