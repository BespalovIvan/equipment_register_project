package com.ivanbespalov.study.equipment_register_project.service.FridgeService;

import com.ivanbespalov.study.equipment_register_project.dto.fridgeDto.FridgeModelDto;

import java.util.UUID;

public interface FridgeModelService {
    FridgeModelDto saveFridgeModel(UUID id,FridgeModelDto fridgeModelDto);
}
