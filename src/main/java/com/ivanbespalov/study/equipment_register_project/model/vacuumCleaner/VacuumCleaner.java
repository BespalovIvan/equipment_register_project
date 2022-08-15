package com.ivanbespalov.study.equipment_register_project.model.vacuumCleaner;

import com.ivanbespalov.study.equipment_register_project.model.ModelAbstract;
import com.ivanbespalov.study.equipment_register_project.model.RegistryAbstract;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.Set;
import java.util.stream.Collectors;

@Entity
@Data
@NoArgsConstructor
public class VacuumCleaner extends RegistryAbstract {
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "vacuum_cleaner_id")
    private Set<VacuumCleanerModel> models;

    @Override
    public Set<ModelAbstract> getModelAvailability() {
        return models
                .stream()
                .filter(ModelAbstract::isAvailability)
                .collect(Collectors.toSet());
    }
}
