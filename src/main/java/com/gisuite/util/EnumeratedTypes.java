package com.gisuite.util;

/**
 * ISO 19103에서 정의된 열거형 타입을 Java Enum으로 매핑.
 */
public enum EnumeratedTypes {
    TRUE, FALSE, UNKNOWN;

    public static EnumeratedTypes fromBoolean(Boolean value) {
        if (value == null) return UNKNOWN;
        return value ? TRUE : FALSE;
    }
}
