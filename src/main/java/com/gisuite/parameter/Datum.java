package com.gisuite.parameter;

/**
 * ISO 19111 기반의 Datum (기준).
 * 좌표 참조 시스템의 기준점 및 참조 프레임 정의.
 */
public class Datum {
    private final String name;
    private final Ellipsoid ellipsoid;
    private final PrimeMeridian primeMeridian;

    public Datum(String name, Ellipsoid ellipsoid, PrimeMeridian primeMeridian) {
        this.name = name;
        this.ellipsoid = ellipsoid;
        this.primeMeridian = primeMeridian;
    }

    public String getName() {
        return name;
    }

    public Ellipsoid getEllipsoid() {
        return ellipsoid;
    }

    public PrimeMeridian getPrimeMeridian() {
        return primeMeridian;
    }
}
