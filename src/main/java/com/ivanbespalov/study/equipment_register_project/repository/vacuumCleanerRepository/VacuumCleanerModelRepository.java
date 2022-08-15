package com.ivanbespalov.study.equipment_register_project.repository.vacuumCleanerRepository;

import com.ivanbespalov.study.equipment_register_project.model.vacuumCleaner.VacuumCleanerModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface VacuumCleanerModelRepository extends JpaRepository<VacuumCleanerModel, UUID> {
}
