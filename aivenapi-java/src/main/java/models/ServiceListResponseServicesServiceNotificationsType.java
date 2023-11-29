package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Notification type */
public enum ServiceListResponseServicesServiceNotificationsType implements ValuedEnum {
    Service_end_of_life("service_end_of_life"),
    Service_powered_off_removal("service_powered_off_removal");
    public final String value;
    ServiceListResponseServicesServiceNotificationsType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static ServiceListResponseServicesServiceNotificationsType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "service_end_of_life": return Service_end_of_life;
            case "service_powered_off_removal": return Service_powered_off_removal;
            default: return null;
        }
    }
}
