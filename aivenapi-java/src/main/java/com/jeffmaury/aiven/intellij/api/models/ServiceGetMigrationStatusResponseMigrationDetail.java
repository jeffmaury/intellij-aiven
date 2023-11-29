package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ServiceGetMigrationStatusResponseMigrationDetail implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Migrated db name (PG, MySQL) or number (Redis, Dragonfly)
     */
    private String dbname;
    /**
     * Error message in case that migration has failed
     */
    private String error;
    /**
     * The migration method to be used (currently supported only by Redis, Dragonfly, MySQL and PostgreSQL service types)
     */
    private ServiceGetMigrationStatusResponseMigrationDetailMethod method;
    /**
     * Migration status
     */
    private ServiceGetMigrationStatusResponseMigrationDetailStatus status;
    /**
     * Instantiates a new ServiceGetMigrationStatusResponseMigrationDetail and sets the default values.
     */
    public ServiceGetMigrationStatusResponseMigrationDetail() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ServiceGetMigrationStatusResponseMigrationDetail
     */
    @jakarta.annotation.Nonnull
    public static ServiceGetMigrationStatusResponseMigrationDetail createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ServiceGetMigrationStatusResponseMigrationDetail();
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
     * Gets the dbname property value. Migrated db name (PG, MySQL) or number (Redis, Dragonfly)
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDbname() {
        return this.dbname;
    }
    /**
     * Gets the error property value. Error message in case that migration has failed
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getError() {
        return this.error;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("dbname", (n) -> { this.setDbname(n.getStringValue()); });
        deserializerMap.put("error", (n) -> { this.setError(n.getStringValue()); });
        deserializerMap.put("method", (n) -> { this.setMethod(n.getEnumValue(ServiceGetMigrationStatusResponseMigrationDetailMethod.class)); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(ServiceGetMigrationStatusResponseMigrationDetailStatus.class)); });
        return deserializerMap;
    }
    /**
     * Gets the method property value. The migration method to be used (currently supported only by Redis, Dragonfly, MySQL and PostgreSQL service types)
     * @return a ServiceGetMigrationStatusResponseMigrationDetailMethod
     */
    @jakarta.annotation.Nullable
    public ServiceGetMigrationStatusResponseMigrationDetailMethod getMethod() {
        return this.method;
    }
    /**
     * Gets the status property value. Migration status
     * @return a ServiceGetMigrationStatusResponseMigrationDetailStatus
     */
    @jakarta.annotation.Nullable
    public ServiceGetMigrationStatusResponseMigrationDetailStatus getStatus() {
        return this.status;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("dbname", this.getDbname());
        writer.writeStringValue("error", this.getError());
        writer.writeEnumValue("method", this.getMethod());
        writer.writeEnumValue("status", this.getStatus());
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
     * Sets the dbname property value. Migrated db name (PG, MySQL) or number (Redis, Dragonfly)
     * @param value Value to set for the dbname property.
     */
    public void setDbname(@jakarta.annotation.Nullable final String value) {
        this.dbname = value;
    }
    /**
     * Sets the error property value. Error message in case that migration has failed
     * @param value Value to set for the error property.
     */
    public void setError(@jakarta.annotation.Nullable final String value) {
        this.error = value;
    }
    /**
     * Sets the method property value. The migration method to be used (currently supported only by Redis, Dragonfly, MySQL and PostgreSQL service types)
     * @param value Value to set for the method property.
     */
    public void setMethod(@jakarta.annotation.Nullable final ServiceGetMigrationStatusResponseMigrationDetailMethod value) {
        this.method = value;
    }
    /**
     * Sets the status property value. Migration status
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final ServiceGetMigrationStatusResponseMigrationDetailStatus value) {
        this.status = value;
    }
}
