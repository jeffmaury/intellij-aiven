package com.jeffmaury.aiven.intellij.api.project.item.service.item.kafka.schema.compatibility.subjects.item;

import com.jeffmaury.aiven.intellij.api.project.item.service.item.kafka.schema.compatibility.subjects.item.versions.VersionsRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /project/{project}/service/{service_name}/kafka/schema/compatibility/subjects/{subject_name}
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WithSubjectNameItemRequestBuilder extends BaseRequestBuilder {
    /**
     * The versions property
     */
    @jakarta.annotation.Nonnull
    public VersionsRequestBuilder versions() {
        return new VersionsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new WithSubject_nameItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithSubjectNameItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/service/{service_name}/kafka/schema/compatibility/subjects/{subject_name}", pathParameters);
    }
    /**
     * Instantiates a new WithSubject_nameItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithSubjectNameItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/service/{service_name}/kafka/schema/compatibility/subjects/{subject_name}", rawUrl);
    }
}
