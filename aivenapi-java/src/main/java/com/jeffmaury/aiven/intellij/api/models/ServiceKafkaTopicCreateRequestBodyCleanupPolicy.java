package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * DEPRECATED: use config.cleanup_policy
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ServiceKafkaTopicCreateRequestBodyCleanupPolicy implements ValuedEnum {
    Delete("delete"),
    Compact("compact"),
    CompactDelete("compact,delete");
    public final String value;
    ServiceKafkaTopicCreateRequestBodyCleanupPolicy(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ServiceKafkaTopicCreateRequestBodyCleanupPolicy forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "delete": return Delete;
            case "compact": return Compact;
            case "compact,delete": return CompactDelete;
            default: return null;
        }
    }
}
