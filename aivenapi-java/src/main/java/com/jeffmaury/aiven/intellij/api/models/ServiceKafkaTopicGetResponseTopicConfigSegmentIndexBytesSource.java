package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Source of the Kafka topic configuration entry
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ServiceKafkaTopicGetResponseTopicConfigSegmentIndexBytesSource implements ValuedEnum {
    Unknown_config("unknown_config"),
    Topic_config("topic_config"),
    Dynamic_broker_config("dynamic_broker_config"),
    Dynamic_default_broker_config("dynamic_default_broker_config"),
    Static_broker_config("static_broker_config"),
    Default_config("default_config"),
    Dynamic_broker_logger_config("dynamic_broker_logger_config");
    public final String value;
    ServiceKafkaTopicGetResponseTopicConfigSegmentIndexBytesSource(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ServiceKafkaTopicGetResponseTopicConfigSegmentIndexBytesSource forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown_config": return Unknown_config;
            case "topic_config": return Topic_config;
            case "dynamic_broker_config": return Dynamic_broker_config;
            case "dynamic_default_broker_config": return Dynamic_default_broker_config;
            case "static_broker_config": return Static_broker_config;
            case "default_config": return Default_config;
            case "dynamic_broker_logger_config": return Dynamic_broker_logger_config;
            default: return null;
        }
    }
}
