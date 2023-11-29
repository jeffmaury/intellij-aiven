package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Type of warning */
public enum VpcCreateResponsePeeringConnectionsStateInfoWarningsType implements ValuedEnum {
    OverlappingPeerVpcIpRanges("overlapping-peer-vpc-ip-ranges");
    public final String value;
    VpcCreateResponsePeeringConnectionsStateInfoWarningsType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static VpcCreateResponsePeeringConnectionsStateInfoWarningsType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "overlapping-peer-vpc-ip-ranges": return OverlappingPeerVpcIpRanges;
            default: return null;
        }
    }
}
