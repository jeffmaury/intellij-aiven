package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * ProjectUserListResponse
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ProjectUserListResponse implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * List of errors occurred during request processing
     */
    private java.util.List<ProjectUserListResponseErrors> errors;
    /**
     * List of users in groups that have access to the project
     */
    private java.util.List<ProjectUserListResponseGroupUsers> groupUsers;
    /**
     * List of pending invitations
     */
    private java.util.List<ProjectUserListResponseInvitations> invitations;
    /**
     * Printable result of the request
     */
    private String message;
    /**
     * List of project's users
     */
    private java.util.List<ProjectUserListResponseUsers> users;
    /**
     * Instantiates a new ProjectUserListResponse and sets the default values.
     */
    public ProjectUserListResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ProjectUserListResponse
     */
    @jakarta.annotation.Nonnull
    public static ProjectUserListResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ProjectUserListResponse();
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
     * @return a java.util.List<ProjectUserListResponseErrors>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ProjectUserListResponseErrors> getErrors() {
        return this.errors;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("errors", (n) -> { this.setErrors(n.getCollectionOfObjectValues(ProjectUserListResponseErrors::createFromDiscriminatorValue)); });
        deserializerMap.put("group_users", (n) -> { this.setGroupUsers(n.getCollectionOfObjectValues(ProjectUserListResponseGroupUsers::createFromDiscriminatorValue)); });
        deserializerMap.put("invitations", (n) -> { this.setInvitations(n.getCollectionOfObjectValues(ProjectUserListResponseInvitations::createFromDiscriminatorValue)); });
        deserializerMap.put("message", (n) -> { this.setMessage(n.getStringValue()); });
        deserializerMap.put("users", (n) -> { this.setUsers(n.getCollectionOfObjectValues(ProjectUserListResponseUsers::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the group_users property value. List of users in groups that have access to the project
     * @return a java.util.List<ProjectUserListResponseGroupUsers>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ProjectUserListResponseGroupUsers> getGroupUsers() {
        return this.groupUsers;
    }
    /**
     * Gets the invitations property value. List of pending invitations
     * @return a java.util.List<ProjectUserListResponseInvitations>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ProjectUserListResponseInvitations> getInvitations() {
        return this.invitations;
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
     * Gets the users property value. List of project's users
     * @return a java.util.List<ProjectUserListResponseUsers>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ProjectUserListResponseUsers> getUsers() {
        return this.users;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("errors", this.getErrors());
        writer.writeCollectionOfObjectValues("group_users", this.getGroupUsers());
        writer.writeCollectionOfObjectValues("invitations", this.getInvitations());
        writer.writeStringValue("message", this.getMessage());
        writer.writeCollectionOfObjectValues("users", this.getUsers());
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
    public void setErrors(@jakarta.annotation.Nullable final java.util.List<ProjectUserListResponseErrors> value) {
        this.errors = value;
    }
    /**
     * Sets the group_users property value. List of users in groups that have access to the project
     * @param value Value to set for the group_users property.
     */
    public void setGroupUsers(@jakarta.annotation.Nullable final java.util.List<ProjectUserListResponseGroupUsers> value) {
        this.groupUsers = value;
    }
    /**
     * Sets the invitations property value. List of pending invitations
     * @param value Value to set for the invitations property.
     */
    public void setInvitations(@jakarta.annotation.Nullable final java.util.List<ProjectUserListResponseInvitations> value) {
        this.invitations = value;
    }
    /**
     * Sets the message property value. Printable result of the request
     * @param value Value to set for the message property.
     */
    public void setMessage(@jakarta.annotation.Nullable final String value) {
        this.message = value;
    }
    /**
     * Sets the users property value. List of project's users
     * @param value Value to set for the users property.
     */
    public void setUsers(@jakarta.annotation.Nullable final java.util.List<ProjectUserListResponseUsers> value) {
        this.users = value;
    }
}
