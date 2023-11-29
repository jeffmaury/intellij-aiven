package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** State of the service */
public enum ServiceCreateResponseServiceState implements ValuedEnum {
    POWEROFF("POWEROFF"),
    REBALANCING("REBALANCING"),
    REBUILDING("REBUILDING"),
    RUNNING("RUNNING");
    public final String value;
    ServiceCreateResponseServiceState(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static ServiceCreateResponseServiceState forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "POWEROFF": return POWEROFF;
            case "REBALANCING": return REBALANCING;
            case "REBUILDING": return REBUILDING;
            case "RUNNING": return RUNNING;
            default: return null;
        }
    }
}
