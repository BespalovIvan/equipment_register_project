package com.ivanbespalov.study.equipment_register_project.controller.fridgeController;

import com.ivanbespalov.study.equipment_register_project.dto.fridgeDto.FridgeDto;
import com.ivanbespalov.study.equipment_register_project.service.FridgeService.FridgeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class FridgeController {

    private final FridgeService fridgeService;

    public FridgeController(FridgeService fridgeService) {
        this.fridgeService = fridgeService;
    }

    @PostMapping("/fridges")
    public FridgeDto addNewFridge(@RequestBody FridgeDto fridgeDto){
        return fridgeService.addNewFridge(fridgeDto);
    }

    @GetMapping("/fridges/{name}")
    public FridgeDto getFridgeByName(@PathVariable String name){
        return fridgeService.getFridgeByName(name);
    }

    @GetMapping("/fridges")
    public List<FridgeDto> getAllFridges(){
        return fridgeService.getFridges();
    }
}
