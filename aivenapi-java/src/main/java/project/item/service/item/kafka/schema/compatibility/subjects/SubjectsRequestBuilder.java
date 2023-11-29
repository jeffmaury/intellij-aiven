package com.jeffmaury.aiven.intellij.api.project.item.service.item.kafka.schema.compatibility.subjects;

import com.jeffmaury.aiven.intellij.api.project.item.service.item.kafka.schema.compatibility.subjects.item.WithSubjectNameItemRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /project/{project}/service/{service_name}/kafka/schema/compatibility/subjects
 */
public class SubjectsRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the com.jeffmaury.aiven.intellij.api.project.item.service.item.kafka.schema.compatibility.subjects.item collection
     * @param subject_name Unique identifier of the item
     * @return a WithSubjectNameItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public WithSubjectNameItemRequestBuilder bySubject_name(@javax.annotation.Nonnull final String subject_name) {
        Objects.requireNonNull(subject_name);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("subject_name", subject_name);
        return new WithSubjectNameItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new SubjectsRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public SubjectsRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/service/{service_name}/kafka/schema/compatibility/subjects", pathParameters);
    }
    /**
     * Instantiates a new SubjectsRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public SubjectsRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/service/{service_name}/kafka/schema/compatibility/subjects", rawUrl);
    }
}
