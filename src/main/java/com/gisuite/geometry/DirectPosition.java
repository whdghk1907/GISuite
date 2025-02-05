package com.gisuite.geometry;

import java.util.Arrays;

/**
 * ISO 19107 기반의 좌표 위치 클래스.
 */
public class DirectPosition implements Position {
    private final double[] coordinates;

    public DirectPosition(double... coordinates) {
        this.coordinates = coordinates.clone();
    }

    @Override
    public DirectPosition getDirectPosition() {
        return this;
    }

    public double[] getCoordinates() {
        return coordinates.clone();
    }

    @Override
    public String toString() {
        return "DirectPosition" + Arrays.toString(coordinates);
    }
}
