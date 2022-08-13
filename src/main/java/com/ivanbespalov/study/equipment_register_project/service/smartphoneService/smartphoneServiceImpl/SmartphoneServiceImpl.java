package com.ivanbespalov.study.equipment_register_project.service.smartphoneService.smartphoneServiceImpl;

import com.ivanbespalov.study.equipment_register_project.dao.smartphoneRepository.SmartphoneRepository;
import com.ivanbespalov.study.equipment_register_project.dto.smartphoneDto.SmartphoneDto;
import com.ivanbespalov.study.equipment_register_project.entity.smartphone.Smartphone;
import com.ivanbespalov.study.equipment_register_project.service.smartphoneService.SmartphoneService;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class SmartphoneServiceImpl implements SmartphoneService {

    private final SmartphoneRepository smartphoneRepository;

    public SmartphoneServiceImpl(SmartphoneRepository smartphoneRepository) {
        this.smartphoneRepository = smartphoneRepository;
    }

    @Override
    public SmartphoneDto saveSmartphone(SmartphoneDto smartphoneDto) {
        Smartphone smartphone = new Smartphone(smartphoneDto);
        smartphoneRepository.save(smartphone);
        return new SmartphoneDto(smartphone);
    }

    @Override
    public SmartphoneDto getSmartphoneById(UUID id) {
        Smartphone smartphone = smartphoneRepository
                .findById(id)
                .orElseThrow(() -> new NullPointerException("smartphone with id " + id + " not found"));
        return new SmartphoneDto(smartphone);
    }
}
