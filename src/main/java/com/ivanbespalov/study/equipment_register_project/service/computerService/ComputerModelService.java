package com.ivanbespalov.study.equipment_register_project.service.computerService;

import com.ivanbespalov.study.equipment_register_project.dto.computerDto.ComputerFilterDto;
import com.ivanbespalov.study.equipment_register_project.dto.computerDto.ComputerModelDto;

import java.util.List;
import java.util.Map;

public interface ComputerModelService {
    ComputerModelDto addModelFromComputer(ComputerModelDto computerModelDto);

    List<ComputerModelDto> getModelsByColor(String color);

    List<ComputerModelDto> getModelsByPrice(int min, int max);

    List<ComputerModelDto> getModelsByCategory(String category);

    List<ComputerModelDto> getModelsByCpu(String cpu);

    Map<String,List<ComputerModelDto>> filterModels(ComputerFilterDto computerFilterDto);
}
