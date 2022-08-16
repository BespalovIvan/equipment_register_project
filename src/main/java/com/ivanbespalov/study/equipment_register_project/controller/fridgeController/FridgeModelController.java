package com.ivanbespalov.study.equipment_register_project.controller.fridgeController;

import com.ivanbespalov.study.equipment_register_project.dto.fridgeDto.FridgeModelDto;
import com.ivanbespalov.study.equipment_register_project.service.FridgeService.FridgeModelService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/fridges")
public class FridgeModelController {

    private final FridgeModelService fridgeModelService;

    public FridgeModelController(FridgeModelService fridgeModelService) {
        this.fridgeModelService = fridgeModelService;
    }

    @PostMapping("/modelfridges/{id}")
    public FridgeModelDto addNewModelFromFridge(@PathVariable UUID id,
                                                @RequestBody FridgeModelDto fridgeModelDto) {
        return fridgeModelService.addNewFridgeModel(id, fridgeModelDto);
    }

    @GetMapping("/modelfridges/color/{color}")
    public List<FridgeModelDto> getModelByColor(@PathVariable String color) {
        return fridgeModelService.getModelsByColor(color);
    }

    @GetMapping("/modelfridges/price/{min}/{max}")
    public List<FridgeModelDto> getModelsByPrice(@PathVariable int min, @PathVariable int max) {
        return fridgeModelService.getModelsByPrice(min,max);
    }

    @GetMapping("/modelfridges/countdoor/{count}")
    public List<FridgeModelDto> getModelsByCategory(@PathVariable int count) {
        return fridgeModelService.getModelsByCountDoor(count);
    }

    @GetMapping("/modelfridges/compressor/{compressor}")
    public List<FridgeModelDto> getModelsByCpu(@PathVariable String compressor) {
        return fridgeModelService.getModelsByCompressorType(compressor);
    }
}
