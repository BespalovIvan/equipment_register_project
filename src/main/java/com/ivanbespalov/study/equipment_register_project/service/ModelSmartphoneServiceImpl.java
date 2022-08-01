package com.ivanbespalov.study.equipment_register_project.service;

import com.ivanbespalov.study.equipment_register_project.dao.ModelSmartphoneRepository;
import com.ivanbespalov.study.equipment_register_project.entity.ModelSmartphone;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ModelSmartphoneServiceImpl implements ModelSmartphoneService {

    private final ModelSmartphoneRepository modelSmartphoneRepository;

    public ModelSmartphoneServiceImpl(ModelSmartphoneRepository modelSmartphoneRepository) {
        this.modelSmartphoneRepository = modelSmartphoneRepository;
    }

    @Override
    public List<ModelSmartphone> getAllModelsForSmartphone(int id) {
        return modelSmartphoneRepository.findBySmartphoneId(id);
    }

    @Override
    public void addNewModelForSmartphone(ModelSmartphone modelSmartphone) {
        modelSmartphoneRepository.save(modelSmartphone);
    }

    @Override
    public List<ModelSmartphone> getAllSmartphonesFromColor(String color) {

        return modelSmartphoneRepository.findByColorIgnoreCase(color);

    }

    @Override
    public List<ModelSmartphone> getAllSmartphonesFromPrice(int min, int max) {
        return modelSmartphoneRepository.findByPriceBetween(min, max);
    }
}
