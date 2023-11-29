package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Privatelink resource state
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ServicePrivatelinkAWSGetResponseState implements ValuedEnum {
    Creating("creating"),
    Active("active"),
    Deleting("deleting");
    public final String value;
    ServicePrivatelinkAWSGetResponseState(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ServicePrivatelinkAWSGetResponseState forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "creating": return Creating;
            case "active": return Active;
            case "deleting": return Deleting;
            default: return null;
        }
    }
}
