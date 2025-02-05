package com.gisuite.util;

import java.math.BigDecimal;
import java.util.Date;

/**
 * ISO 19103에서 정의된 기본 타입을 Java의 기존 타입으로 매핑.
 */
public class PrimitiveTypes {
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

    public static Boolean asBoolean(boolean value) {
        return value;
    }

    public static Date asDate(long timestamp) {
        return new Date(timestamp);
    }
}
