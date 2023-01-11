package com.plantwebapp.plantopedia.profile;

import com.plantwebapp.plantopedia.type.PlantTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProfileService {

    private final ProfileRepository profileRepository;
    private final PlantTypeRepository plantTypeRepository;

    @Autowired
    private ProfileService(ProfileRepository profileRepository, PlantTypeRepository plantTypeRepository) {
        this.profileRepository = profileRepository;
        this.plantTypeRepository = plantTypeRepository;
    }

    public void addProfile(NewProfileRequest newProfileRequest) {
        Profile profile = new Profile();
        profile.setCommonName(newProfileRequest.getCommonName());
        profile.setGenusName(newProfileRequest.getGenusName());
        profile.setDescription(newProfileRequest.getDescription());
        if (newProfileRequest.getPlantTypeId() != null) {
            profile.setPlantType(plantTypeRepository.findById(newProfileRequest.getPlantTypeId())
                    .orElse(null));
        }
        profileRepository.save(profile);
    }
}