package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Replication policy class */
public enum ServiceKafkaMirrorMakerPatchReplicationFlowResponseReplicationFlowReplicationPolicyClass implements ValuedEnum {
    OrgApacheKafkaConnectMirrorDefaultReplicationPolicy("org.apache.kafka.connect.mirror.DefaultReplicationPolicy"),
    OrgApacheKafkaConnectMirrorIdentityReplicationPolicy("org.apache.kafka.connect.mirror.IdentityReplicationPolicy");
    public final String value;
    ServiceKafkaMirrorMakerPatchReplicationFlowResponseReplicationFlowReplicationPolicyClass(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static ServiceKafkaMirrorMakerPatchReplicationFlowResponseReplicationFlowReplicationPolicyClass forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "org.apache.kafka.connect.mirror.DefaultReplicationPolicy": return OrgApacheKafkaConnectMirrorDefaultReplicationPolicy;
            case "org.apache.kafka.connect.mirror.IdentityReplicationPolicy": return OrgApacheKafkaConnectMirrorIdentityReplicationPolicy;
            default: return null;
        }
    }
}
