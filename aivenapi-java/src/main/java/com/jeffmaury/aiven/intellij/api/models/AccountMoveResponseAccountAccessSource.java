package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Describe the source of the account
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum AccountMoveResponseAccountAccessSource implements ValuedEnum {
    Descendant_membership("descendant_membership"),
    Organization_membership("organization_membership"),
    Project_membership("project_membership"),
    Team_membership("team_membership");
    public final String value;
    AccountMoveResponseAccountAccessSource(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AccountMoveResponseAccountAccessSource forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "descendant_membership": return Descendant_membership;
            case "organization_membership": return Organization_membership;
            case "project_membership": return Project_membership;
            case "team_membership": return Team_membership;
            default: return null;
        }
    }
}
