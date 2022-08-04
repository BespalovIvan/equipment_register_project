package com.ivanbespalov.study.equipment_register_project.service.impl;

import com.ivanbespalov.study.equipment_register_project.dao.SmartphoneRepository;
import com.ivanbespalov.study.equipment_register_project.dto.ModelSmartphoneDto;
import com.ivanbespalov.study.equipment_register_project.dto.SmartphoneDto;
import com.ivanbespalov.study.equipment_register_project.entity.ModelSmartphone;
import com.ivanbespalov.study.equipment_register_project.entity.Smartphone;
import com.ivanbespalov.study.equipment_register_project.service.SmartphoneService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class SmartphoneServiceImpl implements SmartphoneService {

    private final SmartphoneRepository smartphoneRepository;

    public SmartphoneServiceImpl(SmartphoneRepository smartphoneRepository) {
        this.smartphoneRepository = smartphoneRepository;
    }

    @Override
    public List<SmartphoneDto> getAllSmartphone() {

        List<Smartphone> smartphones = smartphoneRepository.findAll();
        List<SmartphoneDto> smartphoneDtoList = new ArrayList<>();

        for (Smartphone s : smartphones) {
            smartphoneDtoList.add(new SmartphoneDto(s.getName(),
                    s.getCountryOfManufacturer(),
                    s.getFirm(),
                    s.isOrderOnline(),
                    s.isCredit()));
        }
        return smartphoneDtoList;
    }

    @Override
    public Smartphone getSmartphoneByID(int id) {
        Optional<Smartphone> smartphoneOptional = smartphoneRepository.findById(id);
        return smartphoneOptional.orElseThrow(NullPointerException::new);
    }

    @Override
    public List<ModelSmartphoneDto> getModelsSmartphoneByName(String name) {

        Smartphone smartphone = smartphoneRepository.findByNameIgnoreCase(name);
        List<ModelSmartphone> modelSmartphones = smartphone.getModelSmartphones();
        List<ModelSmartphoneDto> modelSmartphoneDtoList = new ArrayList<>();

        for (ModelSmartphone model : modelSmartphones) {
            modelSmartphoneDtoList.add(new ModelSmartphoneDto(model.getName(),
                    model.getSerialNumber(),
                    model.getColor(),
                    model.getSize(),
                    model.getPrice(),
                    model.getMemory(),
                    model.getNumberOfCameras(),
                    model.isAvailability()));
        }
        return modelSmartphoneDtoList;
    }

    @Override
    public List<SmartphoneDto> getAllSmartphoneOrderByAlphabet() {

        List<Smartphone> smartphones = smartphoneRepository.findByOrderByName();
        List<SmartphoneDto> smartphoneDtoList = new ArrayList<>();
        for (Smartphone s : smartphones) {
            smartphoneDtoList.add(new SmartphoneDto(s.getName(),
                    s.getCountryOfManufacturer(),
                    s.getFirm(),
                    s.isOrderOnline(),
                    s.isCredit()));
        }
        return smartphoneDtoList;
    }

    @Override
    public SmartphoneDto addNewSmartphone(SmartphoneDto smartphoneDto) {

        Smartphone smartphone = new Smartphone(
                smartphoneDto.getName(),
                smartphoneDto.getCountryOfManufacturer(),
                smartphoneDto.getFirm(),
                smartphoneDto.isOrderOnline(),
                smartphoneDto.isCredit());

        smartphoneRepository.save(smartphone);

        return smartphoneDto;
    }

    @Override
    public void updateSmartphone(Smartphone smartphone) {
        smartphoneRepository.save(smartphone);
    }
}
