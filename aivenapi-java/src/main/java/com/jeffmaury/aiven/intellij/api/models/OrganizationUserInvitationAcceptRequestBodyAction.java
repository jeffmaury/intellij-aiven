package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Action to be performed on the invitation
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum OrganizationUserInvitationAcceptRequestBodyAction implements ValuedEnum {
    Accept("accept");
    public final String value;
    OrganizationUserInvitationAcceptRequestBodyAction(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static OrganizationUserInvitationAcceptRequestBodyAction forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "accept": return Accept;
            default: return null;
        }
    }
}
