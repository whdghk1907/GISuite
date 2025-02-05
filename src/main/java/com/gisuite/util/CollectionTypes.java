package com.gisuite.util;

import java.util.*;

/**
 * ISO 19103에서 정의된 컬렉션 타입을 Java 표준 컬렉션으로 매핑.
 */
public class CollectionTypes {
    public static <T> Collection<T> asCollection(List<T> list) {
        return new ArrayList<>(list);
    }

    public static <T> Set<T> asSet(List<T> list) {
        return new HashSet<>(list);
    }

    public static <K, V> Map<K, V> asDictionary(Map<K, V> map) {
        return new HashMap<>(map);
    }
}
