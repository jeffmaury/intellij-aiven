package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Sort order for log messages
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ProjectGetServiceLogsRequestBodySortOrder implements ValuedEnum {
    Desc("desc"),
    Asc("asc");
    public final String value;
    ProjectGetServiceLogsRequestBodySortOrder(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ProjectGetServiceLogsRequestBodySortOrder forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "desc": return Desc;
            case "asc": return Asc;
            default: return null;
        }
    }
}
