package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Metrics time period */
public enum ServiceBackupToAnotherRegionReportRequestBodyPeriod implements ValuedEnum {
    Hour("hour"),
    Day("day"),
    Week("week"),
    Month("month"),
    Year("year");
    public final String value;
    ServiceBackupToAnotherRegionReportRequestBodyPeriod(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static ServiceBackupToAnotherRegionReportRequestBodyPeriod forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "hour": return Hour;
            case "day": return Day;
            case "week": return Week;
            case "month": return Month;
            case "year": return Year;
            default: return null;
        }
    }
}
