package com.gisuite.referencing.factory;

import org.opengis.referencing.crs.CoordinateReferenceSystem;
import org.opengis.referencing.FactoryException;
import org.geotools.referencing.CRS;

/**
 * EPSGFactoryProvider 클래스: EPSG AuthorityFactory 제공
 */
public class EPSGFactoryProvider {

    /**
     * EPSG 코드를 통해 좌표 참조 시스템을 가져오는 메서드
     * @param epsgCode EPSG 코드 (예: "EPSG:4326")
     * @return CoordinateReferenceSystem 객체
     * @throws FactoryException 팩토리 생성 오류
     */
    public static CoordinateReferenceSystem getCRSByEPSG(String epsgCode) throws FactoryException {
        return CRS.decode(epsgCode, true);
    }
}
