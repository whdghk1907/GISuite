package com.gisuite.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * OGC 및 ISO 표준을 준수하는 UML 어노테이션 정의.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.FIELD})
public @interface UML {
    String identifier();  // ISO 표준에서 정의된 UML 식별자
    String specification(); // 적용된 표준 명칭 (예: ISO_19111)
    Obligation obligation() default Obligation.MANDATORY; // 기본적으로 필수 요소
}

