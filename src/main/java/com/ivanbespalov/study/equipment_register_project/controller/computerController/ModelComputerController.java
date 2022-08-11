package com.ivanbespalov.study.equipment_register_project.controller.computerController;

import com.ivanbespalov.study.equipment_register_project.service.computerService.ModelComputerService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/computers")
public class ModelComputerController {

    private final ModelComputerService modelComputerService;

    public ModelComputerController(ModelComputerService modelComputerService) {
        this.modelComputerService = modelComputerService;
    }
}
