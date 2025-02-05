package com.gisuite.annotation;

/**
 * OGC 표준에서 사용되는 의무 수준(Obligation Level) 열거형.
 */
public enum Obligation {
    MANDATORY, // 필수 (기본값)
    OPTIONAL,  // 선택 가능
    CONDITIONAL // 특정 조건 하에서 필수
}
