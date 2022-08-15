package com.ivanbespalov.study.equipment_register_project.dto.smartphoneDto;

import com.ivanbespalov.study.equipment_register_project.dto.ModelAbstractDto;
import com.ivanbespalov.study.equipment_register_project.model.smartphone.SmartphoneModel;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class SmartphoneModelDto extends ModelAbstractDto {

    private String memory;
    private int numberOfCameras;
    public SmartphoneModelDto(SmartphoneModel smartphoneModel) {
        this.setId(smartphoneModel.getId());
        this.setName(smartphoneModel.getName());
        this.setSerialNumber(smartphoneModel.getSerialNumber());
        this.setColor(smartphoneModel.getColor());
        this.setSize(smartphoneModel.getSize());
        this.setPrice(smartphoneModel.getPrice());
        this.memory = smartphoneModel.getMemory();
        this.isAvailability(smartphoneModel.isAvailability());

    }
}
