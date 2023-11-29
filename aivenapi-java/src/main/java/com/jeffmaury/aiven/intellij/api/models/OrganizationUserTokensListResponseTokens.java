package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class OrganizationUserTokensListResponseTokens implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Description
     */
    private String description;
    /**
     * Last-used IP
     */
    private String lastIp;
    /**
     * Last-used time
     */
    private String lastUsedTime;
    /**
     * Last-used user agent
     */
    private String lastUserAgent;
    /**
     * Token prefix
     */
    private String tokenPrefix;
    /**
     * Instantiates a new OrganizationUserTokensListResponseTokens and sets the default values.
     */
    public OrganizationUserTokensListResponseTokens() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a OrganizationUserTokensListResponseTokens
     */
    @jakarta.annotation.Nonnull
    public static OrganizationUserTokensListResponseTokens createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OrganizationUserTokensListResponseTokens();
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
     * Gets the description property value. Description
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("last_ip", (n) -> { this.setLastIp(n.getStringValue()); });
        deserializerMap.put("last_used_time", (n) -> { this.setLastUsedTime(n.getStringValue()); });
        deserializerMap.put("last_user_agent", (n) -> { this.setLastUserAgent(n.getStringValue()); });
        deserializerMap.put("token_prefix", (n) -> { this.setTokenPrefix(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the last_ip property value. Last-used IP
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getLastIp() {
        return this.lastIp;
    }
    /**
     * Gets the last_used_time property value. Last-used time
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getLastUsedTime() {
        return this.lastUsedTime;
    }
    /**
     * Gets the last_user_agent property value. Last-used user agent
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getLastUserAgent() {
        return this.lastUserAgent;
    }
    /**
     * Gets the token_prefix property value. Token prefix
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getTokenPrefix() {
        return this.tokenPrefix;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("last_ip", this.getLastIp());
        writer.writeStringValue("last_used_time", this.getLastUsedTime());
        writer.writeStringValue("last_user_agent", this.getLastUserAgent());
        writer.writeStringValue("token_prefix", this.getTokenPrefix());
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
     * Sets the description property value. Description
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the last_ip property value. Last-used IP
     * @param value Value to set for the last_ip property.
     */
    public void setLastIp(@jakarta.annotation.Nullable final String value) {
        this.lastIp = value;
    }
    /**
     * Sets the last_used_time property value. Last-used time
     * @param value Value to set for the last_used_time property.
     */
    public void setLastUsedTime(@jakarta.annotation.Nullable final String value) {
        this.lastUsedTime = value;
    }
    /**
     * Sets the last_user_agent property value. Last-used user agent
     * @param value Value to set for the last_user_agent property.
     */
    public void setLastUserAgent(@jakarta.annotation.Nullable final String value) {
        this.lastUserAgent = value;
    }
    /**
     * Sets the token_prefix property value. Token prefix
     * @param value Value to set for the token_prefix property.
     */
    public void setTokenPrefix(@jakarta.annotation.Nullable final String value) {
        this.tokenPrefix = value;
    }
}
