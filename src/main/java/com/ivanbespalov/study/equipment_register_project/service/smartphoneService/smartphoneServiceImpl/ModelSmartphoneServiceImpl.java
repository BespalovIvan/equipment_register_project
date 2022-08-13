package com.ivanbespalov.study.equipment_register_project.service.smartphoneService.smartphoneServiceImpl;

import com.ivanbespalov.study.equipment_register_project.dao.smartphoneRepository.ModelSmartphoneRepository;
import com.ivanbespalov.study.equipment_register_project.dao.smartphoneRepository.SmartphoneRepository;
import com.ivanbespalov.study.equipment_register_project.service.smartphoneService.ModelSmartphoneService;
import org.springframework.stereotype.Service;

@Service
public class ModelSmartphoneServiceImpl implements ModelSmartphoneService {

    private final ModelSmartphoneRepository modelSmartphoneRepository;

    public ModelSmartphoneServiceImpl(ModelSmartphoneRepository modelSmartphoneRepository,
                                      SmartphoneRepository smartphoneRepository) {
        this.modelSmartphoneRepository = modelSmartphoneRepository;
    }
}
