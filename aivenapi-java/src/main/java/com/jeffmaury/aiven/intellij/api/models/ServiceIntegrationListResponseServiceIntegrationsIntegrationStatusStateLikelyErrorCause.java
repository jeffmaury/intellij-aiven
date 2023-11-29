package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Most likely cause of the errors
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ServiceIntegrationListResponseServiceIntegrationsIntegrationStatusStateLikelyErrorCause implements ValuedEnum {
    Destination("destination"),
    Integration("integration"),
    Source("source"),
    Unknown("unknown");
    public final String value;
    ServiceIntegrationListResponseServiceIntegrationsIntegrationStatusStateLikelyErrorCause(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ServiceIntegrationListResponseServiceIntegrationsIntegrationStatusStateLikelyErrorCause forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "destination": return Destination;
            case "integration": return Integration;
            case "source": return Source;
            case "unknown": return Unknown;
            default: return null;
        }
    }
}
