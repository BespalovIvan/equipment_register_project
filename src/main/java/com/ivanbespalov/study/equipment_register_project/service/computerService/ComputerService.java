package com.ivanbespalov.study.equipment_register_project.service.computerService;

import com.ivanbespalov.study.equipment_register_project.dto.computerDto.ComputerDto;
import com.ivanbespalov.study.equipment_register_project.model.computer.Computer;

import java.util.List;

public interface ComputerService {
    ComputerDto addNewComputer(ComputerDto computerDto);

    ComputerDto getComputerByName(String name);

    List<ComputerDto> getAllComputers();

}
