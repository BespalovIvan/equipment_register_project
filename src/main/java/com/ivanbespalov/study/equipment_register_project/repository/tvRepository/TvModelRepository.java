package com.ivanbespalov.study.equipment_register_project.repository.tvRepository;

import com.ivanbespalov.study.equipment_register_project.model.tv.TvModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TvModelRepository extends JpaRepository<TvModel, UUID> {
}
