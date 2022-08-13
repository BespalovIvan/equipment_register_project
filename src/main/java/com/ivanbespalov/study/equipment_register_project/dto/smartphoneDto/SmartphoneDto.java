package com.ivanbespalov.study.equipment_register_project.dto.smartphoneDto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.ivanbespalov.study.equipment_register_project.dto.AppliancesBaseDto;
import com.ivanbespalov.study.equipment_register_project.entity.smartphone.Smartphone;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class SmartphoneDto extends AppliancesBaseDto {

    @JsonIgnore
    private List<ModelSmartphoneDto> modelSmartphoneDto;

    public SmartphoneDto(Smartphone smartphone) {
        this.setId(smartphone.getId());
        this.setName(smartphone.getName());
        this.setFirm(smartphone.getFirm());
        this.setCountryOfManufacturer(smartphone.getCountryOfManufacturer());
        this.isOrderOnline(smartphone.isOrderOnline());
        this.isCredit(smartphone.isCredit());
    }
}
