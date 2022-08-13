package com.ivanbespalov.study.equipment_register_project.entity.computer;

import com.ivanbespalov.study.equipment_register_project.dto.computerDto.ModelComputerDto;
import com.ivanbespalov.study.equipment_register_project.entity.ModelBase;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Entity
@Data
@NoArgsConstructor
public class ModelComputer extends ModelBase {
    private String Category;
    private String Cpu;


    public ModelComputer(ModelComputerDto modelComputerDto) {
    }
}
