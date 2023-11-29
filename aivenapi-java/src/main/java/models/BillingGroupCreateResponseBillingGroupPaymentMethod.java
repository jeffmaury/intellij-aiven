package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Payment method */
public enum BillingGroupCreateResponseBillingGroupPaymentMethod implements ValuedEnum {
    Accrual("accrual"),
    Card("card"),
    Disabled("disabled"),
    Email("email"),
    No_payment_expected("no_payment_expected"),
    Partner("partner");
    public final String value;
    BillingGroupCreateResponseBillingGroupPaymentMethod(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static BillingGroupCreateResponseBillingGroupPaymentMethod forValue(@javax.annotation.Nonnull final String searchValue) {
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
