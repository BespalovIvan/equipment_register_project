package com.ivanbespalov.study.equipment_register_project.service.smartphoneService;

import com.ivanbespalov.study.equipment_register_project.dto.smartphoneDto.SmartphoneDto;

import java.util.UUID;

public interface SmartphoneService {
    SmartphoneDto saveSmartphone(SmartphoneDto smartphoneDto);

    SmartphoneDto getSmartphoneById(UUID id);

}
