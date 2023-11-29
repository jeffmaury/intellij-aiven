package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Type of warning
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum VpcPeeringConnectionUpdateResponsePeeringConnectionsStateInfoWarningsType implements ValuedEnum {
    OverlappingPeerVpcIpRanges("overlapping-peer-vpc-ip-ranges");
    public final String value;
    VpcPeeringConnectionUpdateResponsePeeringConnectionsStateInfoWarningsType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static VpcPeeringConnectionUpdateResponsePeeringConnectionsStateInfoWarningsType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "overlapping-peer-vpc-ip-ranges": return OverlappingPeerVpcIpRanges;
            default: return null;
        }
    }
}
