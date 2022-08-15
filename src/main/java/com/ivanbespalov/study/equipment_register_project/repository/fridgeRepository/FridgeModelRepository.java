package com.ivanbespalov.study.equipment_register_project.repository.fridgeRepository;

import com.ivanbespalov.study.equipment_register_project.model.fridge.FridgeModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface FridgeModelRepository extends JpaRepository<FridgeModel, UUID> {
}
