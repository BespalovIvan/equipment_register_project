package com.ivanbespalov.study.equipment_register_project.service.computerService;

import com.ivanbespalov.study.equipment_register_project.dto.computerDto.ComputerModelDto;

import java.util.UUID;

public interface ComputerModelService {
    ComputerModelDto addModelFromComputer(UUID id, ComputerModelDto computerModelDto);

}
