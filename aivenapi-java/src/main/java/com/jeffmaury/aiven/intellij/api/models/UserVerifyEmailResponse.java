package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * UserVerifyEmailResponse
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UserVerifyEmailResponse implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * List of errors occurred during request processing
     */
    private java.util.List<UserVerifyEmailResponseErrors> errors;
    /**
     * Details of verified invite
     */
    private UserVerifyEmailResponseInviteDetails inviteDetails;
    /**
     * Printable result of the request
     */
    private String message;
    /**
     * Instantiates a new UserVerifyEmailResponse and sets the default values.
     */
    public UserVerifyEmailResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a UserVerifyEmailResponse
     */
    @jakarta.annotation.Nonnull
    public static UserVerifyEmailResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserVerifyEmailResponse();
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
     * Gets the errors property value. List of errors occurred during request processing
     * @return a java.util.List<UserVerifyEmailResponseErrors>
     */
    @jakarta.annotation.Nullable
    public java.util.List<UserVerifyEmailResponseErrors> getErrors() {
        return this.errors;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("errors", (n) -> { this.setErrors(n.getCollectionOfObjectValues(UserVerifyEmailResponseErrors::createFromDiscriminatorValue)); });
        deserializerMap.put("invite_details", (n) -> { this.setInviteDetails(n.getObjectValue(UserVerifyEmailResponseInviteDetails::createFromDiscriminatorValue)); });
        deserializerMap.put("message", (n) -> { this.setMessage(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the invite_details property value. Details of verified invite
     * @return a UserVerifyEmailResponseInviteDetails
     */
    @jakarta.annotation.Nullable
    public UserVerifyEmailResponseInviteDetails getInviteDetails() {
        return this.inviteDetails;
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
        writer.writeCollectionOfObjectValues("errors", this.getErrors());
        writer.writeObjectValue("invite_details", this.getInviteDetails());
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
     * Sets the errors property value. List of errors occurred during request processing
     * @param value Value to set for the errors property.
     */
    public void setErrors(@jakarta.annotation.Nullable final java.util.List<UserVerifyEmailResponseErrors> value) {
        this.errors = value;
    }
    /**
     * Sets the invite_details property value. Details of verified invite
     * @param value Value to set for the invite_details property.
     */
    public void setInviteDetails(@jakarta.annotation.Nullable final UserVerifyEmailResponseInviteDetails value) {
        this.inviteDetails = value;
    }
    /**
     * Sets the message property value. Printable result of the request
     * @param value Value to set for the message property.
     */
    public void setMessage(@jakarta.annotation.Nullable final String value) {
        this.message = value;
    }
}
