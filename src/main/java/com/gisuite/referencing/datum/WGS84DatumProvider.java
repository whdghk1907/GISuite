package com.gisuite.referencing.datum;

import org.opengis.referencing.FactoryException;
import org.opengis.referencing.datum.GeodeticDatum;

/**
 * WGS84DatumProvider 클래스: WGS 84 Datum을 제공하는 클래스
 */
class WGS84DatumProvider {
    /**
     * WGS 84 Datum 객체를 반환하는 메서드
     * @return WGS 84 GeodeticDatum 객체
     * @throws FactoryException 팩토리 생성 오류
     */
    public static GeodeticDatum getWGS84Datum() throws FactoryException {
        DatumFactory factory = new DatumFactory();
        return factory.createGeodeticDatum("WGS 84");
    }
}
