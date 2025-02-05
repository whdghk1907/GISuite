package com.gisuite.referencing;

/**
 * ISO 19111 기반의 타원체 (Ellipsoid).
 * 지구의 형상을 근사적으로 표현하는 모델.
 */
public class Ellipsoid {
    private final String name;
    private final double semiMajorAxis;
    private final double semiMinorAxis;
    private final double inverseFlattening;

    public Ellipsoid(String name, double semiMajorAxis, double semiMinorAxis) {
        this.name = name;
        this.semiMajorAxis = semiMajorAxis;
        this.semiMinorAxis = semiMinorAxis;
        this.inverseFlattening = semiMajorAxis / (semiMajorAxis - semiMinorAxis);
    }

    public String getName() {
        return name;
    }

    public double getSemiMajorAxis() {
        return semiMajorAxis;
    }

    public double getSemiMinorAxis() {
        return semiMinorAxis;
    }

    public double getInverseFlattening() {
        return inverseFlattening;
    }
}
