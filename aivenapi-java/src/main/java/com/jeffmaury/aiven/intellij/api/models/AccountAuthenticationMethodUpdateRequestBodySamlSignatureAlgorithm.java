package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * SAMLSignatureAlgorithm
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum AccountAuthenticationMethodUpdateRequestBodySamlSignatureAlgorithm implements ValuedEnum {
    RsaSha1("rsa-sha1"),
    DsaSha1("dsa-sha1"),
    RsaSha256("rsa-sha256"),
    RsaSha384("rsa-sha384"),
    RsaSha512("rsa-sha512");
    public final String value;
    AccountAuthenticationMethodUpdateRequestBodySamlSignatureAlgorithm(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AccountAuthenticationMethodUpdateRequestBodySamlSignatureAlgorithm forValue(@jakarta.annotation.Nonnull final String searchValue) {
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
