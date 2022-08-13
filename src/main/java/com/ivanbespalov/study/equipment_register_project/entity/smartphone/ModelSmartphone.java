package com.ivanbespalov.study.equipment_register_project.entity.smartphone;

import com.ivanbespalov.study.equipment_register_project.dto.smartphoneDto.ModelSmartphoneDto;
import com.ivanbespalov.study.equipment_register_project.entity.ModelBase;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Entity
@Data
@NoArgsConstructor
public class ModelSmartphone extends ModelBase {

    private String memory;
    private int countOfCameras;

    public ModelSmartphone(ModelSmartphoneDto modelSmartphoneDto) {
        this.setName(modelSmartphoneDto.getName());
        this.setSerialNumber(modelSmartphoneDto.getSerialNumber());
        this.setColor(modelSmartphoneDto.getColor());
        this.setSize(modelSmartphoneDto.getSize());
        this.setPrice(modelSmartphoneDto.getPrice());
        this.memory = modelSmartphoneDto.getMemory();
        this.countOfCameras = modelSmartphoneDto.getNumberOfCameras();
        this.isAvailability(modelSmartphoneDto.isAvailability());
    }
}
