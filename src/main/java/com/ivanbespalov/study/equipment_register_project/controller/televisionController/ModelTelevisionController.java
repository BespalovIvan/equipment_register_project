package com.ivanbespalov.study.equipment_register_project.controller.televisionController;

import com.ivanbespalov.study.equipment_register_project.service.televisionServise.ModelTelevisionService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/televisions")
public class ModelTelevisionController {
    private final ModelTelevisionService modelTelevisionService;

    public ModelTelevisionController(ModelTelevisionService modelTelevisionService) {
        this.modelTelevisionService = modelTelevisionService;
    }
}
