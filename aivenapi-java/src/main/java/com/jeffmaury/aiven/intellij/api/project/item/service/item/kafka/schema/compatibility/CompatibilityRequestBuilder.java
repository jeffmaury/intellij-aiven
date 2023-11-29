package com.jeffmaury.aiven.intellij.api.project.item.service.item.kafka.schema.compatibility;

import com.jeffmaury.aiven.intellij.api.project.item.service.item.kafka.schema.compatibility.subjects.SubjectsRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /project/{project}/service/{service_name}/kafka/schema/compatibility
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CompatibilityRequestBuilder extends BaseRequestBuilder {
    /**
     * The subjects property
     */
    @jakarta.annotation.Nonnull
    public SubjectsRequestBuilder subjects() {
        return new SubjectsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new CompatibilityRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public CompatibilityRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/service/{service_name}/kafka/schema/compatibility", pathParameters);
    }
    /**
     * Instantiates a new CompatibilityRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public CompatibilityRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/service/{service_name}/kafka/schema/compatibility", rawUrl);
    }
}
