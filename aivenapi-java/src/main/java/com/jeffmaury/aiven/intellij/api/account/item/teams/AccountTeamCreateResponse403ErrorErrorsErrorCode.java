package com.jeffmaury.aiven.intellij.api.account.item.teams;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * feature_not_enabled: This feature is not enabled in your context, please contact support to enable it. team_limit_exceeded: Maximum number of teams reached, please contact support to increase the limit
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum AccountTeamCreateResponse403ErrorErrorsErrorCode implements ValuedEnum {
    Feature_not_enabled("feature_not_enabled"),
    Team_limit_exceeded("team_limit_exceeded");
    public final String value;
    AccountTeamCreateResponse403ErrorErrorsErrorCode(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AccountTeamCreateResponse403ErrorErrorsErrorCode forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "feature_not_enabled": return Feature_not_enabled;
            case "team_limit_exceeded": return Team_limit_exceeded;
            default: return null;
        }
    }
}
