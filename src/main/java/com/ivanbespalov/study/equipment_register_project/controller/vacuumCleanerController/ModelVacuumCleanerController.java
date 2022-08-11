package com.ivanbespalov.study.equipment_register_project.controller.vacuumCleanerController;

import com.ivanbespalov.study.equipment_register_project.service.vacuumCleaneService.ModelVacuumCleanerService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/vacuumcleaners")
public class ModelVacuumCleanerController {

    private final ModelVacuumCleanerService modelVacuumCleanerService;

    public ModelVacuumCleanerController(ModelVacuumCleanerService modelVacuumCleanerService) {
        this.modelVacuumCleanerService = modelVacuumCleanerService;
    }
}
