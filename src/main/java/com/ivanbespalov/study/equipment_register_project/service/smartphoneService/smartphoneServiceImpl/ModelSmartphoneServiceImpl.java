package com.ivanbespalov.study.equipment_register_project.service.smartphoneService.smartphoneServiceImpl;

import com.ivanbespalov.study.equipment_register_project.dao.smartphoneRepository.ModelSmartphoneRepository;
import com.ivanbespalov.study.equipment_register_project.dao.smartphoneRepository.SmartphoneRepository;
import com.ivanbespalov.study.equipment_register_project.dto.smartphoneDto.ModelSmartphoneDto;
import com.ivanbespalov.study.equipment_register_project.entity.smartphone.ModelSmartphone;
import com.ivanbespalov.study.equipment_register_project.entity.smartphone.Smartphone;
import com.ivanbespalov.study.equipment_register_project.service.smartphoneService.ModelSmartphoneService;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class ModelSmartphoneServiceImpl implements ModelSmartphoneService {

    private final ModelSmartphoneRepository modelSmartphoneRepository;
    private final SmartphoneRepository smartphoneRepository;

    public ModelSmartphoneServiceImpl(ModelSmartphoneRepository modelSmartphoneRepository,
                                      SmartphoneRepository smartphoneRepository) {
        this.modelSmartphoneRepository = modelSmartphoneRepository;
        this.smartphoneRepository = smartphoneRepository;
    }

    @Override
    public ModelSmartphoneDto addNewModelFromSmartphone(UUID id, ModelSmartphoneDto modelSmartphoneDto) {
        ModelSmartphone modelSmartphone = new ModelSmartphone(modelSmartphoneDto);
        modelSmartphoneRepository.save(modelSmartphone);
        Smartphone smartphoneFromAdd = smartphoneRepository
                .findById(id)
                .orElseThrow(() -> new NullPointerException("smartphone with id " + id + " not found"));
        smartphoneFromAdd.getModelSmartphones().add(modelSmartphone);
        smartphoneRepository.save(smartphoneFromAdd);
        return new ModelSmartphoneDto(modelSmartphone);
    }
}
