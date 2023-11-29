package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * ServiceFlinkValidateApplicationVersionRequestBody
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ServiceFlinkValidateApplicationVersionRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Sinks
     */
    private java.util.List<ServiceFlinkValidateApplicationVersionRequestBodySinks> sinks;
    /**
     * Sources
     */
    private java.util.List<ServiceFlinkValidateApplicationVersionRequestBodySources> sources;
    /**
     * Job SQL statement
     */
    private String statement;
    /**
     * Instantiates a new ServiceFlinkValidateApplicationVersionRequestBody and sets the default values.
     */
    public ServiceFlinkValidateApplicationVersionRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ServiceFlinkValidateApplicationVersionRequestBody
     */
    @jakarta.annotation.Nonnull
    public static ServiceFlinkValidateApplicationVersionRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ServiceFlinkValidateApplicationVersionRequestBody();
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
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("sinks", (n) -> { this.setSinks(n.getCollectionOfObjectValues(ServiceFlinkValidateApplicationVersionRequestBodySinks::createFromDiscriminatorValue)); });
        deserializerMap.put("sources", (n) -> { this.setSources(n.getCollectionOfObjectValues(ServiceFlinkValidateApplicationVersionRequestBodySources::createFromDiscriminatorValue)); });
        deserializerMap.put("statement", (n) -> { this.setStatement(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the sinks property value. Sinks
     * @return a java.util.List<ServiceFlinkValidateApplicationVersionRequestBodySinks>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ServiceFlinkValidateApplicationVersionRequestBodySinks> getSinks() {
        return this.sinks;
    }
    /**
     * Gets the sources property value. Sources
     * @return a java.util.List<ServiceFlinkValidateApplicationVersionRequestBodySources>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ServiceFlinkValidateApplicationVersionRequestBodySources> getSources() {
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
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("sinks", this.getSinks());
        writer.writeCollectionOfObjectValues("sources", this.getSources());
        writer.writeStringValue("statement", this.getStatement());
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
     * Sets the sinks property value. Sinks
     * @param value Value to set for the sinks property.
     */
    public void setSinks(@jakarta.annotation.Nullable final java.util.List<ServiceFlinkValidateApplicationVersionRequestBodySinks> value) {
        this.sinks = value;
    }
    /**
     * Sets the sources property value. Sources
     * @param value Value to set for the sources property.
     */
    public void setSources(@jakarta.annotation.Nullable final java.util.List<ServiceFlinkValidateApplicationVersionRequestBodySources> value) {
        this.sources = value;
    }
    /**
     * Sets the statement property value. Job SQL statement
     * @param value Value to set for the statement property.
     */
    public void setStatement(@jakarta.annotation.Nullable final String value) {
        this.statement = value;
    }
}
