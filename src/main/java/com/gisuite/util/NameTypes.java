package com.gisuite.util;

/**
 * ISO 19103에서 정의된 이름(Name) 타입을 Java String 기반으로 매핑.
 */
public class NameTypes {
    private final String name;
    private final String namespace;

    public NameTypes(String namespace, String name) {
        this.namespace = namespace;
        this.name = name;
    }

    public String getFullName() {
        return namespace + ":" + name;
    }

    public String getLocalName() {
        return name;
    }

    public String getNamespace() {
        return namespace;
    }
}
