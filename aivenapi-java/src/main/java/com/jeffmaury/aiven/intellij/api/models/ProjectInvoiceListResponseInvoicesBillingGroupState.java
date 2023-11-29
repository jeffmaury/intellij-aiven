package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Billing group state
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ProjectInvoiceListResponseInvoicesBillingGroupState implements ValuedEnum {
    Active("active"),
    Deleted("deleted");
    public final String value;
    ProjectInvoiceListResponseInvoicesBillingGroupState(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ProjectInvoiceListResponseInvoicesBillingGroupState forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "active": return Active;
            case "deleted": return Deleted;
            default: return null;
        }
    }
}
