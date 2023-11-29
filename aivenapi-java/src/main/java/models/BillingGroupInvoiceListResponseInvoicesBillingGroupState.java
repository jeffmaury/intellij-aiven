package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Billing group state */
public enum BillingGroupInvoiceListResponseInvoicesBillingGroupState implements ValuedEnum {
    Active("active"),
    Deleted("deleted");
    public final String value;
    BillingGroupInvoiceListResponseInvoicesBillingGroupState(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static BillingGroupInvoiceListResponseInvoicesBillingGroupState forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "active": return Active;
            case "deleted": return Deleted;
            default: return null;
        }
    }
}
