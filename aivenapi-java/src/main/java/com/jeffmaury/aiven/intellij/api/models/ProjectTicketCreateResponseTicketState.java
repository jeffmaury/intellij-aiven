package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Is ticket open or closed */
public enum ProjectTicketCreateResponseTicketState implements ValuedEnum {
    Closed("closed"),
    Open("open");
    public final String value;
    ProjectTicketCreateResponseTicketState(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static ProjectTicketCreateResponseTicketState forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "closed": return Closed;
            case "open": return Open;
            default: return null;
        }
    }
}
