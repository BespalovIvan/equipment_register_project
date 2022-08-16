package com.ivanbespalov.study.equipment_register_project.service.FridgeService.FridgeServiceImpl;

import com.ivanbespalov.study.equipment_register_project.dto.fridgeDto.FridgeModelDto;
import com.ivanbespalov.study.equipment_register_project.model.fridge.Fridge;
import com.ivanbespalov.study.equipment_register_project.model.fridge.FridgeModel;
import com.ivanbespalov.study.equipment_register_project.repository.fridgeRepository.FridgeModelRepository;
import com.ivanbespalov.study.equipment_register_project.repository.fridgeRepository.FridgeRepository;
import com.ivanbespalov.study.equipment_register_project.service.FridgeService.FridgeModelService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class FridgeModelServiceImpl implements FridgeModelService {

    private final FridgeModelRepository fridgeModelRepository;
    private final FridgeRepository fridgeRepository;

    public FridgeModelServiceImpl(FridgeModelRepository fridgeModelRepository, FridgeRepository fridgeRepository) {
        this.fridgeModelRepository = fridgeModelRepository;
        this.fridgeRepository = fridgeRepository;
    }

    @Override
    public FridgeModelDto addNewFridgeModel(UUID id, FridgeModelDto fridgeModelDto) {
        FridgeModel fridgeModel = new FridgeModel(fridgeModelDto);
        fridgeModelRepository.save(fridgeModel);
        Fridge fridge = fridgeRepository
                .findById(id)
                .orElseThrow(() -> new NullPointerException("fridge with id " + id + " not found"));
        fridge.getFridgeModels().add(fridgeModel);
        fridgeRepository.save(fridge);
        return new FridgeModelDto(fridgeModel);
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
        List<FridgeModel> models = fridgeModelRepository.findByPriceBetween(min,max);
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
