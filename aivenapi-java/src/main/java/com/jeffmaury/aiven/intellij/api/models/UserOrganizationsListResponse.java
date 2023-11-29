package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * UserOrganizationsListResponse
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UserOrganizationsListResponse implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Organizations
     */
    private java.util.List<UserOrganizationsListResponseOrganizations> organizations;
    /**
     * Instantiates a new UserOrganizationsListResponse and sets the default values.
     */
    public UserOrganizationsListResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a UserOrganizationsListResponse
     */
    @jakarta.annotation.Nonnull
    public static UserOrganizationsListResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserOrganizationsListResponse();
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
        deserializerMap.put("organizations", (n) -> { this.setOrganizations(n.getCollectionOfObjectValues(UserOrganizationsListResponseOrganizations::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the organizations property value. Organizations
     * @return a java.util.List<UserOrganizationsListResponseOrganizations>
     */
    @jakarta.annotation.Nullable
    public java.util.List<UserOrganizationsListResponseOrganizations> getOrganizations() {
        return this.organizations;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("organizations", this.getOrganizations());
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
     * Sets the organizations property value. Organizations
     * @param value Value to set for the organizations property.
     */
    public void setOrganizations(@jakarta.annotation.Nullable final java.util.List<UserOrganizationsListResponseOrganizations> value) {
        this.organizations = value;
    }
}
