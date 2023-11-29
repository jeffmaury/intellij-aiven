package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Topic state
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ServiceUserCredentialsModifyResponseServiceTopicsState implements ValuedEnum {
    ACTIVE("ACTIVE"),
    CONFIGURING("CONFIGURING"),
    DELETING("DELETING");
    public final String value;
    ServiceUserCredentialsModifyResponseServiceTopicsState(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ServiceUserCredentialsModifyResponseServiceTopicsState forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "ACTIVE": return ACTIVE;
            case "CONFIGURING": return CONFIGURING;
            case "DELETING": return DELETING;
            default: return null;
        }
    }
}
