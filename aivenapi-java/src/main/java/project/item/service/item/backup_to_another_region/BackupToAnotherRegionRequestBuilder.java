package com.jeffmaury.aiven.intellij.api.project.item.service.item.backup_to_another_region;

import com.jeffmaury.aiven.intellij.api.project.item.service.item.backup_to_another_region.report.ReportRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /project/{project}/service/{service_name}/backup_to_another_region
 */
public class BackupToAnotherRegionRequestBuilder extends BaseRequestBuilder {
    /** The report property */
    @javax.annotation.Nonnull
    public ReportRequestBuilder report() {
        return new ReportRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new Backup_to_another_regionRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public BackupToAnotherRegionRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/service/{service_name}/backup_to_another_region", pathParameters);
    }
    /**
     * Instantiates a new Backup_to_another_regionRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public BackupToAnotherRegionRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/service/{service_name}/backup_to_another_region", rawUrl);
    }
}
