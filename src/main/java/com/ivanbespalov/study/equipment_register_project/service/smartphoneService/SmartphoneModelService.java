package com.ivanbespalov.study.equipment_register_project.service.smartphoneService;

import com.ivanbespalov.study.equipment_register_project.dto.smartphoneDto.SmartphoneModelDto;

import java.util.UUID;

public interface SmartphoneModelService {
    SmartphoneModelDto addNewModelFromSmartphone(UUID id, SmartphoneModelDto smartphoneModelDto);


}
