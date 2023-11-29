package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Privatelink resource state */
public enum ServicePrivatelinkAWSDeleteResponseState implements ValuedEnum {
    Creating("creating"),
    Active("active"),
    Deleting("deleting");
    public final String value;
    ServicePrivatelinkAWSDeleteResponseState(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static ServicePrivatelinkAWSDeleteResponseState forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "creating": return Creating;
            case "active": return Active;
            case "deleting": return Deleting;
            default: return null;
        }
    }
}
