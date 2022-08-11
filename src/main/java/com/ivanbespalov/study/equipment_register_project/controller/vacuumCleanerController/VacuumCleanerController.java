package com.ivanbespalov.study.equipment_register_project.controller.vacuumCleanerController;

import com.ivanbespalov.study.equipment_register_project.service.vacuumCleaneService.VacuumCleanerService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class VacuumCleanerController {

    private final VacuumCleanerService vacuumCleanerService;

    public VacuumCleanerController(VacuumCleanerService vacuumCleanerService) {
        this.vacuumCleanerService = vacuumCleanerService;
    }
}
