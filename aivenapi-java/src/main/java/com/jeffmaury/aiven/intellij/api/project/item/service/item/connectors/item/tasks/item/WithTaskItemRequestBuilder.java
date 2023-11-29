package com.jeffmaury.aiven.intellij.api.project.item.service.item.connectors.item.tasks.item;

import com.jeffmaury.aiven.intellij.api.project.item.service.item.connectors.item.tasks.item.restart.RestartRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /project/{project}/service/{service_name}/connectors/{connector_name}/tasks/{task_id}
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WithTaskItemRequestBuilder extends BaseRequestBuilder {
    /**
     * The restart property
     */
    @jakarta.annotation.Nonnull
    public RestartRequestBuilder restart() {
        return new RestartRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new WithTask_ItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithTaskItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/service/{service_name}/connectors/{connector_name}/tasks/{task_id}", pathParameters);
    }
    /**
     * Instantiates a new WithTask_ItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithTaskItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/service/{service_name}/connectors/{connector_name}/tasks/{task_id}", rawUrl);
    }
}
