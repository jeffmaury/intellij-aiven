package com.jeffmaury.aiven.intellij.api.project.item.generatesbomdownloadurl;

import com.jeffmaury.aiven.intellij.api.project.item.generatesbomdownloadurl.item.WithFileFormatItemRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /project/{project}/generate-sbom-download-url
 */
public class GenerateSbomDownloadUrlRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the com.jeffmaury.aiven.intellij.api.project.item.generateSbomDownloadUrl.item collection
     * @param file_format Unique identifier of the item
     * @return a WithFileFormatItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public WithFileFormatItemRequestBuilder byFile_format(@javax.annotation.Nonnull final String file_format) {
        Objects.requireNonNull(file_format);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("file_format", file_format);
        return new WithFileFormatItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new GenerateSbomDownloadUrlRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public GenerateSbomDownloadUrlRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/generate-sbom-download-url", pathParameters);
    }
    /**
     * Instantiates a new GenerateSbomDownloadUrlRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public GenerateSbomDownloadUrlRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/generate-sbom-download-url", rawUrl);
    }
}
