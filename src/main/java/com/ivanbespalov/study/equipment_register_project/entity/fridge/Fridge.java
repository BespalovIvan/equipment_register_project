package com.ivanbespalov.study.equipment_register_project.entity.fridge;

import com.ivanbespalov.study.equipment_register_project.dto.fridgeDto.FridgeDto;
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
public class Fridge extends AppliancesBase {
    @OneToMany
    @JoinColumn(name = "fridge_id")
    private List<ModelFridge> modelFridges;


    public Fridge(FridgeDto fridgeDto) {

    }

    @Override
    public List<ModelBase> getModelAvailability() {
        return modelFridges
                .stream()
                .filter(ModelBase::isAvailability)
                .collect(Collectors.toList());
    }
}
