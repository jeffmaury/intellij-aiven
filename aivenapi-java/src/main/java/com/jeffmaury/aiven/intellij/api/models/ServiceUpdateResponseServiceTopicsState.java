package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Topic state */
public enum ServiceUpdateResponseServiceTopicsState implements ValuedEnum {
    ACTIVE("ACTIVE"),
    CONFIGURING("CONFIGURING"),
    DELETING("DELETING");
    public final String value;
    ServiceUpdateResponseServiceTopicsState(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static ServiceUpdateResponseServiceTopicsState forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "ACTIVE": return ACTIVE;
            case "CONFIGURING": return CONFIGURING;
            case "DELETING": return DELETING;
            default: return null;
        }
    }
}
