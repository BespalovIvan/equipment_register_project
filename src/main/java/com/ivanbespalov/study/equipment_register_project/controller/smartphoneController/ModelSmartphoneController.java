package com.ivanbespalov.study.equipment_register_project.controller.smartphoneController;

import com.ivanbespalov.study.equipment_register_project.service.smartphoneService.ModelSmartphoneService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/smartphones")
public class ModelSmartphoneController {

    private final ModelSmartphoneService modelSmartphoneService;

    public ModelSmartphoneController(ModelSmartphoneService modelSmartphoneService) {
        this.modelSmartphoneService = modelSmartphoneService;
    }

}
