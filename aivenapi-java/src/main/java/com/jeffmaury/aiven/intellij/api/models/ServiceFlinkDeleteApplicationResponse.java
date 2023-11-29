package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * ServiceFlinkDeleteApplicationResponse
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ServiceFlinkDeleteApplicationResponse implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * ApplicationVersions
     */
    private java.util.List<ServiceFlinkDeleteApplicationResponseApplicationVersions> applicationVersions;
    /**
     * Created at
     */
    private String createdAt;
    /**
     * Created by
     */
    private String createdBy;
    /**
     * Flink ApplicationDeployment
     */
    private ServiceFlinkDeleteApplicationResponseCurrentDeployment currentDeployment;
    /**
     * List of errors occurred during request processing
     */
    private java.util.List<ServiceFlinkDeleteApplicationResponseErrors> errors;
    /**
     * Application ID
     */
    private String id;
    /**
     * Printable result of the request
     */
    private String message;
    /**
     * Application name
     */
    private String name;
    /**
     * Updated at
     */
    private String updatedAt;
    /**
     * Updated by
     */
    private String updatedBy;
    /**
     * Instantiates a new ServiceFlinkDeleteApplicationResponse and sets the default values.
     */
    public ServiceFlinkDeleteApplicationResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ServiceFlinkDeleteApplicationResponse
     */
    @jakarta.annotation.Nonnull
    public static ServiceFlinkDeleteApplicationResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ServiceFlinkDeleteApplicationResponse();
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
     * Gets the application_versions property value. ApplicationVersions
     * @return a java.util.List<ServiceFlinkDeleteApplicationResponseApplicationVersions>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ServiceFlinkDeleteApplicationResponseApplicationVersions> getApplicationVersions() {
        return this.applicationVersions;
    }
    /**
     * Gets the created_at property value. Created at
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCreatedAt() {
        return this.createdAt;
    }
    /**
     * Gets the created_by property value. Created by
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCreatedBy() {
        return this.createdBy;
    }
    /**
     * Gets the current_deployment property value. Flink ApplicationDeployment
     * @return a ServiceFlinkDeleteApplicationResponseCurrentDeployment
     */
    @jakarta.annotation.Nullable
    public ServiceFlinkDeleteApplicationResponseCurrentDeployment getCurrentDeployment() {
        return this.currentDeployment;
    }
    /**
     * Gets the errors property value. List of errors occurred during request processing
     * @return a java.util.List<ServiceFlinkDeleteApplicationResponseErrors>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ServiceFlinkDeleteApplicationResponseErrors> getErrors() {
        return this.errors;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(10);
        deserializerMap.put("application_versions", (n) -> { this.setApplicationVersions(n.getCollectionOfObjectValues(ServiceFlinkDeleteApplicationResponseApplicationVersions::createFromDiscriminatorValue)); });
        deserializerMap.put("created_at", (n) -> { this.setCreatedAt(n.getStringValue()); });
        deserializerMap.put("created_by", (n) -> { this.setCreatedBy(n.getStringValue()); });
        deserializerMap.put("current_deployment", (n) -> { this.setCurrentDeployment(n.getObjectValue(ServiceFlinkDeleteApplicationResponseCurrentDeployment::createFromDiscriminatorValue)); });
        deserializerMap.put("errors", (n) -> { this.setErrors(n.getCollectionOfObjectValues(ServiceFlinkDeleteApplicationResponseErrors::createFromDiscriminatorValue)); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("message", (n) -> { this.setMessage(n.getStringValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("updated_at", (n) -> { this.setUpdatedAt(n.getStringValue()); });
        deserializerMap.put("updated_by", (n) -> { this.setUpdatedBy(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the id property value. Application ID
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getId() {
        return this.id;
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
     * Gets the name property value. Application name
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Gets the updated_at property value. Updated at
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getUpdatedAt() {
        return this.updatedAt;
    }
    /**
     * Gets the updated_by property value. Updated by
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getUpdatedBy() {
        return this.updatedBy;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("application_versions", this.getApplicationVersions());
        writer.writeStringValue("created_at", this.getCreatedAt());
        writer.writeStringValue("created_by", this.getCreatedBy());
        writer.writeObjectValue("current_deployment", this.getCurrentDeployment());
        writer.writeCollectionOfObjectValues("errors", this.getErrors());
        writer.writeStringValue("id", this.getId());
        writer.writeStringValue("message", this.getMessage());
        writer.writeStringValue("name", this.getName());
        writer.writeStringValue("updated_at", this.getUpdatedAt());
        writer.writeStringValue("updated_by", this.getUpdatedBy());
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
     * Sets the application_versions property value. ApplicationVersions
     * @param value Value to set for the application_versions property.
     */
    public void setApplicationVersions(@jakarta.annotation.Nullable final java.util.List<ServiceFlinkDeleteApplicationResponseApplicationVersions> value) {
        this.applicationVersions = value;
    }
    /**
     * Sets the created_at property value. Created at
     * @param value Value to set for the created_at property.
     */
    public void setCreatedAt(@jakarta.annotation.Nullable final String value) {
        this.createdAt = value;
    }
    /**
     * Sets the created_by property value. Created by
     * @param value Value to set for the created_by property.
     */
    public void setCreatedBy(@jakarta.annotation.Nullable final String value) {
        this.createdBy = value;
    }
    /**
     * Sets the current_deployment property value. Flink ApplicationDeployment
     * @param value Value to set for the current_deployment property.
     */
    public void setCurrentDeployment(@jakarta.annotation.Nullable final ServiceFlinkDeleteApplicationResponseCurrentDeployment value) {
        this.currentDeployment = value;
    }
    /**
     * Sets the errors property value. List of errors occurred during request processing
     * @param value Value to set for the errors property.
     */
    public void setErrors(@jakarta.annotation.Nullable final java.util.List<ServiceFlinkDeleteApplicationResponseErrors> value) {
        this.errors = value;
    }
    /**
     * Sets the id property value. Application ID
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final String value) {
        this.id = value;
    }
    /**
     * Sets the message property value. Printable result of the request
     * @param value Value to set for the message property.
     */
    public void setMessage(@jakarta.annotation.Nullable final String value) {
        this.message = value;
    }
    /**
     * Sets the name property value. Application name
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the updated_at property value. Updated at
     * @param value Value to set for the updated_at property.
     */
    public void setUpdatedAt(@jakarta.annotation.Nullable final String value) {
        this.updatedAt = value;
    }
    /**
     * Sets the updated_by property value. Updated by
     * @param value Value to set for the updated_by property.
     */
    public void setUpdatedBy(@jakarta.annotation.Nullable final String value) {
        this.updatedBy = value;
    }
}
