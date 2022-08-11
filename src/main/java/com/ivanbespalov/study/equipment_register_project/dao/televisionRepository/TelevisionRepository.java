package com.ivanbespalov.study.equipment_register_project.dao.televisionRepository;

import com.ivanbespalov.study.equipment_register_project.entity.television.Television;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TelevisionRepository extends JpaRepository<Television, UUID> {
}
