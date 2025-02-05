package com.gisuite.parameter;

import java.util.ArrayList;
import java.util.List;

/**
 * ISO 19111 기반의 변환 연산 파라미터 그룹.
 */
public class ParameterValueGroup {
    private final String groupName;
    private final List<ParameterValue> parameters;

    public ParameterValueGroup(String groupName) {
        this.groupName = groupName;
        this.parameters = new ArrayList<>();
    }

    public void addParameter(ParameterValue parameter) {
        parameters.add(parameter);
    }

    public List<ParameterValue> getParameters() {
        return parameters;
    }
}
