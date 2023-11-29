package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** How important is the field */
public enum ServiceKafkaConnectGetConnectorConfigurationResponseConfigurationSchemaImportance implements ValuedEnum {
    LOW("LOW"),
    MEDIUM("MEDIUM"),
    HIGH("HIGH");
    public final String value;
    ServiceKafkaConnectGetConnectorConfigurationResponseConfigurationSchemaImportance(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static ServiceKafkaConnectGetConnectorConfigurationResponseConfigurationSchemaImportance forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "LOW": return LOW;
            case "MEDIUM": return MEDIUM;
            case "HIGH": return HIGH;
            default: return null;
        }
    }
}
