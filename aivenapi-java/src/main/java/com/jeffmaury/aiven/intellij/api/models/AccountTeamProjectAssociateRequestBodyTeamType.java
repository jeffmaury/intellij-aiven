package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Team type (permission level)
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum AccountTeamProjectAssociateRequestBodyTeamType implements ValuedEnum {
    Admin("admin"),
    Operator("operator"),
    Developer("developer"),
    Read_only("read_only");
    public final String value;
    AccountTeamProjectAssociateRequestBodyTeamType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AccountTeamProjectAssociateRequestBodyTeamType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "admin": return Admin;
            case "operator": return Operator;
            case "developer": return Developer;
            case "read_only": return Read_only;
            default: return null;
        }
    }
}
