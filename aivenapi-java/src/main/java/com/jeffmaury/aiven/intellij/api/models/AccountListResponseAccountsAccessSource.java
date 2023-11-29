package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Describe the source of the account */
public enum AccountListResponseAccountsAccessSource implements ValuedEnum {
    Descendant_membership("descendant_membership"),
    Organization_membership("organization_membership"),
    Project_membership("project_membership"),
    Team_membership("team_membership");
    public final String value;
    AccountListResponseAccountsAccessSource(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static AccountListResponseAccountsAccessSource forValue(@javax.annotation.Nonnull final String searchValue) {
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
