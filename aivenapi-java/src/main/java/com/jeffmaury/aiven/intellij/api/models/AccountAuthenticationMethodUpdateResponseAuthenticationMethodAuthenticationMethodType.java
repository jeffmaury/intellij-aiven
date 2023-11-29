package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Authentication method type */
public enum AccountAuthenticationMethodUpdateResponseAuthenticationMethodAuthenticationMethodType implements ValuedEnum {
    Internal("internal"),
    Saml("saml");
    public final String value;
    AccountAuthenticationMethodUpdateResponseAuthenticationMethodAuthenticationMethodType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static AccountAuthenticationMethodUpdateResponseAuthenticationMethodAuthenticationMethodType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "internal": return Internal;
            case "saml": return Saml;
            default: return null;
        }
    }
}
