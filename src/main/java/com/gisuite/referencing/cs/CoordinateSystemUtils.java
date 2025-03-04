package com.gisuite.referencing.cs;

import org.opengis.referencing.cs.CoordinateSystem;

/**
 * CoordinateSystemUtils 클래스: 좌표 시스템 관련 유틸리티 메서드 제공
 */
class CoordinateSystemUtils {
    /**
     * 좌표 시스템의 축 수 가져오기
     * @param cs CoordinateSystem 객체
     * @return 좌표 시스템의 축 개수
     */
    public static int getAxisCount(CoordinateSystem cs) {
        return cs.getDimension();
    }
}

