package com.alsarraa.projects.googleBooksApi;

import java.util.List;

public class VolumeInfo {

    private String title;
    private List<IndustryIdentifier> industryIdentifiers;

    public VolumeInfo() {}

    public VolumeInfo(String title, List<IndustryIdentifier> industryIdentifiers) {
        this.title = title;
        this.industryIdentifiers = industryIdentifiers;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<IndustryIdentifier> getIndustryIdentifiers() {
        return industryIdentifiers;
    }

    public void setIndustryIdentifiers(List<IndustryIdentifier> industryIdentifiers) {
        this.industryIdentifiers = industryIdentifiers;
    }
}
