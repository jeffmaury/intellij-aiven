package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Network access route */
public enum ServiceListResponseServicesComponentsRoute implements ValuedEnum {
    Dynamic("dynamic"),
    PublicEscaped("public"),
    PrivateEscaped("private"),
    Privatelink("privatelink");
    public final String value;
    ServiceListResponseServicesComponentsRoute(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static ServiceListResponseServicesComponentsRoute forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "dynamic": return Dynamic;
            case "public": return PublicEscaped;
            case "private": return PrivateEscaped;
            case "privatelink": return Privatelink;
            default: return null;
        }
    }
}
