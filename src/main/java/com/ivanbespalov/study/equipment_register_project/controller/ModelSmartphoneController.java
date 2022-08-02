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

    @GetMapping("/modelsmartphones")
    public List<ModelSmartphone> getAllModelsSmartphones(){
        return modelSmartphoneService.getAllModelsSmartphones();
    }

    @GetMapping("/modelsmartphones/name/{name}")
    public List<ModelSmartphone> getModelsSmartphone(@PathVariable String name) {
        return modelSmartphoneService.getAllModelsForSmartphone(name);
    }

    @GetMapping("/modelsmartphones/color/{color}")
    public List<ModelSmartphone> getSmartphonesFromColor(@PathVariable String color) {
        return modelSmartphoneService.getAllSmartphonesFromColor(color);
    }

    @GetMapping("/modelsmartphones/price/{min}/{max}")
    public List<ModelSmartphone> getSmartphonesFromPrice(@PathVariable int min, @PathVariable int max) {
        return modelSmartphoneService.getAllSmartphonesFromPrice(min, max);
    }

    @GetMapping("/modelsmartphones/serialnumber/{serialNumber}")
    public ModelSmartphone getSmartphonesFromSerialNumber(@PathVariable int serialNumber) {
        return modelSmartphoneService.getBySerialNumber(serialNumber);
    }

    @GetMapping("/modelsmartphones/size/{size}")
    public List<ModelSmartphone> getSmartphonesFromSize(@PathVariable String size) {
        return modelSmartphoneService.getBySize(size);
    }

    @GetMapping("/modelsmartphones/memory/{memory}")
    public List<ModelSmartphone> getSmartphonesFromMemory(@PathVariable String memory) {
        return modelSmartphoneService.getByMemory(memory);
    }

    @GetMapping("/modelsmartphones/cameras/{numberOfCameras}")
    public List<ModelSmartphone> getSmartphonesFromNumberOfCameras(@PathVariable int numberOfCameras) {
        return modelSmartphoneService.getByNumberOfCameras(numberOfCameras);
    }

    @GetMapping("/modelsmartphones/availability/{availability}")
    public List<ModelSmartphone> getSmartphonesFromAvailability(@PathVariable boolean availability) {
        return modelSmartphoneService.getByAvailability(availability);
    }

    @GetMapping("/modelsmartphones/orderByAlphabet")
    public List<ModelSmartphone> getSmartphonesOrderByAlphabet() {
        return modelSmartphoneService.getAllModelsSmartphoneOrderByAlphabet();
    }

    @GetMapping("/modelsmartphones/orderByPrice")
    public List<ModelSmartphone> getSmartphonesOrderByPrice() {
        return modelSmartphoneService.getAllModelsSmartphoneOrderByPrice();
    }

    @PostMapping("/modelsmartphones")
    public ModelSmartphone addNewModelForSmartphone(@RequestBody ModelSmartphone modelSmartphone) {
        return modelSmartphoneService.addNewModelForSmartphone(modelSmartphone);
    }
}
