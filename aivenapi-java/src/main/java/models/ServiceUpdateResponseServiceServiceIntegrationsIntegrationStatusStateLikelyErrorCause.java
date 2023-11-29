package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Most likely cause of the errors */
public enum ServiceUpdateResponseServiceServiceIntegrationsIntegrationStatusStateLikelyErrorCause implements ValuedEnum {
    Destination("destination"),
    Integration("integration"),
    Source("source"),
    Unknown("unknown");
    public final String value;
    ServiceUpdateResponseServiceServiceIntegrationsIntegrationStatusStateLikelyErrorCause(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static ServiceUpdateResponseServiceServiceIntegrationsIntegrationStatusStateLikelyErrorCause forValue(@javax.annotation.Nonnull final String searchValue) {
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
