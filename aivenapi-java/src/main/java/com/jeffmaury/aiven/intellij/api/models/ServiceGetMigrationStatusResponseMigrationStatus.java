package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Migration status
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ServiceGetMigrationStatusResponseMigrationStatus implements ValuedEnum {
    Done("done"),
    Failed("failed"),
    Running("running"),
    Syncing("syncing");
    public final String value;
    ServiceGetMigrationStatusResponseMigrationStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ServiceGetMigrationStatusResponseMigrationStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "done": return Done;
            case "failed": return Failed;
            case "running": return Running;
            case "syncing": return Syncing;
            default: return null;
        }
    }
}
