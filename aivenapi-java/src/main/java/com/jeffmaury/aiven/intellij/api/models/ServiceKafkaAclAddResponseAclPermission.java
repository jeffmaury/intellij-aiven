package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Kafka permission
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ServiceKafkaAclAddResponseAclPermission implements ValuedEnum {
    Admin("admin"),
    Read("read"),
    Readwrite("readwrite"),
    Write("write");
    public final String value;
    ServiceKafkaAclAddResponseAclPermission(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ServiceKafkaAclAddResponseAclPermission forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "admin": return Admin;
            case "read": return Read;
            case "readwrite": return Readwrite;
            case "write": return Write;
            default: return null;
        }
    }
}
