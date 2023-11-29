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
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UserUpdateResponseUser implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * List of user's required authentication methods
     */
    private java.util.List<String> auth;
    /**
     * City
     */
    private String city;
    /**
     * Country code ISO 3166-1 alpha-2
     */
    private String country;
    /**
     * User registration time
     */
    private String createTime;
    /**
     * Job department
     */
    private String department;
    /**
     * Feature flags
     */
    private UserUpdateResponseUserFeatures features;
    /**
     * Intercom settings
     */
    private UserUpdateResponseUserIntercom intercom;
    /**
     * List of pending invitations
     */
    private java.util.List<UserUpdateResponseUserInvitations> invitations;
    /**
     * Job title
     */
    private String jobTitle;
    /**
     * User management status
     */
    private Boolean managedByScim;
    /**
     * Organization ID
     */
    private String managingOrganizationId;
    /**
     * Project membership and type of membership
     */
    private UserUpdateResponseUserProjectMembership projectMembership;
    /**
     * List of project membership and type of membership
     */
    private UserUpdateResponseUserProjectMemberships projectMemberships;
    /**
     * List of projects the user is a member of
     */
    private java.util.List<String> projects;
    /**
     * User real name
     */
    private String realName;
    /**
     * User account state
     */
    private String state;
    /**
     * Earliest valid authentication token timestamp
     */
    private String tokenValidityBegin;
    /**
     * User email address
     */
    private String user;
    /**
     * User ID
     */
    private String userId;
    /**
     * Instantiates a new UserUpdateResponseUser and sets the default values.
     */
    public UserUpdateResponseUser() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a UserUpdateResponseUser
     */
    @jakarta.annotation.Nonnull
    public static UserUpdateResponseUser createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserUpdateResponseUser();
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
     * Gets the auth property value. List of user's required authentication methods
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getAuth() {
        return this.auth;
    }
    /**
     * Gets the city property value. City
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCity() {
        return this.city;
    }
    /**
     * Gets the country property value. Country code ISO 3166-1 alpha-2
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCountry() {
        return this.country;
    }
    /**
     * Gets the create_time property value. User registration time
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCreateTime() {
        return this.createTime;
    }
    /**
     * Gets the department property value. Job department
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDepartment() {
        return this.department;
    }
    /**
     * Gets the features property value. Feature flags
     * @return a UserUpdateResponseUserFeatures
     */
    @jakarta.annotation.Nullable
    public UserUpdateResponseUserFeatures getFeatures() {
        return this.features;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(19);
        deserializerMap.put("auth", (n) -> { this.setAuth(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("city", (n) -> { this.setCity(n.getStringValue()); });
        deserializerMap.put("country", (n) -> { this.setCountry(n.getStringValue()); });
        deserializerMap.put("create_time", (n) -> { this.setCreateTime(n.getStringValue()); });
        deserializerMap.put("department", (n) -> { this.setDepartment(n.getStringValue()); });
        deserializerMap.put("features", (n) -> { this.setFeatures(n.getObjectValue(UserUpdateResponseUserFeatures::createFromDiscriminatorValue)); });
        deserializerMap.put("intercom", (n) -> { this.setIntercom(n.getObjectValue(UserUpdateResponseUserIntercom::createFromDiscriminatorValue)); });
        deserializerMap.put("invitations", (n) -> { this.setInvitations(n.getCollectionOfObjectValues(UserUpdateResponseUserInvitations::createFromDiscriminatorValue)); });
        deserializerMap.put("job_title", (n) -> { this.setJobTitle(n.getStringValue()); });
        deserializerMap.put("managed_by_scim", (n) -> { this.setManagedByScim(n.getBooleanValue()); });
        deserializerMap.put("managing_organization_id", (n) -> { this.setManagingOrganizationId(n.getStringValue()); });
        deserializerMap.put("project_membership", (n) -> { this.setProjectMembership(n.getObjectValue(UserUpdateResponseUserProjectMembership::createFromDiscriminatorValue)); });
        deserializerMap.put("project_memberships", (n) -> { this.setProjectMemberships(n.getObjectValue(UserUpdateResponseUserProjectMemberships::createFromDiscriminatorValue)); });
        deserializerMap.put("projects", (n) -> { this.setProjects(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("real_name", (n) -> { this.setRealName(n.getStringValue()); });
        deserializerMap.put("state", (n) -> { this.setState(n.getStringValue()); });
        deserializerMap.put("token_validity_begin", (n) -> { this.setTokenValidityBegin(n.getStringValue()); });
        deserializerMap.put("user", (n) -> { this.setUser(n.getStringValue()); });
        deserializerMap.put("user_id", (n) -> { this.setUserId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the intercom property value. Intercom settings
     * @return a UserUpdateResponseUserIntercom
     */
    @jakarta.annotation.Nullable
    public UserUpdateResponseUserIntercom getIntercom() {
        return this.intercom;
    }
    /**
     * Gets the invitations property value. List of pending invitations
     * @return a java.util.List<UserUpdateResponseUserInvitations>
     */
    @jakarta.annotation.Nullable
    public java.util.List<UserUpdateResponseUserInvitations> getInvitations() {
        return this.invitations;
    }
    /**
     * Gets the job_title property value. Job title
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getJobTitle() {
        return this.jobTitle;
    }
    /**
     * Gets the managed_by_scim property value. User management status
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getManagedByScim() {
        return this.managedByScim;
    }
    /**
     * Gets the managing_organization_id property value. Organization ID
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getManagingOrganizationId() {
        return this.managingOrganizationId;
    }
    /**
     * Gets the project_membership property value. Project membership and type of membership
     * @return a UserUpdateResponseUserProjectMembership
     */
    @jakarta.annotation.Nullable
    public UserUpdateResponseUserProjectMembership getProjectMembership() {
        return this.projectMembership;
    }
    /**
     * Gets the project_memberships property value. List of project membership and type of membership
     * @return a UserUpdateResponseUserProjectMemberships
     */
    @jakarta.annotation.Nullable
    public UserUpdateResponseUserProjectMemberships getProjectMemberships() {
        return this.projectMemberships;
    }
    /**
     * Gets the projects property value. List of projects the user is a member of
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getProjects() {
        return this.projects;
    }
    /**
     * Gets the real_name property value. User real name
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getRealName() {
        return this.realName;
    }
    /**
     * Gets the state property value. User account state
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getState() {
        return this.state;
    }
    /**
     * Gets the token_validity_begin property value. Earliest valid authentication token timestamp
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getTokenValidityBegin() {
        return this.tokenValidityBegin;
    }
    /**
     * Gets the user property value. User email address
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getUser() {
        return this.user;
    }
    /**
     * Gets the user_id property value. User ID
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getUserId() {
        return this.userId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfPrimitiveValues("auth", this.getAuth());
        writer.writeStringValue("city", this.getCity());
        writer.writeStringValue("country", this.getCountry());
        writer.writeStringValue("create_time", this.getCreateTime());
        writer.writeStringValue("department", this.getDepartment());
        writer.writeObjectValue("features", this.getFeatures());
        writer.writeObjectValue("intercom", this.getIntercom());
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
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the auth property value. List of user's required authentication methods
     * @param value Value to set for the auth property.
     */
    public void setAuth(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.auth = value;
    }
    /**
     * Sets the city property value. City
     * @param value Value to set for the city property.
     */
    public void setCity(@jakarta.annotation.Nullable final String value) {
        this.city = value;
    }
    /**
     * Sets the country property value. Country code ISO 3166-1 alpha-2
     * @param value Value to set for the country property.
     */
    public void setCountry(@jakarta.annotation.Nullable final String value) {
        this.country = value;
    }
    /**
     * Sets the create_time property value. User registration time
     * @param value Value to set for the create_time property.
     */
    public void setCreateTime(@jakarta.annotation.Nullable final String value) {
        this.createTime = value;
    }
    /**
     * Sets the department property value. Job department
     * @param value Value to set for the department property.
     */
    public void setDepartment(@jakarta.annotation.Nullable final String value) {
        this.department = value;
    }
    /**
     * Sets the features property value. Feature flags
     * @param value Value to set for the features property.
     */
    public void setFeatures(@jakarta.annotation.Nullable final UserUpdateResponseUserFeatures value) {
        this.features = value;
    }
    /**
     * Sets the intercom property value. Intercom settings
     * @param value Value to set for the intercom property.
     */
    public void setIntercom(@jakarta.annotation.Nullable final UserUpdateResponseUserIntercom value) {
        this.intercom = value;
    }
    /**
     * Sets the invitations property value. List of pending invitations
     * @param value Value to set for the invitations property.
     */
    public void setInvitations(@jakarta.annotation.Nullable final java.util.List<UserUpdateResponseUserInvitations> value) {
        this.invitations = value;
    }
    /**
     * Sets the job_title property value. Job title
     * @param value Value to set for the job_title property.
     */
    public void setJobTitle(@jakarta.annotation.Nullable final String value) {
        this.jobTitle = value;
    }
    /**
     * Sets the managed_by_scim property value. User management status
     * @param value Value to set for the managed_by_scim property.
     */
    public void setManagedByScim(@jakarta.annotation.Nullable final Boolean value) {
        this.managedByScim = value;
    }
    /**
     * Sets the managing_organization_id property value. Organization ID
     * @param value Value to set for the managing_organization_id property.
     */
    public void setManagingOrganizationId(@jakarta.annotation.Nullable final String value) {
        this.managingOrganizationId = value;
    }
    /**
     * Sets the project_membership property value. Project membership and type of membership
     * @param value Value to set for the project_membership property.
     */
    public void setProjectMembership(@jakarta.annotation.Nullable final UserUpdateResponseUserProjectMembership value) {
        this.projectMembership = value;
    }
    /**
     * Sets the project_memberships property value. List of project membership and type of membership
     * @param value Value to set for the project_memberships property.
     */
    public void setProjectMemberships(@jakarta.annotation.Nullable final UserUpdateResponseUserProjectMemberships value) {
        this.projectMemberships = value;
    }
    /**
     * Sets the projects property value. List of projects the user is a member of
     * @param value Value to set for the projects property.
     */
    public void setProjects(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.projects = value;
    }
    /**
     * Sets the real_name property value. User real name
     * @param value Value to set for the real_name property.
     */
    public void setRealName(@jakarta.annotation.Nullable final String value) {
        this.realName = value;
    }
    /**
     * Sets the state property value. User account state
     * @param value Value to set for the state property.
     */
    public void setState(@jakarta.annotation.Nullable final String value) {
        this.state = value;
    }
    /**
     * Sets the token_validity_begin property value. Earliest valid authentication token timestamp
     * @param value Value to set for the token_validity_begin property.
     */
    public void setTokenValidityBegin(@jakarta.annotation.Nullable final String value) {
        this.tokenValidityBegin = value;
    }
    /**
     * Sets the user property value. User email address
     * @param value Value to set for the user property.
     */
    public void setUser(@jakarta.annotation.Nullable final String value) {
        this.user = value;
    }
    /**
     * Sets the user_id property value. User ID
     * @param value Value to set for the user_id property.
     */
    public void setUserId(@jakarta.annotation.Nullable final String value) {
        this.userId = value;
    }
}
