package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Metrics time period
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ServiceMetricsFetchRequestBodyPeriod implements ValuedEnum {
    Hour("hour"),
    Day("day"),
    Week("week"),
    Month("month"),
    Year("year");
    public final String value;
    ServiceMetricsFetchRequestBodyPeriod(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ServiceMetricsFetchRequestBodyPeriod forValue(@jakarta.annotation.Nonnull final String searchValue) {
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
