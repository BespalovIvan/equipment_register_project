package com.ivanbespalov.study.equipment_register_project.controller.computerController;

import com.ivanbespalov.study.equipment_register_project.dto.computerDto.ComputerFilterDto;
import com.ivanbespalov.study.equipment_register_project.dto.computerDto.ComputerModelDto;
import com.ivanbespalov.study.equipment_register_project.service.computerService.ComputerModelService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/computers")
@RequiredArgsConstructor
public class ComputerModelController {

    private final ComputerModelService computerModelService;


    @PostMapping("/modelcomputers")
    public ComputerModelDto addNewModelFromComputer(@RequestBody ComputerModelDto computerModelDto) {
        return computerModelService.addModelFromComputer(computerModelDto);
    }

    @GetMapping("/filters")
    public List<ComputerModelDto> getModelsFromFilter(@RequestBody ComputerFilterDto computerFilterDto) {
        return computerModelService.findByFilter(computerFilterDto);
    }
}
