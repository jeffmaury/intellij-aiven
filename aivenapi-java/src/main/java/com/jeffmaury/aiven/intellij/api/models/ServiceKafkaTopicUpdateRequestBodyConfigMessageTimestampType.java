package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** message.timestamp.type */
public enum ServiceKafkaTopicUpdateRequestBodyConfigMessageTimestampType implements ValuedEnum {
    CreateTime("CreateTime"),
    LogAppendTime("LogAppendTime");
    public final String value;
    ServiceKafkaTopicUpdateRequestBodyConfigMessageTimestampType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static ServiceKafkaTopicUpdateRequestBodyConfigMessageTimestampType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "CreateTime": return CreateTime;
            case "LogAppendTime": return LogAppendTime;
            default: return null;
        }
    }
}
