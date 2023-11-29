package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * PGBouncer pool mode
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ServiceUserCredentialsModifyResponseServiceConnectionPoolsPoolMode implements ValuedEnum {
    Session("session"),
    Transaction("transaction"),
    Statement("statement");
    public final String value;
    ServiceUserCredentialsModifyResponseServiceConnectionPoolsPoolMode(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ServiceUserCredentialsModifyResponseServiceConnectionPoolsPoolMode forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "session": return Session;
            case "transaction": return Transaction;
            case "statement": return Statement;
            default: return null;
        }
    }
}
