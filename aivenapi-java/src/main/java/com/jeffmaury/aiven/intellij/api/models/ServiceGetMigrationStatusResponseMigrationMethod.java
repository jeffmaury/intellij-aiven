package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** The migration method to be used (currently supported only by Redis, Dragonfly, MySQL and PostgreSQL service types) */
public enum ServiceGetMigrationStatusResponseMigrationMethod implements ValuedEnum {
    Pg_dump("pg_dump"),
    Scan("scan");
    public final String value;
    ServiceGetMigrationStatusResponseMigrationMethod(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static ServiceGetMigrationStatusResponseMigrationMethod forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "pg_dump": return Pg_dump;
            case "scan": return Scan;
            default: return null;
        }
    }
}
