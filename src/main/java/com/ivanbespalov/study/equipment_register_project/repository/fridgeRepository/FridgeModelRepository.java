package com.ivanbespalov.study.equipment_register_project.repository.fridgeRepository;

import com.ivanbespalov.study.equipment_register_project.model.fridge.FridgeModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface FridgeModelRepository extends JpaRepository<FridgeModel, UUID> {
    List<FridgeModel> findByColorIgnoreCase(String color);

    List<FridgeModel> findByPriceBetween(int min, int max);

    List<FridgeModel> findByCountDoor(int countDoor);

    List<FridgeModel> findByCompressorTypeIgnoreCase(String compressorType);
}
