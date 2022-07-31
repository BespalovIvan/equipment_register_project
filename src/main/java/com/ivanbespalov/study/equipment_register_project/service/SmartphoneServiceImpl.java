package com.ivanbespalov.study.equipment_register_project.service;

import com.ivanbespalov.study.equipment_register_project.dao.SmartphoneRepository;
import com.ivanbespalov.study.equipment_register_project.entity.Smartphone;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SmartphoneServiceImpl implements SmartphoneService {

    private final SmartphoneRepository smartphoneRepository;

    public SmartphoneServiceImpl(SmartphoneRepository smartphoneRepository) {
        this.smartphoneRepository = smartphoneRepository;
    }

    @Override
    public List<Smartphone> getAllSmartphone() {
        return smartphoneRepository.findAll();
    }

    @Override
    public void addNewSmartphone(Smartphone smartphone) {
        smartphoneRepository.save(smartphone);
    }

    @Override
    public Smartphone getSmartphoneByName(String name) {
        return smartphoneRepository.findByNameIgnoreCase(name);
    }
}
