package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Role of this node. Only returned for a subset of service types
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ServiceCreateResponseServiceNodeStatesRole implements ValuedEnum {
    Master("master"),
    Standby("standby"),
    ReadReplica("read-replica");
    public final String value;
    ServiceCreateResponseServiceNodeStatesRole(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ServiceCreateResponseServiceNodeStatesRole forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "master": return Master;
            case "standby": return Standby;
            case "read-replica": return ReadReplica;
            default: return null;
        }
    }
}
