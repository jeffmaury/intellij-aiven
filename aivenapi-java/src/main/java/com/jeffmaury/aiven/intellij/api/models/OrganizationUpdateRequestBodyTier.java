package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * New tier for the organization
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum OrganizationUpdateRequestBodyTier implements ValuedEnum {
    Business("business"),
    Personal("personal");
    public final String value;
    OrganizationUpdateRequestBodyTier(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static OrganizationUpdateRequestBodyTier forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "business": return Business;
            case "personal": return Personal;
            default: return null;
        }
    }
}
