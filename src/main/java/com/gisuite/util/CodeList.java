package com.gisuite.util;

import java.util.HashMap;
import java.util.Map;

/**
 * ISO 19103의 CodeList를 구현.
 */
public class CodeList<T extends CodeList<T>> {
    private static final Map<String, CodeList<?>> VALUES = new HashMap<>();
    private final String name;

    protected CodeList(String name) {
        this.name = name;
        VALUES.put(name, this);
    }

    public String getName() {
        return name;
    }

    @SuppressWarnings("unchecked")
    public static <T extends CodeList<T>> T valueOf(String name, Class<T> type) {
        return (T) VALUES.computeIfAbsent(name, k -> {
            try {
                return type.getConstructor(String.class).newInstance(name);
            } catch (Exception e) {
                throw new IllegalArgumentException("Invalid CodeList name: " + name);
            }
        });
    }
}
