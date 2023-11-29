package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Project VPC state */
public enum VpcDeleteResponseState implements ValuedEnum {
    ACTIVE("ACTIVE"),
    APPROVED("APPROVED"),
    DELETED("DELETED"),
    DELETING("DELETING");
    public final String value;
    VpcDeleteResponseState(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static VpcDeleteResponseState forValue(@javax.annotation.Nonnull final String searchValue) {
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
