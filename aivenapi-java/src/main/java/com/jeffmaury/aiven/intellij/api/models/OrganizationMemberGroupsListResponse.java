package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * OrganizationMemberGroupsListResponse
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class OrganizationMemberGroupsListResponse implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * User Groups
     */
    private java.util.List<OrganizationMemberGroupsListResponseUserGroups> userGroups;
    /**
     * Instantiates a new OrganizationMemberGroupsListResponse and sets the default values.
     */
    public OrganizationMemberGroupsListResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a OrganizationMemberGroupsListResponse
     */
    @jakarta.annotation.Nonnull
    public static OrganizationMemberGroupsListResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OrganizationMemberGroupsListResponse();
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
        deserializerMap.put("user_groups", (n) -> { this.setUserGroups(n.getCollectionOfObjectValues(OrganizationMemberGroupsListResponseUserGroups::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the user_groups property value. User Groups
     * @return a java.util.List<OrganizationMemberGroupsListResponseUserGroups>
     */
    @jakarta.annotation.Nullable
    public java.util.List<OrganizationMemberGroupsListResponseUserGroups> getUserGroups() {
        return this.userGroups;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("user_groups", this.getUserGroups());
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
     * Sets the user_groups property value. User Groups
     * @param value Value to set for the user_groups property.
     */
    public void setUserGroups(@jakarta.annotation.Nullable final java.util.List<OrganizationMemberGroupsListResponseUserGroups> value) {
        this.userGroups = value;
    }
}
