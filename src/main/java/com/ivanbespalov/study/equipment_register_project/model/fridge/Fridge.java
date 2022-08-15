package com.ivanbespalov.study.equipment_register_project.model.fridge;

import com.ivanbespalov.study.equipment_register_project.dto.fridgeDto.FridgeDto;
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
public class Fridge extends RegistryAbstract {
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "fridge_id")
    private Set<FridgeModel> fridgeModels;

    public Fridge(FridgeDto fridgeDto) {
        this.setName(fridgeDto.getName());
        this.setCountry(fridgeDto.getCountry());
        this.setFirma(fridgeDto.getFirma());
        this.isOnline(fridgeDto.isOnline());
        this.isCredit(fridgeDto.isCredit());
    }

    @Override
    public Set<ModelAbstract> getModelAvailability() {
        return fridgeModels
                .stream()
                .filter(ModelAbstract::isAvailability)
                .collect(Collectors.toSet());
    }
}
