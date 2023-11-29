package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Kafka permission */
public enum ServiceUserCredentialsModifyResponseServiceAclPermission implements ValuedEnum {
    Admin("admin"),
    Read("read"),
    Readwrite("readwrite"),
    Write("write");
    public final String value;
    ServiceUserCredentialsModifyResponseServiceAclPermission(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static ServiceUserCredentialsModifyResponseServiceAclPermission forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "admin": return Admin;
            case "read": return Read;
            case "readwrite": return Readwrite;
            case "write": return Write;
            default: return null;
        }
    }
}
