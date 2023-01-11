package com.plantwebapp.plantopedia.profile;

import com.plantwebapp.plantopedia.type.PlantType;
import jakarta.persistence.*;

@Entity(name = "PROFILES")
public class Profile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PRO_ID")
    private Long id;

    @Column(name = "PRO_COMMON_NAME")
    private String commonName;

    @Column(name = "PRO_GENUS_NAME")
    private String genusName;

    @Column(name = "PRO_DESCRIPTION")
    private String description;

    @ManyToOne
    @JoinColumn(name = "PRO_TYPE_ID")
    private PlantType plantType;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public PlantType getPlantType() {
        return plantType;
    }

    public void setPlantType(PlantType plantType) {
        this.plantType = plantType;
    }
}
