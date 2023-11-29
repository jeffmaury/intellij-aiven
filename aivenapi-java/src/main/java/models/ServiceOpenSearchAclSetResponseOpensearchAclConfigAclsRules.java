package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ServiceOpenSearchAclSetResponseOpensearchAclConfigAclsRules implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** OpenSearch index pattern */
    private String index;
    /** OpenSearch permission */
    private ServiceOpenSearchAclSetResponseOpensearchAclConfigAclsRulesPermission permission;
    /**
     * Instantiates a new ServiceOpenSearchAclSetResponseOpensearchAclConfigAclsRules and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ServiceOpenSearchAclSetResponseOpensearchAclConfigAclsRules() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ServiceOpenSearchAclSetResponseOpensearchAclConfigAclsRules
     */
    @javax.annotation.Nonnull
    public static ServiceOpenSearchAclSetResponseOpensearchAclConfigAclsRules createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ServiceOpenSearchAclSetResponseOpensearchAclConfigAclsRules();
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
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("index", (n) -> { this.setIndex(n.getStringValue()); });
        deserializerMap.put("permission", (n) -> { this.setPermission(n.getEnumValue(ServiceOpenSearchAclSetResponseOpensearchAclConfigAclsRulesPermission.class)); });
        return deserializerMap;
    }
    /**
     * Gets the index property value. OpenSearch index pattern
     * @return a string
     */
    @javax.annotation.Nullable
    public String getIndex() {
        return this.index;
    }
    /**
     * Gets the permission property value. OpenSearch permission
     * @return a ServiceOpenSearchAclSetResponseOpensearchAclConfigAclsRulesPermission
     */
    @javax.annotation.Nullable
    public ServiceOpenSearchAclSetResponseOpensearchAclConfigAclsRulesPermission getPermission() {
        return this.permission;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("index", this.getIndex());
        writer.writeEnumValue("permission", this.getPermission());
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
     * Sets the index property value. OpenSearch index pattern
     * @param value Value to set for the index property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIndex(@javax.annotation.Nullable final String value) {
        this.index = value;
    }
    /**
     * Sets the permission property value. OpenSearch permission
     * @param value Value to set for the permission property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPermission(@javax.annotation.Nullable final ServiceOpenSearchAclSetResponseOpensearchAclConfigAclsRulesPermission value) {
        this.permission = value;
    }
}
