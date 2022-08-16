package com.ivanbespalov.study.equipment_register_project.controller.computerController;

import com.ivanbespalov.study.equipment_register_project.dto.computerDto.ComputerDto;
import com.ivanbespalov.study.equipment_register_project.model.computer.Computer;
import com.ivanbespalov.study.equipment_register_project.service.computerService.ComputerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api")
public class ComputerController {

    private final ComputerService computerService;

    public ComputerController(ComputerService computerService) {
        this.computerService = computerService;
    }

    @PostMapping("/computers")
    public ComputerDto addNewComputer(@RequestBody ComputerDto computerDto){
        return computerService.addNewComputer(computerDto);
    }
    @GetMapping("/computers/{name}")
    public ComputerDto getComputerByName(@PathVariable String name){
        return computerService.getComputerByName(name);
    }

    @GetMapping("/computers")
    public List<ComputerDto> getAllComputers(){
       return computerService.getAllComputers();
    }
}
