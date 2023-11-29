package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Severity level
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum OrganizationTicketListResponseTicketsSeverity implements ValuedEnum {
    Critical("critical"),
    High("high"),
    Low("low");
    public final String value;
    OrganizationTicketListResponseTicketsSeverity(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static OrganizationTicketListResponseTicketsSeverity forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "critical": return Critical;
            case "high": return High;
            case "low": return Low;
            default: return null;
        }
    }
}
