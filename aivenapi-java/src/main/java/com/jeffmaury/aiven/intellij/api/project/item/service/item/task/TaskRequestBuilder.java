package com.jeffmaury.aiven.intellij.api.project.item.service.item.task;

import com.jeffmaury.aiven.intellij.api.models.ServiceTaskCreateRequestBody;
import com.jeffmaury.aiven.intellij.api.models.ServiceTaskCreateResponse;
import com.jeffmaury.aiven.intellij.api.project.item.service.item.task.item.WithTaskItemRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /project/{project}/service/{service_name}/task
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TaskRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the com.jeffmaury.aiven.intellij.api.project.item.service.item.task.item collection
     * @param task_id Service task
     * @return a WithTaskItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public WithTaskItemRequestBuilder byTask_id(@jakarta.annotation.Nonnull final String task_id) {
        Objects.requireNonNull(task_id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("task_id", task_id);
        return new WithTaskItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new TaskRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public TaskRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/service/{service_name}/task", pathParameters);
    }
    /**
     * Instantiates a new TaskRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public TaskRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/service/{service_name}/task", rawUrl);
    }
    /**
     * Create a new task for service
     * @param body ServiceTaskCreateRequestBody
     * @return a ServiceTaskCreateResponse
     */
    @jakarta.annotation.Nullable
    public ServiceTaskCreateResponse post(@jakarta.annotation.Nonnull final ServiceTaskCreateRequestBody body) {
        return post(body, null);
    }
    /**
     * Create a new task for service
     * @param body ServiceTaskCreateRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a ServiceTaskCreateResponse
     */
    @jakarta.annotation.Nullable
    public ServiceTaskCreateResponse post(@jakarta.annotation.Nonnull final ServiceTaskCreateRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, ServiceTaskCreateResponse::createFromDiscriminatorValue);
    }
    /**
     * Create a new task for service
     * @param body ServiceTaskCreateRequestBody
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final ServiceTaskCreateRequestBody body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Create a new task for service
     * @param body ServiceTaskCreateRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final ServiceTaskCreateRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.POST, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PostRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a TaskRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public TaskRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new TaskRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
