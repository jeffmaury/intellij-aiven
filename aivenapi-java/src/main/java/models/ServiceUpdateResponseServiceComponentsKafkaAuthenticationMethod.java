package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Kafka authentication method. This is a value specific to the 'kafka' service component */
public enum ServiceUpdateResponseServiceComponentsKafkaAuthenticationMethod implements ValuedEnum {
    Certificate("certificate"),
    Sasl("sasl");
    public final String value;
    ServiceUpdateResponseServiceComponentsKafkaAuthenticationMethod(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static ServiceUpdateResponseServiceComponentsKafkaAuthenticationMethod forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "certificate": return Certificate;
            case "sasl": return Sasl;
            default: return null;
        }
    }
}
