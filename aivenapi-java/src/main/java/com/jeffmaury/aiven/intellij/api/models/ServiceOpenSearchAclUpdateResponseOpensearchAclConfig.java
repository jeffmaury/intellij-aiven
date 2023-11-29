package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * OpenSearch ACL configuration
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ServiceOpenSearchAclUpdateResponseOpensearchAclConfig implements AdditionalDataHolder, Parsable {
    /**
     * List of OpenSearch ACLs
     */
    private java.util.List<ServiceOpenSearchAclUpdateResponseOpensearchAclConfigAcls> acls;
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Enable OpenSearch ACLs. When disabled authenticated service users have unrestricted access.
     */
    private Boolean enabled;
    /**
     * Instantiates a new ServiceOpenSearchAclUpdateResponseOpensearchAclConfig and sets the default values.
     */
    public ServiceOpenSearchAclUpdateResponseOpensearchAclConfig() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ServiceOpenSearchAclUpdateResponseOpensearchAclConfig
     */
    @jakarta.annotation.Nonnull
    public static ServiceOpenSearchAclUpdateResponseOpensearchAclConfig createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ServiceOpenSearchAclUpdateResponseOpensearchAclConfig();
    }
    /**
     * Gets the acls property value. List of OpenSearch ACLs
     * @return a java.util.List<ServiceOpenSearchAclUpdateResponseOpensearchAclConfigAcls>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ServiceOpenSearchAclUpdateResponseOpensearchAclConfigAcls> getAcls() {
        return this.acls;
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
     * Gets the enabled property value. Enable OpenSearch ACLs. When disabled authenticated service users have unrestricted access.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getEnabled() {
        return this.enabled;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("acls", (n) -> { this.setAcls(n.getCollectionOfObjectValues(ServiceOpenSearchAclUpdateResponseOpensearchAclConfigAcls::createFromDiscriminatorValue)); });
        deserializerMap.put("enabled", (n) -> { this.setEnabled(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("acls", this.getAcls());
        writer.writeBooleanValue("enabled", this.getEnabled());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the acls property value. List of OpenSearch ACLs
     * @param value Value to set for the acls property.
     */
    public void setAcls(@jakarta.annotation.Nullable final java.util.List<ServiceOpenSearchAclUpdateResponseOpensearchAclConfigAcls> value) {
        this.acls = value;
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the enabled property value. Enable OpenSearch ACLs. When disabled authenticated service users have unrestricted access.
     * @param value Value to set for the enabled property.
     */
    public void setEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.enabled = value;
    }
}
