package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Service state
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
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
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ListServiceVersionsResponseServiceVersionsState forValue(@jakarta.annotation.Nonnull final String searchValue) {
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
