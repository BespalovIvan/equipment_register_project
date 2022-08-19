package com.ivanbespalov.study.equipment_register_project.repository.computerRepository;

import com.ivanbespalov.study.equipment_register_project.model.computer.ComputerModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

import java.util.UUID;

public interface ComputerModelRepository extends JpaRepository<ComputerModel, UUID>,
        QuerydslPredicateExecutor<ComputerModel> {
}
