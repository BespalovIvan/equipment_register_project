package com.ivanbespalov.study.equipment_register_project.dao.fridgeRepository;

import com.ivanbespalov.study.equipment_register_project.entity.fridge.ModelFridge;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ModelFridgeRepository extends JpaRepository<ModelFridge, UUID> {
}
