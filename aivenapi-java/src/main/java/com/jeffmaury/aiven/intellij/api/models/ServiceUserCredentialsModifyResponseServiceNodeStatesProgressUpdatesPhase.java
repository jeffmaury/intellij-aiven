package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Key identifying this phase
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ServiceUserCredentialsModifyResponseServiceNodeStatesProgressUpdatesPhase implements ValuedEnum {
    Prepare("prepare"),
    Basebackup("basebackup"),
    Stream("stream"),
    Finalize("finalize");
    public final String value;
    ServiceUserCredentialsModifyResponseServiceNodeStatesProgressUpdatesPhase(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ServiceUserCredentialsModifyResponseServiceNodeStatesProgressUpdatesPhase forValue(@jakarta.annotation.Nonnull final String searchValue) {
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
