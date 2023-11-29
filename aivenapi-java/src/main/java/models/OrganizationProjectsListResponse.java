package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * OrganizationProjectsListResponse
 */
public class OrganizationProjectsListResponse implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** List of errors occurred during request processing */
    private java.util.List<OrganizationProjectsListResponseErrors> errors;
    /** Printable result of the request */
    private String message;
    /** List of projects */
    private java.util.List<OrganizationProjectsListResponseProjects> projects;
    /** Total count of projects associated to account. */
    private Integer totalProjectCount;
    /**
     * Instantiates a new OrganizationProjectsListResponse and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public OrganizationProjectsListResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a OrganizationProjectsListResponse
     */
    @javax.annotation.Nonnull
    public static OrganizationProjectsListResponse createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OrganizationProjectsListResponse();
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
     * Gets the errors property value. List of errors occurred during request processing
     * @return a OrganizationProjectsListResponseErrors
     */
    @javax.annotation.Nullable
    public java.util.List<OrganizationProjectsListResponseErrors> getErrors() {
        return this.errors;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("errors", (n) -> { this.setErrors(n.getCollectionOfObjectValues(OrganizationProjectsListResponseErrors::createFromDiscriminatorValue)); });
        deserializerMap.put("message", (n) -> { this.setMessage(n.getStringValue()); });
        deserializerMap.put("projects", (n) -> { this.setProjects(n.getCollectionOfObjectValues(OrganizationProjectsListResponseProjects::createFromDiscriminatorValue)); });
        deserializerMap.put("total_project_count", (n) -> { this.setTotalProjectCount(n.getIntegerValue()); });
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
     * Gets the projects property value. List of projects
     * @return a OrganizationProjectsListResponseProjects
     */
    @javax.annotation.Nullable
    public java.util.List<OrganizationProjectsListResponseProjects> getProjects() {
        return this.projects;
    }
    /**
     * Gets the total_project_count property value. Total count of projects associated to account.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getTotalProjectCount() {
        return this.totalProjectCount;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("errors", this.getErrors());
        writer.writeStringValue("message", this.getMessage());
        writer.writeCollectionOfObjectValues("projects", this.getProjects());
        writer.writeIntegerValue("total_project_count", this.getTotalProjectCount());
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
     * Sets the errors property value. List of errors occurred during request processing
     * @param value Value to set for the errors property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setErrors(@javax.annotation.Nullable final java.util.List<OrganizationProjectsListResponseErrors> value) {
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
    /**
     * Sets the projects property value. List of projects
     * @param value Value to set for the projects property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setProjects(@javax.annotation.Nullable final java.util.List<OrganizationProjectsListResponseProjects> value) {
        this.projects = value;
    }
    /**
     * Sets the total_project_count property value. Total count of projects associated to account.
     * @param value Value to set for the totalProjectCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTotalProjectCount(@javax.annotation.Nullable final Integer value) {
        this.totalProjectCount = value;
    }
}
