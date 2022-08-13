package com.ivanbespalov.study.equipment_register_project.dto.vacuumCleanerDto;

import com.ivanbespalov.study.equipment_register_project.dto.AppliancesBaseDto;
import com.ivanbespalov.study.equipment_register_project.entity.vacuumCleaner.VacuumCleaner;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class VacuumCleanerDto extends AppliancesBaseDto {
    private List<ModelVacuumCleanerDto> modelVacuumCleanerDto;
    public VacuumCleanerDto(VacuumCleaner vacuumCleaner) {
    }

}
