package com.ivanbespalov.study.equipment_register_project.controller.computerController;

import com.ivanbespalov.study.equipment_register_project.service.computerService.ComputerService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class ComputerController {

    private final ComputerService computerService;

    public ComputerController(ComputerService computerService) {
        this.computerService = computerService;
    }
}
