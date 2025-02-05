package com.gisuite.parameter;

/**
 * 간단한 이동 변환 (좌표 평행 이동).
 */
public class TranslateTransform implements MathTransform {
    private final double offsetX;
    private final double offsetY;

    public TranslateTransform(double offsetX, double offsetY) {
        this.offsetX = offsetX;
        this.offsetY = offsetY;
    }

    @Override
    public double[] transform(double[] source) {
        if (source.length < 2) {
            throw new IllegalArgumentException("2D 변환을 위해 최소 2개의 좌표가 필요합니다.");
        }
        return new double[]{source[0] + offsetX, source[1] + offsetY};
    }
}
