package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * OrganizationDomainVerificationType
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum OrganizationDomainUpdateRequestBodyVerificationType implements ValuedEnum {
    Dns("dns"),
    Http("http");
    public final String value;
    OrganizationDomainUpdateRequestBodyVerificationType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static OrganizationDomainUpdateRequestBodyVerificationType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "dns": return Dns;
            case "http": return Http;
            default: return null;
        }
    }
}
