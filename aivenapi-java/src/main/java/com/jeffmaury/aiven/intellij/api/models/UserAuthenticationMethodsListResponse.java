package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * UserAuthenticationMethodsListResponse
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UserAuthenticationMethodsListResponse implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * List of linked authentication methods
     */
    private java.util.List<UserAuthenticationMethodsListResponseAuthenticationMethods> authenticationMethods;
    /**
     * List of errors occurred during request processing
     */
    private java.util.List<UserAuthenticationMethodsListResponseErrors> errors;
    /**
     * Printable result of the request
     */
    private String message;
    /**
     * Instantiates a new UserAuthenticationMethodsListResponse and sets the default values.
     */
    public UserAuthenticationMethodsListResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a UserAuthenticationMethodsListResponse
     */
    @jakarta.annotation.Nonnull
    public static UserAuthenticationMethodsListResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserAuthenticationMethodsListResponse();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the authentication_methods property value. List of linked authentication methods
     * @return a java.util.List<UserAuthenticationMethodsListResponseAuthenticationMethods>
     */
    @jakarta.annotation.Nullable
    public java.util.List<UserAuthenticationMethodsListResponseAuthenticationMethods> getAuthenticationMethods() {
        return this.authenticationMethods;
    }
    /**
     * Gets the errors property value. List of errors occurred during request processing
     * @return a java.util.List<UserAuthenticationMethodsListResponseErrors>
     */
    @jakarta.annotation.Nullable
    public java.util.List<UserAuthenticationMethodsListResponseErrors> getErrors() {
        return this.errors;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("authentication_methods", (n) -> { this.setAuthenticationMethods(n.getCollectionOfObjectValues(UserAuthenticationMethodsListResponseAuthenticationMethods::createFromDiscriminatorValue)); });
        deserializerMap.put("errors", (n) -> { this.setErrors(n.getCollectionOfObjectValues(UserAuthenticationMethodsListResponseErrors::createFromDiscriminatorValue)); });
        deserializerMap.put("message", (n) -> { this.setMessage(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the message property value. Printable result of the request
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getMessage() {
        return this.message;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("authentication_methods", this.getAuthenticationMethods());
        writer.writeCollectionOfObjectValues("errors", this.getErrors());
        writer.writeStringValue("message", this.getMessage());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the authentication_methods property value. List of linked authentication methods
     * @param value Value to set for the authentication_methods property.
     */
    public void setAuthenticationMethods(@jakarta.annotation.Nullable final java.util.List<UserAuthenticationMethodsListResponseAuthenticationMethods> value) {
        this.authenticationMethods = value;
    }
    /**
     * Sets the errors property value. List of errors occurred during request processing
     * @param value Value to set for the errors property.
     */
    public void setErrors(@jakarta.annotation.Nullable final java.util.List<UserAuthenticationMethodsListResponseErrors> value) {
        this.errors = value;
    }
    /**
     * Sets the message property value. Printable result of the request
     * @param value Value to set for the message property.
     */
    public void setMessage(@jakarta.annotation.Nullable final String value) {
        this.message = value;
    }
}
