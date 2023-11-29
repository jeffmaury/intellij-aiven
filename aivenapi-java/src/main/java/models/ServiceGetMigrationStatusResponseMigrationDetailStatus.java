package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Migration status */
public enum ServiceGetMigrationStatusResponseMigrationDetailStatus implements ValuedEnum {
    Done("done"),
    Failed("failed"),
    Running("running"),
    Syncing("syncing");
    public final String value;
    ServiceGetMigrationStatusResponseMigrationDetailStatus(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static ServiceGetMigrationStatusResponseMigrationDetailStatus forValue(@javax.annotation.Nonnull final String searchValue) {
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
