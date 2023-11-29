package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * OpenSearch permission
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ServiceOpenSearchAclSetResponseOpensearchAclConfigAclsRulesPermission implements ValuedEnum {
    Deny("deny"),
    Admin("admin"),
    Read("read"),
    Readwrite("readwrite"),
    Write("write");
    public final String value;
    ServiceOpenSearchAclSetResponseOpensearchAclConfigAclsRulesPermission(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ServiceOpenSearchAclSetResponseOpensearchAclConfigAclsRulesPermission forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "deny": return Deny;
            case "admin": return Admin;
            case "read": return Read;
            case "readwrite": return Readwrite;
            case "write": return Write;
            default: return null;
        }
    }
}
