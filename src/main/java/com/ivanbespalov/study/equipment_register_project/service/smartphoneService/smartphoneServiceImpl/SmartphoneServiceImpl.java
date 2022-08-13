package com.ivanbespalov.study.equipment_register_project.service.smartphoneService.smartphoneServiceImpl;

import com.ivanbespalov.study.equipment_register_project.dao.smartphoneRepository.SmartphoneRepository;
import com.ivanbespalov.study.equipment_register_project.dto.smartphoneDto.SmartphoneDto;
import com.ivanbespalov.study.equipment_register_project.entity.smartphone.Smartphone;
import com.ivanbespalov.study.equipment_register_project.service.smartphoneService.SmartphoneService;
import org.springframework.stereotype.Service;

@Service
public class SmartphoneServiceImpl implements SmartphoneService {

    private final SmartphoneRepository smartphoneRepository;

    public SmartphoneServiceImpl(SmartphoneRepository smartphoneRepository) {
        this.smartphoneRepository = smartphoneRepository;
    }

    @Override
    public SmartphoneDto addNewSmartphone(SmartphoneDto smartphoneDto) {
        Smartphone smartphone = new Smartphone(smartphoneDto);
        smartphoneRepository.save(smartphone);
        return new SmartphoneDto(smartphone);
    }
}
