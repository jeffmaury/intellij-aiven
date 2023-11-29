package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Expected length of the input value */
public enum ServiceKafkaConnectGetConnectorConfigurationResponseConfigurationSchemaWidth implements ValuedEnum {
    NONE("NONE"),
    SHORTEscaped("SHORT"),
    MEDIUM("MEDIUM"),
    LONGEscaped("LONG");
    public final String value;
    ServiceKafkaConnectGetConnectorConfigurationResponseConfigurationSchemaWidth(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static ServiceKafkaConnectGetConnectorConfigurationResponseConfigurationSchemaWidth forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "NONE": return NONE;
            case "SHORT": return SHORTEscaped;
            case "MEDIUM": return MEDIUM;
            case "LONG": return LONGEscaped;
            default: return null;
        }
    }
}
