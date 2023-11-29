package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Service task type */
public enum ServiceTaskCreateRequestBodyTaskType implements ValuedEnum {
    Upgrade_check("upgrade_check"),
    Migration_check("migration_check"),
    Dataset_import("dataset_import");
    public final String value;
    ServiceTaskCreateRequestBodyTaskType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static ServiceTaskCreateRequestBodyTaskType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "upgrade_check": return Upgrade_check;
            case "migration_check": return Migration_check;
            case "dataset_import": return Dataset_import;
            default: return null;
        }
    }
}
