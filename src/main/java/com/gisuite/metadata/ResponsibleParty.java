package com.gisuite.metadata;

/**
 * ISO 19115 기반의 책임 기관 정보를 저장하는 클래스.
 */
public class ResponsibleParty {
    private final String individualName;
    private final String organisationName;
    private final Role role;

    public ResponsibleParty(String individualName, String organisationName, Role role) {
        this.individualName = individualName;
        this.organisationName = organisationName;
        this.role = role;
    }

    public String getIndividualName() {
        return individualName;
    }

    public String getOrganisationName() {
        return organisationName;
    }

    public Role getRole() {
        return role;
    }
}
