package com.ivanbespalov.study.equipment_register_project.controller.fridgeController;

import com.ivanbespalov.study.equipment_register_project.service.FridgeService.FridgeService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class FridgeController {

    private final FridgeService fridgeService;

    public FridgeController(FridgeService fridgeService) {
        this.fridgeService = fridgeService;
    }
}
