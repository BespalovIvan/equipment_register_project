package com.ivanbespalov.study.equipment_register_project.dto.computerDto;

import com.ivanbespalov.study.equipment_register_project.dto.ModelAbstractDto;
import com.ivanbespalov.study.equipment_register_project.model.computer.ComputerModel;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ComputerModelDto extends ModelAbstractDto {

    private String category;
    private String cpu;

    public ComputerModelDto(ComputerModel computerModel) {
        this.setId(computerModel.getId());
        this.setName(computerModel.getName());
        this.setSerialNumber(computerModel.getSerialNumber());
        this.setColor(computerModel.getColor());
        this.setSize(computerModel.getSize());
        this.setPrice(computerModel.getPrice());
        this.category = computerModel.getCategory();
        this.cpu = computerModel.getCpu();
        this.isAvailability(computerModel.isAvailability());
    }
}
