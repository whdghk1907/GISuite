package com.gisuite.referencing.datum;

import org.opengis.referencing.datum.Datum;

/**
 * DatumUtils 클래스: Datum 관련 유틸리티 메서드 제공
 */
class DatumUtils {
    /**
     * Datum의 이름을 가져오는 메서드
     * @param datum Datum 객체
     * @return Datum의 이름 (문자열)
     */
    public static String getDatumName(Datum datum) {
        return datum.getName().getCode();
    }
}