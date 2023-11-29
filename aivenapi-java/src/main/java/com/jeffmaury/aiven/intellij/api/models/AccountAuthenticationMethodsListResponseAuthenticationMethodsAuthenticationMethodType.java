package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Authentication method type */
public enum AccountAuthenticationMethodsListResponseAuthenticationMethodsAuthenticationMethodType implements ValuedEnum {
    Internal("internal"),
    Saml("saml");
    public final String value;
    AccountAuthenticationMethodsListResponseAuthenticationMethodsAuthenticationMethodType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static AccountAuthenticationMethodsListResponseAuthenticationMethodsAuthenticationMethodType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "internal": return Internal;
            case "saml": return Saml;
            default: return null;
        }
    }
}
