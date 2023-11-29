package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Service migration info
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ServiceGetMigrationStatusResponseMigration implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Error message in case that migration has failed
     */
    private String error;
    /**
     * Redis only: how many seconds since last I/O with redis master
     */
    private Integer masterLastIoSecondsAgo;
    /**
     * Redis only: replication master link status
     */
    private ServiceGetMigrationStatusResponseMigrationMasterLinkStatus masterLinkStatus;
    /**
     * The migration method to be used (currently supported only by Redis, Dragonfly, MySQL and PostgreSQL service types)
     */
    private ServiceGetMigrationStatusResponseMigrationMethod method;
    /**
     * Migration status
     */
    private ServiceGetMigrationStatusResponseMigrationStatus status;
    /**
     * Instantiates a new ServiceGetMigrationStatusResponseMigration and sets the default values.
     */
    public ServiceGetMigrationStatusResponseMigration() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ServiceGetMigrationStatusResponseMigration
     */
    @jakarta.annotation.Nonnull
    public static ServiceGetMigrationStatusResponseMigration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ServiceGetMigrationStatusResponseMigration();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("error", (n) -> { this.setError(n.getStringValue()); });
        deserializerMap.put("master_last_io_seconds_ago", (n) -> { this.setMasterLastIoSecondsAgo(n.getIntegerValue()); });
        deserializerMap.put("master_link_status", (n) -> { this.setMasterLinkStatus(n.getEnumValue(ServiceGetMigrationStatusResponseMigrationMasterLinkStatus.class)); });
        deserializerMap.put("method", (n) -> { this.setMethod(n.getEnumValue(ServiceGetMigrationStatusResponseMigrationMethod.class)); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(ServiceGetMigrationStatusResponseMigrationStatus.class)); });
        return deserializerMap;
    }
    /**
     * Gets the master_last_io_seconds_ago property value. Redis only: how many seconds since last I/O with redis master
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getMasterLastIoSecondsAgo() {
        return this.masterLastIoSecondsAgo;
    }
    /**
     * Gets the master_link_status property value. Redis only: replication master link status
     * @return a ServiceGetMigrationStatusResponseMigrationMasterLinkStatus
     */
    @jakarta.annotation.Nullable
    public ServiceGetMigrationStatusResponseMigrationMasterLinkStatus getMasterLinkStatus() {
        return this.masterLinkStatus;
    }
    /**
     * Gets the method property value. The migration method to be used (currently supported only by Redis, Dragonfly, MySQL and PostgreSQL service types)
     * @return a ServiceGetMigrationStatusResponseMigrationMethod
     */
    @jakarta.annotation.Nullable
    public ServiceGetMigrationStatusResponseMigrationMethod getMethod() {
        return this.method;
    }
    /**
     * Gets the status property value. Migration status
     * @return a ServiceGetMigrationStatusResponseMigrationStatus
     */
    @jakarta.annotation.Nullable
    public ServiceGetMigrationStatusResponseMigrationStatus getStatus() {
        return this.status;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("error", this.getError());
        writer.writeIntegerValue("master_last_io_seconds_ago", this.getMasterLastIoSecondsAgo());
        writer.writeEnumValue("master_link_status", this.getMasterLinkStatus());
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
     * Sets the error property value. Error message in case that migration has failed
     * @param value Value to set for the error property.
     */
    public void setError(@jakarta.annotation.Nullable final String value) {
        this.error = value;
    }
    /**
     * Sets the master_last_io_seconds_ago property value. Redis only: how many seconds since last I/O with redis master
     * @param value Value to set for the master_last_io_seconds_ago property.
     */
    public void setMasterLastIoSecondsAgo(@jakarta.annotation.Nullable final Integer value) {
        this.masterLastIoSecondsAgo = value;
    }
    /**
     * Sets the master_link_status property value. Redis only: replication master link status
     * @param value Value to set for the master_link_status property.
     */
    public void setMasterLinkStatus(@jakarta.annotation.Nullable final ServiceGetMigrationStatusResponseMigrationMasterLinkStatus value) {
        this.masterLinkStatus = value;
    }
    /**
     * Sets the method property value. The migration method to be used (currently supported only by Redis, Dragonfly, MySQL and PostgreSQL service types)
     * @param value Value to set for the method property.
     */
    public void setMethod(@jakarta.annotation.Nullable final ServiceGetMigrationStatusResponseMigrationMethod value) {
        this.method = value;
    }
    /**
     * Sets the status property value. Migration status
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final ServiceGetMigrationStatusResponseMigrationStatus value) {
        this.status = value;
    }
}
