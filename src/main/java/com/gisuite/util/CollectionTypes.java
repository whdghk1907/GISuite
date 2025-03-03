package com.gisuite.util;

import java.util.*;

/**
 * ISO 19103에서 정의된 컬렉션 및 딕셔너리 타입을 Java 표준 컬렉션 프레임워크로 매핑.
 * GeoAPI Implementation Specification을 준수하여 구현.
 */
public class CollectionTypes {
    // Collection 관련 메서드
    public static <T> Collection<T> asCollection(Collection<T> collection) {
        return new ArrayList<>(collection);
    }

    // Set 관련 메서드
    public static <T> Set<T> asSet(Collection<T> collection) {
        return new HashSet<>(collection);
    }

    // Bag 타입 (Collection으로 구현)
    public static <T> Collection<T> asBag(Collection<T> collection) {
        return new ArrayList<>(collection);
    }

    // Sequence (List) 관련 메서드
    public static <T> List<T> asSequence(Collection<T> collection) {
        return new ArrayList<>(collection);
    }

    // Dictionary 및 KeyValuePair 메서드
    public static <K, V> Map<K, V> asDictionary(Map<K, V> map) {
        return new HashMap<>(map);
    }

    public static <K, V> Map.Entry<K, V> asKeyValuePair(K key, V value) {
        return new AbstractMap.SimpleEntry<>(key, value);
    }

    // 아직 구현되지 않은 타입 (TransfiniteSet, CircularSequence)
    public static <T> Set<T> unimplementedTransfiniteSet() {
        throw new UnsupportedOperationException("TransfiniteSet is not implemented.");
    }

    public static <T> List<T> unimplementedCircularSequence() {
        throw new UnsupportedOperationException("CircularSequence is not implemented.");
    }
}
