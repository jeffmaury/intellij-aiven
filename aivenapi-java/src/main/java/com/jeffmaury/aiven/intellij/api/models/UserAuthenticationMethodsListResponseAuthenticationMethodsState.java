package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * State for authentication method
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum UserAuthenticationMethodsListResponseAuthenticationMethodsState implements ValuedEnum {
    Active("active"),
    Deleted("deleted");
    public final String value;
    UserAuthenticationMethodsListResponseAuthenticationMethodsState(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static UserAuthenticationMethodsListResponseAuthenticationMethodsState forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "active": return Active;
            case "deleted": return Deleted;
            default: return null;
        }
    }
}
