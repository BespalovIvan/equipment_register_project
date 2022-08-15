package com.ivanbespalov.study.equipment_register_project.controller.computerController;

import com.ivanbespalov.study.equipment_register_project.dto.computerDto.ComputerModelDto;
import com.ivanbespalov.study.equipment_register_project.service.computerService.ComputerModelService;
import org.springframework.web.bind.annotation.*;

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
                                                    @RequestBody ComputerModelDto computerModelDto){
        return computerModelService.addModelFromComputer(id,computerModelDto);
    }
}
