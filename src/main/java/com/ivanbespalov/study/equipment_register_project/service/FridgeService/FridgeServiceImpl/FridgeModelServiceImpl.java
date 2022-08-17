package com.ivanbespalov.study.equipment_register_project.service.FridgeService.FridgeServiceImpl;

import com.ivanbespalov.study.equipment_register_project.dto.computerDto.ComputerModelDto;
import com.ivanbespalov.study.equipment_register_project.dto.fridgeDto.FridgeFilterDto;
import com.ivanbespalov.study.equipment_register_project.dto.fridgeDto.FridgeModelDto;
import com.ivanbespalov.study.equipment_register_project.model.fridge.Fridge;
import com.ivanbespalov.study.equipment_register_project.model.fridge.FridgeModel;
import com.ivanbespalov.study.equipment_register_project.repository.fridgeRepository.FridgeModelRepository;
import com.ivanbespalov.study.equipment_register_project.repository.fridgeRepository.FridgeRepository;
import com.ivanbespalov.study.equipment_register_project.service.FridgeService.FridgeModelService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class FridgeModelServiceImpl implements FridgeModelService {

    private final FridgeModelRepository fridgeModelRepository;
    private final FridgeRepository fridgeRepository;

    public FridgeModelServiceImpl(FridgeModelRepository fridgeModelRepository, FridgeRepository fridgeRepository) {
        this.fridgeModelRepository = fridgeModelRepository;
        this.fridgeRepository = fridgeRepository;
    }

    @Override
    public FridgeModelDto addNewFridgeModel(FridgeModelDto fridgeModelDto) {
        FridgeModel fridgeModel = new FridgeModel(fridgeModelDto);
        fridgeModelRepository.save(fridgeModel);
        Fridge fridge = fridgeRepository
                .findById(fridgeModelDto.getAppliancesId())
                .orElseThrow(() -> new NullPointerException("fridge with id "
                        + fridgeModelDto.getAppliancesId() + " not found"));
        fridge.getFridgeModels().add(fridgeModel);
        fridgeRepository.save(fridge);
        FridgeModelDto resultDto = new FridgeModelDto(fridgeModel);
        resultDto.setAppliancesId(fridgeModelDto.getAppliancesId());
        return resultDto;
    }

    @Override
    public Map<String, List<FridgeModelDto>> getModelsByFilter(FridgeFilterDto fridgeFilterDto) {
        Map<String, List<FridgeModelDto>> result = new HashMap<>();
        if (fridgeFilterDto.getColor() != null) {
            result.put("Models by color " + fridgeFilterDto.getColor(), getModelsByColor(fridgeFilterDto.getColor()));
        }
        if (fridgeFilterDto.getPriceMin() != 0 &&
                fridgeFilterDto.getPriceMax() != 0) {
            result.put("Models by price " + fridgeFilterDto.getPriceMin() + fridgeFilterDto.getPriceMax(),
                    getModelsByPrice(fridgeFilterDto.getPriceMin(), fridgeFilterDto.getPriceMax()));
        }
        if (fridgeFilterDto.getCountDoor() != 0) {
            result.put("Models by count door " + fridgeFilterDto.getCountDoor(),
                    getModelsByCountDoor(fridgeFilterDto.getCountDoor()));
        }
        if (fridgeFilterDto.getCompressorType() != null) {
            result.put("Models by price " + fridgeFilterDto.getCompressorType(),
                    getModelsByCompressorType(fridgeFilterDto.getCompressorType()));
        }
        return result;
    }

    @Override
    public List<FridgeModelDto> getModelsByColor(String color) {
        List<FridgeModel> models = fridgeModelRepository.findByColorIgnoreCase(color);
        List<FridgeModelDto> modelsDto = new ArrayList<>();
        models.forEach(model -> modelsDto.add(new FridgeModelDto(model)));
        return modelsDto;
    }

    @Override
    public List<FridgeModelDto> getModelsByPrice(int min, int max) {
        List<FridgeModel> models = fridgeModelRepository.findByPriceBetween(min, max);
        List<FridgeModelDto> modelsDto = new ArrayList<>();
        models.forEach(model -> modelsDto.add(new FridgeModelDto(model)));
        return modelsDto;
    }

    @Override
    public List<FridgeModelDto> getModelsByCountDoor(int countDoor) {
        List<FridgeModel> models = fridgeModelRepository.findByCountDoor(countDoor);
        List<FridgeModelDto> modelsDto = new ArrayList<>();
        models.forEach(model -> modelsDto.add(new FridgeModelDto(model)));
        return modelsDto;
    }

    @Override
    public List<FridgeModelDto> getModelsByCompressorType(String compressorType) {
        List<FridgeModel> models = fridgeModelRepository.findByCompressorTypeIgnoreCase(compressorType);
        List<FridgeModelDto> modelsDto = new ArrayList<>();
        models.forEach(model -> modelsDto.add(new FridgeModelDto(model)));
        return modelsDto;
    }
}
