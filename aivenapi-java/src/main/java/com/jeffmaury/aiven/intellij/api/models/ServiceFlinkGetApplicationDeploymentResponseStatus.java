package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Deployment status
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ServiceFlinkGetApplicationDeploymentResponseStatus implements ValuedEnum {
    INITIALIZING("INITIALIZING"),
    CREATED("CREATED"),
    RUNNING("RUNNING"),
    FAILING("FAILING"),
    FAILED("FAILED"),
    SAVING("SAVING"),
    CANCELLING_REQUESTED("CANCELLING_REQUESTED"),
    CANCELLING("CANCELLING"),
    CANCELED("CANCELED"),
    SAVING_AND_STOP_REQUESTED("SAVING_AND_STOP_REQUESTED"),
    SAVING_AND_STOP("SAVING_AND_STOP"),
    FINISHED("FINISHED"),
    RESTARTING("RESTARTING"),
    SUSPENDED("SUSPENDED"),
    DELETE_REQUESTED("DELETE_REQUESTED"),
    DELETING("DELETING"),
    RECONCILING("RECONCILING");
    public final String value;
    ServiceFlinkGetApplicationDeploymentResponseStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ServiceFlinkGetApplicationDeploymentResponseStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "INITIALIZING": return INITIALIZING;
            case "CREATED": return CREATED;
            case "RUNNING": return RUNNING;
            case "FAILING": return FAILING;
            case "FAILED": return FAILED;
            case "SAVING": return SAVING;
            case "CANCELLING_REQUESTED": return CANCELLING_REQUESTED;
            case "CANCELLING": return CANCELLING;
            case "CANCELED": return CANCELED;
            case "SAVING_AND_STOP_REQUESTED": return SAVING_AND_STOP_REQUESTED;
            case "SAVING_AND_STOP": return SAVING_AND_STOP;
            case "FINISHED": return FINISHED;
            case "RESTARTING": return RESTARTING;
            case "SUSPENDED": return SUSPENDED;
            case "DELETE_REQUESTED": return DELETE_REQUESTED;
            case "DELETING": return DELETING;
            case "RECONCILING": return RECONCILING;
            default: return null;
        }
    }
}
