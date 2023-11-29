package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * ServicePrivatelinkAzureDeleteResponse
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ServicePrivatelinkAzureDeleteResponse implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Azure Privatelink service alias
     */
    private String azureServiceAlias;
    /**
     * Azure Privatelink service ID
     */
    private String azureServiceId;
    /**
     * List of errors occurred during request processing
     */
    private java.util.List<ServicePrivatelinkAzureDeleteResponseErrors> errors;
    /**
     * Printable result of the request
     */
    private String message;
    /**
     * Privatelink resource state
     */
    private ServicePrivatelinkAzureDeleteResponseState state;
    /**
     * Subscription ID allowlist
     */
    private java.util.List<String> userSubscriptionIds;
    /**
     * Instantiates a new ServicePrivatelinkAzureDeleteResponse and sets the default values.
     */
    public ServicePrivatelinkAzureDeleteResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ServicePrivatelinkAzureDeleteResponse
     */
    @jakarta.annotation.Nonnull
    public static ServicePrivatelinkAzureDeleteResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ServicePrivatelinkAzureDeleteResponse();
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
     * Gets the azure_service_alias property value. Azure Privatelink service alias
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAzureServiceAlias() {
        return this.azureServiceAlias;
    }
    /**
     * Gets the azure_service_id property value. Azure Privatelink service ID
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAzureServiceId() {
        return this.azureServiceId;
    }
    /**
     * Gets the errors property value. List of errors occurred during request processing
     * @return a java.util.List<ServicePrivatelinkAzureDeleteResponseErrors>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ServicePrivatelinkAzureDeleteResponseErrors> getErrors() {
        return this.errors;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("azure_service_alias", (n) -> { this.setAzureServiceAlias(n.getStringValue()); });
        deserializerMap.put("azure_service_id", (n) -> { this.setAzureServiceId(n.getStringValue()); });
        deserializerMap.put("errors", (n) -> { this.setErrors(n.getCollectionOfObjectValues(ServicePrivatelinkAzureDeleteResponseErrors::createFromDiscriminatorValue)); });
        deserializerMap.put("message", (n) -> { this.setMessage(n.getStringValue()); });
        deserializerMap.put("state", (n) -> { this.setState(n.getEnumValue(ServicePrivatelinkAzureDeleteResponseState.class)); });
        deserializerMap.put("user_subscription_ids", (n) -> { this.setUserSubscriptionIds(n.getCollectionOfPrimitiveValues(String.class)); });
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
     * Gets the state property value. Privatelink resource state
     * @return a ServicePrivatelinkAzureDeleteResponseState
     */
    @jakarta.annotation.Nullable
    public ServicePrivatelinkAzureDeleteResponseState getState() {
        return this.state;
    }
    /**
     * Gets the user_subscription_ids property value. Subscription ID allowlist
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getUserSubscriptionIds() {
        return this.userSubscriptionIds;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("azure_service_alias", this.getAzureServiceAlias());
        writer.writeStringValue("azure_service_id", this.getAzureServiceId());
        writer.writeCollectionOfObjectValues("errors", this.getErrors());
        writer.writeStringValue("message", this.getMessage());
        writer.writeEnumValue("state", this.getState());
        writer.writeCollectionOfPrimitiveValues("user_subscription_ids", this.getUserSubscriptionIds());
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
     * Sets the azure_service_alias property value. Azure Privatelink service alias
     * @param value Value to set for the azure_service_alias property.
     */
    public void setAzureServiceAlias(@jakarta.annotation.Nullable final String value) {
        this.azureServiceAlias = value;
    }
    /**
     * Sets the azure_service_id property value. Azure Privatelink service ID
     * @param value Value to set for the azure_service_id property.
     */
    public void setAzureServiceId(@jakarta.annotation.Nullable final String value) {
        this.azureServiceId = value;
    }
    /**
     * Sets the errors property value. List of errors occurred during request processing
     * @param value Value to set for the errors property.
     */
    public void setErrors(@jakarta.annotation.Nullable final java.util.List<ServicePrivatelinkAzureDeleteResponseErrors> value) {
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
     * Sets the state property value. Privatelink resource state
     * @param value Value to set for the state property.
     */
    public void setState(@jakarta.annotation.Nullable final ServicePrivatelinkAzureDeleteResponseState value) {
        this.state = value;
    }
    /**
     * Sets the user_subscription_ids property value. Subscription ID allowlist
     * @param value Value to set for the user_subscription_ids property.
     */
    public void setUserSubscriptionIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.userSubscriptionIds = value;
    }
}
