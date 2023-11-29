package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * The format of the content.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ServiceKafkaTopicMessageProduceRequestBodyFormat implements ValuedEnum {
    Binary("binary"),
    Json("json"),
    Avro("avro"),
    Protobuf("protobuf"),
    Jsonschema("jsonschema");
    public final String value;
    ServiceKafkaTopicMessageProduceRequestBodyFormat(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ServiceKafkaTopicMessageProduceRequestBodyFormat forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "binary": return Binary;
            case "json": return Json;
            case "avro": return Avro;
            case "protobuf": return Protobuf;
            case "jsonschema": return Jsonschema;
            default: return null;
        }
    }
}
