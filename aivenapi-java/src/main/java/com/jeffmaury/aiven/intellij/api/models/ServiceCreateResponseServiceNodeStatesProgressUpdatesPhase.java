package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Key identifying this phase
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ServiceCreateResponseServiceNodeStatesProgressUpdatesPhase implements ValuedEnum {
    Prepare("prepare"),
    Basebackup("basebackup"),
    Stream("stream"),
    Finalize("finalize");
    public final String value;
    ServiceCreateResponseServiceNodeStatesProgressUpdatesPhase(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ServiceCreateResponseServiceNodeStatesProgressUpdatesPhase forValue(@jakarta.annotation.Nonnull final String searchValue) {
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