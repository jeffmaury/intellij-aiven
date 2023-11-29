package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Day of week for installing updates */
public enum ServiceUserCredentialsResetResponseServiceMaintenanceDow implements ValuedEnum {
    Monday("monday"),
    Tuesday("tuesday"),
    Wednesday("wednesday"),
    Thursday("thursday"),
    Friday("friday"),
    Saturday("saturday"),
    Sunday("sunday"),
    Never("never");
    public final String value;
    ServiceUserCredentialsResetResponseServiceMaintenanceDow(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static ServiceUserCredentialsResetResponseServiceMaintenanceDow forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "monday": return Monday;
            case "tuesday": return Tuesday;
            case "wednesday": return Wednesday;
            case "thursday": return Thursday;
            case "friday": return Friday;
            case "saturday": return Saturday;
            case "sunday": return Sunday;
            case "never": return Never;
            default: return null;
        }
    }
}
