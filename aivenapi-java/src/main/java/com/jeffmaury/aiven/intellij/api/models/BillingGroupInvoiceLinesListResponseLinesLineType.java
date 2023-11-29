package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Type of the invoice line
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum BillingGroupInvoiceLinesListResponseLinesLineType implements ValuedEnum {
    Commitment_fee("commitment_fee"),
    Credit_consumption("credit_consumption"),
    Extra_charge("extra_charge"),
    Multiplier("multiplier"),
    Other_event("other_event"),
    Rounding("rounding"),
    Service_charge("service_charge"),
    Support_charge("support_charge");
    public final String value;
    BillingGroupInvoiceLinesListResponseLinesLineType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static BillingGroupInvoiceLinesListResponseLinesLineType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "commitment_fee": return Commitment_fee;
            case "credit_consumption": return Credit_consumption;
            case "extra_charge": return Extra_charge;
            case "multiplier": return Multiplier;
            case "other_event": return Other_event;
            case "rounding": return Rounding;
            case "service_charge": return Service_charge;
            case "support_charge": return Support_charge;
            default: return null;
        }
    }
}
