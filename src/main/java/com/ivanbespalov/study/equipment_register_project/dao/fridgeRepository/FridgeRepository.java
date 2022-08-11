package com.ivanbespalov.study.equipment_register_project.dao.fridgeRepository;

import com.ivanbespalov.study.equipment_register_project.entity.fridge.Fridge;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface FridgeRepository extends JpaRepository<Fridge, UUID> {
}
