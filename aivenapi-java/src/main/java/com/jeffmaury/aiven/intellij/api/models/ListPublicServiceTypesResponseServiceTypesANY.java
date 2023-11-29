package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Service type information
 */
public class ListPublicServiceTypesResponseServiceTypesANY implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** Default version of the service if no explicit version is defined */
    private String defaultVersion;
    /** Single line description of the service */
    private String description;
    /** Latest available version of the service */
    private String latestAvailableVersion;
    /** List of plans available for this type of service */
    private java.util.List<ListPublicServiceTypesResponseServiceTypesANYServicePlans> servicePlans;
    /** JSON-Schema for the 'user_config' properties */
    private ListPublicServiceTypesResponseServiceTypesANYUserConfigSchema userConfigSchema;
    /**
     * Instantiates a new ListPublicServiceTypesResponseServiceTypesANY and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ListPublicServiceTypesResponseServiceTypesANY() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ListPublicServiceTypesResponseServiceTypesANY
     */
    @javax.annotation.Nonnull
    public static ListPublicServiceTypesResponseServiceTypesANY createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ListPublicServiceTypesResponseServiceTypesANY();
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
     * Gets the default_version property value. Default version of the service if no explicit version is defined
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDefaultVersion() {
        return this.defaultVersion;
    }
    /**
     * Gets the description property value. Single line description of the service
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("default_version", (n) -> { this.setDefaultVersion(n.getStringValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("latest_available_version", (n) -> { this.setLatestAvailableVersion(n.getStringValue()); });
        deserializerMap.put("service_plans", (n) -> { this.setServicePlans(n.getCollectionOfObjectValues(ListPublicServiceTypesResponseServiceTypesANYServicePlans::createFromDiscriminatorValue)); });
        deserializerMap.put("user_config_schema", (n) -> { this.setUserConfigSchema(n.getObjectValue(ListPublicServiceTypesResponseServiceTypesANYUserConfigSchema::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the latest_available_version property value. Latest available version of the service
     * @return a string
     */
    @javax.annotation.Nullable
    public String getLatestAvailableVersion() {
        return this.latestAvailableVersion;
    }
    /**
     * Gets the service_plans property value. List of plans available for this type of service
     * @return a ListPublicServiceTypesResponseServiceTypesANYServicePlans
     */
    @javax.annotation.Nullable
    public java.util.List<ListPublicServiceTypesResponseServiceTypesANYServicePlans> getServicePlans() {
        return this.servicePlans;
    }
    /**
     * Gets the user_config_schema property value. JSON-Schema for the 'user_config' properties
     * @return a ListPublicServiceTypesResponseServiceTypesANYUserConfigSchema
     */
    @javax.annotation.Nullable
    public ListPublicServiceTypesResponseServiceTypesANYUserConfigSchema getUserConfigSchema() {
        return this.userConfigSchema;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("default_version", this.getDefaultVersion());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("latest_available_version", this.getLatestAvailableVersion());
        writer.writeCollectionOfObjectValues("service_plans", this.getServicePlans());
        writer.writeObjectValue("user_config_schema", this.getUserConfigSchema());
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
     * Sets the default_version property value. Default version of the service if no explicit version is defined
     * @param value Value to set for the defaultVersion property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefaultVersion(@javax.annotation.Nullable final String value) {
        this.defaultVersion = value;
    }
    /**
     * Sets the description property value. Single line description of the service
     * @param value Value to set for the description property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDescription(@javax.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the latest_available_version property value. Latest available version of the service
     * @param value Value to set for the latestAvailableVersion property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLatestAvailableVersion(@javax.annotation.Nullable final String value) {
        this.latestAvailableVersion = value;
    }
    /**
     * Sets the service_plans property value. List of plans available for this type of service
     * @param value Value to set for the servicePlans property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setServicePlans(@javax.annotation.Nullable final java.util.List<ListPublicServiceTypesResponseServiceTypesANYServicePlans> value) {
        this.servicePlans = value;
    }
    /**
     * Sets the user_config_schema property value. JSON-Schema for the 'user_config' properties
     * @param value Value to set for the userConfigSchema property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserConfigSchema(@javax.annotation.Nullable final ListPublicServiceTypesResponseServiceTypesANYUserConfigSchema value) {
        this.userConfigSchema = value;
    }
}
