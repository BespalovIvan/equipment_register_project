package com.ivanbespalov.study.equipment_register_project.service.FridgeService;

import com.ivanbespalov.study.equipment_register_project.dto.fridgeDto.FridgeDto;

import java.util.List;

public interface FridgeService {
    FridgeDto addNewFridge(FridgeDto fridgeDto);

    FridgeDto getFridgeByName(String name);

    List<FridgeDto> getFridges();


}
