package com.ivanbespalov.study.equipment_register_project.dao;

import com.ivanbespalov.study.equipment_register_project.entity.ModelSmartphone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ModelSmartphoneRepository extends JpaRepository<ModelSmartphone,Integer> {
    List<ModelSmartphone> findByColorIgnoreCase(String color);

    List<ModelSmartphone> findByPriceBetween(int min,int max);
}
