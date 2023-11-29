package com.jeffmaury.aiven.intellij.api.account.item.teams;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** team_names_must_be_unique: Team with the same name already exists */
public enum MachineProcessableErrorCodeClientsMustBePreparedToHandleNewCodes implements ValuedEnum {
    Team_names_must_be_unique("team_names_must_be_unique");
    public final String value;
    MachineProcessableErrorCodeClientsMustBePreparedToHandleNewCodes(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static MachineProcessableErrorCodeClientsMustBePreparedToHandleNewCodes forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "team_names_must_be_unique": return Team_names_must_be_unique;
            default: return null;
        }
    }
}
