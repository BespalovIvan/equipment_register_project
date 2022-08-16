package com.ivanbespalov.study.equipment_register_project.controller.computerController;

import com.ivanbespalov.study.equipment_register_project.dto.computerDto.ComputerModelDto;
import com.ivanbespalov.study.equipment_register_project.service.computerService.ComputerModelService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/computers")
public class ComputerModelController {

    private final ComputerModelService computerModelService;

    public ComputerModelController(ComputerModelService computerModelService) {
        this.computerModelService = computerModelService;
    }

    @PostMapping("/modelcomputers/{id}")
    public ComputerModelDto addNewModelFromComputer(@PathVariable UUID id,
                                                    @RequestBody ComputerModelDto computerModelDto) {
        return computerModelService.addModelFromComputer(id, computerModelDto);
    }

    @GetMapping("/modelcomputers/color/{color}")
    public List<ComputerModelDto> getModelByColor(@PathVariable String color) {
        return computerModelService.getModelsByColor(color);
    }

    @GetMapping("/modelcomputers/price/{min}/{max}")
    public List<ComputerModelDto> getModelsByPrice(@PathVariable int min, @PathVariable int max) {
        return computerModelService.getModelsByPrice(min,max);
    }

    @GetMapping("/modelcomputers/category/{category}")
    public List<ComputerModelDto> getModelsByCategory(@PathVariable String category) {
        return computerModelService.getModelsByCategory(category);
    }

    @GetMapping("/modelcomputers/cpu/{cpu}")
    public List<ComputerModelDto> getModelsByCpu(@PathVariable String cpu) {
        return computerModelService.getModelsByCpu(cpu);
    }

}
