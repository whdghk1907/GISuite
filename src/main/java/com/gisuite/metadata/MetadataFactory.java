package com.gisuite.metadata;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * ISO 19115 기반의 메타데이터 객체를 생성하는 팩토리 클래스.
 */
public class MetadataFactory {

    public static Metadata createMetadata(String fileIdentifier, String title, String authorName, String organisation) {
        Citation citation = new Citation(title, new ArrayList<>(), new ArrayList<>());

        ResponsibleParty author = new ResponsibleParty(authorName, organisation, Role.AUTHOR);
        List<ResponsibleParty> responsibleParties = new ArrayList<>();
        responsibleParties.add(author);

        return new Metadata(fileIdentifier, new Date(), citation, responsibleParties);
    }
}
