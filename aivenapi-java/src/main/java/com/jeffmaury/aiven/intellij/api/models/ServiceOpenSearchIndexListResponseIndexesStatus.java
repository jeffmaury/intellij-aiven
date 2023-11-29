package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Index status */
public enum ServiceOpenSearchIndexListResponseIndexesStatus implements ValuedEnum {
    Unknown("unknown"),
    Open("open"),
    Close("close"),
    None("none");
    public final String value;
    ServiceOpenSearchIndexListResponseIndexesStatus(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static ServiceOpenSearchIndexListResponseIndexesStatus forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "open": return Open;
            case "close": return Close;
            case "none": return None;
            default: return null;
        }
    }
}
