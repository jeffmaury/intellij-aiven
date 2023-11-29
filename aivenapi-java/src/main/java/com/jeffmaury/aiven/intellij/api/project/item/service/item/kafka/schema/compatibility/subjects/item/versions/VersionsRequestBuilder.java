package com.jeffmaury.aiven.intellij.api.project.item.service.item.kafka.schema.compatibility.subjects.item.versions;

import com.jeffmaury.aiven.intellij.api.project.item.service.item.kafka.schema.compatibility.subjects.item.versions.version_idlatest.d_plus.item.VersionIdLatestDPlusItemRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /project/{project}/service/{service_name}/kafka/schema/compatibility/subjects/{subject_name}/versions
 */
public class VersionsRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the com.jeffmaury.aiven.intellij.api.project.item.service.item.kafka.schema.compatibility.subjects.item.versions.Version_idLatest.d_plus collection
     * @param version_idLatestD_plus Unique identifier of the item
     * @return a VersionIdLatestDPlusItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public VersionIdLatestDPlusItemRequestBuilder byVersion_idLatestD_plus(@javax.annotation.Nonnull final String version_idLatestD_plus) {
        Objects.requireNonNull(version_idLatestD_plus);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("version_id%3Alatest%7C%5Cd%2B", version_idLatestD_plus);
        return new VersionIdLatestDPlusItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new VersionsRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public VersionsRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/service/{service_name}/kafka/schema/compatibility/subjects/{subject_name}/versions", pathParameters);
    }
    /**
     * Instantiates a new VersionsRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public VersionsRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/service/{service_name}/kafka/schema/compatibility/subjects/{subject_name}/versions", rawUrl);
    }
}
