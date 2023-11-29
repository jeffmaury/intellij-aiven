package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AccountTeamProjectListResponseProjects implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** Project name */
    private String projectName;
    /** Team type (permission level) */
    private AccountTeamProjectListResponseProjectsTeamType teamType;
    /**
     * Instantiates a new AccountTeamProjectListResponseProjects and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public AccountTeamProjectListResponseProjects() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AccountTeamProjectListResponseProjects
     */
    @javax.annotation.Nonnull
    public static AccountTeamProjectListResponseProjects createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AccountTeamProjectListResponseProjects();
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
        deserializerMap.put("project_name", (n) -> { this.setProjectName(n.getStringValue()); });
        deserializerMap.put("team_type", (n) -> { this.setTeamType(n.getEnumValue(AccountTeamProjectListResponseProjectsTeamType.class)); });
        return deserializerMap;
    }
    /**
     * Gets the project_name property value. Project name
     * @return a string
     */
    @javax.annotation.Nullable
    public String getProjectName() {
        return this.projectName;
    }
    /**
     * Gets the team_type property value. Team type (permission level)
     * @return a AccountTeamProjectListResponseProjectsTeamType
     */
    @javax.annotation.Nullable
    public AccountTeamProjectListResponseProjectsTeamType getTeamType() {
        return this.teamType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("project_name", this.getProjectName());
        writer.writeEnumValue("team_type", this.getTeamType());
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
     * Sets the project_name property value. Project name
     * @param value Value to set for the projectName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setProjectName(@javax.annotation.Nullable final String value) {
        this.projectName = value;
    }
    /**
     * Sets the team_type property value. Team type (permission level)
     * @param value Value to set for the teamType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTeamType(@javax.annotation.Nullable final AccountTeamProjectListResponseProjectsTeamType value) {
        this.teamType = value;
    }
}
