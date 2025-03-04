package com.gisuite.referencing.cs;

import org.opengis.referencing.FactoryException;
import org.opengis.referencing.cs.CartesianCS;

/**
 * CartesianCSProvider 클래스: 직교 좌표 시스템을 제공하는 클래스
 */
class CartesianCSProvider {
    /**
     * 기본 직교 좌표 시스템 (예: 평면 지도 투영 시스템) 반환
     * @return CartesianCS 객체
     * @throws FactoryException 팩토리 생성 오류
     */
    public static CartesianCS getDefaultCartesianCS() throws FactoryException {
        CSFactory factory = new CSFactory();
        return factory.createCartesianCS("Default Cartesian CS");
    }
}