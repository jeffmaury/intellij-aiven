package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** State for authentication method */
public enum UserAuthenticationMethodsListResponseAuthenticationMethodsState implements ValuedEnum {
    Active("active"),
    Deleted("deleted");
    public final String value;
    UserAuthenticationMethodsListResponseAuthenticationMethodsState(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static UserAuthenticationMethodsListResponseAuthenticationMethodsState forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "active": return Active;
            case "deleted": return Deleted;
            default: return null;
        }
    }
}
