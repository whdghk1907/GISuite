package com.gisuite.geometry;

/**
 * ISO 19107 기반의 위치 인터페이스.
 * 모든 위치(좌표 포함)는 이 인터페이스를 구현해야 함.
 */
public interface Position {
    DirectPosition getDirectPosition();
}
