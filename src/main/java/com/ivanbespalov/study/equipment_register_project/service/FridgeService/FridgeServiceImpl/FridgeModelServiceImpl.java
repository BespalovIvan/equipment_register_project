package com.ivanbespalov.study.equipment_register_project.service.FridgeService.FridgeServiceImpl;

import com.ivanbespalov.study.equipment_register_project.dto.fridgeDto.FridgeFilterDto;
import com.ivanbespalov.study.equipment_register_project.dto.fridgeDto.FridgeModelDto;
import com.ivanbespalov.study.equipment_register_project.model.fridge.Fridge;
import com.ivanbespalov.study.equipment_register_project.model.fridge.FridgeModel;
import com.ivanbespalov.study.equipment_register_project.repository.fridgeRepository.FridgeModelRepository;
import com.ivanbespalov.study.equipment_register_project.repository.fridgeRepository.FridgeRepository;
import com.ivanbespalov.study.equipment_register_project.service.FridgeService.FridgeModelService;
import com.ivanbespalov.study.equipment_register_project.utils.QPredicates;
import com.querydsl.core.types.Predicate;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import static com.ivanbespalov.study.equipment_register_project.model.fridge.QFridgeModel.fridgeModel;

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
    public List<FridgeModelDto> findByFilter(FridgeFilterDto fridgeFilterDto) {
        List<FridgeModel> fridgeModels = new ArrayList<>();
        List<FridgeModelDto> result = new ArrayList<>();
        Predicate predicate = QPredicates.builder()
                .add(fridgeFilterDto.getCountDoor(), fridgeModel.countDoor::eq)
                .add(fridgeFilterDto.getColor(), fridgeModel.color::containsIgnoreCase)
                .add(fridgeFilterDto.getCompressorType(), fridgeModel.compressorType::containsIgnoreCase)
                .buildAnd();
        Iterable<FridgeModel> filterModels = fridgeModelRepository.findAll(predicate);
        filterModels.forEach(fridgeModels::add);
        fridgeModels.forEach(model -> result.add(new FridgeModelDto(model)));
        return result;
    }
}
