package com.ivanbespalov.study.equipment_register_project.dto.computerDto;

import com.ivanbespalov.study.equipment_register_project.dto.RegistryAbstractDto;
import com.ivanbespalov.study.equipment_register_project.model.computer.Computer;
import com.ivanbespalov.study.equipment_register_project.model.computer.ComputerModel;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@NoArgsConstructor
public class ComputerDto extends RegistryAbstractDto {


    private Set<ComputerModelDto> computerModels;

    public ComputerDto(Computer computer) {
        this.setId(computer.getId());
        this.setName(computer.getName());
        this.setFirma(computer.getFirma());
        this.setCountry(computer.getCountry());
        this.isOnline(computer.isOnline());
        this.isCredit(computer.isCredit());
        }
}

