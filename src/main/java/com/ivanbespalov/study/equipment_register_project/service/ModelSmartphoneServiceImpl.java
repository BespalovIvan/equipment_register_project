package com.ivanbespalov.study.equipment_register_project.service;

import com.ivanbespalov.study.equipment_register_project.dao.ModelSmartphoneRepository;
import com.ivanbespalov.study.equipment_register_project.dao.SmartphoneRepository;
import com.ivanbespalov.study.equipment_register_project.entity.ModelSmartphone;
import com.ivanbespalov.study.equipment_register_project.entity.Smartphone;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ModelSmartphoneServiceImpl implements ModelSmartphoneService {

    private final ModelSmartphoneRepository modelSmartphoneRepository;
    private final SmartphoneRepository smartphoneRepository;

    public ModelSmartphoneServiceImpl(ModelSmartphoneRepository modelSmartphoneRepository, SmartphoneRepository smartphoneRepository) {
        this.modelSmartphoneRepository = modelSmartphoneRepository;
        this.smartphoneRepository = smartphoneRepository;
    }

    @Override
    public List<ModelSmartphone> getAllModelsSmartphone(int id) {
        Smartphone smartphone;
        try {
            Optional<Smartphone> optionalSmartphone = smartphoneRepository.findById(id);
            if (optionalSmartphone.isPresent()) {
                smartphone = optionalSmartphone.get();
                return smartphone.getModelsSmartphone();
            }
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
        throw new NullPointerException("Not found smartphone");
    }

    @Override
    public void addNewModelForSmartphone(int id, ModelSmartphone modelSmartphone) {
        modelSmartphoneRepository.save(modelSmartphone);
        Smartphone smartphone;
        Optional<Smartphone> optionalSmartphone = smartphoneRepository.findById(id);
        if (optionalSmartphone.isPresent()) {
            smartphone = optionalSmartphone.get();
            smartphone.getModelsSmartphone().add(modelSmartphone);
            smartphoneRepository.save(smartphone);
        }
    }

    @Override
    public List<ModelSmartphone> getAllSmartphonesFromColor(String color) {

        return modelSmartphoneRepository.findByColorIgnoreCase(color);

    }

    @Override
    public List<ModelSmartphone> getAllSmartphonesFromPrice(int min, int max) {
        return modelSmartphoneRepository.findByPriceBetween(min,max);
    }
}
