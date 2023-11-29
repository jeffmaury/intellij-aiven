package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Operation to be performed on the group
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum UserGroupMembersUpdateRequestBodyOperation implements ValuedEnum {
    Add_members("add_members"),
    Remove_members("remove_members");
    public final String value;
    UserGroupMembersUpdateRequestBodyOperation(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static UserGroupMembersUpdateRequestBodyOperation forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "add_members": return Add_members;
            case "remove_members": return Remove_members;
            default: return null;
        }
    }
}
