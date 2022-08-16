package com.ivanbespalov.study.equipment_register_project.service.FridgeService.FridgeServiceImpl;

import com.ivanbespalov.study.equipment_register_project.dto.fridgeDto.FridgeDto;
import com.ivanbespalov.study.equipment_register_project.model.fridge.Fridge;
import com.ivanbespalov.study.equipment_register_project.repository.fridgeRepository.FridgeRepository;
import com.ivanbespalov.study.equipment_register_project.service.FridgeService.FridgeService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FridgeServiceImpl implements FridgeService {

    private final FridgeRepository fridgeRepository;

    public FridgeServiceImpl(FridgeRepository fridgeRepository) {
        this.fridgeRepository = fridgeRepository;
    }

    @Override
    public FridgeDto addNewFridge(FridgeDto fridgeDto) {
        Fridge fridge = new Fridge(fridgeDto);
        fridgeRepository.save(fridge);
        return new FridgeDto(fridge);
    }

    @Override
    public FridgeDto getFridgeByName(String name) {
        Fridge fridge = fridgeRepository.findByNameIgnoreCase(name)
                .orElseThrow(() -> new NullPointerException("Fridge with name " + name + " not found"));
        return new FridgeDto(fridge);
    }

    @Override
    public List<FridgeDto> getFridges() {
        List<Fridge> fridges = fridgeRepository.findAll();
        List<FridgeDto> fridgeDto = new ArrayList<>();
        fridges.forEach(fridge -> fridgeDto.add(new FridgeDto(fridge)));
        return fridgeDto;
    }
}
