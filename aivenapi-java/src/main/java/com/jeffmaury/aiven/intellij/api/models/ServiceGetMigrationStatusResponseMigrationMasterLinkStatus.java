package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Redis only: replication master link status */
public enum ServiceGetMigrationStatusResponseMigrationMasterLinkStatus implements ValuedEnum {
    Up("up"),
    Down("down");
    public final String value;
    ServiceGetMigrationStatusResponseMigrationMasterLinkStatus(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static ServiceGetMigrationStatusResponseMigrationMasterLinkStatus forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "up": return Up;
            case "down": return Down;
            default: return null;
        }
    }
}
