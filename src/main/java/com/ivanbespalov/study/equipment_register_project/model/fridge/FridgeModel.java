package com.ivanbespalov.study.equipment_register_project.model.fridge;

import com.ivanbespalov.study.equipment_register_project.dto.fridgeDto.FridgeModelDto;
import com.ivanbespalov.study.equipment_register_project.model.ModelAbstract;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Entity
@Data
@NoArgsConstructor
public class FridgeModel extends ModelAbstract {
    private int countDoor;
    private String compressorType;

    public FridgeModel(FridgeModelDto fridgeModelDto) {
        this.setName(fridgeModelDto.getName());
        this.setSerialNumber(fridgeModelDto.getSerialNumber());
        this.setColor(fridgeModelDto.getColor());
        this.setSize(fridgeModelDto.getSize());
        this.setPrice(fridgeModelDto.getPrice());
        this.countDoor = fridgeModelDto.getCountDoor();
        this.compressorType = fridgeModelDto.getCompressorType();
        this.isAvailability(fridgeModelDto.isAvailability());
    }
}
