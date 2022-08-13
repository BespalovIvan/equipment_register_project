package com.ivanbespalov.study.equipment_register_project.controller.smartphoneController;

import com.ivanbespalov.study.equipment_register_project.dto.smartphoneDto.SmartphoneDto;
import com.ivanbespalov.study.equipment_register_project.service.smartphoneService.SmartphoneService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class SmartphoneController {

    private final SmartphoneService smartphoneService;

    public SmartphoneController(SmartphoneService smartphoneService) {
        this.smartphoneService = smartphoneService;
    }

    @PostMapping("/smartphones")
    public SmartphoneDto addNewSmartphone(@RequestBody SmartphoneDto smartphoneDto) {
        return smartphoneService.addNewSmartphone(smartphoneDto);
    }

}