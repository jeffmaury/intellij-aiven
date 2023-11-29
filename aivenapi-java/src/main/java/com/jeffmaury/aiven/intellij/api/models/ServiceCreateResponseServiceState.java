package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * State of the service
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ServiceCreateResponseServiceState implements ValuedEnum {
    POWEROFF("POWEROFF"),
    REBALANCING("REBALANCING"),
    REBUILDING("REBUILDING"),
    RUNNING("RUNNING");
    public final String value;
    ServiceCreateResponseServiceState(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ServiceCreateResponseServiceState forValue(@jakarta.annotation.Nonnull final String searchValue) {
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
