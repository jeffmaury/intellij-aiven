package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** State of the verification process */
public enum OrganizationDomainVerifyResponseState implements ValuedEnum {
    Deleted("deleted"),
    Unverified("unverified"),
    Verified("verified");
    public final String value;
    OrganizationDomainVerifyResponseState(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static OrganizationDomainVerifyResponseState forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "deleted": return Deleted;
            case "unverified": return Unverified;
            case "verified": return Verified;
            default: return null;
        }
    }
}
