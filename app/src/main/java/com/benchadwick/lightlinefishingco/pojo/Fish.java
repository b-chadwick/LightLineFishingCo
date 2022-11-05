package com.benchadwick.lightlinefishingco.pojo;

public class Fish {
    private int imageId;
    private String species;
    private String anglerName;
    private String dateSubmitted;

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getAnglerName() {
        return anglerName;
    }

    public void setAnglerName(String anglerName) {
        this.anglerName = anglerName;
    }

    public String getDateSubmitted() {
        return dateSubmitted;
    }

    public void setDateSubmitted(String dateSubmitted) {
        this.dateSubmitted = dateSubmitted;
    }

    public Fish(int imageId, String species, String anglerName, String dateSubmitted) {
        this.imageId = imageId;
        this.species = species;
        this.anglerName = anglerName;
        this.dateSubmitted = dateSubmitted;
    }
}
