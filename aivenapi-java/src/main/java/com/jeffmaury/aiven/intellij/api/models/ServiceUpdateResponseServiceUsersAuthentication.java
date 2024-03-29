package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Authentication details
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ServiceUpdateResponseServiceUsersAuthentication implements ValuedEnum {
    Caching_sha2_password("caching_sha2_password"),
    Mysql_native_password("mysql_native_password");
    public final String value;
    ServiceUpdateResponseServiceUsersAuthentication(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ServiceUpdateResponseServiceUsersAuthentication forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "caching_sha2_password": return Caching_sha2_password;
            case "mysql_native_password": return Mysql_native_password;
            default: return null;
        }
    }
}
