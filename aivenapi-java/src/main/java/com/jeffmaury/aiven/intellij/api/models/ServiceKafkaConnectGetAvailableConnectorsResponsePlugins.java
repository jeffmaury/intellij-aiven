package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ServiceKafkaConnectGetAvailableConnectorsResponsePlugins implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Connector author name
     */
    private String author;
    /**
     * Connector class name
     */
    private String classEscaped;
    /**
     * Connector documentation URL
     */
    private String docURL;
    /**
     * Describes if connector is in beta
     */
    private Boolean preview;
    /**
     * Information about beta stage of connector
     */
    private String previewInfo;
    /**
     * Descriptive human readable name defined by Aiven
     */
    private String title;
    /**
     * Describes whether data flows from or to Kafka
     */
    private ServiceKafkaConnectGetAvailableConnectorsResponsePluginsType type;
    /**
     * Connector version number
     */
    private String version;
    /**
     * Instantiates a new ServiceKafkaConnectGetAvailableConnectorsResponsePlugins and sets the default values.
     */
    public ServiceKafkaConnectGetAvailableConnectorsResponsePlugins() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ServiceKafkaConnectGetAvailableConnectorsResponsePlugins
     */
    @jakarta.annotation.Nonnull
    public static ServiceKafkaConnectGetAvailableConnectorsResponsePlugins createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ServiceKafkaConnectGetAvailableConnectorsResponsePlugins();
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
     * Gets the author property value. Connector author name
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAuthor() {
        return this.author;
    }
    /**
     * Gets the class property value. Connector class name
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getClassEscaped() {
        return this.classEscaped;
    }
    /**
     * Gets the docURL property value. Connector documentation URL
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDocURL() {
        return this.docURL;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(8);
        deserializerMap.put("author", (n) -> { this.setAuthor(n.getStringValue()); });
        deserializerMap.put("class", (n) -> { this.setClass(n.getStringValue()); });
        deserializerMap.put("docURL", (n) -> { this.setDocURL(n.getStringValue()); });
        deserializerMap.put("preview", (n) -> { this.setPreview(n.getBooleanValue()); });
        deserializerMap.put("preview_info", (n) -> { this.setPreviewInfo(n.getStringValue()); });
        deserializerMap.put("title", (n) -> { this.setTitle(n.getStringValue()); });
        deserializerMap.put("type", (n) -> { this.setType(n.getEnumValue(ServiceKafkaConnectGetAvailableConnectorsResponsePluginsType.class)); });
        deserializerMap.put("version", (n) -> { this.setVersion(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the preview property value. Describes if connector is in beta
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getPreview() {
        return this.preview;
    }
    /**
     * Gets the preview_info property value. Information about beta stage of connector
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getPreviewInfo() {
        return this.previewInfo;
    }
    /**
     * Gets the title property value. Descriptive human readable name defined by Aiven
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getTitle() {
        return this.title;
    }
    /**
     * Gets the type property value. Describes whether data flows from or to Kafka
     * @return a ServiceKafkaConnectGetAvailableConnectorsResponsePluginsType
     */
    @jakarta.annotation.Nullable
    public ServiceKafkaConnectGetAvailableConnectorsResponsePluginsType getType() {
        return this.type;
    }
    /**
     * Gets the version property value. Connector version number
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getVersion() {
        return this.version;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("author", this.getAuthor());
        writer.writeStringValue("class", this.getClassEscaped());
        writer.writeStringValue("docURL", this.getDocURL());
        writer.writeBooleanValue("preview", this.getPreview());
        writer.writeStringValue("preview_info", this.getPreviewInfo());
        writer.writeStringValue("title", this.getTitle());
        writer.writeEnumValue("type", this.getType());
        writer.writeStringValue("version", this.getVersion());
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
     * Sets the author property value. Connector author name
     * @param value Value to set for the author property.
     */
    public void setAuthor(@jakarta.annotation.Nullable final String value) {
        this.author = value;
    }
    /**
     * Sets the class property value. Connector class name
     * @param value Value to set for the class property.
     */
    public void setClass(@jakarta.annotation.Nullable final String value) {
        this.classEscaped = value;
    }
    /**
     * Sets the docURL property value. Connector documentation URL
     * @param value Value to set for the docURL property.
     */
    public void setDocURL(@jakarta.annotation.Nullable final String value) {
        this.docURL = value;
    }
    /**
     * Sets the preview property value. Describes if connector is in beta
     * @param value Value to set for the preview property.
     */
    public void setPreview(@jakarta.annotation.Nullable final Boolean value) {
        this.preview = value;
    }
    /**
     * Sets the preview_info property value. Information about beta stage of connector
     * @param value Value to set for the preview_info property.
     */
    public void setPreviewInfo(@jakarta.annotation.Nullable final String value) {
        this.previewInfo = value;
    }
    /**
     * Sets the title property value. Descriptive human readable name defined by Aiven
     * @param value Value to set for the title property.
     */
    public void setTitle(@jakarta.annotation.Nullable final String value) {
        this.title = value;
    }
    /**
     * Sets the type property value. Describes whether data flows from or to Kafka
     * @param value Value to set for the type property.
     */
    public void setType(@jakarta.annotation.Nullable final ServiceKafkaConnectGetAvailableConnectorsResponsePluginsType value) {
        this.type = value;
    }
    /**
     * Sets the version property value. Connector version number
     * @param value Value to set for the version property.
     */
    public void setVersion(@jakarta.annotation.Nullable final String value) {
        this.version = value;
    }
}
