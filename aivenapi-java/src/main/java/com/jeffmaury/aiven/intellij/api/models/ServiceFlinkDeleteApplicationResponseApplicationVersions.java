package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ServiceFlinkDeleteApplicationResponseApplicationVersions implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Created at
     */
    private String createdAt;
    /**
     * Created by
     */
    private String createdBy;
    /**
     * ApplicationVersion ID
     */
    private String id;
    /**
     * Sinks
     */
    private java.util.List<ServiceFlinkDeleteApplicationResponseApplicationVersionsSinks> sinks;
    /**
     * Sources
     */
    private java.util.List<ServiceFlinkDeleteApplicationResponseApplicationVersionsSources> sources;
    /**
     * Job SQL statement
     */
    private String statement;
    /**
     * Version number
     */
    private Integer version;
    /**
     * Instantiates a new ServiceFlinkDeleteApplicationResponseApplicationVersions and sets the default values.
     */
    public ServiceFlinkDeleteApplicationResponseApplicationVersions() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ServiceFlinkDeleteApplicationResponseApplicationVersions
     */
    @jakarta.annotation.Nonnull
    public static ServiceFlinkDeleteApplicationResponseApplicationVersions createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ServiceFlinkDeleteApplicationResponseApplicationVersions();
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
     * Gets the created_at property value. Created at
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCreatedAt() {
        return this.createdAt;
    }
    /**
     * Gets the created_by property value. Created by
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCreatedBy() {
        return this.createdBy;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(7);
        deserializerMap.put("created_at", (n) -> { this.setCreatedAt(n.getStringValue()); });
        deserializerMap.put("created_by", (n) -> { this.setCreatedBy(n.getStringValue()); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("sinks", (n) -> { this.setSinks(n.getCollectionOfObjectValues(ServiceFlinkDeleteApplicationResponseApplicationVersionsSinks::createFromDiscriminatorValue)); });
        deserializerMap.put("sources", (n) -> { this.setSources(n.getCollectionOfObjectValues(ServiceFlinkDeleteApplicationResponseApplicationVersionsSources::createFromDiscriminatorValue)); });
        deserializerMap.put("statement", (n) -> { this.setStatement(n.getStringValue()); });
        deserializerMap.put("version", (n) -> { this.setVersion(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the id property value. ApplicationVersion ID
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getId() {
        return this.id;
    }
    /**
     * Gets the sinks property value. Sinks
     * @return a java.util.List<ServiceFlinkDeleteApplicationResponseApplicationVersionsSinks>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ServiceFlinkDeleteApplicationResponseApplicationVersionsSinks> getSinks() {
        return this.sinks;
    }
    /**
     * Gets the sources property value. Sources
     * @return a java.util.List<ServiceFlinkDeleteApplicationResponseApplicationVersionsSources>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ServiceFlinkDeleteApplicationResponseApplicationVersionsSources> getSources() {
        return this.sources;
    }
    /**
     * Gets the statement property value. Job SQL statement
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getStatement() {
        return this.statement;
    }
    /**
     * Gets the version property value. Version number
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getVersion() {
        return this.version;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("created_at", this.getCreatedAt());
        writer.writeStringValue("created_by", this.getCreatedBy());
        writer.writeStringValue("id", this.getId());
        writer.writeCollectionOfObjectValues("sinks", this.getSinks());
        writer.writeCollectionOfObjectValues("sources", this.getSources());
        writer.writeStringValue("statement", this.getStatement());
        writer.writeIntegerValue("version", this.getVersion());
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
     * Sets the created_at property value. Created at
     * @param value Value to set for the created_at property.
     */
    public void setCreatedAt(@jakarta.annotation.Nullable final String value) {
        this.createdAt = value;
    }
    /**
     * Sets the created_by property value. Created by
     * @param value Value to set for the created_by property.
     */
    public void setCreatedBy(@jakarta.annotation.Nullable final String value) {
        this.createdBy = value;
    }
    /**
     * Sets the id property value. ApplicationVersion ID
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final String value) {
        this.id = value;
    }
    /**
     * Sets the sinks property value. Sinks
     * @param value Value to set for the sinks property.
     */
    public void setSinks(@jakarta.annotation.Nullable final java.util.List<ServiceFlinkDeleteApplicationResponseApplicationVersionsSinks> value) {
        this.sinks = value;
    }
    /**
     * Sets the sources property value. Sources
     * @param value Value to set for the sources property.
     */
    public void setSources(@jakarta.annotation.Nullable final java.util.List<ServiceFlinkDeleteApplicationResponseApplicationVersionsSources> value) {
        this.sources = value;
    }
    /**
     * Sets the statement property value. Job SQL statement
     * @param value Value to set for the statement property.
     */
    public void setStatement(@jakarta.annotation.Nullable final String value) {
        this.statement = value;
    }
    /**
     * Sets the version property value. Version number
     * @param value Value to set for the version property.
     */
    public void setVersion(@jakarta.annotation.Nullable final Integer value) {
        this.version = value;
    }
}
