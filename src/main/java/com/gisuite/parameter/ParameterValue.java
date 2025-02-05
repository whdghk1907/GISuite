package com.gisuite.parameter;

/**
 * ISO 19111 기반의 변환 연산 개별 파라미터.
 */
public class ParameterValue {
    private final String name;
    private final double value;

    public ParameterValue(String name, double value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public double getValue() {
        return value;
    }
}
