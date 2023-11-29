package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Unit for current/min/max values. New units may be added. If null should be treated as generic unit */
public enum ServiceUpdateResponseServiceNodeStatesProgressUpdatesUnit implements ValuedEnum {
    Binlogs("binlogs"),
    Bytes_compressed("bytes_compressed"),
    Bytes_uncompressed("bytes_uncompressed"),
    Wal_lsn("wal_lsn");
    public final String value;
    ServiceUpdateResponseServiceNodeStatesProgressUpdatesUnit(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static ServiceUpdateResponseServiceNodeStatesProgressUpdatesUnit forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "binlogs": return Binlogs;
            case "bytes_compressed": return Bytes_compressed;
            case "bytes_uncompressed": return Bytes_uncompressed;
            case "wal_lsn": return Wal_lsn;
            default: return null;
        }
    }
}
