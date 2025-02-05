package com.gisuite.metadata;

import java.util.Date;
import java.util.List;

/**
 * ISO 19115 기반의 메타데이터 엔티티 클래스.
 */
public class Metadata {
    private final String fileIdentifier;
    private final Date dateStamp;
    private final Citation citation;
    private final List<ResponsibleParty> responsibleParties;

    public Metadata(String fileIdentifier, Date dateStamp, Citation citation, List<ResponsibleParty> responsibleParties) {
        this.fileIdentifier = fileIdentifier;
        this.dateStamp = dateStamp;
        this.citation = citation;
        this.responsibleParties = responsibleParties;
    }

    public String getFileIdentifier() {
        return fileIdentifier;
    }

    public Date getDateStamp() {
        return dateStamp;
    }

    public Citation getCitation() {
        return citation;
    }

    public List<ResponsibleParty> getResponsibleParties() {
        return responsibleParties;
    }
}
