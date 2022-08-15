package com.ivanbespalov.study.equipment_register_project.model.vacuumCleaner;

import com.ivanbespalov.study.equipment_register_project.model.ModelAbstract;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Entity
@Data
@NoArgsConstructor
public class VacuumCleanerModel extends ModelAbstract {
    private int dustContainerVolume;
    private int countModes;

}
