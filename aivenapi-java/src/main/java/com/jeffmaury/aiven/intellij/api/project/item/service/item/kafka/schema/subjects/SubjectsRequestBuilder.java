package com.jeffmaury.aiven.intellij.api.project.item.service.item.kafka.schema.subjects;

import com.jeffmaury.aiven.intellij.api.models.ServiceSchemaRegistrySubjectsResponse;
import com.jeffmaury.aiven.intellij.api.project.item.service.item.kafka.schema.subjects.item.WithSubjectNameItemRequestBuilder;
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
 * Builds and executes requests for operations under /project/{project}/service/{service_name}/kafka/schema/subjects
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SubjectsRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the com.jeffmaury.aiven.intellij.api.project.item.service.item.kafka.schema.subjects.item collection
     * @param subject_name Subject name
     * @return a WithSubjectNameItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public WithSubjectNameItemRequestBuilder bySubject_name(@jakarta.annotation.Nonnull final String subject_name) {
        Objects.requireNonNull(subject_name);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("subject_name", subject_name);
        return new WithSubjectNameItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new SubjectsRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public SubjectsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/service/{service_name}/kafka/schema/subjects", pathParameters);
    }
    /**
     * Instantiates a new SubjectsRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public SubjectsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/service/{service_name}/kafka/schema/subjects", rawUrl);
    }
    /**
     * Lists Schema Registry subjects
     * @return a ServiceSchemaRegistrySubjectsResponse
     */
    @jakarta.annotation.Nullable
    public ServiceSchemaRegistrySubjectsResponse get() {
        return get(null);
    }
    /**
     * Lists Schema Registry subjects
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a ServiceSchemaRegistrySubjectsResponse
     */
    @jakarta.annotation.Nullable
    public ServiceSchemaRegistrySubjectsResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, ServiceSchemaRegistrySubjectsResponse::createFromDiscriminatorValue);
    }
    /**
     * Lists Schema Registry subjects
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Lists Schema Registry subjects
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.GET, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, GetRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a SubjectsRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public SubjectsRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new SubjectsRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
    }
}
