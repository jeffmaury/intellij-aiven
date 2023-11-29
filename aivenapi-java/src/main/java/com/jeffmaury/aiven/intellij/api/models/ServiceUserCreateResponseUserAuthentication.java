package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Authentication details */
public enum ServiceUserCreateResponseUserAuthentication implements ValuedEnum {
    Caching_sha2_password("caching_sha2_password"),
    Mysql_native_password("mysql_native_password");
    public final String value;
    ServiceUserCreateResponseUserAuthentication(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static ServiceUserCreateResponseUserAuthentication forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "caching_sha2_password": return Caching_sha2_password;
            case "mysql_native_password": return Mysql_native_password;
            default: return null;
        }
    }
}
