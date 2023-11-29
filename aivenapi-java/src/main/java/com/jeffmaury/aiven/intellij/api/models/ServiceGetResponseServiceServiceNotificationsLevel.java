package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Notification level
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ServiceGetResponseServiceServiceNotificationsLevel implements ValuedEnum {
    Notice("notice"),
    Warning("warning");
    public final String value;
    ServiceGetResponseServiceServiceNotificationsLevel(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ServiceGetResponseServiceServiceNotificationsLevel forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notice": return Notice;
            case "warning": return Warning;
            default: return null;
        }
    }
}
