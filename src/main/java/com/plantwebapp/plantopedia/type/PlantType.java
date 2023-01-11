package com.plantwebapp.plantopedia.type;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity(name = "PLANT_TYPES")
public class PlantType {

    @Id
    @GeneratedValue
    @Column(name = "PLANT_TYPE_ID")
    private Long id;

    @Column(name = "PLANT_TYPE_NAME")
    private String typeName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = this.typeName;
    }
}
