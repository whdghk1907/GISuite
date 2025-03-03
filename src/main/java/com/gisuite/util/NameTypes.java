package com.gisuite.util;

import org.opengis.util.NameFactory;
import org.opengis.util.NameSpace;
import org.opengis.util.GenericName;
import org.opengis.util.ScopedName;
import org.opengis.util.LocalName;
import org.opengis.util.TypeName;
import org.opengis.util.MemberName;

/**
 * ISO 19103에서 정의된 이름(Name) 타입을 GeoAPI 표준에 맞게 구현.
 */
public class NameTypes {
    private final NameFactory nameFactory;
    private final NameSpace nameSpace;
    private final GenericName genericName;
    private final ScopedName scopedName;
    private final LocalName localName;
    private final TypeName typeName;
    private final MemberName memberName;

    public NameTypes(NameFactory nameFactory, NameSpace nameSpace, GenericName genericName,
                     ScopedName scopedName, LocalName localName, TypeName typeName, MemberName memberName) {
        this.nameFactory = nameFactory;
        this.nameSpace = nameSpace;
        this.genericName = genericName;
        this.scopedName = scopedName;
        this.localName = localName;
        this.typeName = typeName;
        this.memberName = memberName;
    }

    public NameFactory getNameFactory() {
        return nameFactory;
    }

    public NameSpace getNameSpace() {
        return nameSpace;
    }

    public GenericName getGenericName() {
        return genericName;
    }

    public ScopedName getScopedName() {
        return scopedName;
    }

    public LocalName getLocalName() {
        return localName;
    }

    public TypeName getTypeName() {
        return typeName;
    }

    public MemberName getMemberName() {
        return memberName;
    }
}
