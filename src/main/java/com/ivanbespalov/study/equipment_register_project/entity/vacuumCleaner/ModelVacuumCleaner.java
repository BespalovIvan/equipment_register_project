package com.ivanbespalov.study.equipment_register_project.entity.vacuumCleaner;

import com.ivanbespalov.study.equipment_register_project.dto.vacuumCleanerDto.ModelVacuumCleanerDto;
import com.ivanbespalov.study.equipment_register_project.entity.ModelBase;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Entity
@Data
@NoArgsConstructor
public class ModelVacuumCleaner extends ModelBase {
    private int DustContainerVolume;
    private int CountModes;

    public ModelVacuumCleaner(ModelVacuumCleanerDto modelVacuumCleanerDto) {
    }
}
