package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * OrganizationUserInvitationAcceptRequestBody
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class OrganizationUserInvitationAcceptRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Action to be performed on the invitation
     */
    private OrganizationUserInvitationAcceptRequestBodyAction action;
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Instantiates a new OrganizationUserInvitationAcceptRequestBody and sets the default values.
     */
    public OrganizationUserInvitationAcceptRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a OrganizationUserInvitationAcceptRequestBody
     */
    @jakarta.annotation.Nonnull
    public static OrganizationUserInvitationAcceptRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OrganizationUserInvitationAcceptRequestBody();
    }
    /**
     * Gets the action property value. Action to be performed on the invitation
     * @return a OrganizationUserInvitationAcceptRequestBodyAction
     */
    @jakarta.annotation.Nullable
    public OrganizationUserInvitationAcceptRequestBodyAction getAction() {
        return this.action;
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
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(1);
        deserializerMap.put("action", (n) -> { this.setAction(n.getEnumValue(OrganizationUserInvitationAcceptRequestBodyAction::forValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("action", this.getAction());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the action property value. Action to be performed on the invitation
     * @param value Value to set for the action property.
     */
    public void setAction(@jakarta.annotation.Nullable final OrganizationUserInvitationAcceptRequestBodyAction value) {
        this.action = value;
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
}
