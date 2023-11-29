package com.jeffmaury.aiven.intellij.api.project.item.service.item.clickhouse.query.stats;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum GetOrderByQueryParameterType implements ValuedEnum {
    CallsAsc("calls:asc"),
    CallsDesc("calls:desc"),
    Min_timeAsc("min_time:asc"),
    Min_timeDesc("min_time:desc"),
    Max_timeAsc("max_time:asc"),
    Max_timeDesc("max_time:desc"),
    Mean_timeAsc("mean_time:asc"),
    Mean_timeDesc("mean_time:desc"),
    P95_timeAsc("p95_time:asc"),
    P95_timeDesc("p95_time:desc"),
    Stddev_timeAsc("stddev_time:asc"),
    Stddev_timeDesc("stddev_time:desc"),
    Total_timeAsc("total_time:asc"),
    Total_timeDesc("total_time:desc");
    public final String value;
    GetOrderByQueryParameterType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static GetOrderByQueryParameterType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "calls:asc": return CallsAsc;
            case "calls:desc": return CallsDesc;
            case "min_time:asc": return Min_timeAsc;
            case "min_time:desc": return Min_timeDesc;
            case "max_time:asc": return Max_timeAsc;
            case "max_time:desc": return Max_timeDesc;
            case "mean_time:asc": return Mean_timeAsc;
            case "mean_time:desc": return Mean_timeDesc;
            case "p95_time:asc": return P95_timeAsc;
            case "p95_time:desc": return P95_timeDesc;
            case "stddev_time:asc": return Stddev_timeAsc;
            case "stddev_time:desc": return Stddev_timeDesc;
            case "total_time:asc": return Total_timeAsc;
            case "total_time:desc": return Total_timeDesc;
            default: return null;
        }
    }
}
