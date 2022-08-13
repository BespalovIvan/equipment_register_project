package com.ivanbespalov.study.equipment_register_project.service.smartphoneService;

import com.ivanbespalov.study.equipment_register_project.dto.smartphoneDto.ModelSmartphoneDto;

import java.util.UUID;

public interface ModelSmartphoneService {
    ModelSmartphoneDto addNewModelFromSmartphone(UUID id,ModelSmartphoneDto modelSmartphoneDto);


}
