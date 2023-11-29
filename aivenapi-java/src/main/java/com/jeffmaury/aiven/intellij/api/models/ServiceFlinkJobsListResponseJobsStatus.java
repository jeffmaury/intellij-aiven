package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Job status
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ServiceFlinkJobsListResponseJobsStatus implements ValuedEnum {
    INITIALIZING("INITIALIZING"),
    CREATED("CREATED"),
    RUNNING("RUNNING"),
    FAILING("FAILING"),
    FAILED("FAILED"),
    CANCELLING("CANCELLING"),
    CANCELED("CANCELED"),
    FINISHED("FINISHED"),
    RESTARTING("RESTARTING"),
    SUSPENDED("SUSPENDED"),
    RECONCILING("RECONCILING");
    public final String value;
    ServiceFlinkJobsListResponseJobsStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ServiceFlinkJobsListResponseJobsStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "INITIALIZING": return INITIALIZING;
            case "CREATED": return CREATED;
            case "RUNNING": return RUNNING;
            case "FAILING": return FAILING;
            case "FAILED": return FAILED;
            case "CANCELLING": return CANCELLING;
            case "CANCELED": return CANCELED;
            case "FINISHED": return FINISHED;
            case "RESTARTING": return RESTARTING;
            case "SUSPENDED": return SUSPENDED;
            case "RECONCILING": return RECONCILING;
            default: return null;
        }
    }
}
