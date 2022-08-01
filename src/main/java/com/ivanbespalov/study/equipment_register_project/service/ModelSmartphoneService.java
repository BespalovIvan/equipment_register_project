package com.ivanbespalov.study.equipment_register_project.service;

import com.ivanbespalov.study.equipment_register_project.entity.ModelSmartphone;

import java.util.List;

public interface ModelSmartphoneService {

    List<ModelSmartphone> getAllModelsForSmartphone(int id);

    void addNewModelForSmartphone(ModelSmartphone modelSmartphone);

   List<ModelSmartphone> getAllSmartphonesFromColor(String color);

   List<ModelSmartphone> getAllSmartphonesFromPrice(int min,int max);

}
