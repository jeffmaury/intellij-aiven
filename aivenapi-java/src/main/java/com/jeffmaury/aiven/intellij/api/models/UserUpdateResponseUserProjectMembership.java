package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Project membership and type of membership
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UserUpdateResponseUserProjectMembership implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Project member type
     */
    private UserUpdateResponseUserProjectMembershipANY aNY;
    /**
     * Instantiates a new UserUpdateResponseUserProjectMembership and sets the default values.
     */
    public UserUpdateResponseUserProjectMembership() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a UserUpdateResponseUserProjectMembership
     */
    @jakarta.annotation.Nonnull
    public static UserUpdateResponseUserProjectMembership createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserUpdateResponseUserProjectMembership();
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
     * Gets the ANY property value. Project member type
     * @return a UserUpdateResponseUserProjectMembershipANY
     */
    @jakarta.annotation.Nullable
    public UserUpdateResponseUserProjectMembershipANY getANY() {
        return this.aNY;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(1);
        deserializerMap.put("ANY", (n) -> { this.setANY(n.getEnumValue(UserUpdateResponseUserProjectMembershipANY::forValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("ANY", this.getANY());
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
     * Sets the ANY property value. Project member type
     * @param value Value to set for the ANY property.
     */
    public void setANY(@jakarta.annotation.Nullable final UserUpdateResponseUserProjectMembershipANY value) {
        this.aNY = value;
    }
}
