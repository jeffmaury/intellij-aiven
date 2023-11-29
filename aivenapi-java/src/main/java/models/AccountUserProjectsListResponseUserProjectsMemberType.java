package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Project member type */
public enum AccountUserProjectsListResponseUserProjectsMemberType implements ValuedEnum {
    Admin("admin"),
    Developer("developer"),
    Operator("operator"),
    Read_only("read_only");
    public final String value;
    AccountUserProjectsListResponseUserProjectsMemberType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static AccountUserProjectsListResponseUserProjectsMemberType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "admin": return Admin;
            case "developer": return Developer;
            case "operator": return Operator;
            case "read_only": return Read_only;
            default: return null;
        }
    }
}
