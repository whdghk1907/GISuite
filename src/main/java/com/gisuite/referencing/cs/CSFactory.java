package com.gisuite.referencing.cs;

import org.opengis.referencing.cs.CartesianCS;
import org.opengis.referencing.cs.CoordinateSystemAxis;
import org.opengis.referencing.FactoryException;
import org.opengis.referencing.cs.AxisDirection;
import javax.measure.Unit;
import si.uom.SI;

/**
 * CSFactory 클래스: 좌표 시스템 (Coordinate System) 객체를 생성하는 팩토리 클래스
 */
public class CSFactory {

    /**
     * 직교 좌표 시스템 (Cartesian Coordinate System) 생성
     * @param name 좌표 시스템의 이름
     * @return 생성된 CartesianCS 객체
     * @throws FactoryException 팩토리 생성 오류
     */
    public CartesianCS createCartesianCS(String name) throws FactoryException {
        CoordinateSystemAxis xAxis = createAxis("Easting", AxisDirection.EAST, SI.METRE);
        CoordinateSystemAxis yAxis = createAxis("Northing", AxisDirection.NORTH, SI.METRE);
        return new org.geotools.referencing.cs.DefaultCartesianCS(name, xAxis, yAxis);
    }

    /**
     * 좌표 시스템 축 생성 메서드
     * @param name 축의 이름
     * @param direction 축의 방향
     * @param unit 단위 (예: 미터)
     * @return 생성된 CoordinateSystemAxis 객체
     */
    private CoordinateSystemAxis createAxis(String name, AxisDirection direction, Unit<?> unit) {
        return new org.geotools.referencing.cs.DefaultCoordinateSystemAxis(name, direction, unit);
    }
}
