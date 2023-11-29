package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Severity level */
public enum ProjectTicketCreateResponseTicketSeverity implements ValuedEnum {
    Critical("critical"),
    High("high"),
    Low("low");
    public final String value;
    ProjectTicketCreateResponseTicketSeverity(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static ProjectTicketCreateResponseTicketSeverity forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "critical": return Critical;
            case "high": return High;
            case "low": return Low;
            default: return null;
        }
    }
}
