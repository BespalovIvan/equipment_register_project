package com.ivanbespalov.study.equipment_register_project.controller.televisionController;

import com.ivanbespalov.study.equipment_register_project.service.televisionServise.TelevisionService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TelevisionController {
    private final TelevisionService televisionService;

    public TelevisionController(TelevisionService televisionService) {
        this.televisionService = televisionService;
    }
}
