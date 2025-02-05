package com.gisuite.parameter;

/**
 * 간단한 스케일 변환 (배율 조정).
 */
public class ScaleTransform implements MathTransform {
    private final double scaleFactor;

    public ScaleTransform(double scaleFactor) {
        this.scaleFactor = scaleFactor;
    }

    @Override
    public double[] transform(double[] source) {
        double[] result = new double[source.length];
        for (int i = 0; i < source.length; i++) {
            result[i] = source[i] * scaleFactor;
        }
        return result;
    }
}
