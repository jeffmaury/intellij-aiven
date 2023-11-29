package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * State of this invoice
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum BillingGroupInvoiceListResponseInvoicesState implements ValuedEnum {
    Accrual("accrual"),
    Consolidated("consolidated"),
    Due("due"),
    Estimate("estimate"),
    Failed_credit_card_charge("failed_credit_card_charge"),
    Failed_no_credit_card("failed_no_credit_card"),
    Mailed("mailed"),
    No_payment_expected("no_payment_expected"),
    Paid("paid"),
    Partner_metering("partner_metering"),
    Uncollectible("uncollectible"),
    Waived("waived");
    public final String value;
    BillingGroupInvoiceListResponseInvoicesState(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static BillingGroupInvoiceListResponseInvoicesState forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "accrual": return Accrual;
            case "consolidated": return Consolidated;
            case "due": return Due;
            case "estimate": return Estimate;
            case "failed_credit_card_charge": return Failed_credit_card_charge;
            case "failed_no_credit_card": return Failed_no_credit_card;
            case "mailed": return Mailed;
            case "no_payment_expected": return No_payment_expected;
            case "paid": return Paid;
            case "partner_metering": return Partner_metering;
            case "uncollectible": return Uncollectible;
            case "waived": return Waived;
            default: return null;
        }
    }
}
