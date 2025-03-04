package com.gisuite.referencing.operation;

import org.geotools.referencing.operation.transform.AffineTransform2D;
import org.opengis.referencing.operation.MathTransform;

import java.awt.geom.AffineTransform;

/**
 * AffineTransformationProvider 클래스: 선형 변환(Affine Transformation)을 제공하는 클래스
 */
public class AffineTransformationProvider {

    /**
     * 기본 선형 변환(이동 및 스케일링) 반환
     * @return MathTransform 객체
     */
    public static MathTransform getDefaultAffineTransform() {
        double[] matrix = {1, 0, 0, 0, 1, 0};
        return new AffineTransform2D(new AffineTransform(matrix));
    }
}
