package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * SAMLVariant
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum AccountAuthenticationMethodsListResponseAuthenticationMethodsSamlVariant implements ValuedEnum {
    Adfs("adfs");
    public final String value;
    AccountAuthenticationMethodsListResponseAuthenticationMethodsSamlVariant(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AccountAuthenticationMethodsListResponseAuthenticationMethodsSamlVariant forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "adfs": return Adfs;
            default: return null;
        }
    }
}
