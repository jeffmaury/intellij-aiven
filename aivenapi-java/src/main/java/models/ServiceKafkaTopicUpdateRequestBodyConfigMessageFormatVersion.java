package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** message.format.version */
public enum ServiceKafkaTopicUpdateRequestBodyConfigMessageFormatVersion implements ValuedEnum {
    ZeroEightZero("0.8.0"),
    ZeroEightOne("0.8.1"),
    ZeroEightTwo("0.8.2"),
    ZeroNineZero("0.9.0"),
    ZeroOneZeroZero("0.10.0"),
    ZeroOneZeroZeroIV0("0.10.0-IV0"),
    ZeroOneZeroZeroIV1("0.10.0-IV1"),
    ZeroOneZeroOne("0.10.1"),
    ZeroOneZeroOneIV0("0.10.1-IV0"),
    ZeroOneZeroOneIV1("0.10.1-IV1"),
    ZeroOneZeroOneIV2("0.10.1-IV2"),
    ZeroOneZeroTwo("0.10.2"),
    ZeroOneZeroTwoIV0("0.10.2-IV0"),
    ZeroOneOneZero("0.11.0"),
    ZeroOneOneZeroIV0("0.11.0-IV0"),
    ZeroOneOneZeroIV1("0.11.0-IV1"),
    ZeroOneOneZeroIV2("0.11.0-IV2"),
    OneZero("1.0"),
    OneZeroIV0("1.0-IV0"),
    OneOne("1.1"),
    OneOneIV0("1.1-IV0"),
    TwoZero("2.0"),
    TwoZeroIV0("2.0-IV0"),
    TwoZeroIV1("2.0-IV1"),
    TwoOne("2.1"),
    TwoOneIV0("2.1-IV0"),
    TwoOneIV1("2.1-IV1"),
    TwoOneIV2("2.1-IV2"),
    TwoTwo("2.2"),
    TwoTwoIV0("2.2-IV0"),
    TwoTwoIV1("2.2-IV1"),
    TwoThree("2.3"),
    TwoThreeIV0("2.3-IV0"),
    TwoThreeIV1("2.3-IV1"),
    TwoFour("2.4"),
    TwoFourIV0("2.4-IV0"),
    TwoFourIV1("2.4-IV1"),
    TwoFive("2.5"),
    TwoFiveIV0("2.5-IV0"),
    TwoSix("2.6"),
    TwoSixIV0("2.6-IV0"),
    TwoSeven("2.7"),
    TwoSevenIV0("2.7-IV0"),
    TwoSevenIV1("2.7-IV1"),
    TwoSevenIV2("2.7-IV2"),
    TwoEight("2.8"),
    TwoEightIV0("2.8-IV0"),
    TwoEightIV1("2.8-IV1"),
    ThreeZero("3.0"),
    ThreeZeroIV0("3.0-IV0"),
    ThreeZeroIV1("3.0-IV1"),
    ThreeOne("3.1"),
    ThreeOneIV0("3.1-IV0"),
    ThreeTwo("3.2"),
    ThreeTwoIV0("3.2-IV0"),
    ThreeThree("3.3"),
    ThreeThreeIV0("3.3-IV0"),
    ThreeThreeIV1("3.3-IV1"),
    ThreeThreeIV2("3.3-IV2"),
    ThreeThreeIV3("3.3-IV3"),
    ThreeFour("3.4"),
    ThreeFourIV0("3.4-IV0"),
    ThreeFive("3.5"),
    ThreeFiveIV0("3.5-IV0"),
    ThreeFiveIV1("3.5-IV1"),
    ThreeFiveIV2("3.5-IV2"),
    ThreeSix("3.6"),
    ThreeSixIV0("3.6-IV0"),
    ThreeSixIV1("3.6-IV1"),
    ThreeSixIV2("3.6-IV2");
    public final String value;
    ServiceKafkaTopicUpdateRequestBodyConfigMessageFormatVersion(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static ServiceKafkaTopicUpdateRequestBodyConfigMessageFormatVersion forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "0.8.0": return ZeroEightZero;
            case "0.8.1": return ZeroEightOne;
            case "0.8.2": return ZeroEightTwo;
            case "0.9.0": return ZeroNineZero;
            case "0.10.0": return ZeroOneZeroZero;
            case "0.10.0-IV0": return ZeroOneZeroZeroIV0;
            case "0.10.0-IV1": return ZeroOneZeroZeroIV1;
            case "0.10.1": return ZeroOneZeroOne;
            case "0.10.1-IV0": return ZeroOneZeroOneIV0;
            case "0.10.1-IV1": return ZeroOneZeroOneIV1;
            case "0.10.1-IV2": return ZeroOneZeroOneIV2;
            case "0.10.2": return ZeroOneZeroTwo;
            case "0.10.2-IV0": return ZeroOneZeroTwoIV0;
            case "0.11.0": return ZeroOneOneZero;
            case "0.11.0-IV0": return ZeroOneOneZeroIV0;
            case "0.11.0-IV1": return ZeroOneOneZeroIV1;
            case "0.11.0-IV2": return ZeroOneOneZeroIV2;
            case "1.0": return OneZero;
            case "1.0-IV0": return OneZeroIV0;
            case "1.1": return OneOne;
            case "1.1-IV0": return OneOneIV0;
            case "2.0": return TwoZero;
            case "2.0-IV0": return TwoZeroIV0;
            case "2.0-IV1": return TwoZeroIV1;
            case "2.1": return TwoOne;
            case "2.1-IV0": return TwoOneIV0;
            case "2.1-IV1": return TwoOneIV1;
            case "2.1-IV2": return TwoOneIV2;
            case "2.2": return TwoTwo;
            case "2.2-IV0": return TwoTwoIV0;
            case "2.2-IV1": return TwoTwoIV1;
            case "2.3": return TwoThree;
            case "2.3-IV0": return TwoThreeIV0;
            case "2.3-IV1": return TwoThreeIV1;
            case "2.4": return TwoFour;
            case "2.4-IV0": return TwoFourIV0;
            case "2.4-IV1": return TwoFourIV1;
            case "2.5": return TwoFive;
            case "2.5-IV0": return TwoFiveIV0;
            case "2.6": return TwoSix;
            case "2.6-IV0": return TwoSixIV0;
            case "2.7": return TwoSeven;
            case "2.7-IV0": return TwoSevenIV0;
            case "2.7-IV1": return TwoSevenIV1;
            case "2.7-IV2": return TwoSevenIV2;
            case "2.8": return TwoEight;
            case "2.8-IV0": return TwoEightIV0;
            case "2.8-IV1": return TwoEightIV1;
            case "3.0": return ThreeZero;
            case "3.0-IV0": return ThreeZeroIV0;
            case "3.0-IV1": return ThreeZeroIV1;
            case "3.1": return ThreeOne;
            case "3.1-IV0": return ThreeOneIV0;
            case "3.2": return ThreeTwo;
            case "3.2-IV0": return ThreeTwoIV0;
            case "3.3": return ThreeThree;
            case "3.3-IV0": return ThreeThreeIV0;
            case "3.3-IV1": return ThreeThreeIV1;
            case "3.3-IV2": return ThreeThreeIV2;
            case "3.3-IV3": return ThreeThreeIV3;
            case "3.4": return ThreeFour;
            case "3.4-IV0": return ThreeFourIV0;
            case "3.5": return ThreeFive;
            case "3.5-IV0": return ThreeFiveIV0;
            case "3.5-IV1": return ThreeFiveIV1;
            case "3.5-IV2": return ThreeFiveIV2;
            case "3.6": return ThreeSix;
            case "3.6-IV0": return ThreeSixIV0;
            case "3.6-IV1": return ThreeSixIV1;
            case "3.6-IV2": return ThreeSixIV2;
            default: return null;
        }
    }
}
