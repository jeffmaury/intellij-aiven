package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * OrganizationUserInvitationsListResponse
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class OrganizationUserInvitationsListResponse implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * List of user invitations for the organization
     */
    private java.util.List<OrganizationUserInvitationsListResponseInvitations> invitations;
    /**
     * Instantiates a new OrganizationUserInvitationsListResponse and sets the default values.
     */
    public OrganizationUserInvitationsListResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a OrganizationUserInvitationsListResponse
     */
    @jakarta.annotation.Nonnull
    public static OrganizationUserInvitationsListResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OrganizationUserInvitationsListResponse();
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
        deserializerMap.put("invitations", (n) -> { this.setInvitations(n.getCollectionOfObjectValues(OrganizationUserInvitationsListResponseInvitations::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the invitations property value. List of user invitations for the organization
     * @return a java.util.List<OrganizationUserInvitationsListResponseInvitations>
     */
    @jakarta.annotation.Nullable
    public java.util.List<OrganizationUserInvitationsListResponseInvitations> getInvitations() {
        return this.invitations;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("invitations", this.getInvitations());
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
     * Sets the invitations property value. List of user invitations for the organization
     * @param value Value to set for the invitations property.
     */
    public void setInvitations(@jakarta.annotation.Nullable final java.util.List<OrganizationUserInvitationsListResponseInvitations> value) {
        this.invitations = value;
    }
}
