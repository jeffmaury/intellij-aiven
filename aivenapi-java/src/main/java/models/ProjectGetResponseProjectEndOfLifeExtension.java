package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * End of life extension information
 */
public class ProjectGetResponseProjectEndOfLifeExtension implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** Service EOL extension */
    private ProjectGetResponseProjectEndOfLifeExtensionElasticsearch elasticsearch;
    /**
     * Instantiates a new ProjectGetResponseProjectEndOfLifeExtension and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ProjectGetResponseProjectEndOfLifeExtension() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ProjectGetResponseProjectEndOfLifeExtension
     */
    @javax.annotation.Nonnull
    public static ProjectGetResponseProjectEndOfLifeExtension createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ProjectGetResponseProjectEndOfLifeExtension();
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
     * Gets the elasticsearch property value. Service EOL extension
     * @return a ProjectGetResponseProjectEndOfLifeExtensionElasticsearch
     */
    @javax.annotation.Nullable
    public ProjectGetResponseProjectEndOfLifeExtensionElasticsearch getElasticsearch() {
        return this.elasticsearch;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(1);
        deserializerMap.put("elasticsearch", (n) -> { this.setElasticsearch(n.getObjectValue(ProjectGetResponseProjectEndOfLifeExtensionElasticsearch::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("elasticsearch", this.getElasticsearch());
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
     * Sets the elasticsearch property value. Service EOL extension
     * @param value Value to set for the elasticsearch property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setElasticsearch(@javax.annotation.Nullable final ProjectGetResponseProjectEndOfLifeExtensionElasticsearch value) {
        this.elasticsearch = value;
    }
}
