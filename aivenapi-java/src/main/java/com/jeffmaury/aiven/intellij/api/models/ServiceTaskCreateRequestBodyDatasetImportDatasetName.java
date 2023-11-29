package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Name of the dataset to import to PostgreSQL database. Used with dataset_import.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ServiceTaskCreateRequestBodyDatasetImportDatasetName implements ValuedEnum {
    Pagila("pagila");
    public final String value;
    ServiceTaskCreateRequestBodyDatasetImportDatasetName(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ServiceTaskCreateRequestBodyDatasetImportDatasetName forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "pagila": return Pagila;
            default: return null;
        }
    }
}
