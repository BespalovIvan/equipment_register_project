package com.ivanbespalov.study.equipment_register_project.controller;

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
    public List<Smartphone> getAllSmartphones() {
        return service.getAllSmartphone();
    }

    @PostMapping("/smartphones")
    public void addNewSmartphone(@RequestBody Smartphone smartphone) {
        service.addNewSmartphone(smartphone);
    }

    @GetMapping("/smartphones/{name}")
    public Smartphone getSmartphoneByName(@PathVariable String name) {
        return service.getSmartphoneByName(name);
    }
}
