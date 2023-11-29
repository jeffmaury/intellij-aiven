package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ServiceFlinkValidateApplicationVersionResponseSinks implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** Columns */
    private java.util.List<ServiceFlinkValidateApplicationVersionResponseSinksColumns> columns;
    /** The CREATE TABLE statement */
    private String createTable;
    /** Integration ID */
    private String integrationId;
    /** The error message. */
    private String message;
    /** Option */
    private ServiceFlinkValidateApplicationVersionResponseSinksOptions options;
    /** Error position in the SQL. */
    private ServiceFlinkValidateApplicationVersionResponseSinksPosition position;
    /** Table name */
    private String tableName;
    /**
     * Instantiates a new ServiceFlinkValidateApplicationVersionResponseSinks and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ServiceFlinkValidateApplicationVersionResponseSinks() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ServiceFlinkValidateApplicationVersionResponseSinks
     */
    @javax.annotation.Nonnull
    public static ServiceFlinkValidateApplicationVersionResponseSinks createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ServiceFlinkValidateApplicationVersionResponseSinks();
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
     * Gets the columns property value. Columns
     * @return a ServiceFlinkValidateApplicationVersionResponseSinksColumns
     */
    @javax.annotation.Nullable
    public java.util.List<ServiceFlinkValidateApplicationVersionResponseSinksColumns> getColumns() {
        return this.columns;
    }
    /**
     * Gets the create_table property value. The CREATE TABLE statement
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCreateTable() {
        return this.createTable;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(7);
        deserializerMap.put("columns", (n) -> { this.setColumns(n.getCollectionOfObjectValues(ServiceFlinkValidateApplicationVersionResponseSinksColumns::createFromDiscriminatorValue)); });
        deserializerMap.put("create_table", (n) -> { this.setCreateTable(n.getStringValue()); });
        deserializerMap.put("integration_id", (n) -> { this.setIntegrationId(n.getStringValue()); });
        deserializerMap.put("message", (n) -> { this.setMessage(n.getStringValue()); });
        deserializerMap.put("options", (n) -> { this.setOptions(n.getObjectValue(ServiceFlinkValidateApplicationVersionResponseSinksOptions::createFromDiscriminatorValue)); });
        deserializerMap.put("position", (n) -> { this.setPosition(n.getObjectValue(ServiceFlinkValidateApplicationVersionResponseSinksPosition::createFromDiscriminatorValue)); });
        deserializerMap.put("table_name", (n) -> { this.setTableName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the integration_id property value. Integration ID
     * @return a string
     */
    @javax.annotation.Nullable
    public String getIntegrationId() {
        return this.integrationId;
    }
    /**
     * Gets the message property value. The error message.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMessage() {
        return this.message;
    }
    /**
     * Gets the options property value. Option
     * @return a ServiceFlinkValidateApplicationVersionResponseSinksOptions
     */
    @javax.annotation.Nullable
    public ServiceFlinkValidateApplicationVersionResponseSinksOptions getOptions() {
        return this.options;
    }
    /**
     * Gets the position property value. Error position in the SQL.
     * @return a ServiceFlinkValidateApplicationVersionResponseSinksPosition
     */
    @javax.annotation.Nullable
    public ServiceFlinkValidateApplicationVersionResponseSinksPosition getPosition() {
        return this.position;
    }
    /**
     * Gets the table_name property value. Table name
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTableName() {
        return this.tableName;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("columns", this.getColumns());
        writer.writeStringValue("create_table", this.getCreateTable());
        writer.writeStringValue("integration_id", this.getIntegrationId());
        writer.writeStringValue("message", this.getMessage());
        writer.writeObjectValue("options", this.getOptions());
        writer.writeObjectValue("position", this.getPosition());
        writer.writeStringValue("table_name", this.getTableName());
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
     * Sets the columns property value. Columns
     * @param value Value to set for the columns property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setColumns(@javax.annotation.Nullable final java.util.List<ServiceFlinkValidateApplicationVersionResponseSinksColumns> value) {
        this.columns = value;
    }
    /**
     * Sets the create_table property value. The CREATE TABLE statement
     * @param value Value to set for the createTable property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreateTable(@javax.annotation.Nullable final String value) {
        this.createTable = value;
    }
    /**
     * Sets the integration_id property value. Integration ID
     * @param value Value to set for the integrationId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIntegrationId(@javax.annotation.Nullable final String value) {
        this.integrationId = value;
    }
    /**
     * Sets the message property value. The error message.
     * @param value Value to set for the message property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMessage(@javax.annotation.Nullable final String value) {
        this.message = value;
    }
    /**
     * Sets the options property value. Option
     * @param value Value to set for the options property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOptions(@javax.annotation.Nullable final ServiceFlinkValidateApplicationVersionResponseSinksOptions value) {
        this.options = value;
    }
    /**
     * Sets the position property value. Error position in the SQL.
     * @param value Value to set for the position property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPosition(@javax.annotation.Nullable final ServiceFlinkValidateApplicationVersionResponseSinksPosition value) {
        this.position = value;
    }
    /**
     * Sets the table_name property value. Table name
     * @param value Value to set for the tableName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTableName(@javax.annotation.Nullable final String value) {
        this.tableName = value;
    }
}
