package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** The format of the content. */
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
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static ServiceKafkaTopicMessageProduceRequestBodyFormat forValue(@javax.annotation.Nonnull final String searchValue) {
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
