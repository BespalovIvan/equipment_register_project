package com.ivanbespalov.study.equipment_register_project.entity.vacuumCleaner;

import com.ivanbespalov.study.equipment_register_project.dto.vacuumCleanerDto.VacuumCleanerDto;
import com.ivanbespalov.study.equipment_register_project.entity.AppliancesBase;
import com.ivanbespalov.study.equipment_register_project.entity.ModelBase;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.List;
import java.util.stream.Collectors;

@Entity
@Data
@NoArgsConstructor
public class VacuumCleaner extends AppliancesBase {
    @OneToMany
    @JoinColumn(name = "vacuum_cleaner_id")
    private List<ModelVacuumCleaner> modelVacuumCleaners;

    public VacuumCleaner(VacuumCleanerDto vacuumCleanerDto) {

    }

    @Override
    public List<ModelBase> getModelAvailability() {
        return modelVacuumCleaners
                .stream()
                .filter(ModelBase::isAvailability)
                .collect(Collectors.toList());
    }
}
