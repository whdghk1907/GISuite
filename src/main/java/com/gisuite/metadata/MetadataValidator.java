package com.gisuite.metadata;

import java.util.List;

/**
 * ISO 19115 기반의 메타데이터 유효성을 검사하는 클래스.
 */
public class MetadataValidator {

    public static boolean validate(Metadata metadata) {
        if (metadata.getFileIdentifier() == null || metadata.getFileIdentifier().isEmpty()) {
            return false;
        }

        if (metadata.getDateStamp() == null) {
            return false;
        }

        if (metadata.getCitation() == null || metadata.getCitation().getTitle().isEmpty()) {
            return false;
        }

        List<ResponsibleParty> parties = metadata.getResponsibleParties();
        if (parties == null || parties.isEmpty()) {
            return false;
        }

        return true;
    }
}
