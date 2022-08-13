package com.ivanbespalov.study.equipment_register_project.dto.computerDto;

import com.ivanbespalov.study.equipment_register_project.dto.AppliancesBaseDto;
import com.ivanbespalov.study.equipment_register_project.entity.computer.Computer;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class ComputerDto extends AppliancesBaseDto {
    private List<ModelComputerDto> modelsComputerDto;


    public ComputerDto(Computer computer) {

    }
}
