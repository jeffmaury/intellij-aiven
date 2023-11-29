package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * UserGroupMembersUpdateRequestBody
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UserGroupMembersUpdateRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * List of user IDs to apply the operation on
     */
    private java.util.List<String> memberIds;
    /**
     * Operation to be performed on the group
     */
    private UserGroupMembersUpdateRequestBodyOperation operation;
    /**
     * Instantiates a new UserGroupMembersUpdateRequestBody and sets the default values.
     */
    public UserGroupMembersUpdateRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a UserGroupMembersUpdateRequestBody
     */
    @jakarta.annotation.Nonnull
    public static UserGroupMembersUpdateRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserGroupMembersUpdateRequestBody();
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
        deserializerMap.put("member_ids", (n) -> { this.setMemberIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("operation", (n) -> { this.setOperation(n.getEnumValue(UserGroupMembersUpdateRequestBodyOperation.class)); });
        return deserializerMap;
    }
    /**
     * Gets the member_ids property value. List of user IDs to apply the operation on
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getMemberIds() {
        return this.memberIds;
    }
    /**
     * Gets the operation property value. Operation to be performed on the group
     * @return a UserGroupMembersUpdateRequestBodyOperation
     */
    @jakarta.annotation.Nullable
    public UserGroupMembersUpdateRequestBodyOperation getOperation() {
        return this.operation;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfPrimitiveValues("member_ids", this.getMemberIds());
        writer.writeEnumValue("operation", this.getOperation());
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
     * Sets the member_ids property value. List of user IDs to apply the operation on
     * @param value Value to set for the member_ids property.
     */
    public void setMemberIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.memberIds = value;
    }
    /**
     * Sets the operation property value. Operation to be performed on the group
     * @param value Value to set for the operation property.
     */
    public void setOperation(@jakarta.annotation.Nullable final UserGroupMembersUpdateRequestBodyOperation value) {
        this.operation = value;
    }
}
