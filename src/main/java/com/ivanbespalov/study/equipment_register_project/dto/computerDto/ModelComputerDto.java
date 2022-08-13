package com.ivanbespalov.study.equipment_register_project.dto.computerDto;

import com.ivanbespalov.study.equipment_register_project.dto.ModelBaseDto;
import com.ivanbespalov.study.equipment_register_project.entity.computer.ModelComputer;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ModelComputerDto extends ModelBaseDto {

    private String modelComputerDtoCategory;
    private String modelComputerDtoCpu;

    public ModelComputerDto(ModelComputer modelComputer) {

    }
}