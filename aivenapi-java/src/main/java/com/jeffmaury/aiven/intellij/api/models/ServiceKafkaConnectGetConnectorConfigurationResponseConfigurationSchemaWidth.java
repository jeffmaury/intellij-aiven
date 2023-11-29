package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Expected length of the input value
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ServiceKafkaConnectGetConnectorConfigurationResponseConfigurationSchemaWidth implements ValuedEnum {
    NONE("NONE"),
    SHORT("SHORT"),
    MEDIUM("MEDIUM"),
    LONG("LONG");
    public final String value;
    ServiceKafkaConnectGetConnectorConfigurationResponseConfigurationSchemaWidth(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ServiceKafkaConnectGetConnectorConfigurationResponseConfigurationSchemaWidth forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "NONE": return NONE;
            case "SHORT": return SHORT;
            case "MEDIUM": return MEDIUM;
            case "LONG": return LONG;
            default: return null;
        }
    }
}
