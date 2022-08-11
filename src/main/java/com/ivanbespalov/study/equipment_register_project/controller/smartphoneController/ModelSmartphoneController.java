package com.ivanbespalov.study.equipment_register_project.controller.smartphoneController;

import com.ivanbespalov.study.equipment_register_project.dto.smartphoneDto.ModelSmartphoneDto;
import com.ivanbespalov.study.equipment_register_project.service.smartphoneService.ModelSmartphoneService;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/smartphones")
public class ModelSmartphoneController {

    private final ModelSmartphoneService modelSmartphoneService;

    public ModelSmartphoneController(ModelSmartphoneService modelSmartphoneService) {
        this.modelSmartphoneService = modelSmartphoneService;
    }

    @PostMapping("/modelsmartphones/{id}")
    public ModelSmartphoneDto addNewModelForSmartphone(@PathVariable UUID id,
                                                       @RequestBody ModelSmartphoneDto modelSmartphoneDto) {
        return modelSmartphoneService.addNewModelForSmartphone(id, modelSmartphoneDto);
    }
}
