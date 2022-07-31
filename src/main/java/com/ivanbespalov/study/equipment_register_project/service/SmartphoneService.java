package com.ivanbespalov.study.equipment_register_project.service;

import com.ivanbespalov.study.equipment_register_project.entity.Smartphone;

import java.util.List;

public interface SmartphoneService {
    List<Smartphone> getAllSmartphone();

    void addNewSmartphone(Smartphone smartphone);

    Smartphone getSmartphoneByName(String name);

}
