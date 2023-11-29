package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Project VPC state
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum VpcDeleteResponseState implements ValuedEnum {
    ACTIVE("ACTIVE"),
    APPROVED("APPROVED"),
    DELETED("DELETED"),
    DELETING("DELETING");
    public final String value;
    VpcDeleteResponseState(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static VpcDeleteResponseState forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "ACTIVE": return ACTIVE;
            case "APPROVED": return APPROVED;
            case "DELETED": return DELETED;
            case "DELETING": return DELETING;
            default: return null;
        }
    }
}
