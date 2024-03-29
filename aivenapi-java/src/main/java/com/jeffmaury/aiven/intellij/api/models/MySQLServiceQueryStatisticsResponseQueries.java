package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MySQLServiceQueryStatisticsResponseQueries implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Query statistic
     */
    private Double avgTimerWait;
    /**
     * Query statistic
     */
    private Double countStar;
    /**
     * Query statistic
     */
    private String digest;
    /**
     * Query statistic
     */
    private String digestText;
    /**
     * Query statistic
     */
    private String firstSeen;
    /**
     * Query statistic
     */
    private String lastSeen;
    /**
     * Query statistic
     */
    private Double maxTimerWait;
    /**
     * Query statistic
     */
    private Double minTimerWait;
    /**
     * Query statistic
     */
    private Double quantile95;
    /**
     * Query statistic
     */
    private Double quantile99;
    /**
     * Query statistic
     */
    private Double quantile999;
    /**
     * Query statistic
     */
    private String querySampleSeen;
    /**
     * Query statistic
     */
    private String querySampleText;
    /**
     * Query statistic
     */
    private String querySampleTimerWait;
    /**
     * Query statistic
     */
    private String schemaName;
    /**
     * Query statistic
     */
    private Double sumCreatedTmpDiskTables;
    /**
     * Query statistic
     */
    private Double sumCreatedTmpTables;
    /**
     * Query statistic
     */
    private Double sumErrors;
    /**
     * Query statistic
     */
    private Double sumLockTime;
    /**
     * Query statistic
     */
    private Double sumNoGoodIndexUsed;
    /**
     * Query statistic
     */
    private Double sumNoIndexUsed;
    /**
     * Query statistic
     */
    private Double sumRowsAffected;
    /**
     * Query statistic
     */
    private Double sumRowsExamined;
    /**
     * Query statistic
     */
    private Double sumRowsSent;
    /**
     * Query statistic
     */
    private Double sumSelectFullJoin;
    /**
     * Query statistic
     */
    private Double sumSelectFullRangeJoin;
    /**
     * Query statistic
     */
    private Double sumSelectRange;
    /**
     * Query statistic
     */
    private Double sumSelectRangeCheck;
    /**
     * Query statistic
     */
    private Double sumSelectScan;
    /**
     * Query statistic
     */
    private Double sumSortMergePasses;
    /**
     * Query statistic
     */
    private Double sumSortRange;
    /**
     * Query statistic
     */
    private Double sumSortRows;
    /**
     * Query statistic
     */
    private Double sumSortScan;
    /**
     * Query statistic
     */
    private Double sumTimerWait;
    /**
     * Query statistic
     */
    private Double sumWarnings;
    /**
     * Instantiates a new MySQLServiceQueryStatisticsResponseQueries and sets the default values.
     */
    public MySQLServiceQueryStatisticsResponseQueries() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a MySQLServiceQueryStatisticsResponseQueries
     */
    @jakarta.annotation.Nonnull
    public static MySQLServiceQueryStatisticsResponseQueries createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MySQLServiceQueryStatisticsResponseQueries();
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
     * Gets the avg_timer_wait property value. Query statistic
     * @return a Double
     */
    @jakarta.annotation.Nullable
    public Double getAvgTimerWait() {
        return this.avgTimerWait;
    }
    /**
     * Gets the count_star property value. Query statistic
     * @return a Double
     */
    @jakarta.annotation.Nullable
    public Double getCountStar() {
        return this.countStar;
    }
    /**
     * Gets the digest property value. Query statistic
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDigest() {
        return this.digest;
    }
    /**
     * Gets the digest_text property value. Query statistic
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDigestText() {
        return this.digestText;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(35);
        deserializerMap.put("avg_timer_wait", (n) -> { this.setAvgTimerWait(n.getDoubleValue()); });
        deserializerMap.put("count_star", (n) -> { this.setCountStar(n.getDoubleValue()); });
        deserializerMap.put("digest", (n) -> { this.setDigest(n.getStringValue()); });
        deserializerMap.put("digest_text", (n) -> { this.setDigestText(n.getStringValue()); });
        deserializerMap.put("first_seen", (n) -> { this.setFirstSeen(n.getStringValue()); });
        deserializerMap.put("last_seen", (n) -> { this.setLastSeen(n.getStringValue()); });
        deserializerMap.put("max_timer_wait", (n) -> { this.setMaxTimerWait(n.getDoubleValue()); });
        deserializerMap.put("min_timer_wait", (n) -> { this.setMinTimerWait(n.getDoubleValue()); });
        deserializerMap.put("quantile_95", (n) -> { this.setQuantile95(n.getDoubleValue()); });
        deserializerMap.put("quantile_99", (n) -> { this.setQuantile99(n.getDoubleValue()); });
        deserializerMap.put("quantile_999", (n) -> { this.setQuantile999(n.getDoubleValue()); });
        deserializerMap.put("query_sample_seen", (n) -> { this.setQuerySampleSeen(n.getStringValue()); });
        deserializerMap.put("query_sample_text", (n) -> { this.setQuerySampleText(n.getStringValue()); });
        deserializerMap.put("query_sample_timer_wait", (n) -> { this.setQuerySampleTimerWait(n.getStringValue()); });
        deserializerMap.put("schema_name", (n) -> { this.setSchemaName(n.getStringValue()); });
        deserializerMap.put("sum_created_tmp_disk_tables", (n) -> { this.setSumCreatedTmpDiskTables(n.getDoubleValue()); });
        deserializerMap.put("sum_created_tmp_tables", (n) -> { this.setSumCreatedTmpTables(n.getDoubleValue()); });
        deserializerMap.put("sum_errors", (n) -> { this.setSumErrors(n.getDoubleValue()); });
        deserializerMap.put("sum_lock_time", (n) -> { this.setSumLockTime(n.getDoubleValue()); });
        deserializerMap.put("sum_no_good_index_used", (n) -> { this.setSumNoGoodIndexUsed(n.getDoubleValue()); });
        deserializerMap.put("sum_no_index_used", (n) -> { this.setSumNoIndexUsed(n.getDoubleValue()); });
        deserializerMap.put("sum_rows_affected", (n) -> { this.setSumRowsAffected(n.getDoubleValue()); });
        deserializerMap.put("sum_rows_examined", (n) -> { this.setSumRowsExamined(n.getDoubleValue()); });
        deserializerMap.put("sum_rows_sent", (n) -> { this.setSumRowsSent(n.getDoubleValue()); });
        deserializerMap.put("sum_select_full_join", (n) -> { this.setSumSelectFullJoin(n.getDoubleValue()); });
        deserializerMap.put("sum_select_full_range_join", (n) -> { this.setSumSelectFullRangeJoin(n.getDoubleValue()); });
        deserializerMap.put("sum_select_range", (n) -> { this.setSumSelectRange(n.getDoubleValue()); });
        deserializerMap.put("sum_select_range_check", (n) -> { this.setSumSelectRangeCheck(n.getDoubleValue()); });
        deserializerMap.put("sum_select_scan", (n) -> { this.setSumSelectScan(n.getDoubleValue()); });
        deserializerMap.put("sum_sort_merge_passes", (n) -> { this.setSumSortMergePasses(n.getDoubleValue()); });
        deserializerMap.put("sum_sort_range", (n) -> { this.setSumSortRange(n.getDoubleValue()); });
        deserializerMap.put("sum_sort_rows", (n) -> { this.setSumSortRows(n.getDoubleValue()); });
        deserializerMap.put("sum_sort_scan", (n) -> { this.setSumSortScan(n.getDoubleValue()); });
        deserializerMap.put("sum_timer_wait", (n) -> { this.setSumTimerWait(n.getDoubleValue()); });
        deserializerMap.put("sum_warnings", (n) -> { this.setSumWarnings(n.getDoubleValue()); });
        return deserializerMap;
    }
    /**
     * Gets the first_seen property value. Query statistic
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getFirstSeen() {
        return this.firstSeen;
    }
    /**
     * Gets the last_seen property value. Query statistic
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getLastSeen() {
        return this.lastSeen;
    }
    /**
     * Gets the max_timer_wait property value. Query statistic
     * @return a Double
     */
    @jakarta.annotation.Nullable
    public Double getMaxTimerWait() {
        return this.maxTimerWait;
    }
    /**
     * Gets the min_timer_wait property value. Query statistic
     * @return a Double
     */
    @jakarta.annotation.Nullable
    public Double getMinTimerWait() {
        return this.minTimerWait;
    }
    /**
     * Gets the quantile_95 property value. Query statistic
     * @return a Double
     */
    @jakarta.annotation.Nullable
    public Double getQuantile95() {
        return this.quantile95;
    }
    /**
     * Gets the quantile_99 property value. Query statistic
     * @return a Double
     */
    @jakarta.annotation.Nullable
    public Double getQuantile99() {
        return this.quantile99;
    }
    /**
     * Gets the quantile_999 property value. Query statistic
     * @return a Double
     */
    @jakarta.annotation.Nullable
    public Double getQuantile999() {
        return this.quantile999;
    }
    /**
     * Gets the query_sample_seen property value. Query statistic
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getQuerySampleSeen() {
        return this.querySampleSeen;
    }
    /**
     * Gets the query_sample_text property value. Query statistic
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getQuerySampleText() {
        return this.querySampleText;
    }
    /**
     * Gets the query_sample_timer_wait property value. Query statistic
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getQuerySampleTimerWait() {
        return this.querySampleTimerWait;
    }
    /**
     * Gets the schema_name property value. Query statistic
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSchemaName() {
        return this.schemaName;
    }
    /**
     * Gets the sum_created_tmp_disk_tables property value. Query statistic
     * @return a Double
     */
    @jakarta.annotation.Nullable
    public Double getSumCreatedTmpDiskTables() {
        return this.sumCreatedTmpDiskTables;
    }
    /**
     * Gets the sum_created_tmp_tables property value. Query statistic
     * @return a Double
     */
    @jakarta.annotation.Nullable
    public Double getSumCreatedTmpTables() {
        return this.sumCreatedTmpTables;
    }
    /**
     * Gets the sum_errors property value. Query statistic
     * @return a Double
     */
    @jakarta.annotation.Nullable
    public Double getSumErrors() {
        return this.sumErrors;
    }
    /**
     * Gets the sum_lock_time property value. Query statistic
     * @return a Double
     */
    @jakarta.annotation.Nullable
    public Double getSumLockTime() {
        return this.sumLockTime;
    }
    /**
     * Gets the sum_no_good_index_used property value. Query statistic
     * @return a Double
     */
    @jakarta.annotation.Nullable
    public Double getSumNoGoodIndexUsed() {
        return this.sumNoGoodIndexUsed;
    }
    /**
     * Gets the sum_no_index_used property value. Query statistic
     * @return a Double
     */
    @jakarta.annotation.Nullable
    public Double getSumNoIndexUsed() {
        return this.sumNoIndexUsed;
    }
    /**
     * Gets the sum_rows_affected property value. Query statistic
     * @return a Double
     */
    @jakarta.annotation.Nullable
    public Double getSumRowsAffected() {
        return this.sumRowsAffected;
    }
    /**
     * Gets the sum_rows_examined property value. Query statistic
     * @return a Double
     */
    @jakarta.annotation.Nullable
    public Double getSumRowsExamined() {
        return this.sumRowsExamined;
    }
    /**
     * Gets the sum_rows_sent property value. Query statistic
     * @return a Double
     */
    @jakarta.annotation.Nullable
    public Double getSumRowsSent() {
        return this.sumRowsSent;
    }
    /**
     * Gets the sum_select_full_join property value. Query statistic
     * @return a Double
     */
    @jakarta.annotation.Nullable
    public Double getSumSelectFullJoin() {
        return this.sumSelectFullJoin;
    }
    /**
     * Gets the sum_select_full_range_join property value. Query statistic
     * @return a Double
     */
    @jakarta.annotation.Nullable
    public Double getSumSelectFullRangeJoin() {
        return this.sumSelectFullRangeJoin;
    }
    /**
     * Gets the sum_select_range property value. Query statistic
     * @return a Double
     */
    @jakarta.annotation.Nullable
    public Double getSumSelectRange() {
        return this.sumSelectRange;
    }
    /**
     * Gets the sum_select_range_check property value. Query statistic
     * @return a Double
     */
    @jakarta.annotation.Nullable
    public Double getSumSelectRangeCheck() {
        return this.sumSelectRangeCheck;
    }
    /**
     * Gets the sum_select_scan property value. Query statistic
     * @return a Double
     */
    @jakarta.annotation.Nullable
    public Double getSumSelectScan() {
        return this.sumSelectScan;
    }
    /**
     * Gets the sum_sort_merge_passes property value. Query statistic
     * @return a Double
     */
    @jakarta.annotation.Nullable
    public Double getSumSortMergePasses() {
        return this.sumSortMergePasses;
    }
    /**
     * Gets the sum_sort_range property value. Query statistic
     * @return a Double
     */
    @jakarta.annotation.Nullable
    public Double getSumSortRange() {
        return this.sumSortRange;
    }
    /**
     * Gets the sum_sort_rows property value. Query statistic
     * @return a Double
     */
    @jakarta.annotation.Nullable
    public Double getSumSortRows() {
        return this.sumSortRows;
    }
    /**
     * Gets the sum_sort_scan property value. Query statistic
     * @return a Double
     */
    @jakarta.annotation.Nullable
    public Double getSumSortScan() {
        return this.sumSortScan;
    }
    /**
     * Gets the sum_timer_wait property value. Query statistic
     * @return a Double
     */
    @jakarta.annotation.Nullable
    public Double getSumTimerWait() {
        return this.sumTimerWait;
    }
    /**
     * Gets the sum_warnings property value. Query statistic
     * @return a Double
     */
    @jakarta.annotation.Nullable
    public Double getSumWarnings() {
        return this.sumWarnings;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeDoubleValue("avg_timer_wait", this.getAvgTimerWait());
        writer.writeDoubleValue("count_star", this.getCountStar());
        writer.writeStringValue("digest", this.getDigest());
        writer.writeStringValue("digest_text", this.getDigestText());
        writer.writeStringValue("first_seen", this.getFirstSeen());
        writer.writeStringValue("last_seen", this.getLastSeen());
        writer.writeDoubleValue("max_timer_wait", this.getMaxTimerWait());
        writer.writeDoubleValue("min_timer_wait", this.getMinTimerWait());
        writer.writeDoubleValue("quantile_95", this.getQuantile95());
        writer.writeDoubleValue("quantile_99", this.getQuantile99());
        writer.writeDoubleValue("quantile_999", this.getQuantile999());
        writer.writeStringValue("query_sample_seen", this.getQuerySampleSeen());
        writer.writeStringValue("query_sample_text", this.getQuerySampleText());
        writer.writeStringValue("query_sample_timer_wait", this.getQuerySampleTimerWait());
        writer.writeStringValue("schema_name", this.getSchemaName());
        writer.writeDoubleValue("sum_created_tmp_disk_tables", this.getSumCreatedTmpDiskTables());
        writer.writeDoubleValue("sum_created_tmp_tables", this.getSumCreatedTmpTables());
        writer.writeDoubleValue("sum_errors", this.getSumErrors());
        writer.writeDoubleValue("sum_lock_time", this.getSumLockTime());
        writer.writeDoubleValue("sum_no_good_index_used", this.getSumNoGoodIndexUsed());
        writer.writeDoubleValue("sum_no_index_used", this.getSumNoIndexUsed());
        writer.writeDoubleValue("sum_rows_affected", this.getSumRowsAffected());
        writer.writeDoubleValue("sum_rows_examined", this.getSumRowsExamined());
        writer.writeDoubleValue("sum_rows_sent", this.getSumRowsSent());
        writer.writeDoubleValue("sum_select_full_join", this.getSumSelectFullJoin());
        writer.writeDoubleValue("sum_select_full_range_join", this.getSumSelectFullRangeJoin());
        writer.writeDoubleValue("sum_select_range", this.getSumSelectRange());
        writer.writeDoubleValue("sum_select_range_check", this.getSumSelectRangeCheck());
        writer.writeDoubleValue("sum_select_scan", this.getSumSelectScan());
        writer.writeDoubleValue("sum_sort_merge_passes", this.getSumSortMergePasses());
        writer.writeDoubleValue("sum_sort_range", this.getSumSortRange());
        writer.writeDoubleValue("sum_sort_rows", this.getSumSortRows());
        writer.writeDoubleValue("sum_sort_scan", this.getSumSortScan());
        writer.writeDoubleValue("sum_timer_wait", this.getSumTimerWait());
        writer.writeDoubleValue("sum_warnings", this.getSumWarnings());
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
     * Sets the avg_timer_wait property value. Query statistic
     * @param value Value to set for the avg_timer_wait property.
     */
    public void setAvgTimerWait(@jakarta.annotation.Nullable final Double value) {
        this.avgTimerWait = value;
    }
    /**
     * Sets the count_star property value. Query statistic
     * @param value Value to set for the count_star property.
     */
    public void setCountStar(@jakarta.annotation.Nullable final Double value) {
        this.countStar = value;
    }
    /**
     * Sets the digest property value. Query statistic
     * @param value Value to set for the digest property.
     */
    public void setDigest(@jakarta.annotation.Nullable final String value) {
        this.digest = value;
    }
    /**
     * Sets the digest_text property value. Query statistic
     * @param value Value to set for the digest_text property.
     */
    public void setDigestText(@jakarta.annotation.Nullable final String value) {
        this.digestText = value;
    }
    /**
     * Sets the first_seen property value. Query statistic
     * @param value Value to set for the first_seen property.
     */
    public void setFirstSeen(@jakarta.annotation.Nullable final String value) {
        this.firstSeen = value;
    }
    /**
     * Sets the last_seen property value. Query statistic
     * @param value Value to set for the last_seen property.
     */
    public void setLastSeen(@jakarta.annotation.Nullable final String value) {
        this.lastSeen = value;
    }
    /**
     * Sets the max_timer_wait property value. Query statistic
     * @param value Value to set for the max_timer_wait property.
     */
    public void setMaxTimerWait(@jakarta.annotation.Nullable final Double value) {
        this.maxTimerWait = value;
    }
    /**
     * Sets the min_timer_wait property value. Query statistic
     * @param value Value to set for the min_timer_wait property.
     */
    public void setMinTimerWait(@jakarta.annotation.Nullable final Double value) {
        this.minTimerWait = value;
    }
    /**
     * Sets the quantile_95 property value. Query statistic
     * @param value Value to set for the quantile_95 property.
     */
    public void setQuantile95(@jakarta.annotation.Nullable final Double value) {
        this.quantile95 = value;
    }
    /**
     * Sets the quantile_99 property value. Query statistic
     * @param value Value to set for the quantile_99 property.
     */
    public void setQuantile99(@jakarta.annotation.Nullable final Double value) {
        this.quantile99 = value;
    }
    /**
     * Sets the quantile_999 property value. Query statistic
     * @param value Value to set for the quantile_999 property.
     */
    public void setQuantile999(@jakarta.annotation.Nullable final Double value) {
        this.quantile999 = value;
    }
    /**
     * Sets the query_sample_seen property value. Query statistic
     * @param value Value to set for the query_sample_seen property.
     */
    public void setQuerySampleSeen(@jakarta.annotation.Nullable final String value) {
        this.querySampleSeen = value;
    }
    /**
     * Sets the query_sample_text property value. Query statistic
     * @param value Value to set for the query_sample_text property.
     */
    public void setQuerySampleText(@jakarta.annotation.Nullable final String value) {
        this.querySampleText = value;
    }
    /**
     * Sets the query_sample_timer_wait property value. Query statistic
     * @param value Value to set for the query_sample_timer_wait property.
     */
    public void setQuerySampleTimerWait(@jakarta.annotation.Nullable final String value) {
        this.querySampleTimerWait = value;
    }
    /**
     * Sets the schema_name property value. Query statistic
     * @param value Value to set for the schema_name property.
     */
    public void setSchemaName(@jakarta.annotation.Nullable final String value) {
        this.schemaName = value;
    }
    /**
     * Sets the sum_created_tmp_disk_tables property value. Query statistic
     * @param value Value to set for the sum_created_tmp_disk_tables property.
     */
    public void setSumCreatedTmpDiskTables(@jakarta.annotation.Nullable final Double value) {
        this.sumCreatedTmpDiskTables = value;
    }
    /**
     * Sets the sum_created_tmp_tables property value. Query statistic
     * @param value Value to set for the sum_created_tmp_tables property.
     */
    public void setSumCreatedTmpTables(@jakarta.annotation.Nullable final Double value) {
        this.sumCreatedTmpTables = value;
    }
    /**
     * Sets the sum_errors property value. Query statistic
     * @param value Value to set for the sum_errors property.
     */
    public void setSumErrors(@jakarta.annotation.Nullable final Double value) {
        this.sumErrors = value;
    }
    /**
     * Sets the sum_lock_time property value. Query statistic
     * @param value Value to set for the sum_lock_time property.
     */
    public void setSumLockTime(@jakarta.annotation.Nullable final Double value) {
        this.sumLockTime = value;
    }
    /**
     * Sets the sum_no_good_index_used property value. Query statistic
     * @param value Value to set for the sum_no_good_index_used property.
     */
    public void setSumNoGoodIndexUsed(@jakarta.annotation.Nullable final Double value) {
        this.sumNoGoodIndexUsed = value;
    }
    /**
     * Sets the sum_no_index_used property value. Query statistic
     * @param value Value to set for the sum_no_index_used property.
     */
    public void setSumNoIndexUsed(@jakarta.annotation.Nullable final Double value) {
        this.sumNoIndexUsed = value;
    }
    /**
     * Sets the sum_rows_affected property value. Query statistic
     * @param value Value to set for the sum_rows_affected property.
     */
    public void setSumRowsAffected(@jakarta.annotation.Nullable final Double value) {
        this.sumRowsAffected = value;
    }
    /**
     * Sets the sum_rows_examined property value. Query statistic
     * @param value Value to set for the sum_rows_examined property.
     */
    public void setSumRowsExamined(@jakarta.annotation.Nullable final Double value) {
        this.sumRowsExamined = value;
    }
    /**
     * Sets the sum_rows_sent property value. Query statistic
     * @param value Value to set for the sum_rows_sent property.
     */
    public void setSumRowsSent(@jakarta.annotation.Nullable final Double value) {
        this.sumRowsSent = value;
    }
    /**
     * Sets the sum_select_full_join property value. Query statistic
     * @param value Value to set for the sum_select_full_join property.
     */
    public void setSumSelectFullJoin(@jakarta.annotation.Nullable final Double value) {
        this.sumSelectFullJoin = value;
    }
    /**
     * Sets the sum_select_full_range_join property value. Query statistic
     * @param value Value to set for the sum_select_full_range_join property.
     */
    public void setSumSelectFullRangeJoin(@jakarta.annotation.Nullable final Double value) {
        this.sumSelectFullRangeJoin = value;
    }
    /**
     * Sets the sum_select_range property value. Query statistic
     * @param value Value to set for the sum_select_range property.
     */
    public void setSumSelectRange(@jakarta.annotation.Nullable final Double value) {
        this.sumSelectRange = value;
    }
    /**
     * Sets the sum_select_range_check property value. Query statistic
     * @param value Value to set for the sum_select_range_check property.
     */
    public void setSumSelectRangeCheck(@jakarta.annotation.Nullable final Double value) {
        this.sumSelectRangeCheck = value;
    }
    /**
     * Sets the sum_select_scan property value. Query statistic
     * @param value Value to set for the sum_select_scan property.
     */
    public void setSumSelectScan(@jakarta.annotation.Nullable final Double value) {
        this.sumSelectScan = value;
    }
    /**
     * Sets the sum_sort_merge_passes property value. Query statistic
     * @param value Value to set for the sum_sort_merge_passes property.
     */
    public void setSumSortMergePasses(@jakarta.annotation.Nullable final Double value) {
        this.sumSortMergePasses = value;
    }
    /**
     * Sets the sum_sort_range property value. Query statistic
     * @param value Value to set for the sum_sort_range property.
     */
    public void setSumSortRange(@jakarta.annotation.Nullable final Double value) {
        this.sumSortRange = value;
    }
    /**
     * Sets the sum_sort_rows property value. Query statistic
     * @param value Value to set for the sum_sort_rows property.
     */
    public void setSumSortRows(@jakarta.annotation.Nullable final Double value) {
        this.sumSortRows = value;
    }
    /**
     * Sets the sum_sort_scan property value. Query statistic
     * @param value Value to set for the sum_sort_scan property.
     */
    public void setSumSortScan(@jakarta.annotation.Nullable final Double value) {
        this.sumSortScan = value;
    }
    /**
     * Sets the sum_timer_wait property value. Query statistic
     * @param value Value to set for the sum_timer_wait property.
     */
    public void setSumTimerWait(@jakarta.annotation.Nullable final Double value) {
        this.sumTimerWait = value;
    }
    /**
     * Sets the sum_warnings property value. Query statistic
     * @param value Value to set for the sum_warnings property.
     */
    public void setSumWarnings(@jakarta.annotation.Nullable final Double value) {
        this.sumWarnings = value;
    }
}
