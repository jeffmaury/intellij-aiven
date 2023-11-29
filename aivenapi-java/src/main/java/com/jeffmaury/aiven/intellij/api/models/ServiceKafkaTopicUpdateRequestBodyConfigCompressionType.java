package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * compression.type
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ServiceKafkaTopicUpdateRequestBodyConfigCompressionType implements ValuedEnum {
    Snappy("snappy"),
    Gzip("gzip"),
    Lz4("lz4"),
    Producer("producer"),
    Uncompressed("uncompressed"),
    Zstd("zstd");
    public final String value;
    ServiceKafkaTopicUpdateRequestBodyConfigCompressionType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ServiceKafkaTopicUpdateRequestBodyConfigCompressionType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "snappy": return Snappy;
            case "gzip": return Gzip;
            case "lz4": return Lz4;
            case "producer": return Producer;
            case "uncompressed": return Uncompressed;
            case "zstd": return Zstd;
            default: return null;
        }
    }
}
