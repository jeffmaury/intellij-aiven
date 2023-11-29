package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Privatelink connection state */
public enum ServicePrivatelinkAzureConnectionListResponseConnectionsState implements ValuedEnum {
    PendingUserApproval("pending-user-approval"),
    UserApproved("user-approved"),
    Connected("connected"),
    Active("active");
    public final String value;
    ServicePrivatelinkAzureConnectionListResponseConnectionsState(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static ServicePrivatelinkAzureConnectionListResponseConnectionsState forValue(@javax.annotation.Nonnull final String searchValue) {
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
