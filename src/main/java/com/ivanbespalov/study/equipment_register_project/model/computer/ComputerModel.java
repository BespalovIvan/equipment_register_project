package com.ivanbespalov.study.equipment_register_project.model.computer;

import com.ivanbespalov.study.equipment_register_project.dto.computerDto.ComputerModelDto;
import com.ivanbespalov.study.equipment_register_project.model.ModelAbstract;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Entity
@Data
@NoArgsConstructor
public class ComputerModel extends ModelAbstract {
    private String category;
    private String cpu;

    public ComputerModel(ComputerModelDto computerModelDto) {
        this.setName(computerModelDto.getName());
        this.setSerialNumber(computerModelDto.getSerialNumber());
        this.setColor(computerModelDto.getColor());
        this.setSize(computerModelDto.getSize());
        this.setPrice(computerModelDto.getPrice());
        this.category =  computerModelDto.getCategory();
        this.cpu = computerModelDto.getCpu();
        this.isAvailability(computerModelDto.isAvailability());
    }
}
