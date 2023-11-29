package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * HTTP method used for redirecting
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum UserAuthLoginOptionsResponseMethod implements ValuedEnum {
    POST("POST"),
    GET("GET");
    public final String value;
    UserAuthLoginOptionsResponseMethod(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static UserAuthLoginOptionsResponseMethod forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "POST": return POST;
            case "GET": return GET;
            default: return null;
        }
    }
}
