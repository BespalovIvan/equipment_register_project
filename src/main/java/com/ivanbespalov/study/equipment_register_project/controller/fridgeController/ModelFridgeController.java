package com.ivanbespalov.study.equipment_register_project.controller.fridgeController;

import com.ivanbespalov.study.equipment_register_project.service.FridgeService.ModelFridgeService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/fridges")
public class ModelFridgeController {

    private final ModelFridgeService modelFridgeService;

    public ModelFridgeController(ModelFridgeService modelFridgeService) {
        this.modelFridgeService = modelFridgeService;
    }
}
