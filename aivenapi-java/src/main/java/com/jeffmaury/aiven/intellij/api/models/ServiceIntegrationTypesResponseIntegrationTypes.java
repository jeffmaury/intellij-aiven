package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ServiceIntegrationTypesResponseIntegrationTypes implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Description of the destination service
     */
    private String destDescription;
    /**
     * Service type. DEPRECATED: Use dest_service_types instead
     */
    private String destServiceType;
    /**
     * Supported destination service types
     */
    private java.util.List<String> destServiceTypes;
    /**
     * Integration type name
     */
    private String integrationType;
    /**
     * Description of the source service
     */
    private String sourceDescription;
    /**
     * Supported source service types
     */
    private java.util.List<String> sourceServiceTypes;
    /**
     * JSON-Schema for the 'user_config' properties
     */
    private ServiceIntegrationTypesResponseIntegrationTypesUserConfigSchema userConfigSchema;
    /**
     * Instantiates a new ServiceIntegrationTypesResponseIntegrationTypes and sets the default values.
     */
    public ServiceIntegrationTypesResponseIntegrationTypes() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ServiceIntegrationTypesResponseIntegrationTypes
     */
    @jakarta.annotation.Nonnull
    public static ServiceIntegrationTypesResponseIntegrationTypes createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ServiceIntegrationTypesResponseIntegrationTypes();
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
     * Gets the dest_description property value. Description of the destination service
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDestDescription() {
        return this.destDescription;
    }
    /**
     * Gets the dest_service_type property value. Service type. DEPRECATED: Use dest_service_types instead
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDestServiceType() {
        return this.destServiceType;
    }
    /**
     * Gets the dest_service_types property value. Supported destination service types
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getDestServiceTypes() {
        return this.destServiceTypes;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(7);
        deserializerMap.put("dest_description", (n) -> { this.setDestDescription(n.getStringValue()); });
        deserializerMap.put("dest_service_type", (n) -> { this.setDestServiceType(n.getStringValue()); });
        deserializerMap.put("dest_service_types", (n) -> { this.setDestServiceTypes(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("integration_type", (n) -> { this.setIntegrationType(n.getStringValue()); });
        deserializerMap.put("source_description", (n) -> { this.setSourceDescription(n.getStringValue()); });
        deserializerMap.put("source_service_types", (n) -> { this.setSourceServiceTypes(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("user_config_schema", (n) -> { this.setUserConfigSchema(n.getObjectValue(ServiceIntegrationTypesResponseIntegrationTypesUserConfigSchema::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the integration_type property value. Integration type name
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getIntegrationType() {
        return this.integrationType;
    }
    /**
     * Gets the source_description property value. Description of the source service
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSourceDescription() {
        return this.sourceDescription;
    }
    /**
     * Gets the source_service_types property value. Supported source service types
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getSourceServiceTypes() {
        return this.sourceServiceTypes;
    }
    /**
     * Gets the user_config_schema property value. JSON-Schema for the 'user_config' properties
     * @return a ServiceIntegrationTypesResponseIntegrationTypesUserConfigSchema
     */
    @jakarta.annotation.Nullable
    public ServiceIntegrationTypesResponseIntegrationTypesUserConfigSchema getUserConfigSchema() {
        return this.userConfigSchema;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("dest_description", this.getDestDescription());
        writer.writeStringValue("dest_service_type", this.getDestServiceType());
        writer.writeCollectionOfPrimitiveValues("dest_service_types", this.getDestServiceTypes());
        writer.writeStringValue("integration_type", this.getIntegrationType());
        writer.writeStringValue("source_description", this.getSourceDescription());
        writer.writeCollectionOfPrimitiveValues("source_service_types", this.getSourceServiceTypes());
        writer.writeObjectValue("user_config_schema", this.getUserConfigSchema());
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
     * Sets the dest_description property value. Description of the destination service
     * @param value Value to set for the dest_description property.
     */
    public void setDestDescription(@jakarta.annotation.Nullable final String value) {
        this.destDescription = value;
    }
    /**
     * Sets the dest_service_type property value. Service type. DEPRECATED: Use dest_service_types instead
     * @param value Value to set for the dest_service_type property.
     */
    public void setDestServiceType(@jakarta.annotation.Nullable final String value) {
        this.destServiceType = value;
    }
    /**
     * Sets the dest_service_types property value. Supported destination service types
     * @param value Value to set for the dest_service_types property.
     */
    public void setDestServiceTypes(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.destServiceTypes = value;
    }
    /**
     * Sets the integration_type property value. Integration type name
     * @param value Value to set for the integration_type property.
     */
    public void setIntegrationType(@jakarta.annotation.Nullable final String value) {
        this.integrationType = value;
    }
    /**
     * Sets the source_description property value. Description of the source service
     * @param value Value to set for the source_description property.
     */
    public void setSourceDescription(@jakarta.annotation.Nullable final String value) {
        this.sourceDescription = value;
    }
    /**
     * Sets the source_service_types property value. Supported source service types
     * @param value Value to set for the source_service_types property.
     */
    public void setSourceServiceTypes(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.sourceServiceTypes = value;
    }
    /**
     * Sets the user_config_schema property value. JSON-Schema for the 'user_config' properties
     * @param value Value to set for the user_config_schema property.
     */
    public void setUserConfigSchema(@jakarta.annotation.Nullable final ServiceIntegrationTypesResponseIntegrationTypesUserConfigSchema value) {
        this.userConfigSchema = value;
    }
}
