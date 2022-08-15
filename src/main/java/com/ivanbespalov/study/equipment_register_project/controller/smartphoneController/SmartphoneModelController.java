package com.ivanbespalov.study.equipment_register_project.controller.smartphoneController;

import com.ivanbespalov.study.equipment_register_project.service.smartphoneService.SmartphoneModelService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/smartphones")
public class SmartphoneModelController {

    private final SmartphoneModelService smartphoneModelService;

    public SmartphoneModelController(SmartphoneModelService smartphoneModelService) {
        this.smartphoneModelService = smartphoneModelService;
    }

}
