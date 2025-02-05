package com.gisuite.geometry;

/**
 * ISO 19107 기반의 차원 불일치 예외.
 * 좌표 차원이 일치하지 않을 때 발생하는 예외.
 */
public class MismatchedDimensionException extends RuntimeException {
    public MismatchedDimensionException(String message) {
        super(message);
    }
}
