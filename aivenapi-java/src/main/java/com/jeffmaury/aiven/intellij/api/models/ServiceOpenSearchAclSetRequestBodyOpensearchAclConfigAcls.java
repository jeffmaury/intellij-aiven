package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ServiceOpenSearchAclSetRequestBodyOpensearchAclConfigAcls implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * OpenSearch rules
     */
    private java.util.List<ServiceOpenSearchAclSetRequestBodyOpensearchAclConfigAclsRules> rules;
    /**
     * Username
     */
    private String username;
    /**
     * Instantiates a new ServiceOpenSearchAclSetRequestBodyOpensearchAclConfigAcls and sets the default values.
     */
    public ServiceOpenSearchAclSetRequestBodyOpensearchAclConfigAcls() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ServiceOpenSearchAclSetRequestBodyOpensearchAclConfigAcls
     */
    @jakarta.annotation.Nonnull
    public static ServiceOpenSearchAclSetRequestBodyOpensearchAclConfigAcls createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ServiceOpenSearchAclSetRequestBodyOpensearchAclConfigAcls();
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
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("rules", (n) -> { this.setRules(n.getCollectionOfObjectValues(ServiceOpenSearchAclSetRequestBodyOpensearchAclConfigAclsRules::createFromDiscriminatorValue)); });
        deserializerMap.put("username", (n) -> { this.setUsername(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the rules property value. OpenSearch rules
     * @return a java.util.List<ServiceOpenSearchAclSetRequestBodyOpensearchAclConfigAclsRules>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ServiceOpenSearchAclSetRequestBodyOpensearchAclConfigAclsRules> getRules() {
        return this.rules;
    }
    /**
     * Gets the username property value. Username
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getUsername() {
        return this.username;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("rules", this.getRules());
        writer.writeStringValue("username", this.getUsername());
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
     * Sets the rules property value. OpenSearch rules
     * @param value Value to set for the rules property.
     */
    public void setRules(@jakarta.annotation.Nullable final java.util.List<ServiceOpenSearchAclSetRequestBodyOpensearchAclConfigAclsRules> value) {
        this.rules = value;
    }
    /**
     * Sets the username property value. Username
     * @param value Value to set for the username property.
     */
    public void setUsername(@jakarta.annotation.Nullable final String value) {
        this.username = value;
    }
}
