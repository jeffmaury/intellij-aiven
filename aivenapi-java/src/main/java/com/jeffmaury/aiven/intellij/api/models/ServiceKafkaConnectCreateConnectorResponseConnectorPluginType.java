package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Describes whether data flows from or to Kafka */
public enum ServiceKafkaConnectCreateConnectorResponseConnectorPluginType implements ValuedEnum {
    Sink("sink"),
    Source("source"),
    Unknown("unknown");
    public final String value;
    ServiceKafkaConnectCreateConnectorResponseConnectorPluginType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static ServiceKafkaConnectCreateConnectorResponseConnectorPluginType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "sink": return Sink;
            case "source": return Source;
            case "unknown": return Unknown;
            default: return null;
        }
    }
}
