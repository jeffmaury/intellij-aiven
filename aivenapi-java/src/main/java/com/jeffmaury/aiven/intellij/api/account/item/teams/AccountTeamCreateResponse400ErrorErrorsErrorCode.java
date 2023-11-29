package com.jeffmaury.aiven.intellij.api.account.item.teams;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * team_names_must_be_unique: Team with the same name already exists
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum AccountTeamCreateResponse400ErrorErrorsErrorCode implements ValuedEnum {
    Team_names_must_be_unique("team_names_must_be_unique");
    public final String value;
    AccountTeamCreateResponse400ErrorErrorsErrorCode(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AccountTeamCreateResponse400ErrorErrorsErrorCode forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "team_names_must_be_unique": return Team_names_must_be_unique;
            default: return null;
        }
    }
}
