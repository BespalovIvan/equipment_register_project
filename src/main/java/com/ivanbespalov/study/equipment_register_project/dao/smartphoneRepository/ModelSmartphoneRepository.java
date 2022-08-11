package com.ivanbespalov.study.equipment_register_project.dao.smartphoneRepository;

import com.ivanbespalov.study.equipment_register_project.entity.smartphone.ModelSmartphone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ModelSmartphoneRepository extends JpaRepository<ModelSmartphone,Integer> {


}
