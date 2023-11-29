package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class PGServiceQueryStatisticsResponseQueries implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** Query statistic */
    private Double blkReadTime;
    /** Query statistic */
    private Double blkWriteTime;
    /** Query statistic */
    private Double calls;
    /** Query statistic */
    private String databaseName;
    /** Query statistic */
    private Double localBlksDirtied;
    /** Query statistic */
    private Double localBlksHit;
    /** Query statistic */
    private Double localBlksRead;
    /** Query statistic */
    private Double localBlksWritten;
    /** Query statistic */
    private Double maxExecTime;
    /** Query statistic */
    private Double maxPlanTime;
    /** Query statistic */
    private Double maxTime;
    /** Query statistic */
    private Double meanExecTime;
    /** Query statistic */
    private Double meanPlanTime;
    /** Query statistic */
    private Double meanTime;
    /** Query statistic */
    private Double minExecTime;
    /** Query statistic */
    private Double minPlanTime;
    /** Query statistic */
    private Double minTime;
    /** Query statistic */
    private String query;
    /** Query statistic */
    private Double queryid;
    /** Query statistic */
    private Double rows;
    /** Query statistic */
    private Double sharedBlksDirtied;
    /** Query statistic */
    private Double sharedBlksHit;
    /** Query statistic */
    private Double sharedBlksRead;
    /** Query statistic */
    private Double sharedBlksWritten;
    /** Query statistic */
    private Double stddevExecTime;
    /** Query statistic */
    private Double stddevPlanTime;
    /** Query statistic */
    private Double stddevTime;
    /** Query statistic */
    private Double tempBlksRead;
    /** Query statistic */
    private Double tempBlksWritten;
    /** Query statistic */
    private Double totalExecTime;
    /** Query statistic */
    private Double totalPlanTime;
    /** Query statistic */
    private Double totalTime;
    /** Query statistic */
    private String userName;
    /** Query statistic */
    private String walBytes;
    /** Query statistic */
    private Double walFpi;
    /** Query statistic */
    private Double walRecords;
    /**
     * Instantiates a new PGServiceQueryStatisticsResponseQueries and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public PGServiceQueryStatisticsResponseQueries() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a PGServiceQueryStatisticsResponseQueries
     */
    @javax.annotation.Nonnull
    public static PGServiceQueryStatisticsResponseQueries createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PGServiceQueryStatisticsResponseQueries();
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
     * Gets the blk_read_time property value. Query statistic
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getBlkReadTime() {
        return this.blkReadTime;
    }
    /**
     * Gets the blk_write_time property value. Query statistic
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getBlkWriteTime() {
        return this.blkWriteTime;
    }
    /**
     * Gets the calls property value. Query statistic
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getCalls() {
        return this.calls;
    }
    /**
     * Gets the database_name property value. Query statistic
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDatabaseName() {
        return this.databaseName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(36);
        deserializerMap.put("blk_read_time", (n) -> { this.setBlkReadTime(n.getDoubleValue()); });
        deserializerMap.put("blk_write_time", (n) -> { this.setBlkWriteTime(n.getDoubleValue()); });
        deserializerMap.put("calls", (n) -> { this.setCalls(n.getDoubleValue()); });
        deserializerMap.put("database_name", (n) -> { this.setDatabaseName(n.getStringValue()); });
        deserializerMap.put("local_blks_dirtied", (n) -> { this.setLocalBlksDirtied(n.getDoubleValue()); });
        deserializerMap.put("local_blks_hit", (n) -> { this.setLocalBlksHit(n.getDoubleValue()); });
        deserializerMap.put("local_blks_read", (n) -> { this.setLocalBlksRead(n.getDoubleValue()); });
        deserializerMap.put("local_blks_written", (n) -> { this.setLocalBlksWritten(n.getDoubleValue()); });
        deserializerMap.put("max_exec_time", (n) -> { this.setMaxExecTime(n.getDoubleValue()); });
        deserializerMap.put("max_plan_time", (n) -> { this.setMaxPlanTime(n.getDoubleValue()); });
        deserializerMap.put("max_time", (n) -> { this.setMaxTime(n.getDoubleValue()); });
        deserializerMap.put("mean_exec_time", (n) -> { this.setMeanExecTime(n.getDoubleValue()); });
        deserializerMap.put("mean_plan_time", (n) -> { this.setMeanPlanTime(n.getDoubleValue()); });
        deserializerMap.put("mean_time", (n) -> { this.setMeanTime(n.getDoubleValue()); });
        deserializerMap.put("min_exec_time", (n) -> { this.setMinExecTime(n.getDoubleValue()); });
        deserializerMap.put("min_plan_time", (n) -> { this.setMinPlanTime(n.getDoubleValue()); });
        deserializerMap.put("min_time", (n) -> { this.setMinTime(n.getDoubleValue()); });
        deserializerMap.put("query", (n) -> { this.setQuery(n.getStringValue()); });
        deserializerMap.put("queryid", (n) -> { this.setQueryid(n.getDoubleValue()); });
        deserializerMap.put("rows", (n) -> { this.setRows(n.getDoubleValue()); });
        deserializerMap.put("shared_blks_dirtied", (n) -> { this.setSharedBlksDirtied(n.getDoubleValue()); });
        deserializerMap.put("shared_blks_hit", (n) -> { this.setSharedBlksHit(n.getDoubleValue()); });
        deserializerMap.put("shared_blks_read", (n) -> { this.setSharedBlksRead(n.getDoubleValue()); });
        deserializerMap.put("shared_blks_written", (n) -> { this.setSharedBlksWritten(n.getDoubleValue()); });
        deserializerMap.put("stddev_exec_time", (n) -> { this.setStddevExecTime(n.getDoubleValue()); });
        deserializerMap.put("stddev_plan_time", (n) -> { this.setStddevPlanTime(n.getDoubleValue()); });
        deserializerMap.put("stddev_time", (n) -> { this.setStddevTime(n.getDoubleValue()); });
        deserializerMap.put("temp_blks_read", (n) -> { this.setTempBlksRead(n.getDoubleValue()); });
        deserializerMap.put("temp_blks_written", (n) -> { this.setTempBlksWritten(n.getDoubleValue()); });
        deserializerMap.put("total_exec_time", (n) -> { this.setTotalExecTime(n.getDoubleValue()); });
        deserializerMap.put("total_plan_time", (n) -> { this.setTotalPlanTime(n.getDoubleValue()); });
        deserializerMap.put("total_time", (n) -> { this.setTotalTime(n.getDoubleValue()); });
        deserializerMap.put("user_name", (n) -> { this.setUserName(n.getStringValue()); });
        deserializerMap.put("wal_bytes", (n) -> { this.setWalBytes(n.getStringValue()); });
        deserializerMap.put("wal_fpi", (n) -> { this.setWalFpi(n.getDoubleValue()); });
        deserializerMap.put("wal_records", (n) -> { this.setWalRecords(n.getDoubleValue()); });
        return deserializerMap;
    }
    /**
     * Gets the local_blks_dirtied property value. Query statistic
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getLocalBlksDirtied() {
        return this.localBlksDirtied;
    }
    /**
     * Gets the local_blks_hit property value. Query statistic
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getLocalBlksHit() {
        return this.localBlksHit;
    }
    /**
     * Gets the local_blks_read property value. Query statistic
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getLocalBlksRead() {
        return this.localBlksRead;
    }
    /**
     * Gets the local_blks_written property value. Query statistic
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getLocalBlksWritten() {
        return this.localBlksWritten;
    }
    /**
     * Gets the max_exec_time property value. Query statistic
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getMaxExecTime() {
        return this.maxExecTime;
    }
    /**
     * Gets the max_plan_time property value. Query statistic
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getMaxPlanTime() {
        return this.maxPlanTime;
    }
    /**
     * Gets the max_time property value. Query statistic
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getMaxTime() {
        return this.maxTime;
    }
    /**
     * Gets the mean_exec_time property value. Query statistic
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getMeanExecTime() {
        return this.meanExecTime;
    }
    /**
     * Gets the mean_plan_time property value. Query statistic
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getMeanPlanTime() {
        return this.meanPlanTime;
    }
    /**
     * Gets the mean_time property value. Query statistic
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getMeanTime() {
        return this.meanTime;
    }
    /**
     * Gets the min_exec_time property value. Query statistic
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getMinExecTime() {
        return this.minExecTime;
    }
    /**
     * Gets the min_plan_time property value. Query statistic
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getMinPlanTime() {
        return this.minPlanTime;
    }
    /**
     * Gets the min_time property value. Query statistic
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getMinTime() {
        return this.minTime;
    }
    /**
     * Gets the query property value. Query statistic
     * @return a string
     */
    @javax.annotation.Nullable
    public String getQuery() {
        return this.query;
    }
    /**
     * Gets the queryid property value. Query statistic
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getQueryid() {
        return this.queryid;
    }
    /**
     * Gets the rows property value. Query statistic
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getRows() {
        return this.rows;
    }
    /**
     * Gets the shared_blks_dirtied property value. Query statistic
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getSharedBlksDirtied() {
        return this.sharedBlksDirtied;
    }
    /**
     * Gets the shared_blks_hit property value. Query statistic
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getSharedBlksHit() {
        return this.sharedBlksHit;
    }
    /**
     * Gets the shared_blks_read property value. Query statistic
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getSharedBlksRead() {
        return this.sharedBlksRead;
    }
    /**
     * Gets the shared_blks_written property value. Query statistic
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getSharedBlksWritten() {
        return this.sharedBlksWritten;
    }
    /**
     * Gets the stddev_exec_time property value. Query statistic
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getStddevExecTime() {
        return this.stddevExecTime;
    }
    /**
     * Gets the stddev_plan_time property value. Query statistic
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getStddevPlanTime() {
        return this.stddevPlanTime;
    }
    /**
     * Gets the stddev_time property value. Query statistic
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getStddevTime() {
        return this.stddevTime;
    }
    /**
     * Gets the temp_blks_read property value. Query statistic
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getTempBlksRead() {
        return this.tempBlksRead;
    }
    /**
     * Gets the temp_blks_written property value. Query statistic
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getTempBlksWritten() {
        return this.tempBlksWritten;
    }
    /**
     * Gets the total_exec_time property value. Query statistic
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getTotalExecTime() {
        return this.totalExecTime;
    }
    /**
     * Gets the total_plan_time property value. Query statistic
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getTotalPlanTime() {
        return this.totalPlanTime;
    }
    /**
     * Gets the total_time property value. Query statistic
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getTotalTime() {
        return this.totalTime;
    }
    /**
     * Gets the user_name property value. Query statistic
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserName() {
        return this.userName;
    }
    /**
     * Gets the wal_bytes property value. Query statistic
     * @return a string
     */
    @javax.annotation.Nullable
    public String getWalBytes() {
        return this.walBytes;
    }
    /**
     * Gets the wal_fpi property value. Query statistic
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getWalFpi() {
        return this.walFpi;
    }
    /**
     * Gets the wal_records property value. Query statistic
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getWalRecords() {
        return this.walRecords;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeDoubleValue("blk_read_time", this.getBlkReadTime());
        writer.writeDoubleValue("blk_write_time", this.getBlkWriteTime());
        writer.writeDoubleValue("calls", this.getCalls());
        writer.writeStringValue("database_name", this.getDatabaseName());
        writer.writeDoubleValue("local_blks_dirtied", this.getLocalBlksDirtied());
        writer.writeDoubleValue("local_blks_hit", this.getLocalBlksHit());
        writer.writeDoubleValue("local_blks_read", this.getLocalBlksRead());
        writer.writeDoubleValue("local_blks_written", this.getLocalBlksWritten());
        writer.writeDoubleValue("max_exec_time", this.getMaxExecTime());
        writer.writeDoubleValue("max_plan_time", this.getMaxPlanTime());
        writer.writeDoubleValue("max_time", this.getMaxTime());
        writer.writeDoubleValue("mean_exec_time", this.getMeanExecTime());
        writer.writeDoubleValue("mean_plan_time", this.getMeanPlanTime());
        writer.writeDoubleValue("mean_time", this.getMeanTime());
        writer.writeDoubleValue("min_exec_time", this.getMinExecTime());
        writer.writeDoubleValue("min_plan_time", this.getMinPlanTime());
        writer.writeDoubleValue("min_time", this.getMinTime());
        writer.writeStringValue("query", this.getQuery());
        writer.writeDoubleValue("queryid", this.getQueryid());
        writer.writeDoubleValue("rows", this.getRows());
        writer.writeDoubleValue("shared_blks_dirtied", this.getSharedBlksDirtied());
        writer.writeDoubleValue("shared_blks_hit", this.getSharedBlksHit());
        writer.writeDoubleValue("shared_blks_read", this.getSharedBlksRead());
        writer.writeDoubleValue("shared_blks_written", this.getSharedBlksWritten());
        writer.writeDoubleValue("stddev_exec_time", this.getStddevExecTime());
        writer.writeDoubleValue("stddev_plan_time", this.getStddevPlanTime());
        writer.writeDoubleValue("stddev_time", this.getStddevTime());
        writer.writeDoubleValue("temp_blks_read", this.getTempBlksRead());
        writer.writeDoubleValue("temp_blks_written", this.getTempBlksWritten());
        writer.writeDoubleValue("total_exec_time", this.getTotalExecTime());
        writer.writeDoubleValue("total_plan_time", this.getTotalPlanTime());
        writer.writeDoubleValue("total_time", this.getTotalTime());
        writer.writeStringValue("user_name", this.getUserName());
        writer.writeStringValue("wal_bytes", this.getWalBytes());
        writer.writeDoubleValue("wal_fpi", this.getWalFpi());
        writer.writeDoubleValue("wal_records", this.getWalRecords());
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
     * Sets the blk_read_time property value. Query statistic
     * @param value Value to set for the blkReadTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBlkReadTime(@javax.annotation.Nullable final Double value) {
        this.blkReadTime = value;
    }
    /**
     * Sets the blk_write_time property value. Query statistic
     * @param value Value to set for the blkWriteTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBlkWriteTime(@javax.annotation.Nullable final Double value) {
        this.blkWriteTime = value;
    }
    /**
     * Sets the calls property value. Query statistic
     * @param value Value to set for the calls property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCalls(@javax.annotation.Nullable final Double value) {
        this.calls = value;
    }
    /**
     * Sets the database_name property value. Query statistic
     * @param value Value to set for the databaseName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDatabaseName(@javax.annotation.Nullable final String value) {
        this.databaseName = value;
    }
    /**
     * Sets the local_blks_dirtied property value. Query statistic
     * @param value Value to set for the localBlksDirtied property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLocalBlksDirtied(@javax.annotation.Nullable final Double value) {
        this.localBlksDirtied = value;
    }
    /**
     * Sets the local_blks_hit property value. Query statistic
     * @param value Value to set for the localBlksHit property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLocalBlksHit(@javax.annotation.Nullable final Double value) {
        this.localBlksHit = value;
    }
    /**
     * Sets the local_blks_read property value. Query statistic
     * @param value Value to set for the localBlksRead property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLocalBlksRead(@javax.annotation.Nullable final Double value) {
        this.localBlksRead = value;
    }
    /**
     * Sets the local_blks_written property value. Query statistic
     * @param value Value to set for the localBlksWritten property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLocalBlksWritten(@javax.annotation.Nullable final Double value) {
        this.localBlksWritten = value;
    }
    /**
     * Sets the max_exec_time property value. Query statistic
     * @param value Value to set for the maxExecTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMaxExecTime(@javax.annotation.Nullable final Double value) {
        this.maxExecTime = value;
    }
    /**
     * Sets the max_plan_time property value. Query statistic
     * @param value Value to set for the maxPlanTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMaxPlanTime(@javax.annotation.Nullable final Double value) {
        this.maxPlanTime = value;
    }
    /**
     * Sets the max_time property value. Query statistic
     * @param value Value to set for the maxTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMaxTime(@javax.annotation.Nullable final Double value) {
        this.maxTime = value;
    }
    /**
     * Sets the mean_exec_time property value. Query statistic
     * @param value Value to set for the meanExecTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMeanExecTime(@javax.annotation.Nullable final Double value) {
        this.meanExecTime = value;
    }
    /**
     * Sets the mean_plan_time property value. Query statistic
     * @param value Value to set for the meanPlanTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMeanPlanTime(@javax.annotation.Nullable final Double value) {
        this.meanPlanTime = value;
    }
    /**
     * Sets the mean_time property value. Query statistic
     * @param value Value to set for the meanTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMeanTime(@javax.annotation.Nullable final Double value) {
        this.meanTime = value;
    }
    /**
     * Sets the min_exec_time property value. Query statistic
     * @param value Value to set for the minExecTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMinExecTime(@javax.annotation.Nullable final Double value) {
        this.minExecTime = value;
    }
    /**
     * Sets the min_plan_time property value. Query statistic
     * @param value Value to set for the minPlanTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMinPlanTime(@javax.annotation.Nullable final Double value) {
        this.minPlanTime = value;
    }
    /**
     * Sets the min_time property value. Query statistic
     * @param value Value to set for the minTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMinTime(@javax.annotation.Nullable final Double value) {
        this.minTime = value;
    }
    /**
     * Sets the query property value. Query statistic
     * @param value Value to set for the query property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setQuery(@javax.annotation.Nullable final String value) {
        this.query = value;
    }
    /**
     * Sets the queryid property value. Query statistic
     * @param value Value to set for the queryid property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setQueryid(@javax.annotation.Nullable final Double value) {
        this.queryid = value;
    }
    /**
     * Sets the rows property value. Query statistic
     * @param value Value to set for the rows property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRows(@javax.annotation.Nullable final Double value) {
        this.rows = value;
    }
    /**
     * Sets the shared_blks_dirtied property value. Query statistic
     * @param value Value to set for the sharedBlksDirtied property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSharedBlksDirtied(@javax.annotation.Nullable final Double value) {
        this.sharedBlksDirtied = value;
    }
    /**
     * Sets the shared_blks_hit property value. Query statistic
     * @param value Value to set for the sharedBlksHit property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSharedBlksHit(@javax.annotation.Nullable final Double value) {
        this.sharedBlksHit = value;
    }
    /**
     * Sets the shared_blks_read property value. Query statistic
     * @param value Value to set for the sharedBlksRead property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSharedBlksRead(@javax.annotation.Nullable final Double value) {
        this.sharedBlksRead = value;
    }
    /**
     * Sets the shared_blks_written property value. Query statistic
     * @param value Value to set for the sharedBlksWritten property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSharedBlksWritten(@javax.annotation.Nullable final Double value) {
        this.sharedBlksWritten = value;
    }
    /**
     * Sets the stddev_exec_time property value. Query statistic
     * @param value Value to set for the stddevExecTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStddevExecTime(@javax.annotation.Nullable final Double value) {
        this.stddevExecTime = value;
    }
    /**
     * Sets the stddev_plan_time property value. Query statistic
     * @param value Value to set for the stddevPlanTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStddevPlanTime(@javax.annotation.Nullable final Double value) {
        this.stddevPlanTime = value;
    }
    /**
     * Sets the stddev_time property value. Query statistic
     * @param value Value to set for the stddevTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStddevTime(@javax.annotation.Nullable final Double value) {
        this.stddevTime = value;
    }
    /**
     * Sets the temp_blks_read property value. Query statistic
     * @param value Value to set for the tempBlksRead property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTempBlksRead(@javax.annotation.Nullable final Double value) {
        this.tempBlksRead = value;
    }
    /**
     * Sets the temp_blks_written property value. Query statistic
     * @param value Value to set for the tempBlksWritten property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTempBlksWritten(@javax.annotation.Nullable final Double value) {
        this.tempBlksWritten = value;
    }
    /**
     * Sets the total_exec_time property value. Query statistic
     * @param value Value to set for the totalExecTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTotalExecTime(@javax.annotation.Nullable final Double value) {
        this.totalExecTime = value;
    }
    /**
     * Sets the total_plan_time property value. Query statistic
     * @param value Value to set for the totalPlanTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTotalPlanTime(@javax.annotation.Nullable final Double value) {
        this.totalPlanTime = value;
    }
    /**
     * Sets the total_time property value. Query statistic
     * @param value Value to set for the totalTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTotalTime(@javax.annotation.Nullable final Double value) {
        this.totalTime = value;
    }
    /**
     * Sets the user_name property value. Query statistic
     * @param value Value to set for the userName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserName(@javax.annotation.Nullable final String value) {
        this.userName = value;
    }
    /**
     * Sets the wal_bytes property value. Query statistic
     * @param value Value to set for the walBytes property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWalBytes(@javax.annotation.Nullable final String value) {
        this.walBytes = value;
    }
    /**
     * Sets the wal_fpi property value. Query statistic
     * @param value Value to set for the walFpi property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWalFpi(@javax.annotation.Nullable final Double value) {
        this.walFpi = value;
    }
    /**
     * Sets the wal_records property value. Query statistic
     * @param value Value to set for the walRecords property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWalRecords(@javax.annotation.Nullable final Double value) {
        this.walRecords = value;
    }
}
