package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Service integration type
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ServiceIntegrationCreateRequestBodyIntegrationType implements ValuedEnum {
    Alertmanager("alertmanager"),
    Autoscaler("autoscaler"),
    Caching("caching"),
    Cassandra_cross_service_cluster("cassandra_cross_service_cluster"),
    Clickhouse_kafka("clickhouse_kafka"),
    Clickhouse_postgresql("clickhouse_postgresql"),
    Dashboard("dashboard"),
    Datadog("datadog"),
    Datasource("datasource"),
    External_aws_cloudwatch_logs("external_aws_cloudwatch_logs"),
    External_aws_cloudwatch_metrics("external_aws_cloudwatch_metrics"),
    External_elasticsearch_logs("external_elasticsearch_logs"),
    External_google_cloud_logging("external_google_cloud_logging"),
    External_opensearch_logs("external_opensearch_logs"),
    Flink("flink"),
    Flink_external_bigquery("flink_external_bigquery"),
    Flink_external_kafka("flink_external_kafka"),
    Internal_connectivity("internal_connectivity"),
    Jolokia("jolokia"),
    Kafka_connect("kafka_connect"),
    Kafka_logs("kafka_logs"),
    Kafka_mirrormaker("kafka_mirrormaker"),
    Logs("logs"),
    M3aggregator("m3aggregator"),
    M3coordinator("m3coordinator"),
    Metrics("metrics"),
    Opensearch_cross_cluster_replication("opensearch_cross_cluster_replication"),
    Opensearch_cross_cluster_search("opensearch_cross_cluster_search"),
    Prometheus("prometheus"),
    Read_replica("read_replica"),
    Rsyslog("rsyslog"),
    Schema_registry_proxy("schema_registry_proxy"),
    Stresstester("stresstester"),
    Thanoscompactor("thanoscompactor"),
    Thanosquery("thanosquery"),
    Thanosstore("thanosstore"),
    Vmalert("vmalert");
    public final String value;
    ServiceIntegrationCreateRequestBodyIntegrationType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ServiceIntegrationCreateRequestBodyIntegrationType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "alertmanager": return Alertmanager;
            case "autoscaler": return Autoscaler;
            case "caching": return Caching;
            case "cassandra_cross_service_cluster": return Cassandra_cross_service_cluster;
            case "clickhouse_kafka": return Clickhouse_kafka;
            case "clickhouse_postgresql": return Clickhouse_postgresql;
            case "dashboard": return Dashboard;
            case "datadog": return Datadog;
            case "datasource": return Datasource;
            case "external_aws_cloudwatch_logs": return External_aws_cloudwatch_logs;
            case "external_aws_cloudwatch_metrics": return External_aws_cloudwatch_metrics;
            case "external_elasticsearch_logs": return External_elasticsearch_logs;
            case "external_google_cloud_logging": return External_google_cloud_logging;
            case "external_opensearch_logs": return External_opensearch_logs;
            case "flink": return Flink;
            case "flink_external_bigquery": return Flink_external_bigquery;
            case "flink_external_kafka": return Flink_external_kafka;
            case "internal_connectivity": return Internal_connectivity;
            case "jolokia": return Jolokia;
            case "kafka_connect": return Kafka_connect;
            case "kafka_logs": return Kafka_logs;
            case "kafka_mirrormaker": return Kafka_mirrormaker;
            case "logs": return Logs;
            case "m3aggregator": return M3aggregator;
            case "m3coordinator": return M3coordinator;
            case "metrics": return Metrics;
            case "opensearch_cross_cluster_replication": return Opensearch_cross_cluster_replication;
            case "opensearch_cross_cluster_search": return Opensearch_cross_cluster_search;
            case "prometheus": return Prometheus;
            case "read_replica": return Read_replica;
            case "rsyslog": return Rsyslog;
            case "schema_registry_proxy": return Schema_registry_proxy;
            case "stresstester": return Stresstester;
            case "thanoscompactor": return Thanoscompactor;
            case "thanosquery": return Thanosquery;
            case "thanosstore": return Thanosstore;
            case "vmalert": return Vmalert;
            default: return null;
        }
    }
}
