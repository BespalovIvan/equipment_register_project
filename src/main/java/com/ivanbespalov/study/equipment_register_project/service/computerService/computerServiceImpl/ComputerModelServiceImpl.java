package com.ivanbespalov.study.equipment_register_project.service.computerService.computerServiceImpl;

import com.ivanbespalov.study.equipment_register_project.dto.computerDto.ComputerModelDto;
import com.ivanbespalov.study.equipment_register_project.model.computer.Computer;
import com.ivanbespalov.study.equipment_register_project.model.computer.ComputerModel;
import com.ivanbespalov.study.equipment_register_project.repository.computerRepository.ComputerModelRepository;
import com.ivanbespalov.study.equipment_register_project.repository.computerRepository.ComputerRepository;
import com.ivanbespalov.study.equipment_register_project.service.computerService.ComputerModelService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class ComputerModelServiceImpl implements ComputerModelService {
    private final ComputerModelRepository computerModelRepository;
    private final ComputerRepository computerRepository;

    public ComputerModelServiceImpl(ComputerModelRepository computerModelRepository,
                                    ComputerRepository computerRepository) {
        this.computerModelRepository = computerModelRepository;
        this.computerRepository = computerRepository;
    }

    @Override
    public ComputerModelDto addModelFromComputer(UUID id, ComputerModelDto computerModelDto) {

        ComputerModel computerModel = new ComputerModel(computerModelDto);
        computerModelRepository.save(computerModel);
        Computer computer = computerRepository
                .findById(id)
                .orElseThrow(() -> new NullPointerException("computer with id " + id + " not found"));
        computer.getComputerModels().add(computerModel);
        computerRepository.save(computer);
        return new ComputerModelDto(computerModel);
    }

    @Override
    public List<ComputerModelDto> getModelsByColor(String color) {
        List<ComputerModel> models = computerModelRepository.findByColorIgnoreCase(color);
        List<ComputerModelDto> modelsDto = new ArrayList<>();
        models.forEach(model -> modelsDto.add(new ComputerModelDto(model)));
        return modelsDto;
    }

    @Override
    public List<ComputerModelDto> getModelsByPrice(int min, int max) {

        List<ComputerModel> modelByPriceBetween = computerModelRepository.findByPriceBetween(min, max);
        List<ComputerModelDto> computerModelDto = new ArrayList<>();
        modelByPriceBetween.forEach(model -> computerModelDto.add(new ComputerModelDto(model)));
        return computerModelDto;
    }

    @Override
    public List<ComputerModelDto> getModelsByCategory(String category) {

        List<ComputerModel> modelByCategory = computerModelRepository.findByCategoryIgnoreCase(category);
        List<ComputerModelDto> computerModelDto = new ArrayList<>();
        modelByCategory.forEach(model -> computerModelDto.add(new ComputerModelDto(model)));
        return computerModelDto;
    }

    @Override
    public List<ComputerModelDto> getModelsByCpu(String cpu) {

        List<ComputerModel> modelByCpu = computerModelRepository.findByCpuIgnoreCase(cpu);
        List<ComputerModelDto> computerModelDto = new ArrayList<>();
        modelByCpu.forEach(model -> computerModelDto.add(new ComputerModelDto(model)));
        return computerModelDto;
    }
}
