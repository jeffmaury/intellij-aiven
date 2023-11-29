package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * message.timestamp.type
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ServiceKafkaTopicCreateRequestBodyConfigMessageTimestampType implements ValuedEnum {
    CreateTime("CreateTime"),
    LogAppendTime("LogAppendTime");
    public final String value;
    ServiceKafkaTopicCreateRequestBodyConfigMessageTimestampType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ServiceKafkaTopicCreateRequestBodyConfigMessageTimestampType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "CreateTime": return CreateTime;
            case "LogAppendTime": return LogAppendTime;
            default: return null;
        }
    }
}
