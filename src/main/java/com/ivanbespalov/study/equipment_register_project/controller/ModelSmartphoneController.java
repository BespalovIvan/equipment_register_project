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
        return modelSmartphoneService.getAllModelsForSmartphone(id);
    }

    @GetMapping("/modelsmartphones/color/{color}")
    public List<ModelSmartphone> getSmartphonesFromColor(@PathVariable String color){
        return modelSmartphoneService.getAllSmartphonesFromColor(color);
    }

    @GetMapping("/modelsmartphones/price/{min}/{max}")
    public List<ModelSmartphone> getSmartphonesFromPrice(@PathVariable int min,@PathVariable int max){
        return modelSmartphoneService.getAllSmartphonesFromPrice(min,max);
    }
    @PostMapping("/modelsmartphones")
    public void addNewModelForSmartphone(@RequestBody ModelSmartphone modelSmartphone){
        modelSmartphoneService.addNewModelForSmartphone(modelSmartphone);
    }

}
