package com.gisuite.referencing;

/**
 * ISO 19111 기반의 좌표 참조 시스템 (CRS).
 * 좌표 데이터를 특정 참조 시스템으로 정의하는 역할을 수행.
 */
public class CoordinateReferenceSystem {
    private final String name;
    private final CoordinateSystem coordinateSystem;
    private final Datum datum;

    public CoordinateReferenceSystem(String name, CoordinateSystem coordinateSystem, Datum datum) {
        this.name = name;
        this.coordinateSystem = coordinateSystem;
        this.datum = datum;
    }

    public String getName() {
        return name;
    }

    public CoordinateSystem getCoordinateSystem() {
        return coordinateSystem;
    }

    public Datum getDatum() {
        return datum;
    }
}
