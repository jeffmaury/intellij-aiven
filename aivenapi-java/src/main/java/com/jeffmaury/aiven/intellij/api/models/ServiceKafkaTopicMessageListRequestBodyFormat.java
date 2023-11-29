package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** The format of consumed messages, which is used to convert messages into a JSON-compatible form. If unspecified, defaults to binary */
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
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static ServiceKafkaTopicMessageListRequestBodyFormat forValue(@javax.annotation.Nonnull final String searchValue) {
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
