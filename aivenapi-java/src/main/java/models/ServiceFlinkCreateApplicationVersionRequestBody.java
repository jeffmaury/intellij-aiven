package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * ServiceFlinkCreateApplicationVersionRequestBody
 */
public class ServiceFlinkCreateApplicationVersionRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** Sinks */
    private java.util.List<ServiceFlinkCreateApplicationVersionRequestBodySinks> sinks;
    /** Sources */
    private java.util.List<ServiceFlinkCreateApplicationVersionRequestBodySources> sources;
    /** Job SQL statement */
    private String statement;
    /**
     * Instantiates a new ServiceFlinkCreateApplicationVersionRequestBody and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ServiceFlinkCreateApplicationVersionRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ServiceFlinkCreateApplicationVersionRequestBody
     */
    @javax.annotation.Nonnull
    public static ServiceFlinkCreateApplicationVersionRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ServiceFlinkCreateApplicationVersionRequestBody();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("sinks", (n) -> { this.setSinks(n.getCollectionOfObjectValues(ServiceFlinkCreateApplicationVersionRequestBodySinks::createFromDiscriminatorValue)); });
        deserializerMap.put("sources", (n) -> { this.setSources(n.getCollectionOfObjectValues(ServiceFlinkCreateApplicationVersionRequestBodySources::createFromDiscriminatorValue)); });
        deserializerMap.put("statement", (n) -> { this.setStatement(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the sinks property value. Sinks
     * @return a ServiceFlinkCreateApplicationVersionRequestBodySinks
     */
    @javax.annotation.Nullable
    public java.util.List<ServiceFlinkCreateApplicationVersionRequestBodySinks> getSinks() {
        return this.sinks;
    }
    /**
     * Gets the sources property value. Sources
     * @return a ServiceFlinkCreateApplicationVersionRequestBodySources
     */
    @javax.annotation.Nullable
    public java.util.List<ServiceFlinkCreateApplicationVersionRequestBodySources> getSources() {
        return this.sources;
    }
    /**
     * Gets the statement property value. Job SQL statement
     * @return a string
     */
    @javax.annotation.Nullable
    public String getStatement() {
        return this.statement;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("sinks", this.getSinks());
        writer.writeCollectionOfObjectValues("sources", this.getSources());
        writer.writeStringValue("statement", this.getStatement());
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
     * Sets the sinks property value. Sinks
     * @param value Value to set for the sinks property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSinks(@javax.annotation.Nullable final java.util.List<ServiceFlinkCreateApplicationVersionRequestBodySinks> value) {
        this.sinks = value;
    }
    /**
     * Sets the sources property value. Sources
     * @param value Value to set for the sources property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSources(@javax.annotation.Nullable final java.util.List<ServiceFlinkCreateApplicationVersionRequestBodySources> value) {
        this.sources = value;
    }
    /**
     * Sets the statement property value. Job SQL statement
     * @param value Value to set for the statement property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStatement(@javax.annotation.Nullable final String value) {
        this.statement = value;
    }
}
