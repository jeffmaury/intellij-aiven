package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** DEPRECATED: use config.cleanup_policy */
public enum ServiceKafkaTopicCreateRequestBodyCleanupPolicy implements ValuedEnum {
    Delete("delete"),
    Compact("compact"),
    CompactDelete("compact,delete");
    public final String value;
    ServiceKafkaTopicCreateRequestBodyCleanupPolicy(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static ServiceKafkaTopicCreateRequestBodyCleanupPolicy forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "delete": return Delete;
            case "compact": return Compact;
            case "compact,delete": return CompactDelete;
            default: return null;
        }
    }
}
