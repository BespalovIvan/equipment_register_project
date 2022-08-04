package com.ivanbespalov.study.equipment_register_project.service;

import com.ivanbespalov.study.equipment_register_project.dto.ModelSmartphoneDto;
import com.ivanbespalov.study.equipment_register_project.dto.SmartphoneDto;
import com.ivanbespalov.study.equipment_register_project.entity.Smartphone;

import java.util.List;

public interface SmartphoneService {
    List<SmartphoneDto> getAllSmartphone();

    Smartphone getSmartphoneByID(int id);

    void updateSmartphone(Smartphone smartphone);

    List<ModelSmartphoneDto> getModelsSmartphoneByName(String name);

    List<SmartphoneDto> getAllSmartphoneOrderByAlphabet();

    SmartphoneDto addNewSmartphone(SmartphoneDto smartphone);

}
