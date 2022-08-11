package com.ivanbespalov.study.equipment_register_project.service.smartphoneService;

import com.ivanbespalov.study.equipment_register_project.dto.smartphoneDto.SmartphoneDto;
import com.ivanbespalov.study.equipment_register_project.entity.smartphone.Smartphone;

import java.util.UUID;


public interface SmartphoneService {

    Smartphone getSmartphoneByID(UUID id);

    void updateSmartphone(Smartphone smartphone);

    SmartphoneDto addNewSmartphone(SmartphoneDto smartphone);

}
