package com.ivanbespalov.study.equipment_register_project.dao.vacuumCleanerRepository;

import com.ivanbespalov.study.equipment_register_project.entity.vacuumCleaner.VacuumCleaner;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface VacuumCleanerRepository extends JpaRepository<VacuumCleaner, UUID> {
}
