package com.plantwebapp.plantopedia.type;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping(value = "/api/plant-types")
public class PlantTypeController {

    private final PlantTypeRepository plantTypeRepository;

    @Autowired
    private PlantTypeController(PlantTypeRepository plantTypeRepository) {
        this.plantTypeRepository = plantTypeRepository;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<PlantType>> getPlantTypes() {
        return ResponseEntity.ok(plantTypeRepository.findAll());
    }

}
