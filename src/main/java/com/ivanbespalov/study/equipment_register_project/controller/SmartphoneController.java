package com.ivanbespalov.study.equipment_register_project.controller;

import com.ivanbespalov.study.equipment_register_project.dto.ModelSmartphoneDto;
import com.ivanbespalov.study.equipment_register_project.dto.SmartphoneDto;
import com.ivanbespalov.study.equipment_register_project.entity.Smartphone;
import com.ivanbespalov.study.equipment_register_project.service.SmartphoneService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class SmartphoneController {

    private final SmartphoneService service;

    public SmartphoneController(SmartphoneService service) {
        this.service = service;
    }

    @GetMapping("/smartphones")
    public List<SmartphoneDto> getAllSmartphones() {
        return service.getAllSmartphone();
    }

    @GetMapping("/smartphones/{id}")
    public Smartphone getSmartphoneById(@PathVariable int id) {
        return service.getSmartphoneByID(id);
    }

    @GetMapping("/smartphones/name/{name}")
    public List<ModelSmartphoneDto> getSmartphoneByName(@PathVariable String name) {
        return service.getModelsSmartphoneByName(name);
    }

    @GetMapping("/smartphones/orderByAlphabet")
    public List<SmartphoneDto> getAllSmartphonesOrderByAlphabet() {
        return service.getAllSmartphoneOrderByAlphabet();
    }

    @PostMapping("/smartphones")
    public SmartphoneDto addNewSmartphone(@RequestBody SmartphoneDto smartphone) {
        return service.addNewSmartphone(smartphone);
    }
}
