package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Offset syncs topic location
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ServiceKafkaMirrorMakerPatchReplicationFlowRequestBodyOffsetSyncsTopicLocation implements ValuedEnum {
    Source("source"),
    Target("target");
    public final String value;
    ServiceKafkaMirrorMakerPatchReplicationFlowRequestBodyOffsetSyncsTopicLocation(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ServiceKafkaMirrorMakerPatchReplicationFlowRequestBodyOffsetSyncsTopicLocation forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "source": return Source;
            case "target": return Target;
            default: return null;
        }
    }
}
