package com.ivanbespalov.study.equipment_register_project.dto.fridgeDto;

import com.ivanbespalov.study.equipment_register_project.dto.ModelBaseDto;
import com.ivanbespalov.study.equipment_register_project.entity.fridge.ModelFridge;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ModelFridgeDto extends ModelBaseDto {

    private int modelFridgeDtoCountDoor;
    private String modelFridgeDtoCompressorType;

    public ModelFridgeDto(ModelFridge modelFridge) {
    }
}