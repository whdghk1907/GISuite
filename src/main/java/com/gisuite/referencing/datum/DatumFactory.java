package com.gisuite.referencing.datum;

import org.opengis.referencing.datum.Datum;
import org.opengis.referencing.datum.GeodeticDatum;
import org.opengis.referencing.FactoryException;
import org.opengis.referencing.datum.Ellipsoid;
import org.opengis.referencing.datum.PrimeMeridian;

import org.geotools.referencing.datum.DefaultEllipsoid;
import org.geotools.referencing.datum.DefaultGeodeticDatum;
import org.geotools.referencing.datum.DefaultPrimeMeridian;

/**
 * DatumFactory 클래스: Datum (측지 기준) 객체를 생성하는 팩토리 클래스
 */
public class DatumFactory {

    /**
     * WGS 84 기준의 GeodeticDatum 생성
     * @param name Datum의 이름 (예: "WGS 84")
     * @return 생성된 GeodeticDatum 객체
     * @throws FactoryException 팩토리 생성 오류
     */
    public GeodeticDatum createGeodeticDatum(String name) throws FactoryException {
        Ellipsoid ellipsoid = DefaultEllipsoid.WGS84;
        PrimeMeridian primeMeridian = DefaultPrimeMeridian.GREENWICH;
        return new DefaultGeodeticDatum(name, ellipsoid, primeMeridian);
    }
}

