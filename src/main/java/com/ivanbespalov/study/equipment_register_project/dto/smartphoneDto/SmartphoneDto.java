package com.ivanbespalov.study.equipment_register_project.dto.smartphoneDto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.ivanbespalov.study.equipment_register_project.dto.RegistryAbstractDto;
import com.ivanbespalov.study.equipment_register_project.model.smartphone.Smartphone;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@NoArgsConstructor
public class SmartphoneDto extends RegistryAbstractDto {

    @JsonIgnore
    private Set<SmartphoneModelDto> smartphoneModelDto;

    public SmartphoneDto(Smartphone smartphone) {
        this.setId(smartphone.getId());
        this.setName(smartphone.getName());
        this.setFirma(smartphone.getFirma());
        this.setCountry(smartphone.getCountry());
        this.isOnline(smartphone.isOnline());
        this.isCredit(smartphone.isCredit());
    }
}
