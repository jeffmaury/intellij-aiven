package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Action
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum UserAuthLoginOptionsResponseAction implements ValuedEnum {
    Azure_oauth("azure_oauth"),
    Github_oauth("github_oauth"),
    Google_oauth("google_oauth"),
    Hasura_oauth("hasura_oauth"),
    Password("password"),
    Saml("saml"),
    Signup("signup");
    public final String value;
    UserAuthLoginOptionsResponseAction(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static UserAuthLoginOptionsResponseAction forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "azure_oauth": return Azure_oauth;
            case "github_oauth": return Github_oauth;
            case "google_oauth": return Google_oauth;
            case "hasura_oauth": return Hasura_oauth;
            case "password": return Password;
            case "saml": return Saml;
            case "signup": return Signup;
            default: return null;
        }
    }
}
