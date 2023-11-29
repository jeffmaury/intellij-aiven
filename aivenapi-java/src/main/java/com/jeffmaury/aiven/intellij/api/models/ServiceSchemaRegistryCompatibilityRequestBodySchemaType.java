package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Schema type
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ServiceSchemaRegistryCompatibilityRequestBodySchemaType implements ValuedEnum {
    AVRO("AVRO"),
    JSON("JSON"),
    PROTOBUF("PROTOBUF");
    public final String value;
    ServiceSchemaRegistryCompatibilityRequestBodySchemaType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ServiceSchemaRegistryCompatibilityRequestBodySchemaType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "AVRO": return AVRO;
            case "JSON": return JSON;
            case "PROTOBUF": return PROTOBUF;
            default: return null;
        }
    }
}
