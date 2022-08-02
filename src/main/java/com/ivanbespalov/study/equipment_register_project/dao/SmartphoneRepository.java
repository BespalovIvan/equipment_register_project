package com.ivanbespalov.study.equipment_register_project.dao;

import com.ivanbespalov.study.equipment_register_project.entity.Smartphone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SmartphoneRepository extends JpaRepository<Smartphone, Integer> {
    Smartphone findByNameIgnoreCase(String name);

    List<Smartphone> findByOrderByName();

}
