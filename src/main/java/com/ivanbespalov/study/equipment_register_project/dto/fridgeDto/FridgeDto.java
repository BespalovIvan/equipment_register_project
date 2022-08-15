package com.ivanbespalov.study.equipment_register_project.dto.fridgeDto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.ivanbespalov.study.equipment_register_project.dto.RegistryAbstractDto;
import com.ivanbespalov.study.equipment_register_project.model.fridge.Fridge;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@NoArgsConstructor
public class FridgeDto extends RegistryAbstractDto {

    @JsonIgnore
    private Set<FridgeModelDto> modelsFridgeDto;

    public FridgeDto(Fridge fridge) {
        this.setId(fridge.getId());
        this.setName(fridge.getName());
        this.setFirma(fridge.getFirma());
        this.setCountry(fridge.getCountry());
        this.isOnline(fridge.isOnline());
        this.isCredit(fridge.isCredit());
    }
}
