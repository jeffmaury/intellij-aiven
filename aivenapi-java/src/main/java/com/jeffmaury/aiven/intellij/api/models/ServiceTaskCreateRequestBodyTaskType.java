package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Service task type
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ServiceTaskCreateRequestBodyTaskType implements ValuedEnum {
    Upgrade_check("upgrade_check"),
    Migration_check("migration_check"),
    Dataset_import("dataset_import");
    public final String value;
    ServiceTaskCreateRequestBodyTaskType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ServiceTaskCreateRequestBodyTaskType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "upgrade_check": return Upgrade_check;
            case "migration_check": return Migration_check;
            case "dataset_import": return Dataset_import;
            default: return null;
        }
    }
}
