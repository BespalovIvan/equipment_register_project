package com.ivanbespalov.study.equipment_register_project.dto.smartphoneDto;

import com.ivanbespalov.study.equipment_register_project.dto.AppliancesBaseDto;
import com.ivanbespalov.study.equipment_register_project.entity.smartphone.Smartphone;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class SmartphoneDto extends AppliancesBaseDto {

    private List<ModelSmartphoneDto> modelSmartphoneDto;

    public SmartphoneDto(Smartphone smartphone) {

    }

}
