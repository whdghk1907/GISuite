package com.gisuite.referencing;

/**
 * ISO 19111 기반의 좌표 시스템 (Coordinate System).
 * 특정 차원과 축을 정의하는 역할.
 */
public class CoordinateSystem {
    private final int dimension;
    private final String[] axisNames;

    public CoordinateSystem(int dimension, String... axisNames) {
        if (axisNames.length != dimension) {
            throw new IllegalArgumentException("축 개수와 차원이 일치해야 합니다.");
        }
        this.dimension = dimension;
        this.axisNames = axisNames.clone();
    }

    public int getDimension() {
        return dimension;
    }

    public String[] getAxisNames() {
        return axisNames.clone();
    }
}
