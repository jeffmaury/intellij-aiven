package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Type of verification to be made
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum OrganizationDomainsListResponseDomainsVerificationType implements ValuedEnum {
    Dns("dns"),
    Http("http");
    public final String value;
    OrganizationDomainsListResponseDomainsVerificationType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static OrganizationDomainsListResponseDomainsVerificationType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "dns": return Dns;
            case "http": return Http;
            default: return null;
        }
    }
}
