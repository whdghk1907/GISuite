package com.gisuite.parameter;

/**
 * ISO 19111 기반의 좌표 변환 연산.
 */
public class CoordinateOperation {
    private final ParameterValueGroup parameterGroup;

    public CoordinateOperation(ParameterValueGroup parameterGroup) {
        this.parameterGroup = parameterGroup;
    }

    public ParameterValueGroup getParameterGroup() {
        return parameterGroup;
    }
}
