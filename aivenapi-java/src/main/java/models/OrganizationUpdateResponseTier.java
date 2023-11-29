package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Tier of the organization */
public enum OrganizationUpdateResponseTier implements ValuedEnum {
    Business("business"),
    Personal("personal");
    public final String value;
    OrganizationUpdateResponseTier(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static OrganizationUpdateResponseTier forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "business": return Business;
            case "personal": return Personal;
            default: return null;
        }
    }
}
