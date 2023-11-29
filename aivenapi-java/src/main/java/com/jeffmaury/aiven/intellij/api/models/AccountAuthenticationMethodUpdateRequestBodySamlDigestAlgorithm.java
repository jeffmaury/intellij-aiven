package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Digest algorithm. This is an advanced option that typically does not need to be set.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum AccountAuthenticationMethodUpdateRequestBodySamlDigestAlgorithm implements ValuedEnum {
    Sha1("sha1"),
    Sha256("sha256"),
    Sha384("sha384"),
    Sha512("sha512");
    public final String value;
    AccountAuthenticationMethodUpdateRequestBodySamlDigestAlgorithm(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AccountAuthenticationMethodUpdateRequestBodySamlDigestAlgorithm forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "sha1": return Sha1;
            case "sha256": return Sha256;
            case "sha384": return Sha384;
            case "sha512": return Sha512;
            default: return null;
        }
    }
}
