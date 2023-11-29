package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * ProjectUserUpdateRequestBody
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ProjectUserUpdateRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Project member type
     */
    private ProjectUserUpdateRequestBodyMemberType memberType;
    /**
     * Instantiates a new ProjectUserUpdateRequestBody and sets the default values.
     */
    public ProjectUserUpdateRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ProjectUserUpdateRequestBody
     */
    @jakarta.annotation.Nonnull
    public static ProjectUserUpdateRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ProjectUserUpdateRequestBody();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(1);
        deserializerMap.put("member_type", (n) -> { this.setMemberType(n.getEnumValue(ProjectUserUpdateRequestBodyMemberType.class)); });
        return deserializerMap;
    }
    /**
     * Gets the member_type property value. Project member type
     * @return a ProjectUserUpdateRequestBodyMemberType
     */
    @jakarta.annotation.Nullable
    public ProjectUserUpdateRequestBodyMemberType getMemberType() {
        return this.memberType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("member_type", this.getMemberType());
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
     * Sets the member_type property value. Project member type
     * @param value Value to set for the member_type property.
     */
    public void setMemberType(@jakarta.annotation.Nullable final ProjectUserUpdateRequestBodyMemberType value) {
        this.memberType = value;
    }
}
