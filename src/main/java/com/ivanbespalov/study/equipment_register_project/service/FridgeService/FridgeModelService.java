package com.ivanbespalov.study.equipment_register_project.service.FridgeService;

import com.ivanbespalov.study.equipment_register_project.dto.fridgeDto.FridgeFilterDto;
import com.ivanbespalov.study.equipment_register_project.dto.fridgeDto.FridgeModelDto;

import java.util.List;

public interface FridgeModelService {
    FridgeModelDto addNewFridgeModel(FridgeModelDto fridgeModelDto);

    List<FridgeModelDto> findByFilter(FridgeFilterDto fridgeFilterDto);
}
