package com.gisuite.referencing.crs;

import org.opengis.referencing.crs.CoordinateReferenceSystem;
import org.opengis.referencing.FactoryException;

import org.geotools.referencing.CRS;


public class CRSFactory {

    /**
     * EPSG 코드를 통해 좌표 참조 시스템 생성
     * @param epsgCode EPSG 코드 (예: "EPSG:4326")
     * @return 생성된 CoordinateReferenceSystem 객체
     * @throws FactoryException 팩토리 생성 오류
     */
    public CoordinateReferenceSystem createCRS(String epsgCode) throws FactoryException {
        return CRS.decode(epsgCode);
    }
}
