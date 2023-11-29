package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * AccountProjectsListResponse
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AccountProjectsListResponse implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * List of errors occurred during request processing
     */
    private java.util.List<AccountProjectsListResponseErrors> errors;
    /**
     * Printable result of the request
     */
    private String message;
    /**
     * List of projects
     */
    private java.util.List<AccountProjectsListResponseProjects> projects;
    /**
     * Total count of projects associated to account.
     */
    private Integer totalProjectCount;
    /**
     * Instantiates a new AccountProjectsListResponse and sets the default values.
     */
    public AccountProjectsListResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AccountProjectsListResponse
     */
    @jakarta.annotation.Nonnull
    public static AccountProjectsListResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AccountProjectsListResponse();
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
     * @return a java.util.List<AccountProjectsListResponseErrors>
     */
    @jakarta.annotation.Nullable
    public java.util.List<AccountProjectsListResponseErrors> getErrors() {
        return this.errors;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("errors", (n) -> { this.setErrors(n.getCollectionOfObjectValues(AccountProjectsListResponseErrors::createFromDiscriminatorValue)); });
        deserializerMap.put("message", (n) -> { this.setMessage(n.getStringValue()); });
        deserializerMap.put("projects", (n) -> { this.setProjects(n.getCollectionOfObjectValues(AccountProjectsListResponseProjects::createFromDiscriminatorValue)); });
        deserializerMap.put("total_project_count", (n) -> { this.setTotalProjectCount(n.getIntegerValue()); });
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
     * Gets the projects property value. List of projects
     * @return a java.util.List<AccountProjectsListResponseProjects>
     */
    @jakarta.annotation.Nullable
    public java.util.List<AccountProjectsListResponseProjects> getProjects() {
        return this.projects;
    }
    /**
     * Gets the total_project_count property value. Total count of projects associated to account.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getTotalProjectCount() {
        return this.totalProjectCount;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("errors", this.getErrors());
        writer.writeStringValue("message", this.getMessage());
        writer.writeCollectionOfObjectValues("projects", this.getProjects());
        writer.writeIntegerValue("total_project_count", this.getTotalProjectCount());
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
    public void setErrors(@jakarta.annotation.Nullable final java.util.List<AccountProjectsListResponseErrors> value) {
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
     * Sets the projects property value. List of projects
     * @param value Value to set for the projects property.
     */
    public void setProjects(@jakarta.annotation.Nullable final java.util.List<AccountProjectsListResponseProjects> value) {
        this.projects = value;
    }
    /**
     * Sets the total_project_count property value. Total count of projects associated to account.
     * @param value Value to set for the total_project_count property.
     */
    public void setTotalProjectCount(@jakarta.annotation.Nullable final Integer value) {
        this.totalProjectCount = value;
    }
}
