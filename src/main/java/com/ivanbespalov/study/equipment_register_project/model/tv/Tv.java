package com.ivanbespalov.study.equipment_register_project.model.tv;

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
public class Tv extends RegistryAbstract {
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "tv_id")
    private Set<TvModel> models;

    @Override
    public Set<ModelAbstract> getModelAvailability() {
        return models.stream()
                .filter(ModelAbstract::isAvailability)
                .collect(Collectors.toSet());
    }
}
