package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** SAMLSignatureAlgorithm */
public enum AccountAuthenticationMethodCreateResponseAuthenticationMethodSamlSignatureAlgorithm implements ValuedEnum {
    RsaSha1("rsa-sha1"),
    DsaSha1("dsa-sha1"),
    RsaSha256("rsa-sha256"),
    RsaSha384("rsa-sha384"),
    RsaSha512("rsa-sha512");
    public final String value;
    AccountAuthenticationMethodCreateResponseAuthenticationMethodSamlSignatureAlgorithm(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static AccountAuthenticationMethodCreateResponseAuthenticationMethodSamlSignatureAlgorithm forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "rsa-sha1": return RsaSha1;
            case "dsa-sha1": return DsaSha1;
            case "rsa-sha256": return RsaSha256;
            case "rsa-sha384": return RsaSha384;
            case "rsa-sha512": return RsaSha512;
            default: return null;
        }
    }
}
