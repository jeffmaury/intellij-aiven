package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ProjectTicketListResponseTickets implements AdditionalDataHolder, Parsable {
    /**
     * Account ID
     */
    private String accountId;
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Created timestamp, ISO 8601 format
     */
    private String createTime;
    /**
     * Longer description
     */
    private String description;
    /**
     * Ticket followers
     */
    private java.util.List<ProjectTicketListResponseTicketsFollowers> followers;
    /**
     * Whether the current user is following this ticket
     */
    private Boolean following;
    /**
     * Organization ID
     */
    private String organizationId;
    /**
     * Project name
     */
    private String projectName;
    /**
     * Service name
     */
    private String serviceName;
    /**
     * Severity level
     */
    private ProjectTicketListResponseTicketsSeverity severity;
    /**
     * Is ticket open or closed
     */
    private ProjectTicketListResponseTicketsState state;
    /**
     * User information
     */
    private ProjectTicketListResponseTicketsSubmitter submitter;
    /**
     * Ticket ID
     */
    private String ticketId;
    /**
     * Short description
     */
    private String title;
    /**
     * Update timestamp, ISO 8601 format
     */
    private String updateTime;
    /**
     * User email address
     */
    private String userEmail;
    /**
     * User real name
     */
    private String userRealName;
    /**
     * Instantiates a new ProjectTicketListResponseTickets and sets the default values.
     */
    public ProjectTicketListResponseTickets() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ProjectTicketListResponseTickets
     */
    @jakarta.annotation.Nonnull
    public static ProjectTicketListResponseTickets createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ProjectTicketListResponseTickets();
    }
    /**
     * Gets the account_id property value. Account ID
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAccountId() {
        return this.accountId;
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
     * Gets the create_time property value. Created timestamp, ISO 8601 format
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCreateTime() {
        return this.createTime;
    }
    /**
     * Gets the description property value. Longer description
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(16);
        deserializerMap.put("account_id", (n) -> { this.setAccountId(n.getStringValue()); });
        deserializerMap.put("create_time", (n) -> { this.setCreateTime(n.getStringValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("followers", (n) -> { this.setFollowers(n.getCollectionOfObjectValues(ProjectTicketListResponseTicketsFollowers::createFromDiscriminatorValue)); });
        deserializerMap.put("following", (n) -> { this.setFollowing(n.getBooleanValue()); });
        deserializerMap.put("organization_id", (n) -> { this.setOrganizationId(n.getStringValue()); });
        deserializerMap.put("project_name", (n) -> { this.setProjectName(n.getStringValue()); });
        deserializerMap.put("service_name", (n) -> { this.setServiceName(n.getStringValue()); });
        deserializerMap.put("severity", (n) -> { this.setSeverity(n.getEnumValue(ProjectTicketListResponseTicketsSeverity::forValue)); });
        deserializerMap.put("state", (n) -> { this.setState(n.getEnumValue(ProjectTicketListResponseTicketsState::forValue)); });
        deserializerMap.put("submitter", (n) -> { this.setSubmitter(n.getObjectValue(ProjectTicketListResponseTicketsSubmitter::createFromDiscriminatorValue)); });
        deserializerMap.put("ticket_id", (n) -> { this.setTicketId(n.getStringValue()); });
        deserializerMap.put("title", (n) -> { this.setTitle(n.getStringValue()); });
        deserializerMap.put("update_time", (n) -> { this.setUpdateTime(n.getStringValue()); });
        deserializerMap.put("user_email", (n) -> { this.setUserEmail(n.getStringValue()); });
        deserializerMap.put("user_real_name", (n) -> { this.setUserRealName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the followers property value. Ticket followers
     * @return a java.util.List<ProjectTicketListResponseTicketsFollowers>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ProjectTicketListResponseTicketsFollowers> getFollowers() {
        return this.followers;
    }
    /**
     * Gets the following property value. Whether the current user is following this ticket
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getFollowing() {
        return this.following;
    }
    /**
     * Gets the organization_id property value. Organization ID
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOrganizationId() {
        return this.organizationId;
    }
    /**
     * Gets the project_name property value. Project name
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getProjectName() {
        return this.projectName;
    }
    /**
     * Gets the service_name property value. Service name
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getServiceName() {
        return this.serviceName;
    }
    /**
     * Gets the severity property value. Severity level
     * @return a ProjectTicketListResponseTicketsSeverity
     */
    @jakarta.annotation.Nullable
    public ProjectTicketListResponseTicketsSeverity getSeverity() {
        return this.severity;
    }
    /**
     * Gets the state property value. Is ticket open or closed
     * @return a ProjectTicketListResponseTicketsState
     */
    @jakarta.annotation.Nullable
    public ProjectTicketListResponseTicketsState getState() {
        return this.state;
    }
    /**
     * Gets the submitter property value. User information
     * @return a ProjectTicketListResponseTicketsSubmitter
     */
    @jakarta.annotation.Nullable
    public ProjectTicketListResponseTicketsSubmitter getSubmitter() {
        return this.submitter;
    }
    /**
     * Gets the ticket_id property value. Ticket ID
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getTicketId() {
        return this.ticketId;
    }
    /**
     * Gets the title property value. Short description
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getTitle() {
        return this.title;
    }
    /**
     * Gets the update_time property value. Update timestamp, ISO 8601 format
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getUpdateTime() {
        return this.updateTime;
    }
    /**
     * Gets the user_email property value. User email address
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getUserEmail() {
        return this.userEmail;
    }
    /**
     * Gets the user_real_name property value. User real name
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getUserRealName() {
        return this.userRealName;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("account_id", this.getAccountId());
        writer.writeStringValue("create_time", this.getCreateTime());
        writer.writeStringValue("description", this.getDescription());
        writer.writeCollectionOfObjectValues("followers", this.getFollowers());
        writer.writeBooleanValue("following", this.getFollowing());
        writer.writeStringValue("organization_id", this.getOrganizationId());
        writer.writeStringValue("project_name", this.getProjectName());
        writer.writeStringValue("service_name", this.getServiceName());
        writer.writeEnumValue("severity", this.getSeverity());
        writer.writeEnumValue("state", this.getState());
        writer.writeObjectValue("submitter", this.getSubmitter());
        writer.writeStringValue("ticket_id", this.getTicketId());
        writer.writeStringValue("title", this.getTitle());
        writer.writeStringValue("update_time", this.getUpdateTime());
        writer.writeStringValue("user_email", this.getUserEmail());
        writer.writeStringValue("user_real_name", this.getUserRealName());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the account_id property value. Account ID
     * @param value Value to set for the account_id property.
     */
    public void setAccountId(@jakarta.annotation.Nullable final String value) {
        this.accountId = value;
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the create_time property value. Created timestamp, ISO 8601 format
     * @param value Value to set for the create_time property.
     */
    public void setCreateTime(@jakarta.annotation.Nullable final String value) {
        this.createTime = value;
    }
    /**
     * Sets the description property value. Longer description
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the followers property value. Ticket followers
     * @param value Value to set for the followers property.
     */
    public void setFollowers(@jakarta.annotation.Nullable final java.util.List<ProjectTicketListResponseTicketsFollowers> value) {
        this.followers = value;
    }
    /**
     * Sets the following property value. Whether the current user is following this ticket
     * @param value Value to set for the following property.
     */
    public void setFollowing(@jakarta.annotation.Nullable final Boolean value) {
        this.following = value;
    }
    /**
     * Sets the organization_id property value. Organization ID
     * @param value Value to set for the organization_id property.
     */
    public void setOrganizationId(@jakarta.annotation.Nullable final String value) {
        this.organizationId = value;
    }
    /**
     * Sets the project_name property value. Project name
     * @param value Value to set for the project_name property.
     */
    public void setProjectName(@jakarta.annotation.Nullable final String value) {
        this.projectName = value;
    }
    /**
     * Sets the service_name property value. Service name
     * @param value Value to set for the service_name property.
     */
    public void setServiceName(@jakarta.annotation.Nullable final String value) {
        this.serviceName = value;
    }
    /**
     * Sets the severity property value. Severity level
     * @param value Value to set for the severity property.
     */
    public void setSeverity(@jakarta.annotation.Nullable final ProjectTicketListResponseTicketsSeverity value) {
        this.severity = value;
    }
    /**
     * Sets the state property value. Is ticket open or closed
     * @param value Value to set for the state property.
     */
    public void setState(@jakarta.annotation.Nullable final ProjectTicketListResponseTicketsState value) {
        this.state = value;
    }
    /**
     * Sets the submitter property value. User information
     * @param value Value to set for the submitter property.
     */
    public void setSubmitter(@jakarta.annotation.Nullable final ProjectTicketListResponseTicketsSubmitter value) {
        this.submitter = value;
    }
    /**
     * Sets the ticket_id property value. Ticket ID
     * @param value Value to set for the ticket_id property.
     */
    public void setTicketId(@jakarta.annotation.Nullable final String value) {
        this.ticketId = value;
    }
    /**
     * Sets the title property value. Short description
     * @param value Value to set for the title property.
     */
    public void setTitle(@jakarta.annotation.Nullable final String value) {
        this.title = value;
    }
    /**
     * Sets the update_time property value. Update timestamp, ISO 8601 format
     * @param value Value to set for the update_time property.
     */
    public void setUpdateTime(@jakarta.annotation.Nullable final String value) {
        this.updateTime = value;
    }
    /**
     * Sets the user_email property value. User email address
     * @param value Value to set for the user_email property.
     */
    public void setUserEmail(@jakarta.annotation.Nullable final String value) {
        this.userEmail = value;
    }
    /**
     * Sets the user_real_name property value. User real name
     * @param value Value to set for the user_real_name property.
     */
    public void setUserRealName(@jakarta.annotation.Nullable final String value) {
        this.userRealName = value;
    }
}
