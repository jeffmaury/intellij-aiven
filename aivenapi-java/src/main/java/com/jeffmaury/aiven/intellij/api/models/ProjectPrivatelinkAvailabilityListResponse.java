package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * ProjectPrivatelinkAvailabilityListResponse
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ProjectPrivatelinkAvailabilityListResponse implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * List of errors occurred during request processing
     */
    private java.util.List<ProjectPrivatelinkAvailabilityListResponseErrors> errors;
    /**
     * Printable result of the request
     */
    private String message;
    /**
     * Privatelink pricing information for supported clouds
     */
    private java.util.List<ProjectPrivatelinkAvailabilityListResponsePrivatelinkAvailability> privatelinkAvailability;
    /**
     * Instantiates a new ProjectPrivatelinkAvailabilityListResponse and sets the default values.
     */
    public ProjectPrivatelinkAvailabilityListResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ProjectPrivatelinkAvailabilityListResponse
     */
    @jakarta.annotation.Nonnull
    public static ProjectPrivatelinkAvailabilityListResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ProjectPrivatelinkAvailabilityListResponse();
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
     * Gets the errors property value. List of errors occurred during request processing
     * @return a java.util.List<ProjectPrivatelinkAvailabilityListResponseErrors>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ProjectPrivatelinkAvailabilityListResponseErrors> getErrors() {
        return this.errors;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("errors", (n) -> { this.setErrors(n.getCollectionOfObjectValues(ProjectPrivatelinkAvailabilityListResponseErrors::createFromDiscriminatorValue)); });
        deserializerMap.put("message", (n) -> { this.setMessage(n.getStringValue()); });
        deserializerMap.put("privatelink_availability", (n) -> { this.setPrivatelinkAvailability(n.getCollectionOfObjectValues(ProjectPrivatelinkAvailabilityListResponsePrivatelinkAvailability::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the message property value. Printable result of the request
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getMessage() {
        return this.message;
    }
    /**
     * Gets the privatelink_availability property value. Privatelink pricing information for supported clouds
     * @return a java.util.List<ProjectPrivatelinkAvailabilityListResponsePrivatelinkAvailability>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ProjectPrivatelinkAvailabilityListResponsePrivatelinkAvailability> getPrivatelinkAvailability() {
        return this.privatelinkAvailability;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("errors", this.getErrors());
        writer.writeStringValue("message", this.getMessage());
        writer.writeCollectionOfObjectValues("privatelink_availability", this.getPrivatelinkAvailability());
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
     * Sets the errors property value. List of errors occurred during request processing
     * @param value Value to set for the errors property.
     */
    public void setErrors(@jakarta.annotation.Nullable final java.util.List<ProjectPrivatelinkAvailabilityListResponseErrors> value) {
        this.errors = value;
    }
    /**
     * Sets the message property value. Printable result of the request
     * @param value Value to set for the message property.
     */
    public void setMessage(@jakarta.annotation.Nullable final String value) {
        this.message = value;
    }
    /**
     * Sets the privatelink_availability property value. Privatelink pricing information for supported clouds
     * @param value Value to set for the privatelink_availability property.
     */
    public void setPrivatelinkAvailability(@jakarta.annotation.Nullable final java.util.List<ProjectPrivatelinkAvailabilityListResponsePrivatelinkAvailability> value) {
        this.privatelinkAvailability = value;
    }
}
