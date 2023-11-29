package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * The format of consumed messages, which is used to convert messages into a JSON-compatible form. If unspecified, defaults to binary
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ServiceKafkaTopicMessageListRequestBodyFormat implements ValuedEnum {
    Binary("binary"),
    Json("json"),
    Avro("avro"),
    Protobuf("protobuf"),
    Jsonschema("jsonschema");
    public final String value;
    ServiceKafkaTopicMessageListRequestBodyFormat(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ServiceKafkaTopicMessageListRequestBodyFormat forValue(@jakarta.annotation.Nonnull final String searchValue) {
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
