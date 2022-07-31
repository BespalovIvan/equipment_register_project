package com.ivanbespalov.study.equipment_register_project.service;

import com.ivanbespalov.study.equipment_register_project.entity.ModelSmartphone;

import java.util.List;

public interface ModelSmartphoneService {

    List<ModelSmartphone> getAllModelsSmartphone(int id);

    void addNewModelForSmartphone(int id, ModelSmartphone modelSmartphone);

   List<ModelSmartphone> getAllSmartphonesFromColor(String color);

   List<ModelSmartphone> getAllSmartphonesFromPrice(int min,int max);

}
