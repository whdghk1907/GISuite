package com.gisuite.referencing.operation;


import org.geotools.referencing.operation.transform.AffineTransform2D;
import org.opengis.referencing.operation.MathTransform;

import java.awt.geom.AffineTransform;

/**
 * MathTransformFactory 클래스: 수학적 변환(Math Transform) 객체를 생성하는 팩토리 클래스
 */
public class MathTransformFactory {

    /**
     * 2D 선형 변환(Affine Transform) 생성
     * @param matrix 3x3 변환 행렬
     * @return 생성된 MathTransform 객체
     */
    public MathTransform createAffineTransform(double[] matrix) {
        AffineTransform transform = new AffineTransform(matrix);
        return new AffineTransform2D(transform);
    }
}
