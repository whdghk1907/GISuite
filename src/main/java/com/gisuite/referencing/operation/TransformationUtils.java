package com.gisuite.referencing.operation;

import org.opengis.referencing.operation.MathTransform;

/**
 * TransformationUtils 클래스: 좌표 변환 관련 유틸리티 메서드 제공
 */
public class TransformationUtils {

    /**
     * 두 좌표 사이의 변환을 수행
     * @param transform MathTransform 객체
     * @param coordinates 변환할 좌표 배열 [x, y]
     * @return 변환된 좌표 배열
     * @throws Exception 변환 중 오류
     */
    public static double[] transformCoordinates(MathTransform transform, double[] coordinates) throws Exception {
        double[] result = new double[2];
        transform.transform(coordinates, 0, result, 0, 1);
        return result;
    }
}