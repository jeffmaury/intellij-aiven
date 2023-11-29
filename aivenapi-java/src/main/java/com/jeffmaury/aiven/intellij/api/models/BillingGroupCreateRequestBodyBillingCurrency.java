package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Billing currency */
public enum BillingGroupCreateRequestBodyBillingCurrency implements ValuedEnum {
    AUD("AUD"),
    CAD("CAD"),
    CHF("CHF"),
    DKK("DKK"),
    EUR("EUR"),
    GBP("GBP"),
    JPY("JPY"),
    NOK("NOK"),
    NZD("NZD"),
    SEK("SEK"),
    SGD("SGD"),
    USD("USD");
    public final String value;
    BillingGroupCreateRequestBodyBillingCurrency(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static BillingGroupCreateRequestBodyBillingCurrency forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "AUD": return AUD;
            case "CAD": return CAD;
            case "CHF": return CHF;
            case "DKK": return DKK;
            case "EUR": return EUR;
            case "GBP": return GBP;
            case "JPY": return JPY;
            case "NOK": return NOK;
            case "NZD": return NZD;
            case "SEK": return SEK;
            case "SGD": return SGD;
            case "USD": return USD;
            default: return null;
        }
    }
}
