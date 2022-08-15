package com.ivanbespalov.study.equipment_register_project.service.smartphoneService.smartphoneServiceImpl;

import com.ivanbespalov.study.equipment_register_project.repository.smartphoneRepository.SmartphoneModelRepository;
import com.ivanbespalov.study.equipment_register_project.repository.smartphoneRepository.SmartphoneRepository;
import com.ivanbespalov.study.equipment_register_project.dto.smartphoneDto.SmartphoneModelDto;
import com.ivanbespalov.study.equipment_register_project.model.smartphone.SmartphoneModel;
import com.ivanbespalov.study.equipment_register_project.model.smartphone.Smartphone;
import com.ivanbespalov.study.equipment_register_project.service.smartphoneService.SmartphoneModelService;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class SmartphoneModelServiceImpl implements SmartphoneModelService {

    private final SmartphoneModelRepository smartphoneModelRepository;
    private final SmartphoneRepository smartphoneRepository;

    public SmartphoneModelServiceImpl(SmartphoneModelRepository smartphoneModelRepository,
                                      SmartphoneRepository smartphoneRepository) {
        this.smartphoneModelRepository = smartphoneModelRepository;
        this.smartphoneRepository = smartphoneRepository;
    }

    @Override
    public SmartphoneModelDto addNewModelFromSmartphone(UUID id, SmartphoneModelDto smartphoneModelDto) {
        SmartphoneModel smartphoneModel = new SmartphoneModel(smartphoneModelDto);
        smartphoneModelRepository.save(smartphoneModel);
        Smartphone smartphoneFromAdd = smartphoneRepository
                .findById(id)
                .orElseThrow(() -> new NullPointerException("smartphone with id " + id + " not found"));
        smartphoneFromAdd.getModels().add(smartphoneModel);
        smartphoneRepository.save(smartphoneFromAdd);
        return new SmartphoneModelDto(smartphoneModel);
    }
}
