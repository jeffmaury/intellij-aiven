package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Static IP address state */
public enum ProjectStaticIPDissociateResponseState implements ValuedEnum {
    Creating("creating"),
    Created("created"),
    Available("available"),
    Assigned("assigned"),
    Deleting("deleting"),
    Deleted("deleted");
    public final String value;
    ProjectStaticIPDissociateResponseState(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static ProjectStaticIPDissociateResponseState forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "creating": return Creating;
            case "created": return Created;
            case "available": return Available;
            case "assigned": return Assigned;
            case "deleting": return Deleting;
            case "deleted": return Deleted;
            default: return null;
        }
    }
}
