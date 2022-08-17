package com.ivanbespalov.study.equipment_register_project.service.computerService.computerServiceImpl;

import com.ivanbespalov.study.equipment_register_project.dto.computerDto.ComputerFilterDto;
import com.ivanbespalov.study.equipment_register_project.dto.computerDto.ComputerModelDto;
import com.ivanbespalov.study.equipment_register_project.model.computer.Computer;
import com.ivanbespalov.study.equipment_register_project.model.computer.ComputerModel;
import com.ivanbespalov.study.equipment_register_project.repository.computerRepository.ComputerModelRepository;
import com.ivanbespalov.study.equipment_register_project.repository.computerRepository.ComputerRepository;
import com.ivanbespalov.study.equipment_register_project.service.computerService.ComputerModelService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    public ComputerModelDto addModelFromComputer(ComputerModelDto computerModelDto) {
        ComputerModel computerModel = new ComputerModel(computerModelDto);
        computerModelRepository.save(computerModel);
        Computer computer = computerRepository
                .findById(computerModelDto.getAppliancesId())
                .orElseThrow(() -> new NullPointerException("computer with id "
                        + computerModelDto.getAppliancesId() + " not found"));
        computer.getComputerModels().add(computerModel);
        computerRepository.save(computer);
        ComputerModelDto dtoResult = new ComputerModelDto(computerModel);
        dtoResult.setAppliancesId(computerModelDto.getAppliancesId());
        return dtoResult;
    }

    @Override
    public Map<String, List<ComputerModelDto>> filterModels(ComputerFilterDto computerFilterDto) {
        Map<String, List<ComputerModelDto>> result = new HashMap<>();
        if (computerFilterDto.getColor() != null) {
            result.put("Models by color " + computerFilterDto.getColor(), getModelsByColor(computerFilterDto.getColor()));
        }
        if (computerFilterDto.getPriceMin() != 0 &&
                computerFilterDto.getPriceMax() != 0) {
            result.put("Models by price " + computerFilterDto.getPriceMin() + computerFilterDto.getPriceMax(),
                    getModelsByPrice(computerFilterDto.getPriceMin(), computerFilterDto.getPriceMax()));
        }
        if (computerFilterDto.getCategory() != null) {
            result.put("Models by category " + computerFilterDto.getCategory(), getModelsByCategory(computerFilterDto.getCategory()));
        }
        if (computerFilterDto.getCpu() != null) {
            result.put("Models by cpu " + computerFilterDto.getCpu(), getModelsByCpu(computerFilterDto.getCpu()));
        }
        return result;
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
