package com.ivanbespalov.study.equipment_register_project.service.FridgeService.FridgeServiceImpl;

import com.ivanbespalov.study.equipment_register_project.dto.fridgeDto.FridgeDto;
import com.ivanbespalov.study.equipment_register_project.model.fridge.Fridge;
import com.ivanbespalov.study.equipment_register_project.repository.fridgeRepository.FridgeRepository;
import com.ivanbespalov.study.equipment_register_project.service.FridgeService.FridgeService;
import org.springframework.stereotype.Service;

@Service
public class FridgeServiceImpl implements FridgeService {

    private final FridgeRepository fridgeRepository;

    public FridgeServiceImpl(FridgeRepository fridgeRepository) {
        this.fridgeRepository = fridgeRepository;
    }

    @Override
    public FridgeDto saveFridge(FridgeDto fridgeDto) {
        Fridge fridge = new Fridge(fridgeDto);
        fridgeRepository.save(fridge);
        return new FridgeDto(fridge);
    }
}
