package com.ivanbespalov.study.equipment_register_project.dto.smartphoneDto;

import com.ivanbespalov.study.equipment_register_project.dto.ModelBaseDto;
import com.ivanbespalov.study.equipment_register_project.entity.smartphone.ModelSmartphone;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ModelSmartphoneDto extends ModelBaseDto {

    private String memory;
    private int numberOfCameras;
    public ModelSmartphoneDto(ModelSmartphone modelSmartphone) {
        this.setId(modelSmartphone.getId());
        this.setName(modelSmartphone.getName());
        this.setSerialNumber(modelSmartphone.getSerialNumber());
        this.setColor(modelSmartphone.getColor());
        this.setSize(modelSmartphone.getSize());
        this.setPrice(modelSmartphone.getPrice());
        this.memory = modelSmartphone.getMemory();
        this.isAvailability(modelSmartphone.isAvailability());

    }
}
