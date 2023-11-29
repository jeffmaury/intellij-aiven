package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * OrganizationUserInfo
 */
public class OrganizationUserGetResponseUserInfo implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** City */
    private String city;
    /** Country */
    private String country;
    /** Creation time */
    private String createTime;
    /** Department */
    private String department;
    /** Job Title */
    private String jobTitle;
    /** Managed By Scim */
    private Boolean managedByScim;
    /** Managing Organization ID */
    private String managingOrganizationId;
    /** Real Name */
    private String realName;
    /** State */
    private String state;
    /** User Email */
    private String userEmail;
    /**
     * Instantiates a new OrganizationUserGetResponseUserInfo and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public OrganizationUserGetResponseUserInfo() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a OrganizationUserGetResponseUserInfo
     */
    @javax.annotation.Nonnull
    public static OrganizationUserGetResponseUserInfo createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OrganizationUserGetResponseUserInfo();
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
     * Gets the city property value. City
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCity() {
        return this.city;
    }
    /**
     * Gets the country property value. Country
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCountry() {
        return this.country;
    }
    /**
     * Gets the create_time property value. Creation time
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCreateTime() {
        return this.createTime;
    }
    /**
     * Gets the department property value. Department
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDepartment() {
        return this.department;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(10);
        deserializerMap.put("city", (n) -> { this.setCity(n.getStringValue()); });
        deserializerMap.put("country", (n) -> { this.setCountry(n.getStringValue()); });
        deserializerMap.put("create_time", (n) -> { this.setCreateTime(n.getStringValue()); });
        deserializerMap.put("department", (n) -> { this.setDepartment(n.getStringValue()); });
        deserializerMap.put("job_title", (n) -> { this.setJobTitle(n.getStringValue()); });
        deserializerMap.put("managed_by_scim", (n) -> { this.setManagedByScim(n.getBooleanValue()); });
        deserializerMap.put("managing_organization_id", (n) -> { this.setManagingOrganizationId(n.getStringValue()); });
        deserializerMap.put("real_name", (n) -> { this.setRealName(n.getStringValue()); });
        deserializerMap.put("state", (n) -> { this.setState(n.getStringValue()); });
        deserializerMap.put("user_email", (n) -> { this.setUserEmail(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the job_title property value. Job Title
     * @return a string
     */
    @javax.annotation.Nullable
    public String getJobTitle() {
        return this.jobTitle;
    }
    /**
     * Gets the managed_by_scim property value. Managed By Scim
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getManagedByScim() {
        return this.managedByScim;
    }
    /**
     * Gets the managing_organization_id property value. Managing Organization ID
     * @return a string
     */
    @javax.annotation.Nullable
    public String getManagingOrganizationId() {
        return this.managingOrganizationId;
    }
    /**
     * Gets the real_name property value. Real Name
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRealName() {
        return this.realName;
    }
    /**
     * Gets the state property value. State
     * @return a string
     */
    @javax.annotation.Nullable
    public String getState() {
        return this.state;
    }
    /**
     * Gets the user_email property value. User Email
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserEmail() {
        return this.userEmail;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("city", this.getCity());
        writer.writeStringValue("country", this.getCountry());
        writer.writeStringValue("create_time", this.getCreateTime());
        writer.writeStringValue("department", this.getDepartment());
        writer.writeStringValue("job_title", this.getJobTitle());
        writer.writeBooleanValue("managed_by_scim", this.getManagedByScim());
        writer.writeStringValue("managing_organization_id", this.getManagingOrganizationId());
        writer.writeStringValue("real_name", this.getRealName());
        writer.writeStringValue("state", this.getState());
        writer.writeStringValue("user_email", this.getUserEmail());
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
     * Sets the city property value. City
     * @param value Value to set for the city property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCity(@javax.annotation.Nullable final String value) {
        this.city = value;
    }
    /**
     * Sets the country property value. Country
     * @param value Value to set for the country property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCountry(@javax.annotation.Nullable final String value) {
        this.country = value;
    }
    /**
     * Sets the create_time property value. Creation time
     * @param value Value to set for the createTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreateTime(@javax.annotation.Nullable final String value) {
        this.createTime = value;
    }
    /**
     * Sets the department property value. Department
     * @param value Value to set for the department property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDepartment(@javax.annotation.Nullable final String value) {
        this.department = value;
    }
    /**
     * Sets the job_title property value. Job Title
     * @param value Value to set for the jobTitle property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setJobTitle(@javax.annotation.Nullable final String value) {
        this.jobTitle = value;
    }
    /**
     * Sets the managed_by_scim property value. Managed By Scim
     * @param value Value to set for the managedByScim property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setManagedByScim(@javax.annotation.Nullable final Boolean value) {
        this.managedByScim = value;
    }
    /**
     * Sets the managing_organization_id property value. Managing Organization ID
     * @param value Value to set for the managingOrganizationId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setManagingOrganizationId(@javax.annotation.Nullable final String value) {
        this.managingOrganizationId = value;
    }
    /**
     * Sets the real_name property value. Real Name
     * @param value Value to set for the realName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRealName(@javax.annotation.Nullable final String value) {
        this.realName = value;
    }
    /**
     * Sets the state property value. State
     * @param value Value to set for the state property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setState(@javax.annotation.Nullable final String value) {
        this.state = value;
    }
    /**
     * Sets the user_email property value. User Email
     * @param value Value to set for the userEmail property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserEmail(@javax.annotation.Nullable final String value) {
        this.userEmail = value;
    }
}
