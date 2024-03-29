package com.jeffmaury.aiven.intellij.api.project.item.service.item.backup_to_another_region;

import com.jeffmaury.aiven.intellij.api.project.item.service.item.backup_to_another_region.report.ReportRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /project/{project}/service/{service_name}/backup_to_another_region
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class BackupToAnotherRegionRequestBuilder extends BaseRequestBuilder {
    /**
     * The report property
     */
    @jakarta.annotation.Nonnull
    public ReportRequestBuilder report() {
        return new ReportRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new Backup_to_another_regionRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public BackupToAnotherRegionRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/service/{service_name}/backup_to_another_region", pathParameters);
    }
    /**
     * Instantiates a new Backup_to_another_regionRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public BackupToAnotherRegionRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/service/{service_name}/backup_to_another_region", rawUrl);
    }
}
