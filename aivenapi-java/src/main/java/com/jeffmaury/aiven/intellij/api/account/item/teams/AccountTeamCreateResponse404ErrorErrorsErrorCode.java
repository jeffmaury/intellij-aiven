package com.jeffmaury.aiven.intellij.api.account.item.teams;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * account_not_found: No such account exists
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum AccountTeamCreateResponse404ErrorErrorsErrorCode implements ValuedEnum {
    Account_not_found("account_not_found");
    public final String value;
    AccountTeamCreateResponse404ErrorErrorsErrorCode(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AccountTeamCreateResponse404ErrorErrorsErrorCode forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "account_not_found": return Account_not_found;
            default: return null;
        }
    }
}
