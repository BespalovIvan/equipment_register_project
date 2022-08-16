package com.ivanbespalov.study.equipment_register_project.repository.computerRepository;

import com.ivanbespalov.study.equipment_register_project.model.computer.ComputerModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface ComputerModelRepository extends JpaRepository<ComputerModel, UUID> {
    List<ComputerModel> findByColorIgnoreCase(String color);

    List<ComputerModel> findByPriceBetween(int min, int max);

    List<ComputerModel> findByCategoryIgnoreCase(String category);

    List<ComputerModel> findByCpuIgnoreCase(String cpu);
}
