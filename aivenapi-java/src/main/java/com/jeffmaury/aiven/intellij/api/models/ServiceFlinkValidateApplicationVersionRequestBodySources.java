package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ServiceFlinkValidateApplicationVersionRequestBodySources implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The CREATE TABLE statement
     */
    private String createTable;
    /**
     * Integration ID
     */
    private String integrationId;
    /**
     * Instantiates a new ServiceFlinkValidateApplicationVersionRequestBodySources and sets the default values.
     */
    public ServiceFlinkValidateApplicationVersionRequestBodySources() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ServiceFlinkValidateApplicationVersionRequestBodySources
     */
    @jakarta.annotation.Nonnull
    public static ServiceFlinkValidateApplicationVersionRequestBodySources createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ServiceFlinkValidateApplicationVersionRequestBodySources();
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
     * Gets the create_table property value. The CREATE TABLE statement
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCreateTable() {
        return this.createTable;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("create_table", (n) -> { this.setCreateTable(n.getStringValue()); });
        deserializerMap.put("integration_id", (n) -> { this.setIntegrationId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the integration_id property value. Integration ID
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getIntegrationId() {
        return this.integrationId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("create_table", this.getCreateTable());
        writer.writeStringValue("integration_id", this.getIntegrationId());
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
     * Sets the create_table property value. The CREATE TABLE statement
     * @param value Value to set for the create_table property.
     */
    public void setCreateTable(@jakarta.annotation.Nullable final String value) {
        this.createTable = value;
    }
    /**
     * Sets the integration_id property value. Integration ID
     * @param value Value to set for the integration_id property.
     */
    public void setIntegrationId(@jakarta.annotation.Nullable final String value) {
        this.integrationId = value;
    }
}
