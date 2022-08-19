package com.ivanbespalov.study.equipment_register_project.dto.fridgeDto;

import com.ivanbespalov.study.equipment_register_project.dto.ModelAbstractDto;
import com.ivanbespalov.study.equipment_register_project.model.fridge.FridgeModel;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class FridgeModelDto extends ModelAbstractDto {

    private Integer countDoor;
    private String compressorType;

    public FridgeModelDto(FridgeModel fridgeModel) {
        this.setId(fridgeModel.getId());
        this.setName(fridgeModel.getName());
        this.setSerialNumber(fridgeModel.getSerialNumber());
        this.setColor(fridgeModel.getColor());
        this.setSize(fridgeModel.getSize());
        this.setPrice(fridgeModel.getPrice());
        this.countDoor = fridgeModel.getCountDoor();
        this.compressorType = fridgeModel.getCompressorType();
        this.isAvailability(fridgeModel.isAvailability());
    }
}
