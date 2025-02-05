package com.gisuite.parameter;

import java.util.Arrays;

/**
 * ISO 19111 기반의 수학적 변환 연산 (MathTransform).
 * 좌표 변환을 수행하는 수학적 연산을 정의하는 인터페이스.
 */
public interface MathTransform {

    /**
     * 단일 좌표를 변환.
     *
     * @param source 좌표 변환 전의 원본 값
     * @return 변환된 좌표 값
     */
    double[] transform(double[] source);

    /**
     * 여러 개의 좌표를 변환.
     *
     * @param sourceArray 변환할 원본 좌표 배열
     * @return 변환된 좌표 배열
     */
    default double[][] transform(double[][] sourceArray) {
        return Arrays.stream(sourceArray)
                .map(this::transform)
                .toArray(double[][]::new);
    }
}
