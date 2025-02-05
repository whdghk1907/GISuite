package com.gisuite.referencing;

/**
 * ISO 19111 기반의 본초 자오선 (Prime Meridian).
 * 경도의 기준점을 정의.
 */
public class PrimeMeridian {
    private final String name;
    private final double longitude;

    public PrimeMeridian(String name, double longitude) {
        this.name = name;
        this.longitude = longitude;
    }

    public String getName() {
        return name;
    }

    public double getLongitude() {
        return longitude;
    }
}
