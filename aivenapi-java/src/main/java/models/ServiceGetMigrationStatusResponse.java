package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * ServiceGetMigrationStatusResponse
 */
public class ServiceGetMigrationStatusResponse implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** List of errors occurred during request processing */
    private java.util.List<ServiceGetMigrationStatusResponseErrors> errors;
    /** Printable result of the request */
    private String message;
    /** Service migration info */
    private ServiceGetMigrationStatusResponseMigration migration;
    /** Migration status per database */
    private java.util.List<ServiceGetMigrationStatusResponseMigrationDetail> migrationDetail;
    /**
     * Instantiates a new ServiceGetMigrationStatusResponse and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ServiceGetMigrationStatusResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ServiceGetMigrationStatusResponse
     */
    @javax.annotation.Nonnull
    public static ServiceGetMigrationStatusResponse createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ServiceGetMigrationStatusResponse();
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
     * Gets the errors property value. List of errors occurred during request processing
     * @return a ServiceGetMigrationStatusResponseErrors
     */
    @javax.annotation.Nullable
    public java.util.List<ServiceGetMigrationStatusResponseErrors> getErrors() {
        return this.errors;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("errors", (n) -> { this.setErrors(n.getCollectionOfObjectValues(ServiceGetMigrationStatusResponseErrors::createFromDiscriminatorValue)); });
        deserializerMap.put("message", (n) -> { this.setMessage(n.getStringValue()); });
        deserializerMap.put("migration", (n) -> { this.setMigration(n.getObjectValue(ServiceGetMigrationStatusResponseMigration::createFromDiscriminatorValue)); });
        deserializerMap.put("migration_detail", (n) -> { this.setMigrationDetail(n.getCollectionOfObjectValues(ServiceGetMigrationStatusResponseMigrationDetail::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the message property value. Printable result of the request
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMessage() {
        return this.message;
    }
    /**
     * Gets the migration property value. Service migration info
     * @return a ServiceGetMigrationStatusResponseMigration
     */
    @javax.annotation.Nullable
    public ServiceGetMigrationStatusResponseMigration getMigration() {
        return this.migration;
    }
    /**
     * Gets the migration_detail property value. Migration status per database
     * @return a ServiceGetMigrationStatusResponseMigrationDetail
     */
    @javax.annotation.Nullable
    public java.util.List<ServiceGetMigrationStatusResponseMigrationDetail> getMigrationDetail() {
        return this.migrationDetail;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("errors", this.getErrors());
        writer.writeStringValue("message", this.getMessage());
        writer.writeObjectValue("migration", this.getMigration());
        writer.writeCollectionOfObjectValues("migration_detail", this.getMigrationDetail());
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
     * Sets the errors property value. List of errors occurred during request processing
     * @param value Value to set for the errors property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setErrors(@javax.annotation.Nullable final java.util.List<ServiceGetMigrationStatusResponseErrors> value) {
        this.errors = value;
    }
    /**
     * Sets the message property value. Printable result of the request
     * @param value Value to set for the message property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMessage(@javax.annotation.Nullable final String value) {
        this.message = value;
    }
    /**
     * Sets the migration property value. Service migration info
     * @param value Value to set for the migration property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMigration(@javax.annotation.Nullable final ServiceGetMigrationStatusResponseMigration value) {
        this.migration = value;
    }
    /**
     * Sets the migration_detail property value. Migration status per database
     * @param value Value to set for the migrationDetail property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMigrationDetail(@javax.annotation.Nullable final java.util.List<ServiceGetMigrationStatusResponseMigrationDetail> value) {
        this.migrationDetail = value;
    }
}
