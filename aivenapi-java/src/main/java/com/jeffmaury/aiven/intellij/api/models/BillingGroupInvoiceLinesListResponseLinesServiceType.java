package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Service type, if invoice line is for service use */
public enum BillingGroupInvoiceLinesListResponseLinesServiceType implements ValuedEnum {
    Cassandra("cassandra"),
    Clickhouse("clickhouse"),
    Elasticsearch("elasticsearch"),
    Flink("flink"),
    Grafana("grafana"),
    Influxdb("influxdb"),
    Kafka("kafka"),
    Kafka_connect("kafka_connect"),
    Kafka_mirrormaker("kafka_mirrormaker"),
    M3db("m3db"),
    M3aggregator("m3aggregator"),
    Mysql("mysql"),
    Opensearch("opensearch"),
    Pg("pg"),
    Redis("redis");
    public final String value;
    BillingGroupInvoiceLinesListResponseLinesServiceType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static BillingGroupInvoiceLinesListResponseLinesServiceType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "cassandra": return Cassandra;
            case "clickhouse": return Clickhouse;
            case "elasticsearch": return Elasticsearch;
            case "flink": return Flink;
            case "grafana": return Grafana;
            case "influxdb": return Influxdb;
            case "kafka": return Kafka;
            case "kafka_connect": return Kafka_connect;
            case "kafka_mirrormaker": return Kafka_mirrormaker;
            case "m3db": return M3db;
            case "m3aggregator": return M3aggregator;
            case "mysql": return Mysql;
            case "opensearch": return Opensearch;
            case "pg": return Pg;
            case "redis": return Redis;
            default: return null;
        }
    }
}
