package com.ivanbespalov.study.equipment_register_project.controller;

import com.ivanbespalov.study.equipment_register_project.entity.ModelSmartphone;
import com.ivanbespalov.study.equipment_register_project.service.ModelSmartphoneService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/smartphones")
public class ModelSmartphoneController {

   private final ModelSmartphoneService modelSmartphoneService;

    public ModelSmartphoneController(ModelSmartphoneService modelSmartphoneService) {
        this.modelSmartphoneService = modelSmartphoneService;
    }

    @GetMapping("/modelsmartphones/{id}")
    public List<ModelSmartphone> getModelsSmartphone(@PathVariable int id){
        return modelSmartphoneService.getAllModelsSmartphone(id);
    }

    @GetMapping(value = "/modelsmartphones/color/{color}")
    public List<ModelSmartphone> getSmartphonesFromColor(@PathVariable String color){
        return modelSmartphoneService.getAllSmartphonesFromColor(color);
    }

    @GetMapping(value = "/modelsmartphones/price/{min}/{max}")
    public List<ModelSmartphone> getSmartphonesFromColor(@PathVariable int min,@PathVariable int max){
        return modelSmartphoneService.getAllSmartphonesFromPrice(min,max);
    }
    @PostMapping("/modelsmartphones/{id}")
    public void addNewModelForSmartphone(@PathVariable int id, @RequestBody ModelSmartphone modelSmartphone){
        modelSmartphoneService.addNewModelForSmartphone(id,modelSmartphone);
    }

}
