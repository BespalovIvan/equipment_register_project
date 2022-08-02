package com.ivanbespalov.study.equipment_register_project.dao;

import com.ivanbespalov.study.equipment_register_project.entity.ModelSmartphone;
import com.ivanbespalov.study.equipment_register_project.entity.Smartphone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ModelSmartphoneRepository extends JpaRepository<ModelSmartphone,Integer> {
    List<ModelSmartphone> findByColorIgnoreCase(String color);

    List<ModelSmartphone> findByPriceBetween(int min,int max);

    List<ModelSmartphone> findByNameIgnoreCase (String name);

    ModelSmartphone findBySerialNumber(int serialNumber);

    List<ModelSmartphone> findBySize(String size);

    List<ModelSmartphone> findByMemory(String memory);

    List<ModelSmartphone> findByNumberOfCameras(int numberOfCameras);

    List<ModelSmartphone> findByAvailability(boolean availability);

    List<ModelSmartphone> findByOrderByName();

    List<ModelSmartphone> findByOrderByPrice();

}
