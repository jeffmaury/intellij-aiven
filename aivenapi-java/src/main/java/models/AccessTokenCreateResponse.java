package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * AccessTokenCreateResponse
 */
public class AccessTokenCreateResponse implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** True for tokens explicitly created via the access_tokens API, false for tokens created via login. */
    private Boolean createdManually;
    /** Timestamp when the access token was created */
    private String createTime;
    /** true if API request was made with this access token */
    private Boolean currentlyActive;
    /** Name / description of an access token */
    private String description;
    /** List of errors occurred during request processing */
    private java.util.List<AccessTokenCreateResponseErrors> errors;
    /** Timestamp when the access token will expire unless extended, if ever */
    private String expiryTime;
    /** Extend token expiration time when token is used. Only applicable if max_age_seconds is specified. */
    private Boolean extendWhenUsed;
    /** This full access token can be used to make API calls. This can also be used to update or revoke tokens. Note that when using this token with the update and revoke APIs it must be URL encoded because it may contain /, + and = characters (/ =&gt; %2F, + =&gt; %2B, = =&gt; %3D). */
    private String fullToken;
    /** IP address the access token was last used from in case it has ever been used */
    private String lastIp;
    /** Timestamp when the access token was last used, if ever */
    private String lastUsedTime;
    /** User agent string of the client that last used the token in case it has ever been used */
    private String lastUserAgent;
    /** Human readable user agent string of the client that last used the token in case user agent is known */
    private String lastUserAgentHumanReadable;
    /** Time the token remains valid since creation (or since last use if extend_when_used is true) */
    private Double maxAgeSeconds;
    /** Printable result of the request */
    private String message;
    /** Scopes this token is restricted to, if specified */
    private java.util.List<String> scopes;
    /** First characters of the actual token value. Full value is only exposed after creation. This value is used when updating or revoking tokens. Note that the value may contain /, + and = characters and must be URL encoded when used (/ =&gt; %2F, + =&gt; %2B, = =&gt; %3D). */
    private String tokenPrefix;
    /**
     * Instantiates a new AccessTokenCreateResponse and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public AccessTokenCreateResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AccessTokenCreateResponse
     */
    @javax.annotation.Nonnull
    public static AccessTokenCreateResponse createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AccessTokenCreateResponse();
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
     * Gets the created_manually property value. True for tokens explicitly created via the access_tokens API, false for tokens created via login.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getCreatedManually() {
        return this.createdManually;
    }
    /**
     * Gets the create_time property value. Timestamp when the access token was created
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCreateTime() {
        return this.createTime;
    }
    /**
     * Gets the currently_active property value. true if API request was made with this access token
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getCurrentlyActive() {
        return this.currentlyActive;
    }
    /**
     * Gets the description property value. Name / description of an access token
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * Gets the errors property value. List of errors occurred during request processing
     * @return a AccessTokenCreateResponseErrors
     */
    @javax.annotation.Nullable
    public java.util.List<AccessTokenCreateResponseErrors> getErrors() {
        return this.errors;
    }
    /**
     * Gets the expiry_time property value. Timestamp when the access token will expire unless extended, if ever
     * @return a string
     */
    @javax.annotation.Nullable
    public String getExpiryTime() {
        return this.expiryTime;
    }
    /**
     * Gets the extend_when_used property value. Extend token expiration time when token is used. Only applicable if max_age_seconds is specified.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getExtendWhenUsed() {
        return this.extendWhenUsed;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(16);
        deserializerMap.put("created_manually", (n) -> { this.setCreatedManually(n.getBooleanValue()); });
        deserializerMap.put("create_time", (n) -> { this.setCreateTime(n.getStringValue()); });
        deserializerMap.put("currently_active", (n) -> { this.setCurrentlyActive(n.getBooleanValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("errors", (n) -> { this.setErrors(n.getCollectionOfObjectValues(AccessTokenCreateResponseErrors::createFromDiscriminatorValue)); });
        deserializerMap.put("expiry_time", (n) -> { this.setExpiryTime(n.getStringValue()); });
        deserializerMap.put("extend_when_used", (n) -> { this.setExtendWhenUsed(n.getBooleanValue()); });
        deserializerMap.put("full_token", (n) -> { this.setFullToken(n.getStringValue()); });
        deserializerMap.put("last_ip", (n) -> { this.setLastIp(n.getStringValue()); });
        deserializerMap.put("last_used_time", (n) -> { this.setLastUsedTime(n.getStringValue()); });
        deserializerMap.put("last_user_agent", (n) -> { this.setLastUserAgent(n.getStringValue()); });
        deserializerMap.put("last_user_agent_human_readable", (n) -> { this.setLastUserAgentHumanReadable(n.getStringValue()); });
        deserializerMap.put("max_age_seconds", (n) -> { this.setMaxAgeSeconds(n.getDoubleValue()); });
        deserializerMap.put("message", (n) -> { this.setMessage(n.getStringValue()); });
        deserializerMap.put("scopes", (n) -> { this.setScopes(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("token_prefix", (n) -> { this.setTokenPrefix(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the full_token property value. This full access token can be used to make API calls. This can also be used to update or revoke tokens. Note that when using this token with the update and revoke APIs it must be URL encoded because it may contain /, + and = characters (/ =&gt; %2F, + =&gt; %2B, = =&gt; %3D).
     * @return a string
     */
    @javax.annotation.Nullable
    public String getFullToken() {
        return this.fullToken;
    }
    /**
     * Gets the last_ip property value. IP address the access token was last used from in case it has ever been used
     * @return a string
     */
    @javax.annotation.Nullable
    public String getLastIp() {
        return this.lastIp;
    }
    /**
     * Gets the last_used_time property value. Timestamp when the access token was last used, if ever
     * @return a string
     */
    @javax.annotation.Nullable
    public String getLastUsedTime() {
        return this.lastUsedTime;
    }
    /**
     * Gets the last_user_agent property value. User agent string of the client that last used the token in case it has ever been used
     * @return a string
     */
    @javax.annotation.Nullable
    public String getLastUserAgent() {
        return this.lastUserAgent;
    }
    /**
     * Gets the last_user_agent_human_readable property value. Human readable user agent string of the client that last used the token in case user agent is known
     * @return a string
     */
    @javax.annotation.Nullable
    public String getLastUserAgentHumanReadable() {
        return this.lastUserAgentHumanReadable;
    }
    /**
     * Gets the max_age_seconds property value. Time the token remains valid since creation (or since last use if extend_when_used is true)
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getMaxAgeSeconds() {
        return this.maxAgeSeconds;
    }
    /**
     * Gets the message property value. Printable result of the request
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMessage() {
        return this.message;
    }
    /**
     * Gets the scopes property value. Scopes this token is restricted to, if specified
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getScopes() {
        return this.scopes;
    }
    /**
     * Gets the token_prefix property value. First characters of the actual token value. Full value is only exposed after creation. This value is used when updating or revoking tokens. Note that the value may contain /, + and = characters and must be URL encoded when used (/ =&gt; %2F, + =&gt; %2B, = =&gt; %3D).
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTokenPrefix() {
        return this.tokenPrefix;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("created_manually", this.getCreatedManually());
        writer.writeStringValue("create_time", this.getCreateTime());
        writer.writeBooleanValue("currently_active", this.getCurrentlyActive());
        writer.writeStringValue("description", this.getDescription());
        writer.writeCollectionOfObjectValues("errors", this.getErrors());
        writer.writeStringValue("expiry_time", this.getExpiryTime());
        writer.writeBooleanValue("extend_when_used", this.getExtendWhenUsed());
        writer.writeStringValue("full_token", this.getFullToken());
        writer.writeStringValue("last_ip", this.getLastIp());
        writer.writeStringValue("last_used_time", this.getLastUsedTime());
        writer.writeStringValue("last_user_agent", this.getLastUserAgent());
        writer.writeStringValue("last_user_agent_human_readable", this.getLastUserAgentHumanReadable());
        writer.writeDoubleValue("max_age_seconds", this.getMaxAgeSeconds());
        writer.writeStringValue("message", this.getMessage());
        writer.writeCollectionOfPrimitiveValues("scopes", this.getScopes());
        writer.writeStringValue("token_prefix", this.getTokenPrefix());
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
     * Sets the created_manually property value. True for tokens explicitly created via the access_tokens API, false for tokens created via login.
     * @param value Value to set for the createdManually property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreatedManually(@javax.annotation.Nullable final Boolean value) {
        this.createdManually = value;
    }
    /**
     * Sets the create_time property value. Timestamp when the access token was created
     * @param value Value to set for the createTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreateTime(@javax.annotation.Nullable final String value) {
        this.createTime = value;
    }
    /**
     * Sets the currently_active property value. true if API request was made with this access token
     * @param value Value to set for the currentlyActive property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCurrentlyActive(@javax.annotation.Nullable final Boolean value) {
        this.currentlyActive = value;
    }
    /**
     * Sets the description property value. Name / description of an access token
     * @param value Value to set for the description property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDescription(@javax.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the errors property value. List of errors occurred during request processing
     * @param value Value to set for the errors property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setErrors(@javax.annotation.Nullable final java.util.List<AccessTokenCreateResponseErrors> value) {
        this.errors = value;
    }
    /**
     * Sets the expiry_time property value. Timestamp when the access token will expire unless extended, if ever
     * @param value Value to set for the expiryTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExpiryTime(@javax.annotation.Nullable final String value) {
        this.expiryTime = value;
    }
    /**
     * Sets the extend_when_used property value. Extend token expiration time when token is used. Only applicable if max_age_seconds is specified.
     * @param value Value to set for the extendWhenUsed property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExtendWhenUsed(@javax.annotation.Nullable final Boolean value) {
        this.extendWhenUsed = value;
    }
    /**
     * Sets the full_token property value. This full access token can be used to make API calls. This can also be used to update or revoke tokens. Note that when using this token with the update and revoke APIs it must be URL encoded because it may contain /, + and = characters (/ =&gt; %2F, + =&gt; %2B, = =&gt; %3D).
     * @param value Value to set for the fullToken property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFullToken(@javax.annotation.Nullable final String value) {
        this.fullToken = value;
    }
    /**
     * Sets the last_ip property value. IP address the access token was last used from in case it has ever been used
     * @param value Value to set for the lastIp property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastIp(@javax.annotation.Nullable final String value) {
        this.lastIp = value;
    }
    /**
     * Sets the last_used_time property value. Timestamp when the access token was last used, if ever
     * @param value Value to set for the lastUsedTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastUsedTime(@javax.annotation.Nullable final String value) {
        this.lastUsedTime = value;
    }
    /**
     * Sets the last_user_agent property value. User agent string of the client that last used the token in case it has ever been used
     * @param value Value to set for the lastUserAgent property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastUserAgent(@javax.annotation.Nullable final String value) {
        this.lastUserAgent = value;
    }
    /**
     * Sets the last_user_agent_human_readable property value. Human readable user agent string of the client that last used the token in case user agent is known
     * @param value Value to set for the lastUserAgentHumanReadable property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastUserAgentHumanReadable(@javax.annotation.Nullable final String value) {
        this.lastUserAgentHumanReadable = value;
    }
    /**
     * Sets the max_age_seconds property value. Time the token remains valid since creation (or since last use if extend_when_used is true)
     * @param value Value to set for the maxAgeSeconds property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMaxAgeSeconds(@javax.annotation.Nullable final Double value) {
        this.maxAgeSeconds = value;
    }
    /**
     * Sets the message property value. Printable result of the request
     * @param value Value to set for the message property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMessage(@javax.annotation.Nullable final String value) {
        this.message = value;
    }
    /**
     * Sets the scopes property value. Scopes this token is restricted to, if specified
     * @param value Value to set for the scopes property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setScopes(@javax.annotation.Nullable final java.util.List<String> value) {
        this.scopes = value;
    }
    /**
     * Sets the token_prefix property value. First characters of the actual token value. Full value is only exposed after creation. This value is used when updating or revoking tokens. Note that the value may contain /, + and = characters and must be URL encoded when used (/ =&gt; %2F, + =&gt; %2B, = =&gt; %3D).
     * @param value Value to set for the tokenPrefix property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTokenPrefix(@javax.annotation.Nullable final String value) {
        this.tokenPrefix = value;
    }
}
