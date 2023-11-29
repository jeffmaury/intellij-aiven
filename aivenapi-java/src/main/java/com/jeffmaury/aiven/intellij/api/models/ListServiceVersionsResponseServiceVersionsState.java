package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Service state */
public enum ListServiceVersionsResponseServiceVersionsState implements ValuedEnum {
    Available("available"),
    Eol("eol"),
    Preview("preview"),
    Terminated("terminated"),
    Unavailable("unavailable");
    public final String value;
    ListServiceVersionsResponseServiceVersionsState(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static ListServiceVersionsResponseServiceVersionsState forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "available": return Available;
            case "eol": return Eol;
            case "preview": return Preview;
            case "terminated": return Terminated;
            case "unavailable": return Unavailable;
            default: return null;
        }
    }
}
