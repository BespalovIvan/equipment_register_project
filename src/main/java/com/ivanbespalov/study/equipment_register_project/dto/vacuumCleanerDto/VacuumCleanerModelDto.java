package com.ivanbespalov.study.equipment_register_project.dto.vacuumCleanerDto;

import com.ivanbespalov.study.equipment_register_project.dto.ModelAbstractDto;
import com.ivanbespalov.study.equipment_register_project.model.vacuumCleaner.VacuumCleanerModel;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class VacuumCleanerModelDto extends ModelAbstractDto {

    private int dustContainerVolume;
    private int countModes;
    public VacuumCleanerModelDto(VacuumCleanerModel vacuumCleanerModel) {

    }
}
