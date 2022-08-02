package com.ivanbespalov.study.equipment_register_project.service.impl;

import com.ivanbespalov.study.equipment_register_project.dao.ModelSmartphoneRepository;
import com.ivanbespalov.study.equipment_register_project.entity.ModelSmartphone;
import com.ivanbespalov.study.equipment_register_project.service.ModelSmartphoneService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ModelSmartphoneServiceImpl implements ModelSmartphoneService {

    private final ModelSmartphoneRepository modelSmartphoneRepository;

    public ModelSmartphoneServiceImpl(ModelSmartphoneRepository modelSmartphoneRepository) {
        this.modelSmartphoneRepository = modelSmartphoneRepository;
    }

    @Override
    public List<ModelSmartphone> getAllModelsForSmartphone(String name) {
        return modelSmartphoneRepository.findByNameIgnoreCase(name);
    }

    @Override
    public List<ModelSmartphone> getAllModelsSmartphones() {

        return modelSmartphoneRepository.findAll();
    }

    @Override
    public ModelSmartphone addNewModelForSmartphone(ModelSmartphone modelSmartphone) {
        modelSmartphoneRepository.save(modelSmartphone);
        return modelSmartphone;
    }

    @Override
    public List<ModelSmartphone> getAllSmartphonesFromColor(String color) {

        return modelSmartphoneRepository.findByColorIgnoreCase(color);

    }

    @Override
    public List<ModelSmartphone> getAllSmartphonesFromPrice(int min, int max) {
        return modelSmartphoneRepository.findByPriceBetween(min, max);
    }

    @Override
    public ModelSmartphone getBySerialNumber(int serialNumber) {
        return modelSmartphoneRepository.findBySerialNumber(serialNumber);
    }

    @Override
    public List<ModelSmartphone> getBySize(String size) {
        return modelSmartphoneRepository.findBySize(size);
    }

    @Override
    public List<ModelSmartphone> getByMemory(String memory) {
        return modelSmartphoneRepository.findByMemory(memory);
    }

    @Override
    public List<ModelSmartphone> getByNumberOfCameras(int numberOfCameras) {
        return modelSmartphoneRepository.findByNumberOfCameras(numberOfCameras);
    }

    @Override
    public List<ModelSmartphone> getByAvailability(boolean availability) {
        return modelSmartphoneRepository.findByAvailability(availability);
    }

    @Override
    public List<ModelSmartphone> getAllModelsSmartphoneOrderByAlphabet() {
        return modelSmartphoneRepository.findByOrderByName();
    }

    @Override
    public List<ModelSmartphone> getAllModelsSmartphoneOrderByPrice() {
        return modelSmartphoneRepository.findByOrderByPrice();
    }
}
