package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Is ticket open or closed
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ProjectTicketCreateResponseTicketState implements ValuedEnum {
    Closed("closed"),
    Open("open");
    public final String value;
    ProjectTicketCreateResponseTicketState(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ProjectTicketCreateResponseTicketState forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "closed": return Closed;
            case "open": return Open;
            default: return null;
        }
    }
}
