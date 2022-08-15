package com.ivanbespalov.study.equipment_register_project.controller.fridgeController;

import com.ivanbespalov.study.equipment_register_project.dto.fridgeDto.FridgeModelDto;
import com.ivanbespalov.study.equipment_register_project.service.FridgeService.FridgeModelService;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/fridges")
public class FridgeModelController {

    private final FridgeModelService fridgeModelService;

    public FridgeModelController(FridgeModelService fridgeModelService) {
        this.fridgeModelService = fridgeModelService;
    }

    @PostMapping("/modelfridges/{id}")
    public FridgeModelDto addNewModelFromFridge(@PathVariable UUID id,
                                                @RequestBody FridgeModelDto fridgeModelDto) {
        return fridgeModelService.saveFridgeModel(id, fridgeModelDto);
    }
}
