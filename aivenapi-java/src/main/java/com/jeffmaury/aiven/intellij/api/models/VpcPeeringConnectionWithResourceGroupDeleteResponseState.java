package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Project VPC peering connection state
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum VpcPeeringConnectionWithResourceGroupDeleteResponseState implements ValuedEnum {
    ACTIVE("ACTIVE"),
    APPROVED("APPROVED"),
    APPROVED_PEER_REQUESTED("APPROVED_PEER_REQUESTED"),
    DELETED("DELETED"),
    DELETED_BY_PEER("DELETED_BY_PEER"),
    DELETING("DELETING"),
    INVALID_SPECIFICATION("INVALID_SPECIFICATION"),
    PENDING_PEER("PENDING_PEER"),
    REJECTED_BY_PEER("REJECTED_BY_PEER");
    public final String value;
    VpcPeeringConnectionWithResourceGroupDeleteResponseState(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static VpcPeeringConnectionWithResourceGroupDeleteResponseState forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "ACTIVE": return ACTIVE;
            case "APPROVED": return APPROVED;
            case "APPROVED_PEER_REQUESTED": return APPROVED_PEER_REQUESTED;
            case "DELETED": return DELETED;
            case "DELETED_BY_PEER": return DELETED_BY_PEER;
            case "DELETING": return DELETING;
            case "INVALID_SPECIFICATION": return INVALID_SPECIFICATION;
            case "PENDING_PEER": return PENDING_PEER;
            case "REJECTED_BY_PEER": return REJECTED_BY_PEER;
            default: return null;
        }
    }
}
