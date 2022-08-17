package com.ivanbespalov.study.equipment_register_project.service.FridgeService;

import com.ivanbespalov.study.equipment_register_project.dto.fridgeDto.FridgeFilterDto;
import com.ivanbespalov.study.equipment_register_project.dto.fridgeDto.FridgeModelDto;

import java.util.List;
import java.util.Map;

public interface FridgeModelService {
    FridgeModelDto addNewFridgeModel(FridgeModelDto fridgeModelDto);

    List<FridgeModelDto> getModelsByColor(String color);

    List<FridgeModelDto> getModelsByPrice(int min, int max);

    List<FridgeModelDto> getModelsByCountDoor(int countDoor);

    List<FridgeModelDto> getModelsByCompressorType(String compressorType);

    Map<String,List<FridgeModelDto>> getModelsByFilter(FridgeFilterDto fridgeFilterDto);
}
