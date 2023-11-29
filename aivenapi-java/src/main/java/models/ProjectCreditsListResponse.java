package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * ProjectCreditsListResponse
 */
public class ProjectCreditsListResponse implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** List of credits assigned to a project */
    private java.util.List<ProjectCreditsListResponseCredits> credits;
    /** List of errors occurred during request processing */
    private java.util.List<ProjectCreditsListResponseErrors> errors;
    /** Printable result of the request */
    private String message;
    /**
     * Instantiates a new ProjectCreditsListResponse and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ProjectCreditsListResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ProjectCreditsListResponse
     */
    @javax.annotation.Nonnull
    public static ProjectCreditsListResponse createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ProjectCreditsListResponse();
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
     * Gets the credits property value. List of credits assigned to a project
     * @return a ProjectCreditsListResponseCredits
     */
    @javax.annotation.Nullable
    public java.util.List<ProjectCreditsListResponseCredits> getCredits() {
        return this.credits;
    }
    /**
     * Gets the errors property value. List of errors occurred during request processing
     * @return a ProjectCreditsListResponseErrors
     */
    @javax.annotation.Nullable
    public java.util.List<ProjectCreditsListResponseErrors> getErrors() {
        return this.errors;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("credits", (n) -> { this.setCredits(n.getCollectionOfObjectValues(ProjectCreditsListResponseCredits::createFromDiscriminatorValue)); });
        deserializerMap.put("errors", (n) -> { this.setErrors(n.getCollectionOfObjectValues(ProjectCreditsListResponseErrors::createFromDiscriminatorValue)); });
        deserializerMap.put("message", (n) -> { this.setMessage(n.getStringValue()); });
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
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("credits", this.getCredits());
        writer.writeCollectionOfObjectValues("errors", this.getErrors());
        writer.writeStringValue("message", this.getMessage());
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
     * Sets the credits property value. List of credits assigned to a project
     * @param value Value to set for the credits property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCredits(@javax.annotation.Nullable final java.util.List<ProjectCreditsListResponseCredits> value) {
        this.credits = value;
    }
    /**
     * Sets the errors property value. List of errors occurred during request processing
     * @param value Value to set for the errors property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setErrors(@javax.annotation.Nullable final java.util.List<ProjectCreditsListResponseErrors> value) {
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
}
