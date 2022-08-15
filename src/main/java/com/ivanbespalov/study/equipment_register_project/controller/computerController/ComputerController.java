package com.ivanbespalov.study.equipment_register_project.controller.computerController;

import com.ivanbespalov.study.equipment_register_project.dto.computerDto.ComputerDto;
import com.ivanbespalov.study.equipment_register_project.service.computerService.ComputerService;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("api")
public class ComputerController {

    private final ComputerService computerService;

    public ComputerController(ComputerService computerService) {
        this.computerService = computerService;
    }

    @PostMapping("/computers")
    public ComputerDto addNewComputer(@RequestBody ComputerDto computerDto){
        return computerService.saveComputer(computerDto);
    }
    @GetMapping("/computers/{id}")
    public ComputerDto getComputerById(@PathVariable UUID id){
        return computerService.getComputerById(id);
    }
    @PutMapping("/computers")
    public ComputerDto updateComputer(@RequestBody ComputerDto computerDto){
        return computerService.updateComputer(computerDto);
    }
    @DeleteMapping("/computers/{id}")
    public String deleteComputer(@PathVariable UUID id){
        return computerService.deleteComputer(id);
    }


}
