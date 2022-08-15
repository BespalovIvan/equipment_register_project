package com.ivanbespalov.study.equipment_register_project.repository.tvRepository;

import com.ivanbespalov.study.equipment_register_project.model.tv.Tv;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TvRepository extends JpaRepository<Tv, UUID> {
}
