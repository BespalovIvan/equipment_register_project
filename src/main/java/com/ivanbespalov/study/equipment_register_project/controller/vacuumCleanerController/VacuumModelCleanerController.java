package com.ivanbespalov.study.equipment_register_project.controller.vacuumCleanerController;

import com.ivanbespalov.study.equipment_register_project.service.vacuumCleaneService.VacuumCleanerModelService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/vacuumcleaners")
public class VacuumModelCleanerController {

    private final VacuumCleanerModelService vacuumCleanerModelService;

    public VacuumModelCleanerController(VacuumCleanerModelService vacuumCleanerModelService) {
        this.vacuumCleanerModelService = vacuumCleanerModelService;
    }
}
