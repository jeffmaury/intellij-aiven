package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * ProjectGetServiceLogsResponse
 */
public class ProjectGetServiceLogsResponse implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** List of errors occurred during request processing */
    private java.util.List<ProjectGetServiceLogsResponseErrors> errors;
    /** Opaque offset identifier of the first received log message. A null value is returned when there are no logs at all. */
    private String firstLogOffset;
    /** List of log entries */
    private java.util.List<ProjectGetServiceLogsResponseLogs> logs;
    /** Printable result of the request */
    private String message;
    /** Opaque offset identifier. A null value is returned when there are no logs at all. */
    private String offset;
    /**
     * Instantiates a new ProjectGetServiceLogsResponse and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ProjectGetServiceLogsResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ProjectGetServiceLogsResponse
     */
    @javax.annotation.Nonnull
    public static ProjectGetServiceLogsResponse createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ProjectGetServiceLogsResponse();
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
     * Gets the errors property value. List of errors occurred during request processing
     * @return a ProjectGetServiceLogsResponseErrors
     */
    @javax.annotation.Nullable
    public java.util.List<ProjectGetServiceLogsResponseErrors> getErrors() {
        return this.errors;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("errors", (n) -> { this.setErrors(n.getCollectionOfObjectValues(ProjectGetServiceLogsResponseErrors::createFromDiscriminatorValue)); });
        deserializerMap.put("first_log_offset", (n) -> { this.setFirstLogOffset(n.getStringValue()); });
        deserializerMap.put("logs", (n) -> { this.setLogs(n.getCollectionOfObjectValues(ProjectGetServiceLogsResponseLogs::createFromDiscriminatorValue)); });
        deserializerMap.put("message", (n) -> { this.setMessage(n.getStringValue()); });
        deserializerMap.put("offset", (n) -> { this.setOffset(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the first_log_offset property value. Opaque offset identifier of the first received log message. A null value is returned when there are no logs at all.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getFirstLogOffset() {
        return this.firstLogOffset;
    }
    /**
     * Gets the logs property value. List of log entries
     * @return a ProjectGetServiceLogsResponseLogs
     */
    @javax.annotation.Nullable
    public java.util.List<ProjectGetServiceLogsResponseLogs> getLogs() {
        return this.logs;
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
     * Gets the offset property value. Opaque offset identifier. A null value is returned when there are no logs at all.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOffset() {
        return this.offset;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("errors", this.getErrors());
        writer.writeStringValue("first_log_offset", this.getFirstLogOffset());
        writer.writeCollectionOfObjectValues("logs", this.getLogs());
        writer.writeStringValue("message", this.getMessage());
        writer.writeStringValue("offset", this.getOffset());
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
     * Sets the errors property value. List of errors occurred during request processing
     * @param value Value to set for the errors property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setErrors(@javax.annotation.Nullable final java.util.List<ProjectGetServiceLogsResponseErrors> value) {
        this.errors = value;
    }
    /**
     * Sets the first_log_offset property value. Opaque offset identifier of the first received log message. A null value is returned when there are no logs at all.
     * @param value Value to set for the firstLogOffset property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFirstLogOffset(@javax.annotation.Nullable final String value) {
        this.firstLogOffset = value;
    }
    /**
     * Sets the logs property value. List of log entries
     * @param value Value to set for the logs property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLogs(@javax.annotation.Nullable final java.util.List<ProjectGetServiceLogsResponseLogs> value) {
        this.logs = value;
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
     * Sets the offset property value. Opaque offset identifier. A null value is returned when there are no logs at all.
     * @param value Value to set for the offset property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOffset(@javax.annotation.Nullable final String value) {
        this.offset = value;
    }
}
