package com.gisuite.util;

import java.math.BigDecimal;
import java.util.Date;
import org.opengis.util.InternationalString;
import org.opengis.metadata.identification.CharacterSet;

/**
 * ISO 19103에서 정의된 기본 타입을 Java의 기존 타입으로 매핑.
 */
public class PrimitiveTypes {
    // Numeric Types
    public static Integer asInteger(int value) {
        return value;
    }

    public static Long asLong(long value) {
        return value;
    }

    public static Double asDouble(double value) {
        return value;
    }

    public static BigDecimal asDecimal(double value) {
        return BigDecimal.valueOf(value);
    }

    // Truth Type
    public static Boolean asBoolean(boolean value) {
        return value;
    }

    // Date and Time Types
    public static Date asDate(long timestamp) {
        return new Date(timestamp);
    }

    // Text Types
    public static String asCharacterString(String value) {
        return value;
    }

    public static InternationalString asInternationalString(InternationalString value) {
        return value;
    }

    public static CharacterSet asCharacterSet(CharacterSet value) {
        return value;
    }
}
