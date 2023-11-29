package com.jeffmaury.aiven.intellij.api.project.item.service.item.flink;

import com.jeffmaury.aiven.intellij.api.project.item.service.item.flink.application.ApplicationRequestBuilder;
import com.jeffmaury.aiven.intellij.api.project.item.service.item.flink.job.JobRequestBuilder;
import com.jeffmaury.aiven.intellij.api.project.item.service.item.flink.overview.OverviewRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /project/{project}/service/{service_name}/flink
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class FlinkRequestBuilder extends BaseRequestBuilder {
    /**
     * The application property
     */
    @jakarta.annotation.Nonnull
    public ApplicationRequestBuilder application() {
        return new ApplicationRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The job property
     */
    @jakarta.annotation.Nonnull
    public JobRequestBuilder job() {
        return new JobRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The overview property
     */
    @jakarta.annotation.Nonnull
    public OverviewRequestBuilder overview() {
        return new OverviewRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new FlinkRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public FlinkRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/service/{service_name}/flink", pathParameters);
    }
    /**
     * Instantiates a new FlinkRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public FlinkRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/service/{service_name}/flink", rawUrl);
    }
}
