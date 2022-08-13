package com.ivanbespalov.study.equipment_register_project.entity.television;

import com.ivanbespalov.study.equipment_register_project.dto.televisionDto.TelevisionDto;
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
public class Television extends AppliancesBase {
    @OneToMany
    @JoinColumn(name = "television_id")
    private List<ModelTelevision> modelTelevisions;

    public Television(TelevisionDto televisionDto) {

    }

    @Override
    public List<ModelBase> getModelAvailability() {
        return modelTelevisions.stream()
                .filter(ModelBase::isAvailability)
                .collect(Collectors.toList());
    }
}
