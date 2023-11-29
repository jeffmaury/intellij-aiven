package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ListServiceVersionsResponseServiceVersions implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** Aiven end-of-life timestamp (ISO 8601) */
    private String aivenEndOfLifeTime;
    /** Availability end timestamp (ISO 8601) */
    private String availabilityEndTime;
    /** Availability start timestamp (ISO 8601) */
    private String availabilityStartTime;
    /** Link to the help article */
    private String endOfLifeHelpArticleUrl;
    /** Service version */
    private String majorVersion;
    /** Service type code */
    private String serviceType;
    /** Service state */
    private ListServiceVersionsResponseServiceVersionsState state;
    /** Termination timestamp (ISO 8601) */
    private String terminationTime;
    /** If the customer takes no action, the service is updated to this service type when end of life is reached on the Aiven platform. If it is the same as the service type, the platform only upgrades the version. */
    private String upgradeToServiceType;
    /** The version to which the service will be updated at the end of life on the Aiven platform if the user does not take any action */
    private String upgradeToVersion;
    /** Upstream end-of-life timestamp (ISO 8601) */
    private String upstreamEndOfLifeTime;
    /**
     * Instantiates a new ListServiceVersionsResponseServiceVersions and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ListServiceVersionsResponseServiceVersions() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ListServiceVersionsResponseServiceVersions
     */
    @javax.annotation.Nonnull
    public static ListServiceVersionsResponseServiceVersions createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ListServiceVersionsResponseServiceVersions();
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
     * Gets the aiven_end_of_life_time property value. Aiven end-of-life timestamp (ISO 8601)
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAivenEndOfLifeTime() {
        return this.aivenEndOfLifeTime;
    }
    /**
     * Gets the availability_end_time property value. Availability end timestamp (ISO 8601)
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAvailabilityEndTime() {
        return this.availabilityEndTime;
    }
    /**
     * Gets the availability_start_time property value. Availability start timestamp (ISO 8601)
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAvailabilityStartTime() {
        return this.availabilityStartTime;
    }
    /**
     * Gets the end_of_life_help_article_url property value. Link to the help article
     * @return a string
     */
    @javax.annotation.Nullable
    public String getEndOfLifeHelpArticleUrl() {
        return this.endOfLifeHelpArticleUrl;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(11);
        deserializerMap.put("aiven_end_of_life_time", (n) -> { this.setAivenEndOfLifeTime(n.getStringValue()); });
        deserializerMap.put("availability_end_time", (n) -> { this.setAvailabilityEndTime(n.getStringValue()); });
        deserializerMap.put("availability_start_time", (n) -> { this.setAvailabilityStartTime(n.getStringValue()); });
        deserializerMap.put("end_of_life_help_article_url", (n) -> { this.setEndOfLifeHelpArticleUrl(n.getStringValue()); });
        deserializerMap.put("major_version", (n) -> { this.setMajorVersion(n.getStringValue()); });
        deserializerMap.put("service_type", (n) -> { this.setServiceType(n.getStringValue()); });
        deserializerMap.put("state", (n) -> { this.setState(n.getEnumValue(ListServiceVersionsResponseServiceVersionsState.class)); });
        deserializerMap.put("termination_time", (n) -> { this.setTerminationTime(n.getStringValue()); });
        deserializerMap.put("upgrade_to_service_type", (n) -> { this.setUpgradeToServiceType(n.getStringValue()); });
        deserializerMap.put("upgrade_to_version", (n) -> { this.setUpgradeToVersion(n.getStringValue()); });
        deserializerMap.put("upstream_end_of_life_time", (n) -> { this.setUpstreamEndOfLifeTime(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the major_version property value. Service version
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMajorVersion() {
        return this.majorVersion;
    }
    /**
     * Gets the service_type property value. Service type code
     * @return a string
     */
    @javax.annotation.Nullable
    public String getServiceType() {
        return this.serviceType;
    }
    /**
     * Gets the state property value. Service state
     * @return a ListServiceVersionsResponseServiceVersionsState
     */
    @javax.annotation.Nullable
    public ListServiceVersionsResponseServiceVersionsState getState() {
        return this.state;
    }
    /**
     * Gets the termination_time property value. Termination timestamp (ISO 8601)
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTerminationTime() {
        return this.terminationTime;
    }
    /**
     * Gets the upgrade_to_service_type property value. If the customer takes no action, the service is updated to this service type when end of life is reached on the Aiven platform. If it is the same as the service type, the platform only upgrades the version.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUpgradeToServiceType() {
        return this.upgradeToServiceType;
    }
    /**
     * Gets the upgrade_to_version property value. The version to which the service will be updated at the end of life on the Aiven platform if the user does not take any action
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUpgradeToVersion() {
        return this.upgradeToVersion;
    }
    /**
     * Gets the upstream_end_of_life_time property value. Upstream end-of-life timestamp (ISO 8601)
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUpstreamEndOfLifeTime() {
        return this.upstreamEndOfLifeTime;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("aiven_end_of_life_time", this.getAivenEndOfLifeTime());
        writer.writeStringValue("availability_end_time", this.getAvailabilityEndTime());
        writer.writeStringValue("availability_start_time", this.getAvailabilityStartTime());
        writer.writeStringValue("end_of_life_help_article_url", this.getEndOfLifeHelpArticleUrl());
        writer.writeStringValue("major_version", this.getMajorVersion());
        writer.writeStringValue("service_type", this.getServiceType());
        writer.writeEnumValue("state", this.getState());
        writer.writeStringValue("termination_time", this.getTerminationTime());
        writer.writeStringValue("upgrade_to_service_type", this.getUpgradeToServiceType());
        writer.writeStringValue("upgrade_to_version", this.getUpgradeToVersion());
        writer.writeStringValue("upstream_end_of_life_time", this.getUpstreamEndOfLifeTime());
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
     * Sets the aiven_end_of_life_time property value. Aiven end-of-life timestamp (ISO 8601)
     * @param value Value to set for the aivenEndOfLifeTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAivenEndOfLifeTime(@javax.annotation.Nullable final String value) {
        this.aivenEndOfLifeTime = value;
    }
    /**
     * Sets the availability_end_time property value. Availability end timestamp (ISO 8601)
     * @param value Value to set for the availabilityEndTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAvailabilityEndTime(@javax.annotation.Nullable final String value) {
        this.availabilityEndTime = value;
    }
    /**
     * Sets the availability_start_time property value. Availability start timestamp (ISO 8601)
     * @param value Value to set for the availabilityStartTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAvailabilityStartTime(@javax.annotation.Nullable final String value) {
        this.availabilityStartTime = value;
    }
    /**
     * Sets the end_of_life_help_article_url property value. Link to the help article
     * @param value Value to set for the endOfLifeHelpArticleUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEndOfLifeHelpArticleUrl(@javax.annotation.Nullable final String value) {
        this.endOfLifeHelpArticleUrl = value;
    }
    /**
     * Sets the major_version property value. Service version
     * @param value Value to set for the majorVersion property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMajorVersion(@javax.annotation.Nullable final String value) {
        this.majorVersion = value;
    }
    /**
     * Sets the service_type property value. Service type code
     * @param value Value to set for the serviceType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setServiceType(@javax.annotation.Nullable final String value) {
        this.serviceType = value;
    }
    /**
     * Sets the state property value. Service state
     * @param value Value to set for the state property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setState(@javax.annotation.Nullable final ListServiceVersionsResponseServiceVersionsState value) {
        this.state = value;
    }
    /**
     * Sets the termination_time property value. Termination timestamp (ISO 8601)
     * @param value Value to set for the terminationTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTerminationTime(@javax.annotation.Nullable final String value) {
        this.terminationTime = value;
    }
    /**
     * Sets the upgrade_to_service_type property value. If the customer takes no action, the service is updated to this service type when end of life is reached on the Aiven platform. If it is the same as the service type, the platform only upgrades the version.
     * @param value Value to set for the upgradeToServiceType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUpgradeToServiceType(@javax.annotation.Nullable final String value) {
        this.upgradeToServiceType = value;
    }
    /**
     * Sets the upgrade_to_version property value. The version to which the service will be updated at the end of life on the Aiven platform if the user does not take any action
     * @param value Value to set for the upgradeToVersion property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUpgradeToVersion(@javax.annotation.Nullable final String value) {
        this.upgradeToVersion = value;
    }
    /**
     * Sets the upstream_end_of_life_time property value. Upstream end-of-life timestamp (ISO 8601)
     * @param value Value to set for the upstreamEndOfLifeTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUpstreamEndOfLifeTime(@javax.annotation.Nullable final String value) {
        this.upstreamEndOfLifeTime = value;
    }
}
