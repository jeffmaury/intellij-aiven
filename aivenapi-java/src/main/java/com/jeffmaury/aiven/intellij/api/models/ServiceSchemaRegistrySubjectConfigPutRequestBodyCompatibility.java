package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Configuration
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ServiceSchemaRegistrySubjectConfigPutRequestBodyCompatibility implements ValuedEnum {
    BACKWARD("BACKWARD"),
    BACKWARD_TRANSITIVE("BACKWARD_TRANSITIVE"),
    FORWARD("FORWARD"),
    FORWARD_TRANSITIVE("FORWARD_TRANSITIVE"),
    FULL("FULL"),
    FULL_TRANSITIVE("FULL_TRANSITIVE"),
    NONE("NONE");
    public final String value;
    ServiceSchemaRegistrySubjectConfigPutRequestBodyCompatibility(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ServiceSchemaRegistrySubjectConfigPutRequestBodyCompatibility forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "BACKWARD": return BACKWARD;
            case "BACKWARD_TRANSITIVE": return BACKWARD_TRANSITIVE;
            case "FORWARD": return FORWARD;
            case "FORWARD_TRANSITIVE": return FORWARD_TRANSITIVE;
            case "FULL": return FULL;
            case "FULL_TRANSITIVE": return FULL_TRANSITIVE;
            case "NONE": return NONE;
            default: return null;
        }
    }
}
