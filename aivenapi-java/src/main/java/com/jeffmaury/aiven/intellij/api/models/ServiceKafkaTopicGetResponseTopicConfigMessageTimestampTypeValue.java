package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * message.timestamp.type
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ServiceKafkaTopicGetResponseTopicConfigMessageTimestampTypeValue implements ValuedEnum {
    CreateTime("CreateTime"),
    LogAppendTime("LogAppendTime");
    public final String value;
    ServiceKafkaTopicGetResponseTopicConfigMessageTimestampTypeValue(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ServiceKafkaTopicGetResponseTopicConfigMessageTimestampTypeValue forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "CreateTime": return CreateTime;
            case "LogAppendTime": return LogAppendTime;
            default: return null;
        }
    }
}
