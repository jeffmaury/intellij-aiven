package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** SAMLVariant */
public enum AccountAuthenticationMethodCreateResponseAuthenticationMethodSamlVariant implements ValuedEnum {
    Adfs("adfs");
    public final String value;
    AccountAuthenticationMethodCreateResponseAuthenticationMethodSamlVariant(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static AccountAuthenticationMethodCreateResponseAuthenticationMethodSamlVariant forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "adfs": return Adfs;
            default: return null;
        }
    }
}
