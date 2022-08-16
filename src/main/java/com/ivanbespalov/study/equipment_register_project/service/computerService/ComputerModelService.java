package com.ivanbespalov.study.equipment_register_project.service.computerService;

import com.ivanbespalov.study.equipment_register_project.dto.computerDto.ComputerModelDto;

import java.util.List;
import java.util.UUID;

public interface ComputerModelService {
    ComputerModelDto addModelFromComputer(UUID id, ComputerModelDto computerModelDto);

    List<ComputerModelDto> getModelsByColor(String color);

    List<ComputerModelDto> getModelsByPrice(int min, int max);

    List<ComputerModelDto> getModelsByCategory(String category);

    List<ComputerModelDto> getModelsByCpu(String cpu);

}
