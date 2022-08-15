package com.ivanbespalov.study.equipment_register_project.repository.smartphoneRepository;

import com.ivanbespalov.study.equipment_register_project.model.smartphone.SmartphoneModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SmartphoneModelRepository extends JpaRepository<SmartphoneModel,Integer> {


}
