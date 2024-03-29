package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Notification metadata
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ServiceUserCredentialsResetResponseServiceServiceNotificationsMetadata implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Link to the help article
     */
    private String endOfLifeHelpArticleUrl;
    /**
     * Link to the help article
     */
    private String endOfLifePolicyUrl;
    /**
     * Timestamp in ISO 8601 format, always in UTC
     */
    private String serviceEndOfLifeTime;
    /**
     * If the customer takes no action, the service is updated to this service type when end of life is reached on the Aiven platform. If it is the same as the service type, the platform only upgrades the version.
     */
    private String upgradeToServiceType;
    /**
     * The version to which the service will be updated at the end of life on the Aiven platform if the user does not take any action
     */
    private String upgradeToVersion;
    /**
     * Instantiates a new ServiceUserCredentialsResetResponseServiceServiceNotificationsMetadata and sets the default values.
     */
    public ServiceUserCredentialsResetResponseServiceServiceNotificationsMetadata() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ServiceUserCredentialsResetResponseServiceServiceNotificationsMetadata
     */
    @jakarta.annotation.Nonnull
    public static ServiceUserCredentialsResetResponseServiceServiceNotificationsMetadata createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ServiceUserCredentialsResetResponseServiceServiceNotificationsMetadata();
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
     * Gets the end_of_life_help_article_url property value. Link to the help article
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getEndOfLifeHelpArticleUrl() {
        return this.endOfLifeHelpArticleUrl;
    }
    /**
     * Gets the end_of_life_policy_url property value. Link to the help article
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getEndOfLifePolicyUrl() {
        return this.endOfLifePolicyUrl;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("end_of_life_help_article_url", (n) -> { this.setEndOfLifeHelpArticleUrl(n.getStringValue()); });
        deserializerMap.put("end_of_life_policy_url", (n) -> { this.setEndOfLifePolicyUrl(n.getStringValue()); });
        deserializerMap.put("service_end_of_life_time", (n) -> { this.setServiceEndOfLifeTime(n.getStringValue()); });
        deserializerMap.put("upgrade_to_service_type", (n) -> { this.setUpgradeToServiceType(n.getStringValue()); });
        deserializerMap.put("upgrade_to_version", (n) -> { this.setUpgradeToVersion(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the service_end_of_life_time property value. Timestamp in ISO 8601 format, always in UTC
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getServiceEndOfLifeTime() {
        return this.serviceEndOfLifeTime;
    }
    /**
     * Gets the upgrade_to_service_type property value. If the customer takes no action, the service is updated to this service type when end of life is reached on the Aiven platform. If it is the same as the service type, the platform only upgrades the version.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getUpgradeToServiceType() {
        return this.upgradeToServiceType;
    }
    /**
     * Gets the upgrade_to_version property value. The version to which the service will be updated at the end of life on the Aiven platform if the user does not take any action
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getUpgradeToVersion() {
        return this.upgradeToVersion;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("end_of_life_help_article_url", this.getEndOfLifeHelpArticleUrl());
        writer.writeStringValue("end_of_life_policy_url", this.getEndOfLifePolicyUrl());
        writer.writeStringValue("service_end_of_life_time", this.getServiceEndOfLifeTime());
        writer.writeStringValue("upgrade_to_service_type", this.getUpgradeToServiceType());
        writer.writeStringValue("upgrade_to_version", this.getUpgradeToVersion());
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
     * Sets the end_of_life_help_article_url property value. Link to the help article
     * @param value Value to set for the end_of_life_help_article_url property.
     */
    public void setEndOfLifeHelpArticleUrl(@jakarta.annotation.Nullable final String value) {
        this.endOfLifeHelpArticleUrl = value;
    }
    /**
     * Sets the end_of_life_policy_url property value. Link to the help article
     * @param value Value to set for the end_of_life_policy_url property.
     */
    public void setEndOfLifePolicyUrl(@jakarta.annotation.Nullable final String value) {
        this.endOfLifePolicyUrl = value;
    }
    /**
     * Sets the service_end_of_life_time property value. Timestamp in ISO 8601 format, always in UTC
     * @param value Value to set for the service_end_of_life_time property.
     */
    public void setServiceEndOfLifeTime(@jakarta.annotation.Nullable final String value) {
        this.serviceEndOfLifeTime = value;
    }
    /**
     * Sets the upgrade_to_service_type property value. If the customer takes no action, the service is updated to this service type when end of life is reached on the Aiven platform. If it is the same as the service type, the platform only upgrades the version.
     * @param value Value to set for the upgrade_to_service_type property.
     */
    public void setUpgradeToServiceType(@jakarta.annotation.Nullable final String value) {
        this.upgradeToServiceType = value;
    }
    /**
     * Sets the upgrade_to_version property value. The version to which the service will be updated at the end of life on the Aiven platform if the user does not take any action
     * @param value Value to set for the upgrade_to_version property.
     */
    public void setUpgradeToVersion(@jakarta.annotation.Nullable final String value) {
        this.upgradeToVersion = value;
    }
}
