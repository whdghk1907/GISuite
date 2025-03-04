package com.gisuite.referencing.crs;

import org.opengis.referencing.crs.CoordinateReferenceSystem;
import org.opengis.referencing.FactoryException;

import org.geotools.referencing.CRS;

class WGS84CRSProvider {
    /**
     * WGS 84 좌표 참조 시스템을 반환하는 메서드
     * @return WGS 84 CoordinateReferenceSystem 객체
     * @throws FactoryException 팩토리 생성 오류
     */
    public static CoordinateReferenceSystem getWGS84CRS() throws FactoryException {
        return CRS.decode("EPSG:4326");
    }
}
