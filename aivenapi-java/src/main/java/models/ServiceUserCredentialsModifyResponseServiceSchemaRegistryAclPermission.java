package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** ACL entry for Schema Registry */
public enum ServiceUserCredentialsModifyResponseServiceSchemaRegistryAclPermission implements ValuedEnum {
    Schema_registry_read("schema_registry_read"),
    Schema_registry_write("schema_registry_write");
    public final String value;
    ServiceUserCredentialsModifyResponseServiceSchemaRegistryAclPermission(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static ServiceUserCredentialsModifyResponseServiceSchemaRegistryAclPermission forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "schema_registry_read": return Schema_registry_read;
            case "schema_registry_write": return Schema_registry_write;
            default: return null;
        }
    }
}
