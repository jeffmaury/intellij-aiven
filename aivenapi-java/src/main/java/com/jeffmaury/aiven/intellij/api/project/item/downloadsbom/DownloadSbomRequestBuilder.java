package com.jeffmaury.aiven.intellij.api.project.item.downloadsbom;

import com.jeffmaury.aiven.intellij.api.project.item.downloadsbom.item.WithFileFormatItemRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /project/{project}/download-sbom
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DownloadSbomRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the com.jeffmaury.aiven.intellij.api.project.item.downloadSbom.item collection
     * @param file_format of the SBOM report
     * @return a WithFileFormatItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public WithFileFormatItemRequestBuilder byFile_format(@jakarta.annotation.Nonnull final String file_format) {
        Objects.requireNonNull(file_format);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("file_format", file_format);
        return new WithFileFormatItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new DownloadSbomRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public DownloadSbomRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/download-sbom", pathParameters);
    }
    /**
     * Instantiates a new DownloadSbomRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public DownloadSbomRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/download-sbom", rawUrl);
    }
}
