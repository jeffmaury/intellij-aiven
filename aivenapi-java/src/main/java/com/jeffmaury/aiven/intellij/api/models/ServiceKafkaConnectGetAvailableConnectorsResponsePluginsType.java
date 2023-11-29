package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Describes whether data flows from or to Kafka
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ServiceKafkaConnectGetAvailableConnectorsResponsePluginsType implements ValuedEnum {
    Sink("sink"),
    Source("source"),
    Unknown("unknown");
    public final String value;
    ServiceKafkaConnectGetAvailableConnectorsResponsePluginsType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ServiceKafkaConnectGetAvailableConnectorsResponsePluginsType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "sink": return Sink;
            case "source": return Source;
            case "unknown": return Unknown;
            default: return null;
        }
    }
}
