package com.ivanbespalov.study.equipment_register_project.dto.fridgeDto;

import com.ivanbespalov.study.equipment_register_project.dto.AppliancesBaseDto;
import com.ivanbespalov.study.equipment_register_project.entity.fridge.Fridge;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class FridgeDto extends AppliancesBaseDto {

    private List<ModelFridgeDto> modelsFridgeDto;

    public FridgeDto(Fridge fridge) {
    }

}
