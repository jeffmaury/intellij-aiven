package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Payload to be used with migration_check
 */
public class ServiceTaskCreateRequestBodyMigrationCheck implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** Comma-separated list of databases, which should be ignored during migration (supported by MySQL and PostgreSQL only at the moment) */
    private String ignoreDbs;
    /** The migration method to be used (currently supported only by Redis, Dragonfly, MySQL and PostgreSQL service types) */
    private ServiceTaskCreateRequestBodyMigrationCheckMethod method;
    /** Project name */
    private String sourceProjectName;
    /** Service name */
    private String sourceServiceName;
    /** Service URI of the source MySQL or PostgreSQL database with admin credentials. Used with migration_check. */
    private String sourceServiceUri;
    /**
     * Instantiates a new ServiceTaskCreateRequestBodyMigrationCheck and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ServiceTaskCreateRequestBodyMigrationCheck() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ServiceTaskCreateRequestBodyMigrationCheck
     */
    @javax.annotation.Nonnull
    public static ServiceTaskCreateRequestBodyMigrationCheck createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ServiceTaskCreateRequestBodyMigrationCheck();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("ignore_dbs", (n) -> { this.setIgnoreDbs(n.getStringValue()); });
        deserializerMap.put("method", (n) -> { this.setMethod(n.getEnumValue(ServiceTaskCreateRequestBodyMigrationCheckMethod.class)); });
        deserializerMap.put("source_project_name", (n) -> { this.setSourceProjectName(n.getStringValue()); });
        deserializerMap.put("source_service_name", (n) -> { this.setSourceServiceName(n.getStringValue()); });
        deserializerMap.put("source_service_uri", (n) -> { this.setSourceServiceUri(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the ignore_dbs property value. Comma-separated list of databases, which should be ignored during migration (supported by MySQL and PostgreSQL only at the moment)
     * @return a string
     */
    @javax.annotation.Nullable
    public String getIgnoreDbs() {
        return this.ignoreDbs;
    }
    /**
     * Gets the method property value. The migration method to be used (currently supported only by Redis, Dragonfly, MySQL and PostgreSQL service types)
     * @return a ServiceTaskCreateRequestBodyMigrationCheckMethod
     */
    @javax.annotation.Nullable
    public ServiceTaskCreateRequestBodyMigrationCheckMethod getMethod() {
        return this.method;
    }
    /**
     * Gets the source_project_name property value. Project name
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSourceProjectName() {
        return this.sourceProjectName;
    }
    /**
     * Gets the source_service_name property value. Service name
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSourceServiceName() {
        return this.sourceServiceName;
    }
    /**
     * Gets the source_service_uri property value. Service URI of the source MySQL or PostgreSQL database with admin credentials. Used with migration_check.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSourceServiceUri() {
        return this.sourceServiceUri;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("ignore_dbs", this.getIgnoreDbs());
        writer.writeEnumValue("method", this.getMethod());
        writer.writeStringValue("source_project_name", this.getSourceProjectName());
        writer.writeStringValue("source_service_name", this.getSourceServiceName());
        writer.writeStringValue("source_service_uri", this.getSourceServiceUri());
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
     * Sets the ignore_dbs property value. Comma-separated list of databases, which should be ignored during migration (supported by MySQL and PostgreSQL only at the moment)
     * @param value Value to set for the ignoreDbs property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIgnoreDbs(@javax.annotation.Nullable final String value) {
        this.ignoreDbs = value;
    }
    /**
     * Sets the method property value. The migration method to be used (currently supported only by Redis, Dragonfly, MySQL and PostgreSQL service types)
     * @param value Value to set for the method property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMethod(@javax.annotation.Nullable final ServiceTaskCreateRequestBodyMigrationCheckMethod value) {
        this.method = value;
    }
    /**
     * Sets the source_project_name property value. Project name
     * @param value Value to set for the sourceProjectName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSourceProjectName(@javax.annotation.Nullable final String value) {
        this.sourceProjectName = value;
    }
    /**
     * Sets the source_service_name property value. Service name
     * @param value Value to set for the sourceServiceName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSourceServiceName(@javax.annotation.Nullable final String value) {
        this.sourceServiceName = value;
    }
    /**
     * Sets the source_service_uri property value. Service URI of the source MySQL or PostgreSQL database with admin credentials. Used with migration_check.
     * @param value Value to set for the sourceServiceUri property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSourceServiceUri(@javax.annotation.Nullable final String value) {
        this.sourceServiceUri = value;
    }
}
