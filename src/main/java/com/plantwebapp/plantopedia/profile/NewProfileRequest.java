package com.plantwebapp.plantopedia.profile;

public class NewProfileRequest {

    private String commonName;
    private String genusName;
    private String description;
    private Long plantTypeId;

    public String getCommonName() {
        return commonName;
    }

    public void setCommonName(String commonName) {
        this.commonName = commonName;
    }

    public String getGenusName() {
        return genusName;
    }

    public void setGenusName(String genusName) {
        this.genusName = genusName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getPlantTypeId() {
        return plantTypeId;
    }

    public void setPlantTypeId(Long plantTypeId) {
        this.plantTypeId = plantTypeId;
    }
}