package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Privatelink connection state
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ServicePrivatelinkAWSConnectionListResponseConnectionsState implements ValuedEnum {
    PendingUserApproval("pending-user-approval"),
    UserApproved("user-approved"),
    Connected("connected"),
    Active("active");
    public final String value;
    ServicePrivatelinkAWSConnectionListResponseConnectionsState(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ServicePrivatelinkAWSConnectionListResponseConnectionsState forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "pending-user-approval": return PendingUserApproval;
            case "user-approved": return UserApproved;
            case "connected": return Connected;
            case "active": return Active;
            default: return null;
        }
    }
}
