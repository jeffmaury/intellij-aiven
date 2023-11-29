package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * ProjectServiceTagsUpdateRequestBody
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ProjectServiceTagsUpdateRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Set of resource tags
     */
    private ProjectServiceTagsUpdateRequestBodyTags tags;
    /**
     * Instantiates a new ProjectServiceTagsUpdateRequestBody and sets the default values.
     */
    public ProjectServiceTagsUpdateRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ProjectServiceTagsUpdateRequestBody
     */
    @jakarta.annotation.Nonnull
    public static ProjectServiceTagsUpdateRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ProjectServiceTagsUpdateRequestBody();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(1);
        deserializerMap.put("tags", (n) -> { this.setTags(n.getObjectValue(ProjectServiceTagsUpdateRequestBodyTags::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the tags property value. Set of resource tags
     * @return a ProjectServiceTagsUpdateRequestBodyTags
     */
    @jakarta.annotation.Nullable
    public ProjectServiceTagsUpdateRequestBodyTags getTags() {
        return this.tags;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("tags", this.getTags());
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
     * Sets the tags property value. Set of resource tags
     * @param value Value to set for the tags property.
     */
    public void setTags(@jakarta.annotation.Nullable final ProjectServiceTagsUpdateRequestBodyTags value) {
        this.tags = value;
    }
}
