package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Role of this node. Only returned for a subset of service types */
public enum ServiceUpdateResponseServiceNodeStatesRole implements ValuedEnum {
    Master("master"),
    Standby("standby"),
    ReadReplica("read-replica");
    public final String value;
    ServiceUpdateResponseServiceNodeStatesRole(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static ServiceUpdateResponseServiceNodeStatesRole forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "master": return Master;
            case "standby": return Standby;
            case "read-replica": return ReadReplica;
            default: return null;
        }
    }
}
