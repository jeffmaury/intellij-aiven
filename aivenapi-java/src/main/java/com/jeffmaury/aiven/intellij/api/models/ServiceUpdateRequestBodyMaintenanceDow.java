package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Day of week for installing updates
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ServiceUpdateRequestBodyMaintenanceDow implements ValuedEnum {
    Monday("monday"),
    Tuesday("tuesday"),
    Wednesday("wednesday"),
    Thursday("thursday"),
    Friday("friday"),
    Saturday("saturday"),
    Sunday("sunday");
    public final String value;
    ServiceUpdateRequestBodyMaintenanceDow(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ServiceUpdateRequestBodyMaintenanceDow forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "monday": return Monday;
            case "tuesday": return Tuesday;
            case "wednesday": return Wednesday;
            case "thursday": return Thursday;
            case "friday": return Friday;
            case "saturday": return Saturday;
            case "sunday": return Sunday;
            default: return null;
        }
    }
}
