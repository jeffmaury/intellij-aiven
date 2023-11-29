package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** AuthenticationMethodState */
public enum AccountAuthenticationMethodUpdateResponseAuthenticationMethodState implements ValuedEnum {
    Active("active"),
    Deleted("deleted"),
    Pending_configuration("pending_configuration");
    public final String value;
    AccountAuthenticationMethodUpdateResponseAuthenticationMethodState(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static AccountAuthenticationMethodUpdateResponseAuthenticationMethodState forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "active": return Active;
            case "deleted": return Deleted;
            case "pending_configuration": return Pending_configuration;
            default: return null;
        }
    }
}
