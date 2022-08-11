package com.ivanbespalov.study.equipment_register_project.dao.computerRepository;

import com.ivanbespalov.study.equipment_register_project.entity.computer.Computer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ComputerRepository extends JpaRepository<Computer, UUID> {
}
