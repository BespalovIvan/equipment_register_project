package com.ivanbespalov.study.equipment_register_project.service.computerService;

import com.ivanbespalov.study.equipment_register_project.dto.computerDto.ComputerDto;

import java.util.UUID;

public interface ComputerService {
    ComputerDto saveComputer(ComputerDto computerDto);

    ComputerDto getComputerById(UUID id);

    ComputerDto updateComputer(ComputerDto computerDto);

    String deleteComputer(UUID id);


}
