package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Target version used with upgrade_check */
public enum ServiceTaskCreateRequestBodyTargetVersion implements ValuedEnum {
    OneTwo("12"),
    OneThree("13"),
    OneFour("14"),
    OneFive("15");
    public final String value;
    ServiceTaskCreateRequestBodyTargetVersion(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static ServiceTaskCreateRequestBodyTargetVersion forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "12": return OneTwo;
            case "13": return OneThree;
            case "14": return OneFour;
            case "15": return OneFive;
            default: return null;
        }
    }
}
