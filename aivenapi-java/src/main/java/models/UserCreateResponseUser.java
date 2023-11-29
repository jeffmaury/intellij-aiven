package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * User information
 */
public class UserCreateResponseUser implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** List of user's required authentication methods */
    private java.util.List<String> auth;
    /** City */
    private String city;
    /** Country code ISO 3166-1 alpha-2 */
    private String country;
    /** User registration time */
    private String createTime;
    /** Job department */
    private String department;
    /** Feature flags */
    private UserCreateResponseUserFeatures features;
    /** List of pending invitations */
    private java.util.List<UserCreateResponseUserInvitations> invitations;
    /** Job title */
    private String jobTitle;
    /** User management status */
    private Boolean managedByScim;
    /** Organization ID */
    private String managingOrganizationId;
    /** Project membership and type of membership */
    private UserCreateResponseUserProjectMembership projectMembership;
    /** List of project membership and type of membership */
    private UserCreateResponseUserProjectMemberships projectMemberships;
    /** List of projects the user is a member of */
    private java.util.List<String> projects;
    /** User real name */
    private String realName;
    /** User account state */
    private String state;
    /** Earliest valid authentication token timestamp */
    private String tokenValidityBegin;
    /** User email address */
    private String user;
    /** User ID */
    private String userId;
    /**
     * Instantiates a new UserCreateResponseUser and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public UserCreateResponseUser() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a UserCreateResponseUser
     */
    @javax.annotation.Nonnull
    public static UserCreateResponseUser createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserCreateResponseUser();
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
     * Gets the auth property value. List of user's required authentication methods
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getAuth() {
        return this.auth;
    }
    /**
     * Gets the city property value. City
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCity() {
        return this.city;
    }
    /**
     * Gets the country property value. Country code ISO 3166-1 alpha-2
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCountry() {
        return this.country;
    }
    /**
     * Gets the create_time property value. User registration time
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCreateTime() {
        return this.createTime;
    }
    /**
     * Gets the department property value. Job department
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDepartment() {
        return this.department;
    }
    /**
     * Gets the features property value. Feature flags
     * @return a UserCreateResponseUserFeatures
     */
    @javax.annotation.Nullable
    public UserCreateResponseUserFeatures getFeatures() {
        return this.features;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(18);
        deserializerMap.put("auth", (n) -> { this.setAuth(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("city", (n) -> { this.setCity(n.getStringValue()); });
        deserializerMap.put("country", (n) -> { this.setCountry(n.getStringValue()); });
        deserializerMap.put("create_time", (n) -> { this.setCreateTime(n.getStringValue()); });
        deserializerMap.put("department", (n) -> { this.setDepartment(n.getStringValue()); });
        deserializerMap.put("features", (n) -> { this.setFeatures(n.getObjectValue(UserCreateResponseUserFeatures::createFromDiscriminatorValue)); });
        deserializerMap.put("invitations", (n) -> { this.setInvitations(n.getCollectionOfObjectValues(UserCreateResponseUserInvitations::createFromDiscriminatorValue)); });
        deserializerMap.put("job_title", (n) -> { this.setJobTitle(n.getStringValue()); });
        deserializerMap.put("managed_by_scim", (n) -> { this.setManagedByScim(n.getBooleanValue()); });
        deserializerMap.put("managing_organization_id", (n) -> { this.setManagingOrganizationId(n.getStringValue()); });
        deserializerMap.put("project_membership", (n) -> { this.setProjectMembership(n.getObjectValue(UserCreateResponseUserProjectMembership::createFromDiscriminatorValue)); });
        deserializerMap.put("project_memberships", (n) -> { this.setProjectMemberships(n.getObjectValue(UserCreateResponseUserProjectMemberships::createFromDiscriminatorValue)); });
        deserializerMap.put("projects", (n) -> { this.setProjects(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("real_name", (n) -> { this.setRealName(n.getStringValue()); });
        deserializerMap.put("state", (n) -> { this.setState(n.getStringValue()); });
        deserializerMap.put("token_validity_begin", (n) -> { this.setTokenValidityBegin(n.getStringValue()); });
        deserializerMap.put("user", (n) -> { this.setUser(n.getStringValue()); });
        deserializerMap.put("user_id", (n) -> { this.setUserId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the invitations property value. List of pending invitations
     * @return a UserCreateResponseUserInvitations
     */
    @javax.annotation.Nullable
    public java.util.List<UserCreateResponseUserInvitations> getInvitations() {
        return this.invitations;
    }
    /**
     * Gets the job_title property value. Job title
     * @return a string
     */
    @javax.annotation.Nullable
    public String getJobTitle() {
        return this.jobTitle;
    }
    /**
     * Gets the managed_by_scim property value. User management status
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getManagedByScim() {
        return this.managedByScim;
    }
    /**
     * Gets the managing_organization_id property value. Organization ID
     * @return a string
     */
    @javax.annotation.Nullable
    public String getManagingOrganizationId() {
        return this.managingOrganizationId;
    }
    /**
     * Gets the project_membership property value. Project membership and type of membership
     * @return a UserCreateResponseUserProjectMembership
     */
    @javax.annotation.Nullable
    public UserCreateResponseUserProjectMembership getProjectMembership() {
        return this.projectMembership;
    }
    /**
     * Gets the project_memberships property value. List of project membership and type of membership
     * @return a UserCreateResponseUserProjectMemberships
     */
    @javax.annotation.Nullable
    public UserCreateResponseUserProjectMemberships getProjectMemberships() {
        return this.projectMemberships;
    }
    /**
     * Gets the projects property value. List of projects the user is a member of
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getProjects() {
        return this.projects;
    }
    /**
     * Gets the real_name property value. User real name
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRealName() {
        return this.realName;
    }
    /**
     * Gets the state property value. User account state
     * @return a string
     */
    @javax.annotation.Nullable
    public String getState() {
        return this.state;
    }
    /**
     * Gets the token_validity_begin property value. Earliest valid authentication token timestamp
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTokenValidityBegin() {
        return this.tokenValidityBegin;
    }
    /**
     * Gets the user property value. User email address
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUser() {
        return this.user;
    }
    /**
     * Gets the user_id property value. User ID
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserId() {
        return this.userId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfPrimitiveValues("auth", this.getAuth());
        writer.writeStringValue("city", this.getCity());
        writer.writeStringValue("country", this.getCountry());
        writer.writeStringValue("create_time", this.getCreateTime());
        writer.writeStringValue("department", this.getDepartment());
        writer.writeObjectValue("features", this.getFeatures());
        writer.writeCollectionOfObjectValues("invitations", this.getInvitations());
        writer.writeStringValue("job_title", this.getJobTitle());
        writer.writeBooleanValue("managed_by_scim", this.getManagedByScim());
        writer.writeStringValue("managing_organization_id", this.getManagingOrganizationId());
        writer.writeObjectValue("project_membership", this.getProjectMembership());
        writer.writeObjectValue("project_memberships", this.getProjectMemberships());
        writer.writeCollectionOfPrimitiveValues("projects", this.getProjects());
        writer.writeStringValue("real_name", this.getRealName());
        writer.writeStringValue("state", this.getState());
        writer.writeStringValue("token_validity_begin", this.getTokenValidityBegin());
        writer.writeStringValue("user", this.getUser());
        writer.writeStringValue("user_id", this.getUserId());
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
     * Sets the auth property value. List of user's required authentication methods
     * @param value Value to set for the auth property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAuth(@javax.annotation.Nullable final java.util.List<String> value) {
        this.auth = value;
    }
    /**
     * Sets the city property value. City
     * @param value Value to set for the city property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCity(@javax.annotation.Nullable final String value) {
        this.city = value;
    }
    /**
     * Sets the country property value. Country code ISO 3166-1 alpha-2
     * @param value Value to set for the country property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCountry(@javax.annotation.Nullable final String value) {
        this.country = value;
    }
    /**
     * Sets the create_time property value. User registration time
     * @param value Value to set for the createTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreateTime(@javax.annotation.Nullable final String value) {
        this.createTime = value;
    }
    /**
     * Sets the department property value. Job department
     * @param value Value to set for the department property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDepartment(@javax.annotation.Nullable final String value) {
        this.department = value;
    }
    /**
     * Sets the features property value. Feature flags
     * @param value Value to set for the features property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFeatures(@javax.annotation.Nullable final UserCreateResponseUserFeatures value) {
        this.features = value;
    }
    /**
     * Sets the invitations property value. List of pending invitations
     * @param value Value to set for the invitations property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setInvitations(@javax.annotation.Nullable final java.util.List<UserCreateResponseUserInvitations> value) {
        this.invitations = value;
    }
    /**
     * Sets the job_title property value. Job title
     * @param value Value to set for the jobTitle property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setJobTitle(@javax.annotation.Nullable final String value) {
        this.jobTitle = value;
    }
    /**
     * Sets the managed_by_scim property value. User management status
     * @param value Value to set for the managedByScim property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setManagedByScim(@javax.annotation.Nullable final Boolean value) {
        this.managedByScim = value;
    }
    /**
     * Sets the managing_organization_id property value. Organization ID
     * @param value Value to set for the managingOrganizationId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setManagingOrganizationId(@javax.annotation.Nullable final String value) {
        this.managingOrganizationId = value;
    }
    /**
     * Sets the project_membership property value. Project membership and type of membership
     * @param value Value to set for the projectMembership property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setProjectMembership(@javax.annotation.Nullable final UserCreateResponseUserProjectMembership value) {
        this.projectMembership = value;
    }
    /**
     * Sets the project_memberships property value. List of project membership and type of membership
     * @param value Value to set for the projectMemberships property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setProjectMemberships(@javax.annotation.Nullable final UserCreateResponseUserProjectMemberships value) {
        this.projectMemberships = value;
    }
    /**
     * Sets the projects property value. List of projects the user is a member of
     * @param value Value to set for the projects property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setProjects(@javax.annotation.Nullable final java.util.List<String> value) {
        this.projects = value;
    }
    /**
     * Sets the real_name property value. User real name
     * @param value Value to set for the realName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRealName(@javax.annotation.Nullable final String value) {
        this.realName = value;
    }
    /**
     * Sets the state property value. User account state
     * @param value Value to set for the state property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setState(@javax.annotation.Nullable final String value) {
        this.state = value;
    }
    /**
     * Sets the token_validity_begin property value. Earliest valid authentication token timestamp
     * @param value Value to set for the tokenValidityBegin property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTokenValidityBegin(@javax.annotation.Nullable final String value) {
        this.tokenValidityBegin = value;
    }
    /**
     * Sets the user property value. User email address
     * @param value Value to set for the user property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUser(@javax.annotation.Nullable final String value) {
        this.user = value;
    }
    /**
     * Sets the user_id property value. User ID
     * @param value Value to set for the userId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserId(@javax.annotation.Nullable final String value) {
        this.userId = value;
    }
}
