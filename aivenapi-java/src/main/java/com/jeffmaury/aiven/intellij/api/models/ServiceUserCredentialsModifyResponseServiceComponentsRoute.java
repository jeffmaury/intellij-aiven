package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Network access route
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ServiceUserCredentialsModifyResponseServiceComponentsRoute implements ValuedEnum {
    Dynamic("dynamic"),
    Public("public"),
    Private("private"),
    Privatelink("privatelink");
    public final String value;
    ServiceUserCredentialsModifyResponseServiceComponentsRoute(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ServiceUserCredentialsModifyResponseServiceComponentsRoute forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "dynamic": return Dynamic;
            case "public": return Public;
            case "private": return Private;
            case "privatelink": return Privatelink;
            default: return null;
        }
    }
}
