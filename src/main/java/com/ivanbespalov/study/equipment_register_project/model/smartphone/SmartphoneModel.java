package com.ivanbespalov.study.equipment_register_project.model.smartphone;

import com.ivanbespalov.study.equipment_register_project.dto.smartphoneDto.SmartphoneModelDto;
import com.ivanbespalov.study.equipment_register_project.model.ModelAbstract;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Entity
@Data
@NoArgsConstructor
public class SmartphoneModel extends ModelAbstract {

    private String memory;
    private int countOfCameras;

    public SmartphoneModel(SmartphoneModelDto smartphoneModelDto) {
        this.setName(smartphoneModelDto.getName());
        this.setSerialNumber(smartphoneModelDto.getSerialNumber());
        this.setColor(smartphoneModelDto.getColor());
        this.setSize(smartphoneModelDto.getSize());
        this.setPrice(smartphoneModelDto.getPrice());
        this.memory = smartphoneModelDto.getMemory();
        this.countOfCameras = smartphoneModelDto.getNumberOfCameras();
        this.isAvailability(smartphoneModelDto.isAvailability());
    }
}
