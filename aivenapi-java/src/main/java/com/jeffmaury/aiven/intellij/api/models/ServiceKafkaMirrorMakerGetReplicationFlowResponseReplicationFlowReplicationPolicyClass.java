package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Replication policy class
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ServiceKafkaMirrorMakerGetReplicationFlowResponseReplicationFlowReplicationPolicyClass implements ValuedEnum {
    OrgApacheKafkaConnectMirrorDefaultReplicationPolicy("org.apache.kafka.connect.mirror.DefaultReplicationPolicy"),
    OrgApacheKafkaConnectMirrorIdentityReplicationPolicy("org.apache.kafka.connect.mirror.IdentityReplicationPolicy");
    public final String value;
    ServiceKafkaMirrorMakerGetReplicationFlowResponseReplicationFlowReplicationPolicyClass(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ServiceKafkaMirrorMakerGetReplicationFlowResponseReplicationFlowReplicationPolicyClass forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "org.apache.kafka.connect.mirror.DefaultReplicationPolicy": return OrgApacheKafkaConnectMirrorDefaultReplicationPolicy;
            case "org.apache.kafka.connect.mirror.IdentityReplicationPolicy": return OrgApacheKafkaConnectMirrorIdentityReplicationPolicy;
            default: return null;
        }
    }
}
