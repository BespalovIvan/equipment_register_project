package com.ivanbespalov.study.equipment_register_project.entity.fridge;

import com.ivanbespalov.study.equipment_register_project.dto.fridgeDto.ModelFridgeDto;
import com.ivanbespalov.study.equipment_register_project.entity.ModelBase;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Entity
@Data
@NoArgsConstructor
public class ModelFridge extends ModelBase {
    private int CountDoor;
    private String CompressorType;

    public ModelFridge(ModelFridgeDto modelFridgeDto) {
    }

}
