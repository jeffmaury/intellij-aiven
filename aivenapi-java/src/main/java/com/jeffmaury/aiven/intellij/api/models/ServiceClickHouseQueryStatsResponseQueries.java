package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ServiceClickHouseQueryStatsResponseQueries implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** Number of calls */
    private Integer calls;
    /** Database */
    private String database;
    /** Maximum query duration in milliseconds */
    private Integer maxTime;
    /** Average query duration in milliseconds */
    private Integer meanTime;
    /** Minimum query duration in milliseconds */
    private Integer minTime;
    /** Query duration 95th percentile in milliseconds */
    private Integer p95Time;
    /** Normalized query */
    private String query;
    /** Average number of rows per call */
    private Double rows;
    /** Query duration standard deviation in milliseconds */
    private Integer stddevTime;
    /** Total duration of all calls in milliseconds */
    private Integer totalTime;
    /**
     * Instantiates a new ServiceClickHouseQueryStatsResponseQueries and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ServiceClickHouseQueryStatsResponseQueries() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ServiceClickHouseQueryStatsResponseQueries
     */
    @javax.annotation.Nonnull
    public static ServiceClickHouseQueryStatsResponseQueries createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ServiceClickHouseQueryStatsResponseQueries();
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
     * Gets the calls property value. Number of calls
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getCalls() {
        return this.calls;
    }
    /**
     * Gets the database property value. Database
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDatabase() {
        return this.database;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(10);
        deserializerMap.put("calls", (n) -> { this.setCalls(n.getIntegerValue()); });
        deserializerMap.put("database", (n) -> { this.setDatabase(n.getStringValue()); });
        deserializerMap.put("max_time", (n) -> { this.setMaxTime(n.getIntegerValue()); });
        deserializerMap.put("mean_time", (n) -> { this.setMeanTime(n.getIntegerValue()); });
        deserializerMap.put("min_time", (n) -> { this.setMinTime(n.getIntegerValue()); });
        deserializerMap.put("p95_time", (n) -> { this.setP95Time(n.getIntegerValue()); });
        deserializerMap.put("query", (n) -> { this.setQuery(n.getStringValue()); });
        deserializerMap.put("rows", (n) -> { this.setRows(n.getDoubleValue()); });
        deserializerMap.put("stddev_time", (n) -> { this.setStddevTime(n.getIntegerValue()); });
        deserializerMap.put("total_time", (n) -> { this.setTotalTime(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the max_time property value. Maximum query duration in milliseconds
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getMaxTime() {
        return this.maxTime;
    }
    /**
     * Gets the mean_time property value. Average query duration in milliseconds
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getMeanTime() {
        return this.meanTime;
    }
    /**
     * Gets the min_time property value. Minimum query duration in milliseconds
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getMinTime() {
        return this.minTime;
    }
    /**
     * Gets the p95_time property value. Query duration 95th percentile in milliseconds
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getP95Time() {
        return this.p95Time;
    }
    /**
     * Gets the query property value. Normalized query
     * @return a string
     */
    @javax.annotation.Nullable
    public String getQuery() {
        return this.query;
    }
    /**
     * Gets the rows property value. Average number of rows per call
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getRows() {
        return this.rows;
    }
    /**
     * Gets the stddev_time property value. Query duration standard deviation in milliseconds
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getStddevTime() {
        return this.stddevTime;
    }
    /**
     * Gets the total_time property value. Total duration of all calls in milliseconds
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getTotalTime() {
        return this.totalTime;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("calls", this.getCalls());
        writer.writeStringValue("database", this.getDatabase());
        writer.writeIntegerValue("max_time", this.getMaxTime());
        writer.writeIntegerValue("mean_time", this.getMeanTime());
        writer.writeIntegerValue("min_time", this.getMinTime());
        writer.writeIntegerValue("p95_time", this.getP95Time());
        writer.writeStringValue("query", this.getQuery());
        writer.writeDoubleValue("rows", this.getRows());
        writer.writeIntegerValue("stddev_time", this.getStddevTime());
        writer.writeIntegerValue("total_time", this.getTotalTime());
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
     * Sets the calls property value. Number of calls
     * @param value Value to set for the calls property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCalls(@javax.annotation.Nullable final Integer value) {
        this.calls = value;
    }
    /**
     * Sets the database property value. Database
     * @param value Value to set for the database property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDatabase(@javax.annotation.Nullable final String value) {
        this.database = value;
    }
    /**
     * Sets the max_time property value. Maximum query duration in milliseconds
     * @param value Value to set for the maxTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMaxTime(@javax.annotation.Nullable final Integer value) {
        this.maxTime = value;
    }
    /**
     * Sets the mean_time property value. Average query duration in milliseconds
     * @param value Value to set for the meanTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMeanTime(@javax.annotation.Nullable final Integer value) {
        this.meanTime = value;
    }
    /**
     * Sets the min_time property value. Minimum query duration in milliseconds
     * @param value Value to set for the minTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMinTime(@javax.annotation.Nullable final Integer value) {
        this.minTime = value;
    }
    /**
     * Sets the p95_time property value. Query duration 95th percentile in milliseconds
     * @param value Value to set for the p95Time property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setP95Time(@javax.annotation.Nullable final Integer value) {
        this.p95Time = value;
    }
    /**
     * Sets the query property value. Normalized query
     * @param value Value to set for the query property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setQuery(@javax.annotation.Nullable final String value) {
        this.query = value;
    }
    /**
     * Sets the rows property value. Average number of rows per call
     * @param value Value to set for the rows property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRows(@javax.annotation.Nullable final Double value) {
        this.rows = value;
    }
    /**
     * Sets the stddev_time property value. Query duration standard deviation in milliseconds
     * @param value Value to set for the stddevTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStddevTime(@javax.annotation.Nullable final Integer value) {
        this.stddevTime = value;
    }
    /**
     * Sets the total_time property value. Total duration of all calls in milliseconds
     * @param value Value to set for the totalTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTotalTime(@javax.annotation.Nullable final Integer value) {
        this.totalTime = value;
    }
}
