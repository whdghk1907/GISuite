package com.gisuite.referencing.operation;

import org.opengis.referencing.operation.MathTransform;
import org.opengis.referencing.FactoryException;
import org.opengis.referencing.crs.CoordinateReferenceSystem;
import org.geotools.referencing.CRS;

/**
 * CoordinateOperationFactory 클래스: 좌표 변환(Coordinate Operation) 객체를 생성하는 팩토리 클래스
 */
public class CoordinateOperationFactory {

    /**
     * 두 좌표 참조 시스템 간의 변환(MathTransform) 생성
     * @param sourceCRS 원본 좌표 참조 시스템
     * @param targetCRS 대상 좌표 참조 시스템
     * @return 생성된 MathTransform 객체
     * @throws FactoryException 팩토리 생성 오류
     */
    public MathTransform createCoordinateOperation(CoordinateReferenceSystem sourceCRS, CoordinateReferenceSystem targetCRS) throws FactoryException {
        return CRS.findMathTransform(sourceCRS, targetCRS, true);
    }
}


