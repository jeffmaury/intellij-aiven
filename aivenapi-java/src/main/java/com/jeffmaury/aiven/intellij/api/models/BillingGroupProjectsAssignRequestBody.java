package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * BillingGroupProjectsAssignRequestBody
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class BillingGroupProjectsAssignRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Projects names
     */
    private java.util.List<String> projectsNames;
    /**
     * Instantiates a new BillingGroupProjectsAssignRequestBody and sets the default values.
     */
    public BillingGroupProjectsAssignRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a BillingGroupProjectsAssignRequestBody
     */
    @jakarta.annotation.Nonnull
    public static BillingGroupProjectsAssignRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new BillingGroupProjectsAssignRequestBody();
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
        deserializerMap.put("projects_names", (n) -> { this.setProjectsNames(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
    }
    /**
     * Gets the projects_names property value. Projects names
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getProjectsNames() {
        return this.projectsNames;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfPrimitiveValues("projects_names", this.getProjectsNames());
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
     * Sets the projects_names property value. Projects names
     * @param value Value to set for the projects_names property.
     */
    public void setProjectsNames(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.projectsNames = value;
    }
}
