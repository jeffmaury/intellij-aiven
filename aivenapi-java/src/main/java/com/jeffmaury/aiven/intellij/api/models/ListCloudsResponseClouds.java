package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ListCloudsResponseClouds implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** Cloud provider and location */
    private String cloudDescription;
    /** Target cloud */
    private String cloudName;
    /** Approximate geographic latitude of the datacenters */
    private Double geoLatitude;
    /** Approximate geographic longitude of the datacenters */
    private Double geoLongitude;
    /** Geographical region */
    private String geoRegion;
    /** Cloud provider name */
    private String provider;
    /** Cloud provider description */
    private String providerDescription;
    /**
     * Instantiates a new ListCloudsResponseClouds and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ListCloudsResponseClouds() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ListCloudsResponseClouds
     */
    @javax.annotation.Nonnull
    public static ListCloudsResponseClouds createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ListCloudsResponseClouds();
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
     * Gets the cloud_description property value. Cloud provider and location
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCloudDescription() {
        return this.cloudDescription;
    }
    /**
     * Gets the cloud_name property value. Target cloud
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCloudName() {
        return this.cloudName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(7);
        deserializerMap.put("cloud_description", (n) -> { this.setCloudDescription(n.getStringValue()); });
        deserializerMap.put("cloud_name", (n) -> { this.setCloudName(n.getStringValue()); });
        deserializerMap.put("geo_latitude", (n) -> { this.setGeoLatitude(n.getDoubleValue()); });
        deserializerMap.put("geo_longitude", (n) -> { this.setGeoLongitude(n.getDoubleValue()); });
        deserializerMap.put("geo_region", (n) -> { this.setGeoRegion(n.getStringValue()); });
        deserializerMap.put("provider", (n) -> { this.setProvider(n.getStringValue()); });
        deserializerMap.put("provider_description", (n) -> { this.setProviderDescription(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the geo_latitude property value. Approximate geographic latitude of the datacenters
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getGeoLatitude() {
        return this.geoLatitude;
    }
    /**
     * Gets the geo_longitude property value. Approximate geographic longitude of the datacenters
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getGeoLongitude() {
        return this.geoLongitude;
    }
    /**
     * Gets the geo_region property value. Geographical region
     * @return a string
     */
    @javax.annotation.Nullable
    public String getGeoRegion() {
        return this.geoRegion;
    }
    /**
     * Gets the provider property value. Cloud provider name
     * @return a string
     */
    @javax.annotation.Nullable
    public String getProvider() {
        return this.provider;
    }
    /**
     * Gets the provider_description property value. Cloud provider description
     * @return a string
     */
    @javax.annotation.Nullable
    public String getProviderDescription() {
        return this.providerDescription;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("cloud_description", this.getCloudDescription());
        writer.writeStringValue("cloud_name", this.getCloudName());
        writer.writeDoubleValue("geo_latitude", this.getGeoLatitude());
        writer.writeDoubleValue("geo_longitude", this.getGeoLongitude());
        writer.writeStringValue("geo_region", this.getGeoRegion());
        writer.writeStringValue("provider", this.getProvider());
        writer.writeStringValue("provider_description", this.getProviderDescription());
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
     * Sets the cloud_description property value. Cloud provider and location
     * @param value Value to set for the cloudDescription property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCloudDescription(@javax.annotation.Nullable final String value) {
        this.cloudDescription = value;
    }
    /**
     * Sets the cloud_name property value. Target cloud
     * @param value Value to set for the cloudName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCloudName(@javax.annotation.Nullable final String value) {
        this.cloudName = value;
    }
    /**
     * Sets the geo_latitude property value. Approximate geographic latitude of the datacenters
     * @param value Value to set for the geoLatitude property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setGeoLatitude(@javax.annotation.Nullable final Double value) {
        this.geoLatitude = value;
    }
    /**
     * Sets the geo_longitude property value. Approximate geographic longitude of the datacenters
     * @param value Value to set for the geoLongitude property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setGeoLongitude(@javax.annotation.Nullable final Double value) {
        this.geoLongitude = value;
    }
    /**
     * Sets the geo_region property value. Geographical region
     * @param value Value to set for the geoRegion property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setGeoRegion(@javax.annotation.Nullable final String value) {
        this.geoRegion = value;
    }
    /**
     * Sets the provider property value. Cloud provider name
     * @param value Value to set for the provider property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setProvider(@javax.annotation.Nullable final String value) {
        this.provider = value;
    }
    /**
     * Sets the provider_description property value. Cloud provider description
     * @param value Value to set for the providerDescription property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setProviderDescription(@javax.annotation.Nullable final String value) {
        this.providerDescription = value;
    }
}
