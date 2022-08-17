package com.ivanbespalov.study.equipment_register_project.controller.fridgeController;

import com.ivanbespalov.study.equipment_register_project.dto.fridgeDto.FridgeFilterDto;
import com.ivanbespalov.study.equipment_register_project.dto.fridgeDto.FridgeModelDto;
import com.ivanbespalov.study.equipment_register_project.service.FridgeService.FridgeModelService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/fridges")
public class FridgeModelController {

    private final FridgeModelService fridgeModelService;

    public FridgeModelController(FridgeModelService fridgeModelService) {
        this.fridgeModelService = fridgeModelService;
    }

    @PostMapping("/modelfridges")
    public FridgeModelDto addNewModelFromFridge(@RequestBody FridgeModelDto fridgeModelDto) {
        return fridgeModelService.addNewFridgeModel(fridgeModelDto);
    }

    @GetMapping("/filter")
    public Map<String, List<FridgeModelDto>> getModelsByFilter(@RequestBody FridgeFilterDto fridgeFilterDto) {
        return fridgeModelService.getModelsByFilter(fridgeFilterDto);
    }


}
