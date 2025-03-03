package com.gisuite.util;

import org.opengis.util.CodeList;

import java.util.ArrayList;
import java.util.List;

/**
 * ISO 19103에서 정의된 열거형 타입을 Java Enum으로 매핑.
 */
public enum EnumeratedTypes {
    TRUE, FALSE, UNKNOWN;

    public static EnumeratedTypes fromBoolean(Boolean value) {
        if (value == null) return UNKNOWN;
        return value ? TRUE : FALSE;
    }

    public static class StatusCode extends CodeList<StatusCode> {
        private static final long serialVersionUID = 1L;
        private static final List<StatusCode> VALUES = new ArrayList<>();

        public static final StatusCode ACTIVE = new StatusCode("ACTIVE");
        public static final StatusCode INACTIVE = new StatusCode("INACTIVE");

        protected StatusCode(String name) {
            super(name, VALUES);
        }

        public static StatusCode[] values() {
            return VALUES.toArray(new StatusCode[0]);
        }

        @Override
        public StatusCode[] family() {
            return values();
        }
    }
}
