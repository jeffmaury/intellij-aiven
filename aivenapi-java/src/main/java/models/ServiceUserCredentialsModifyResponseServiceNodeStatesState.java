package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Current state of the service node */
public enum ServiceUserCredentialsModifyResponseServiceNodeStatesState implements ValuedEnum {
    Leaving("leaving"),
    Running("running"),
    Setting_up_vm("setting_up_vm"),
    Syncing_data("syncing_data"),
    Timing_out("timing_out"),
    Unknown("unknown");
    public final String value;
    ServiceUserCredentialsModifyResponseServiceNodeStatesState(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static ServiceUserCredentialsModifyResponseServiceNodeStatesState forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "leaving": return Leaving;
            case "running": return Running;
            case "setting_up_vm": return Setting_up_vm;
            case "syncing_data": return Syncing_data;
            case "timing_out": return Timing_out;
            case "unknown": return Unknown;
            default: return null;
        }
    }
}
