package com.gisuite.metadata;

import java.util.List;

/**
 * ISO 19115 기반의 Citation (인용) 정보 클래스.
 */
public class Citation {
    private final String title;
    private final List<String> alternateTitles;
    private final List<ResponsibleParty> citedResponsibleParties;

    public Citation(String title, List<String> alternateTitles, List<ResponsibleParty> citedResponsibleParties) {
        this.title = title;
        this.alternateTitles = alternateTitles;
        this.citedResponsibleParties = citedResponsibleParties;
    }

    public String getTitle() {
        return title;
    }

    public List<String> getAlternateTitles() {
        return alternateTitles;
    }

    public List<ResponsibleParty> getCitedResponsibleParties() {
        return citedResponsibleParties;
    }
}
