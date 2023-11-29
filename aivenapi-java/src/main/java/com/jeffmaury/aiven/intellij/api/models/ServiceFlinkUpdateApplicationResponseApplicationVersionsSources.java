package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ServiceFlinkUpdateApplicationResponseApplicationVersionsSources implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Columns
     */
    private java.util.List<ServiceFlinkUpdateApplicationResponseApplicationVersionsSourcesColumns> columns;
    /**
     * The CREATE TABLE statement
     */
    private String createTable;
    /**
     * Integration ID
     */
    private String integrationId;
    /**
     * Option
     */
    private ServiceFlinkUpdateApplicationResponseApplicationVersionsSourcesOptions options;
    /**
     * Source ID
     */
    private String tableId;
    /**
     * Table name
     */
    private String tableName;
    /**
     * Instantiates a new ServiceFlinkUpdateApplicationResponseApplicationVersionsSources and sets the default values.
     */
    public ServiceFlinkUpdateApplicationResponseApplicationVersionsSources() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ServiceFlinkUpdateApplicationResponseApplicationVersionsSources
     */
    @jakarta.annotation.Nonnull
    public static ServiceFlinkUpdateApplicationResponseApplicationVersionsSources createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ServiceFlinkUpdateApplicationResponseApplicationVersionsSources();
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
     * Gets the columns property value. Columns
     * @return a java.util.List<ServiceFlinkUpdateApplicationResponseApplicationVersionsSourcesColumns>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ServiceFlinkUpdateApplicationResponseApplicationVersionsSourcesColumns> getColumns() {
        return this.columns;
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("columns", (n) -> { this.setColumns(n.getCollectionOfObjectValues(ServiceFlinkUpdateApplicationResponseApplicationVersionsSourcesColumns::createFromDiscriminatorValue)); });
        deserializerMap.put("create_table", (n) -> { this.setCreateTable(n.getStringValue()); });
        deserializerMap.put("integration_id", (n) -> { this.setIntegrationId(n.getStringValue()); });
        deserializerMap.put("options", (n) -> { this.setOptions(n.getObjectValue(ServiceFlinkUpdateApplicationResponseApplicationVersionsSourcesOptions::createFromDiscriminatorValue)); });
        deserializerMap.put("table_id", (n) -> { this.setTableId(n.getStringValue()); });
        deserializerMap.put("table_name", (n) -> { this.setTableName(n.getStringValue()); });
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
     * Gets the options property value. Option
     * @return a ServiceFlinkUpdateApplicationResponseApplicationVersionsSourcesOptions
     */
    @jakarta.annotation.Nullable
    public ServiceFlinkUpdateApplicationResponseApplicationVersionsSourcesOptions getOptions() {
        return this.options;
    }
    /**
     * Gets the table_id property value. Source ID
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getTableId() {
        return this.tableId;
    }
    /**
     * Gets the table_name property value. Table name
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getTableName() {
        return this.tableName;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("columns", this.getColumns());
        writer.writeStringValue("create_table", this.getCreateTable());
        writer.writeStringValue("integration_id", this.getIntegrationId());
        writer.writeObjectValue("options", this.getOptions());
        writer.writeStringValue("table_id", this.getTableId());
        writer.writeStringValue("table_name", this.getTableName());
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
     * Sets the columns property value. Columns
     * @param value Value to set for the columns property.
     */
    public void setColumns(@jakarta.annotation.Nullable final java.util.List<ServiceFlinkUpdateApplicationResponseApplicationVersionsSourcesColumns> value) {
        this.columns = value;
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
    /**
     * Sets the options property value. Option
     * @param value Value to set for the options property.
     */
    public void setOptions(@jakarta.annotation.Nullable final ServiceFlinkUpdateApplicationResponseApplicationVersionsSourcesOptions value) {
        this.options = value;
    }
    /**
     * Sets the table_id property value. Source ID
     * @param value Value to set for the table_id property.
     */
    public void setTableId(@jakarta.annotation.Nullable final String value) {
        this.tableId = value;
    }
    /**
     * Sets the table_name property value. Table name
     * @param value Value to set for the table_name property.
     */
    public void setTableName(@jakarta.annotation.Nullable final String value) {
        this.tableName = value;
    }
}
