package com.alsarraa.projects.googleBooksApi;

public class Item {

    private VolumeInfo volumeInfo;

    public Item() {}

    public Item(VolumeInfo volumeInfo) {
        this.volumeInfo = volumeInfo;
    }

    public VolumeInfo getVolumeInfo() {
        return volumeInfo;
    }

    public void setVolumeInfo(VolumeInfo volumeInfo) {
        this.volumeInfo = volumeInfo;
    }
}
