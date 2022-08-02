package com.ivanbespalov.study.equipment_register_project.service;

import com.ivanbespalov.study.equipment_register_project.entity.ModelSmartphone;

import java.util.List;

public interface ModelSmartphoneService {

    List<ModelSmartphone> getAllModelsSmartphones();

    List<ModelSmartphone> getAllModelsForSmartphone(String name);

    ModelSmartphone addNewModelForSmartphone(ModelSmartphone modelSmartphone);

    List<ModelSmartphone> getAllSmartphonesFromColor(String color);

    List<ModelSmartphone> getAllSmartphonesFromPrice(int min, int max);

    ModelSmartphone getBySerialNumber(int serialNumber);

    List<ModelSmartphone> getBySize(String size);

    List<ModelSmartphone> getByMemory(String memory);

    List<ModelSmartphone> getByNumberOfCameras(int numberOfCameras);

    List<ModelSmartphone> getByAvailability(boolean availability);

    List<ModelSmartphone> getAllModelsSmartphoneOrderByAlphabet();

    List<ModelSmartphone> getAllModelsSmartphoneOrderByPrice();

}
