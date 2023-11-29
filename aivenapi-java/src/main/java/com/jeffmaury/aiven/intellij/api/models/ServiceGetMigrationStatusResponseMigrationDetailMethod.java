package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * The migration method to be used (currently supported only by Redis, Dragonfly, MySQL and PostgreSQL service types)
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ServiceGetMigrationStatusResponseMigrationDetailMethod implements ValuedEnum {
    Pg_dump("pg_dump"),
    Scan("scan"),
    Comma(",");
    public final String value;
    ServiceGetMigrationStatusResponseMigrationDetailMethod(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ServiceGetMigrationStatusResponseMigrationDetailMethod forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "pg_dump": return Pg_dump;
            case "scan": return Scan;
            case ",": return Comma;
            default: return null;
        }
    }
}
