package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Mechanism how backups can be restored. 'basic' means a backup is restored as is so that the system is restored to the state it was when the backup was generated. 'pitr' means point-in-time-recovery, which allows restoring the system to any state since the first available full snapshot. */
public enum ListProjectServiceTypesResponseServiceTypesANYServicePlansBackupConfigRecoveryMode implements ValuedEnum {
    Basic("basic"),
    Pitr("pitr");
    public final String value;
    ListProjectServiceTypesResponseServiceTypesANYServicePlansBackupConfigRecoveryMode(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static ListProjectServiceTypesResponseServiceTypesANYServicePlansBackupConfigRecoveryMode forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "basic": return Basic;
            case "pitr": return Pitr;
            default: return null;
        }
    }
}
