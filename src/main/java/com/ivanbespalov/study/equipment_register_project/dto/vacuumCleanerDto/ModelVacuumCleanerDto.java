package com.ivanbespalov.study.equipment_register_project.dto.vacuumCleanerDto;

import com.ivanbespalov.study.equipment_register_project.dto.ModelBaseDto;
import com.ivanbespalov.study.equipment_register_project.entity.vacuumCleaner.ModelVacuumCleaner;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ModelVacuumCleanerDto extends ModelBaseDto {

    private int DustContainerVolume;
    private int CountModes;
    public ModelVacuumCleanerDto(ModelVacuumCleaner modelVacuumCleaner) {

    }
}
