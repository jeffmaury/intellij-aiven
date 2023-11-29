package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Configuration value type
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ServiceKafkaConnectGetConnectorConfigurationResponseConfigurationSchemaType implements ValuedEnum {
    STRING("STRING"),
    INT("INT"),
    SHORT("SHORT"),
    LONG("LONG"),
    DOUBLE("DOUBLE"),
    BOOLEAN("BOOLEAN"),
    LIST("LIST"),
    CLASS("CLASS"),
    PASSWORD("PASSWORD");
    public final String value;
    ServiceKafkaConnectGetConnectorConfigurationResponseConfigurationSchemaType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ServiceKafkaConnectGetConnectorConfigurationResponseConfigurationSchemaType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "STRING": return STRING;
            case "INT": return INT;
            case "SHORT": return SHORT;
            case "LONG": return LONG;
            case "DOUBLE": return DOUBLE;
            case "BOOLEAN": return BOOLEAN;
            case "LIST": return LIST;
            case "CLASS": return CLASS;
            case "PASSWORD": return PASSWORD;
            default: return null;
        }
    }
}
