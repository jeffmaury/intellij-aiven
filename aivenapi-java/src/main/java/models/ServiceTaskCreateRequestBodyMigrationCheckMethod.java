package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** The migration method to be used (currently supported only by Redis, Dragonfly, MySQL and PostgreSQL service types) */
public enum ServiceTaskCreateRequestBodyMigrationCheckMethod implements ValuedEnum {
    Dump("dump"),
    Replication("replication");
    public final String value;
    ServiceTaskCreateRequestBodyMigrationCheckMethod(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static ServiceTaskCreateRequestBodyMigrationCheckMethod forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "dump": return Dump;
            case "replication": return Replication;
            default: return null;
        }
    }
}
