package com.ivanbespalov.study.equipment_register_project.dao.smartphoneRepository;

import com.ivanbespalov.study.equipment_register_project.entity.smartphone.Smartphone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface SmartphoneRepository extends JpaRepository<Smartphone, UUID> {
}