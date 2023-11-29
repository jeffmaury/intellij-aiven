package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * DNS usage name
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ServiceGetResponseServiceComponentsUsage implements ValuedEnum {
    Primary("primary"),
    Replica("replica");
    public final String value;
    ServiceGetResponseServiceComponentsUsage(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ServiceGetResponseServiceComponentsUsage forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "primary": return Primary;
            case "replica": return Replica;
            default: return null;
        }
    }
}
