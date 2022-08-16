package com.ivanbespalov.study.equipment_register_project.repository.computerRepository;

import com.ivanbespalov.study.equipment_register_project.model.computer.Computer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface ComputerRepository extends JpaRepository<Computer, UUID> {
    Optional<Computer> findByNameIgnoreCase(String name);
}
