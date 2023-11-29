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
public class UserOrganizationsListResponse implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** Organizations */
    private java.util.List<UserOrganizationsListResponseOrganizations> organizations;
    /**
     * Instantiates a new UserOrganizationsListResponse and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public UserOrganizationsListResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a UserOrganizationsListResponse
     */
    @javax.annotation.Nonnull
    public static UserOrganizationsListResponse createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserOrganizationsListResponse();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(1);
        deserializerMap.put("organizations", (n) -> { this.setOrganizations(n.getCollectionOfObjectValues(UserOrganizationsListResponseOrganizations::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the organizations property value. Organizations
     * @return a UserOrganizationsListResponseOrganizations
     */
    @javax.annotation.Nullable
    public java.util.List<UserOrganizationsListResponseOrganizations> getOrganizations() {
        return this.organizations;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("organizations", this.getOrganizations());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the organizations property value. Organizations
     * @param value Value to set for the organizations property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOrganizations(@javax.annotation.Nullable final java.util.List<UserOrganizationsListResponseOrganizations> value) {
        this.organizations = value;
    }
}
