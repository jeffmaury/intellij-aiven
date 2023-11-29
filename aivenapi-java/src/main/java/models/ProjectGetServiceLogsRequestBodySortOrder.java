package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Sort order for log messages */
public enum ProjectGetServiceLogsRequestBodySortOrder implements ValuedEnum {
    Desc("desc"),
    Asc("asc");
    public final String value;
    ProjectGetServiceLogsRequestBodySortOrder(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static ProjectGetServiceLogsRequestBodySortOrder forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "desc": return Desc;
            case "asc": return Asc;
            default: return null;
        }
    }
}
