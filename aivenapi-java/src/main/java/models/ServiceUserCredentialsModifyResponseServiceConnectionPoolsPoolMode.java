package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** PGBouncer pool mode */
public enum ServiceUserCredentialsModifyResponseServiceConnectionPoolsPoolMode implements ValuedEnum {
    Session("session"),
    Transaction("transaction"),
    Statement("statement");
    public final String value;
    ServiceUserCredentialsModifyResponseServiceConnectionPoolsPoolMode(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static ServiceUserCredentialsModifyResponseServiceConnectionPoolsPoolMode forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "session": return Session;
            case "transaction": return Transaction;
            case "statement": return Statement;
            default: return null;
        }
    }
}
