package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Payment method
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum AccountBillingGroupListResponseAccountBillingGroupsPaymentMethod implements ValuedEnum {
    Accrual("accrual"),
    Card("card"),
    Disabled("disabled"),
    Email("email"),
    No_payment_expected("no_payment_expected"),
    Partner("partner");
    public final String value;
    AccountBillingGroupListResponseAccountBillingGroupsPaymentMethod(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AccountBillingGroupListResponseAccountBillingGroupsPaymentMethod forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "accrual": return Accrual;
            case "card": return Card;
            case "disabled": return Disabled;
            case "email": return Email;
            case "no_payment_expected": return No_payment_expected;
            case "partner": return Partner;
            default: return null;
        }
    }
}
