package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Kafka authentication method. This is a value specific to the 'kafka' service component
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ServiceGetResponseServiceComponentsKafkaAuthenticationMethod implements ValuedEnum {
    Certificate("certificate"),
    Sasl("sasl");
    public final String value;
    ServiceGetResponseServiceComponentsKafkaAuthenticationMethod(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ServiceGetResponseServiceComponentsKafkaAuthenticationMethod forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "certificate": return Certificate;
            case "sasl": return Sasl;
            default: return null;
        }
    }
}
