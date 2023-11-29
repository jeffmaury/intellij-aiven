package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Current status of the task */
public enum ServiceKafkaConnectGetConnectorStatusResponseStatusTasksState implements ValuedEnum {
    FAILED("FAILED"),
    PAUSED("PAUSED"),
    RUNNING("RUNNING"),
    UNASSIGNED("UNASSIGNED");
    public final String value;
    ServiceKafkaConnectGetConnectorStatusResponseStatusTasksState(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static ServiceKafkaConnectGetConnectorStatusResponseStatusTasksState forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "FAILED": return FAILED;
            case "PAUSED": return PAUSED;
            case "RUNNING": return RUNNING;
            case "UNASSIGNED": return UNASSIGNED;
            default: return null;
        }
    }
}
