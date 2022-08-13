package com.ivanbespalov.study.equipment_register_project.dto.smartphoneDto;

import com.ivanbespalov.study.equipment_register_project.dto.ModelBaseDto;
import com.ivanbespalov.study.equipment_register_project.entity.smartphone.ModelSmartphone;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ModelSmartphoneDto extends ModelBaseDto {

    private String modelSmartphoneDtoMemory;
    private int modelSmartphoneDtoNumberOfCameras;
    public ModelSmartphoneDto(ModelSmartphone modelSmartphone) {

    }
}
