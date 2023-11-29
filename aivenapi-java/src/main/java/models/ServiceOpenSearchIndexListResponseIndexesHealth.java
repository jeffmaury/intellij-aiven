package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Index health */
public enum ServiceOpenSearchIndexListResponseIndexesHealth implements ValuedEnum {
    Green("green"),
    Yellow("yellow"),
    Red("red"),
    Red_("red*"),
    Unknown("unknown");
    public final String value;
    ServiceOpenSearchIndexListResponseIndexesHealth(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static ServiceOpenSearchIndexListResponseIndexesHealth forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "green": return Green;
            case "yellow": return Yellow;
            case "red": return Red;
            case "red*": return Red;
            case "unknown": return Unknown;
            default: return null;
        }
    }
}
