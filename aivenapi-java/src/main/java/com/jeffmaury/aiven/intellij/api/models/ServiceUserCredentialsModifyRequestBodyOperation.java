package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Operation type */
public enum ServiceUserCredentialsModifyRequestBodyOperation implements ValuedEnum {
    AcknowledgeRenewal("acknowledge-renewal"),
    ResetCredentials("reset-credentials"),
    SetAccessControl("set-access-control");
    public final String value;
    ServiceUserCredentialsModifyRequestBodyOperation(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static ServiceUserCredentialsModifyRequestBodyOperation forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "acknowledge-renewal": return AcknowledgeRenewal;
            case "reset-credentials": return ResetCredentials;
            case "set-access-control": return SetAccessControl;
            default: return null;
        }
    }
}
