package com.plantwebapp.plantopedia.search;

import com.plantwebapp.plantopedia.profile.Profile;

public class ProfileDto {

    private String commonName;
    private String genusName;
    private String description;
    private String plantType;

    public static ProfileDto from(Profile profile) {
        String plantType = profile.getPlantType() != null ? profile.getPlantType().getTypeName() : null;
        return new ProfileDto(profile.getCommonName(), profile.getGenusName(), profile.getDescription(), plantType);
    }

    private ProfileDto(String commonName, String genusName, String description, String plantType) {
        this.commonName = commonName;
        this.genusName = genusName;
        this.description = description;
        this.plantType = plantType;
    }

    public String getCommonName() {
        return commonName;
    }

    public String getGenusName() {
        return genusName;
    }

    public String getDescription() {
        return description;
    }

    public String getPlantType() {
        return plantType;
    }
}
