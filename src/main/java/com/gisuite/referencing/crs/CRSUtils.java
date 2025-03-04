package com.gisuite.referencing.crs;

import org.opengis.referencing.crs.CoordinateReferenceSystem;

class CRSUtils {
    /**
     * 좌표 참조 시스템의 이름을 가져오는 메서드
     * @param crs CoordinateReferenceSystem 객체
     * @return CRS의 이름 (문자열)
     */
    public static String getCRSName(CoordinateReferenceSystem crs) {
        return crs.getName() != null ? crs.getName().getCode() : "Unknown CRS";
    }
}
