package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class BillingGroupProjectListResponseProjects implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Available credits
     */
    private String availableCredits;
    /**
     * Estimated balance
     */
    private String estimatedBalance;
    /**
     * Project name
     */
    private String projectName;
    /**
     * Instantiates a new BillingGroupProjectListResponseProjects and sets the default values.
     */
    public BillingGroupProjectListResponseProjects() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a BillingGroupProjectListResponseProjects
     */
    @jakarta.annotation.Nonnull
    public static BillingGroupProjectListResponseProjects createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new BillingGroupProjectListResponseProjects();
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
     * Gets the available_credits property value. Available credits
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAvailableCredits() {
        return this.availableCredits;
    }
    /**
     * Gets the estimated_balance property value. Estimated balance
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getEstimatedBalance() {
        return this.estimatedBalance;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("available_credits", (n) -> { this.setAvailableCredits(n.getStringValue()); });
        deserializerMap.put("estimated_balance", (n) -> { this.setEstimatedBalance(n.getStringValue()); });
        deserializerMap.put("project_name", (n) -> { this.setProjectName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the project_name property value. Project name
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getProjectName() {
        return this.projectName;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("available_credits", this.getAvailableCredits());
        writer.writeStringValue("estimated_balance", this.getEstimatedBalance());
        writer.writeStringValue("project_name", this.getProjectName());
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
     * Sets the available_credits property value. Available credits
     * @param value Value to set for the available_credits property.
     */
    public void setAvailableCredits(@jakarta.annotation.Nullable final String value) {
        this.availableCredits = value;
    }
    /**
     * Sets the estimated_balance property value. Estimated balance
     * @param value Value to set for the estimated_balance property.
     */
    public void setEstimatedBalance(@jakarta.annotation.Nullable final String value) {
        this.estimatedBalance = value;
    }
    /**
     * Sets the project_name property value. Project name
     * @param value Value to set for the project_name property.
     */
    public void setProjectName(@jakarta.annotation.Nullable final String value) {
        this.projectName = value;
    }
}
