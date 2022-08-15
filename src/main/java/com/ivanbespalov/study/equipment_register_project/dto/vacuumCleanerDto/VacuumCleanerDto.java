package com.ivanbespalov.study.equipment_register_project.dto.vacuumCleanerDto;

import com.ivanbespalov.study.equipment_register_project.dto.RegistryAbstractDto;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Set;

@Data
@AllArgsConstructor
public class VacuumCleanerDto extends RegistryAbstractDto {
    private Set<VacuumCleanerModelDto> vacuumCleanerModelDto;

}
