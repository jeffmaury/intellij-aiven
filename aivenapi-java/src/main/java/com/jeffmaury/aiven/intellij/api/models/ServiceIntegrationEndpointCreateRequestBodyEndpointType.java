package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Service integration endpoint type */
public enum ServiceIntegrationEndpointCreateRequestBodyEndpointType implements ValuedEnum {
    Autoscaler("autoscaler"),
    Datadog("datadog"),
    External_aws_cloudwatch_logs("external_aws_cloudwatch_logs"),
    External_aws_cloudwatch_metrics("external_aws_cloudwatch_metrics"),
    External_elasticsearch_logs("external_elasticsearch_logs"),
    External_google_cloud_bigquery("external_google_cloud_bigquery"),
    External_google_cloud_logging("external_google_cloud_logging"),
    External_kafka("external_kafka"),
    External_opensearch_logs("external_opensearch_logs"),
    External_postgresql("external_postgresql"),
    External_schema_registry("external_schema_registry"),
    Jolokia("jolokia"),
    Prometheus("prometheus"),
    Rsyslog("rsyslog");
    public final String value;
    ServiceIntegrationEndpointCreateRequestBodyEndpointType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static ServiceIntegrationEndpointCreateRequestBodyEndpointType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "autoscaler": return Autoscaler;
            case "datadog": return Datadog;
            case "external_aws_cloudwatch_logs": return External_aws_cloudwatch_logs;
            case "external_aws_cloudwatch_metrics": return External_aws_cloudwatch_metrics;
            case "external_elasticsearch_logs": return External_elasticsearch_logs;
            case "external_google_cloud_bigquery": return External_google_cloud_bigquery;
            case "external_google_cloud_logging": return External_google_cloud_logging;
            case "external_kafka": return External_kafka;
            case "external_opensearch_logs": return External_opensearch_logs;
            case "external_postgresql": return External_postgresql;
            case "external_schema_registry": return External_schema_registry;
            case "jolokia": return Jolokia;
            case "prometheus": return Prometheus;
            case "rsyslog": return Rsyslog;
            default: return null;
        }
    }
}
