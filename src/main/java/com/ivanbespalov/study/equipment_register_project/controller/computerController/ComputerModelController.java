package com.ivanbespalov.study.equipment_register_project.controller.computerController;

import com.ivanbespalov.study.equipment_register_project.dto.computerDto.ComputerFilterDto;
import com.ivanbespalov.study.equipment_register_project.dto.computerDto.ComputerModelDto;
import com.ivanbespalov.study.equipment_register_project.service.computerService.ComputerModelService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/computers")
public class ComputerModelController {

    private final ComputerModelService computerModelService;

    public ComputerModelController(ComputerModelService computerModelService) {
        this.computerModelService = computerModelService;
    }

    @PostMapping("/modelcomputers")
    public ComputerModelDto addNewModelFromComputer(@RequestBody ComputerModelDto computerModelDto) {
        return computerModelService.addModelFromComputer(computerModelDto);
    }

    @GetMapping("/filter")
    public Map<String, List<ComputerModelDto>> getModelsFromFilter(@RequestBody ComputerFilterDto computerFilterDto) {
        return computerModelService.filterModels(computerFilterDto);
    }
}
