package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Sorting criteria; desc is descending order and asc ascending
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum AccountUsersSearchRequestBodyOrderBy implements ValuedEnum {
    User_emailAsc("user_email:asc"),
    User_emailDesc("user_email:desc"),
    User_idAsc("user_id:asc"),
    User_idDesc("user_id:desc"),
    Real_nameAsc("real_name:asc"),
    Real_nameDesc("real_name:desc");
    public final String value;
    AccountUsersSearchRequestBodyOrderBy(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AccountUsersSearchRequestBodyOrderBy forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "user_email:asc": return User_emailAsc;
            case "user_email:desc": return User_emailDesc;
            case "user_id:asc": return User_idAsc;
            case "user_id:desc": return User_idDesc;
            case "real_name:asc": return Real_nameAsc;
            case "real_name:desc": return Real_nameDesc;
            default: return null;
        }
    }
}
