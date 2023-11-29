package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * ProjectListResponse
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ProjectListResponse implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * List of errors occurred during request processing
     */
    private java.util.List<ProjectListResponseErrors> errors;
    /**
     * Printable result of the request
     */
    private String message;
    /**
     * Project membership and type of membership
     */
    private ProjectListResponseProjectMembership projectMembership;
    /**
     * List of project membership and type of membership
     */
    private ProjectListResponseProjectMemberships projectMemberships;
    /**
     * List of projects
     */
    private java.util.List<ProjectListResponseProjects> projects;
    /**
     * Instantiates a new ProjectListResponse and sets the default values.
     */
    public ProjectListResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ProjectListResponse
     */
    @jakarta.annotation.Nonnull
    public static ProjectListResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ProjectListResponse();
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
     * @return a java.util.List<ProjectListResponseErrors>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ProjectListResponseErrors> getErrors() {
        return this.errors;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("errors", (n) -> { this.setErrors(n.getCollectionOfObjectValues(ProjectListResponseErrors::createFromDiscriminatorValue)); });
        deserializerMap.put("message", (n) -> { this.setMessage(n.getStringValue()); });
        deserializerMap.put("project_membership", (n) -> { this.setProjectMembership(n.getObjectValue(ProjectListResponseProjectMembership::createFromDiscriminatorValue)); });
        deserializerMap.put("project_memberships", (n) -> { this.setProjectMemberships(n.getObjectValue(ProjectListResponseProjectMemberships::createFromDiscriminatorValue)); });
        deserializerMap.put("projects", (n) -> { this.setProjects(n.getCollectionOfObjectValues(ProjectListResponseProjects::createFromDiscriminatorValue)); });
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
     * Gets the project_membership property value. Project membership and type of membership
     * @return a ProjectListResponseProjectMembership
     */
    @jakarta.annotation.Nullable
    public ProjectListResponseProjectMembership getProjectMembership() {
        return this.projectMembership;
    }
    /**
     * Gets the project_memberships property value. List of project membership and type of membership
     * @return a ProjectListResponseProjectMemberships
     */
    @jakarta.annotation.Nullable
    public ProjectListResponseProjectMemberships getProjectMemberships() {
        return this.projectMemberships;
    }
    /**
     * Gets the projects property value. List of projects
     * @return a java.util.List<ProjectListResponseProjects>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ProjectListResponseProjects> getProjects() {
        return this.projects;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("errors", this.getErrors());
        writer.writeStringValue("message", this.getMessage());
        writer.writeObjectValue("project_membership", this.getProjectMembership());
        writer.writeObjectValue("project_memberships", this.getProjectMemberships());
        writer.writeCollectionOfObjectValues("projects", this.getProjects());
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
    public void setErrors(@jakarta.annotation.Nullable final java.util.List<ProjectListResponseErrors> value) {
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
     * Sets the project_membership property value. Project membership and type of membership
     * @param value Value to set for the project_membership property.
     */
    public void setProjectMembership(@jakarta.annotation.Nullable final ProjectListResponseProjectMembership value) {
        this.projectMembership = value;
    }
    /**
     * Sets the project_memberships property value. List of project membership and type of membership
     * @param value Value to set for the project_memberships property.
     */
    public void setProjectMemberships(@jakarta.annotation.Nullable final ProjectListResponseProjectMemberships value) {
        this.projectMemberships = value;
    }
    /**
     * Sets the projects property value. List of projects
     * @param value Value to set for the projects property.
     */
    public void setProjects(@jakarta.annotation.Nullable final java.util.List<ProjectListResponseProjects> value) {
        this.projects = value;
    }
}
