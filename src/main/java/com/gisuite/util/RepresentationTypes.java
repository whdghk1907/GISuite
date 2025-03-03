package com.gisuite.util;

import org.opengis.util.TypeName;
import org.opengis.util.Record;
import org.opengis.util.RecordSchema;
import org.opengis.util.RecordType;

/**
 * ISO 19103에서 정의된 표현 타입을 GeoAPI 표준에 맞게 구현.
 */
public class RepresentationTypes {
    // Any 타입을 처리하기 위한 Object 반환 메서드
    public static Object asAny(Object value) {
        return value;
    }

    // GeoAPI Type 반환 메서드
    public static TypeName asType(TypeName value) {
        return value;
    }

    // GeoAPI RecordSchema 반환 메서드
    public static RecordSchema asRecordSchema(RecordSchema schema) {
        return schema;
    }

    // GeoAPI RecordType 반환 메서드
    public static RecordType asRecordType(RecordType type) {
        return type;
    }

    // GeoAPI Record 반환 메서드
    public static Record asRecord(Record record) {
        return record;
    }
}
