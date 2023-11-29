package com.jeffmaury.aiven.intellij.api.project.item.service.item.connectors.item.tasks;

import com.jeffmaury.aiven.intellij.api.project.item.service.item.connectors.item.tasks.item.WithTaskItemRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /project/{project}/service/{service_name}/connectors/{connector_name}/tasks
 */
public class TasksRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the com.jeffmaury.aiven.intellij.api.project.item.service.item.connectors.item.tasks.item collection
     * @param task_id Unique identifier of the item
     * @return a WithTaskItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public WithTaskItemRequestBuilder byTask_id(@javax.annotation.Nonnull final String task_id) {
        Objects.requireNonNull(task_id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("task_id", task_id);
        return new WithTaskItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new TasksRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public TasksRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/service/{service_name}/connectors/{connector_name}/tasks", pathParameters);
    }
    /**
     * Instantiates a new TasksRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public TasksRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/service/{service_name}/connectors/{connector_name}/tasks", rawUrl);
    }
}
