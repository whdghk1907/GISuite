package com.gisuite.parameter;

import java.util.HashMap;
import java.util.Map;

/**
 * ISO 19111 기반의 변환 연산을 생성하는 팩토리.
 * 다양한 변환 연산을 생성하고 관리하는 역할 수행.
 */
public class TransformFactory {
    private static final Map<String, MathTransform> TRANSFORM_MAP = new HashMap<>();

    static {
        // 기본적인 변환 정의 (예제)
        TRANSFORM_MAP.put("scale", new ScaleTransform(2.0));
        TRANSFORM_MAP.put("translate", new TranslateTransform(5.0, -3.0));
    }

    /**
     * 지정된 이름의 변환을 가져옴.
     *
     * @param name 변환의 이름
     * @return 해당 변환 연산 (없으면 예외 발생)
     */
    public static MathTransform getTransform(String name) {
        if (!TRANSFORM_MAP.containsKey(name)) {
            throw new IllegalArgumentException("등록되지 않은 변환: " + name);
        }
        return TRANSFORM_MAP.get(name);
    }

    /**
     * 새로운 변환을 등록.
     *
     * @param name 변환 이름
     * @param transform 변환 연산 객체
     */
    public static void registerTransform(String name, MathTransform transform) {
        TRANSFORM_MAP.put(name, transform);
    }
}
