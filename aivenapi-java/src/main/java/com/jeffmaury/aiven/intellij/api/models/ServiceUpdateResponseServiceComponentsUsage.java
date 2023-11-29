package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** DNS usage name */
public enum ServiceUpdateResponseServiceComponentsUsage implements ValuedEnum {
    Primary("primary"),
    Replica("replica");
    public final String value;
    ServiceUpdateResponseServiceComponentsUsage(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static ServiceUpdateResponseServiceComponentsUsage forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "primary": return Primary;
            case "replica": return Replica;
            default: return null;
        }
    }
}
