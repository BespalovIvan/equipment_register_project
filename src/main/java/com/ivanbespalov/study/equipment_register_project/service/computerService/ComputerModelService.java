package com.ivanbespalov.study.equipment_register_project.service.computerService;

import com.ivanbespalov.study.equipment_register_project.dto.computerDto.ComputerFilterDto;
import com.ivanbespalov.study.equipment_register_project.dto.computerDto.ComputerModelDto;

import java.util.List;

public interface ComputerModelService {
    ComputerModelDto addModelFromComputer(ComputerModelDto computerModelDto);

    List<ComputerModelDto> findByFilter(ComputerFilterDto filterDto);
}
