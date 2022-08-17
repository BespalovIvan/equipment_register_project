package com.ivanbespalov.study.equipment_register_project.controller.fridgeController;

import com.ivanbespalov.study.equipment_register_project.dto.fridgeDto.FridgeFilterDto;
import com.ivanbespalov.study.equipment_register_project.dto.fridgeDto.FridgeModelDto;
import com.ivanbespalov.study.equipment_register_project.service.FridgeService.FridgeModelService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/fridges")
@RequiredArgsConstructor
public class FridgeModelController {

    private final FridgeModelService fridgeModelService;

    @PostMapping("/modelfridges")
    public FridgeModelDto addNewModelFromFridge(@RequestBody FridgeModelDto fridgeModelDto) {
        return fridgeModelService.addNewFridgeModel(fridgeModelDto);
    }

    @GetMapping("/filters")
    public List<FridgeModelDto> getModelsByFilter(@RequestBody FridgeFilterDto fridgeFilterDto) {
        return fridgeModelService.findByFilter(fridgeFilterDto);
    }
}
