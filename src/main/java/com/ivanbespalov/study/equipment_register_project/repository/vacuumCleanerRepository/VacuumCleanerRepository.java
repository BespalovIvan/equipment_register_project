package com.ivanbespalov.study.equipment_register_project.repository.vacuumCleanerRepository;

import com.ivanbespalov.study.equipment_register_project.model.vacuumCleaner.VacuumCleaner;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface VacuumCleanerRepository extends JpaRepository<VacuumCleaner, UUID> {
}
