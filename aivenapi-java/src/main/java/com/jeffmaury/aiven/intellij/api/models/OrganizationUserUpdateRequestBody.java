package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * OrganizationUserUpdateRequestBody
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class OrganizationUserUpdateRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * City
     */
    private String city;
    /**
     * Country
     */
    private String country;
    /**
     * Department
     */
    private String department;
    /**
     * Alters super admin state of the organization user
     */
    private Boolean isSuperAdmin;
    /**
     * Job Title
     */
    private String jobTitle;
    /**
     * Real Name
     */
    private String realName;
    /**
     * Instantiates a new OrganizationUserUpdateRequestBody and sets the default values.
     */
    public OrganizationUserUpdateRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a OrganizationUserUpdateRequestBody
     */
    @jakarta.annotation.Nonnull
    public static OrganizationUserUpdateRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OrganizationUserUpdateRequestBody();
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
     * Gets the city property value. City
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCity() {
        return this.city;
    }
    /**
     * Gets the country property value. Country
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCountry() {
        return this.country;
    }
    /**
     * Gets the department property value. Department
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDepartment() {
        return this.department;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("city", (n) -> { this.setCity(n.getStringValue()); });
        deserializerMap.put("country", (n) -> { this.setCountry(n.getStringValue()); });
        deserializerMap.put("department", (n) -> { this.setDepartment(n.getStringValue()); });
        deserializerMap.put("is_super_admin", (n) -> { this.setIsSuperAdmin(n.getBooleanValue()); });
        deserializerMap.put("job_title", (n) -> { this.setJobTitle(n.getStringValue()); });
        deserializerMap.put("real_name", (n) -> { this.setRealName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the is_super_admin property value. Alters super admin state of the organization user
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsSuperAdmin() {
        return this.isSuperAdmin;
    }
    /**
     * Gets the job_title property value. Job Title
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getJobTitle() {
        return this.jobTitle;
    }
    /**
     * Gets the real_name property value. Real Name
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getRealName() {
        return this.realName;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("city", this.getCity());
        writer.writeStringValue("country", this.getCountry());
        writer.writeStringValue("department", this.getDepartment());
        writer.writeBooleanValue("is_super_admin", this.getIsSuperAdmin());
        writer.writeStringValue("job_title", this.getJobTitle());
        writer.writeStringValue("real_name", this.getRealName());
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
     * Sets the city property value. City
     * @param value Value to set for the city property.
     */
    public void setCity(@jakarta.annotation.Nullable final String value) {
        this.city = value;
    }
    /**
     * Sets the country property value. Country
     * @param value Value to set for the country property.
     */
    public void setCountry(@jakarta.annotation.Nullable final String value) {
        this.country = value;
    }
    /**
     * Sets the department property value. Department
     * @param value Value to set for the department property.
     */
    public void setDepartment(@jakarta.annotation.Nullable final String value) {
        this.department = value;
    }
    /**
     * Sets the is_super_admin property value. Alters super admin state of the organization user
     * @param value Value to set for the is_super_admin property.
     */
    public void setIsSuperAdmin(@jakarta.annotation.Nullable final Boolean value) {
        this.isSuperAdmin = value;
    }
    /**
     * Sets the job_title property value. Job Title
     * @param value Value to set for the job_title property.
     */
    public void setJobTitle(@jakarta.annotation.Nullable final String value) {
        this.jobTitle = value;
    }
    /**
     * Sets the real_name property value. Real Name
     * @param value Value to set for the real_name property.
     */
    public void setRealName(@jakarta.annotation.Nullable final String value) {
        this.realName = value;
    }
}
