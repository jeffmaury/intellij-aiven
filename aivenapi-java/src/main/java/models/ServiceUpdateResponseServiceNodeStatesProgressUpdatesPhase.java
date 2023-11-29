package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Key identifying this phase */
public enum ServiceUpdateResponseServiceNodeStatesProgressUpdatesPhase implements ValuedEnum {
    Prepare("prepare"),
    Basebackup("basebackup"),
    Stream("stream"),
    Finalize("finalize");
    public final String value;
    ServiceUpdateResponseServiceNodeStatesProgressUpdatesPhase(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static ServiceUpdateResponseServiceNodeStatesProgressUpdatesPhase forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "prepare": return Prepare;
            case "basebackup": return Basebackup;
            case "stream": return Stream;
            case "finalize": return Finalize;
            default: return null;
        }
    }
}
