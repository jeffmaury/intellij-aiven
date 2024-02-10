package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ServiceOpenSearchAclGetResponseOpensearchAclConfigAclsRules implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * OpenSearch index pattern
     */
    private String index;
    /**
     * OpenSearch permission
     */
    private ServiceOpenSearchAclGetResponseOpensearchAclConfigAclsRulesPermission permission;
    /**
     * Instantiates a new ServiceOpenSearchAclGetResponseOpensearchAclConfigAclsRules and sets the default values.
     */
    public ServiceOpenSearchAclGetResponseOpensearchAclConfigAclsRules() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ServiceOpenSearchAclGetResponseOpensearchAclConfigAclsRules
     */
    @jakarta.annotation.Nonnull
    public static ServiceOpenSearchAclGetResponseOpensearchAclConfigAclsRules createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ServiceOpenSearchAclGetResponseOpensearchAclConfigAclsRules();
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
        deserializerMap.put("index", (n) -> { this.setIndex(n.getStringValue()); });
        deserializerMap.put("permission", (n) -> { this.setPermission(n.getEnumValue(ServiceOpenSearchAclGetResponseOpensearchAclConfigAclsRulesPermission::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the index property value. OpenSearch index pattern
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getIndex() {
        return this.index;
    }
    /**
     * Gets the permission property value. OpenSearch permission
     * @return a ServiceOpenSearchAclGetResponseOpensearchAclConfigAclsRulesPermission
     */
    @jakarta.annotation.Nullable
    public ServiceOpenSearchAclGetResponseOpensearchAclConfigAclsRulesPermission getPermission() {
        return this.permission;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("index", this.getIndex());
        writer.writeEnumValue("permission", this.getPermission());
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
     * Sets the index property value. OpenSearch index pattern
     * @param value Value to set for the index property.
     */
    public void setIndex(@jakarta.annotation.Nullable final String value) {
        this.index = value;
    }
    /**
     * Sets the permission property value. OpenSearch permission
     * @param value Value to set for the permission property.
     */
    public void setPermission(@jakarta.annotation.Nullable final ServiceOpenSearchAclGetResponseOpensearchAclConfigAclsRulesPermission value) {
        this.permission = value;
    }
}
