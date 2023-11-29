package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Service integration status */
public enum ServiceIntegrationGetResponseServiceIntegrationIntegrationStatusStateStatus implements ValuedEnum {
    Failed("failed"),
    Inactive("inactive"),
    Running("running"),
    Starting("starting"),
    Unknown("unknown");
    public final String value;
    ServiceIntegrationGetResponseServiceIntegrationIntegrationStatusStateStatus(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static ServiceIntegrationGetResponseServiceIntegrationIntegrationStatusStateStatus forValue(@javax.annotation.Nonnull final String searchValue) {
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
