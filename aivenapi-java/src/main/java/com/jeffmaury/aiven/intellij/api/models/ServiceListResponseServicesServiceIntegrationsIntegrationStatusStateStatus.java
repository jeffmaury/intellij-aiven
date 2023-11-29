package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Service integration status
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ServiceListResponseServicesServiceIntegrationsIntegrationStatusStateStatus implements ValuedEnum {
    Failed("failed"),
    Inactive("inactive"),
    Running("running"),
    Starting("starting"),
    Unknown("unknown");
    public final String value;
    ServiceListResponseServicesServiceIntegrationsIntegrationStatusStateStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ServiceListResponseServicesServiceIntegrationsIntegrationStatusStateStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "failed": return Failed;
            case "inactive": return Inactive;
            case "running": return Running;
            case "starting": return Starting;
            case "unknown": return Unknown;
            default: return null;
        }
    }
}
