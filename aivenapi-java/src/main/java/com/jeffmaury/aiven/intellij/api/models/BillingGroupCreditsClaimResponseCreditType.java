package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Credit type
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum BillingGroupCreditsClaimResponseCreditType implements ValuedEnum {
    Discount("discount"),
    Employee("employee"),
    Evaluation("evaluation"),
    Internal("internal"),
    Other("other"),
    Outage("outage"),
    Partner("partner"),
    Promotion("promotion"),
    Purchase("purchase"),
    Referral("referral"),
    Sponsorship("sponsorship"),
    Trial("trial"),
    Trial_over("trial_over");
    public final String value;
    BillingGroupCreditsClaimResponseCreditType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static BillingGroupCreditsClaimResponseCreditType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "discount": return Discount;
            case "employee": return Employee;
            case "evaluation": return Evaluation;
            case "internal": return Internal;
            case "other": return Other;
            case "outage": return Outage;
            case "partner": return Partner;
            case "promotion": return Promotion;
            case "purchase": return Purchase;
            case "referral": return Referral;
            case "sponsorship": return Sponsorship;
            case "trial": return Trial;
            case "trial_over": return Trial_over;
            default: return null;
        }
    }
}
