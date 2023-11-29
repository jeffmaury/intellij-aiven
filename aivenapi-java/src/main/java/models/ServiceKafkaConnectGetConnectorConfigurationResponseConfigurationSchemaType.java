package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Configuration value type */
public enum ServiceKafkaConnectGetConnectorConfigurationResponseConfigurationSchemaType implements ValuedEnum {
    STRING("STRING"),
    INTEscaped("INT"),
    SHORTEscaped("SHORT"),
    LONGEscaped("LONG"),
    DOUBLEEscaped("DOUBLE"),
    BOOLEANEscaped("BOOLEAN"),
    LIST("LIST"),
    CLASSEscaped("CLASS"),
    PASSWORD("PASSWORD");
    public final String value;
    ServiceKafkaConnectGetConnectorConfigurationResponseConfigurationSchemaType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static ServiceKafkaConnectGetConnectorConfigurationResponseConfigurationSchemaType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "STRING": return STRING;
            case "INT": return INTEscaped;
            case "SHORT": return SHORTEscaped;
            case "LONG": return LONGEscaped;
            case "DOUBLE": return DOUBLEEscaped;
            case "BOOLEAN": return BOOLEANEscaped;
            case "LIST": return LIST;
            case "CLASS": return CLASSEscaped;
            case "PASSWORD": return PASSWORD;
            default: return null;
        }
    }
}
