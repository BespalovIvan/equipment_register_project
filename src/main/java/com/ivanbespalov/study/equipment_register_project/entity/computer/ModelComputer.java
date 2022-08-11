package com.ivanbespalov.study.equipment_register_project.entity.computer;

import com.ivanbespalov.study.equipment_register_project.dto.computerDto.ModelComputerDto;
import lombok.Data;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Data
@Table(name = "model_computer")
public class ModelComputer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID modelComputerId;
    private String modelComputerName;
    private int modelComputerSerialNumber;
    private String modelComputerColor;
    private String modelComputerSize;
    private int modelComputerPrice;
    private String modelComputerCategory;
    private String modelComputerCpu;
    private boolean modelComputerAvailability;

    public ModelComputer() {
    }

    public ModelComputer(ModelComputerDto modelComputerDto) {
        this.modelComputerId = modelComputerDto.getModelComputerDtoId();
        this.modelComputerName = modelComputerDto.getModelComputerDtoName();
        this.modelComputerSerialNumber = modelComputerDto.getModelComputerDtoSerialNumber();
        this.modelComputerColor = modelComputerDto.getModelComputerDtoColor();
        this.modelComputerSize = modelComputerDto.getModelComputerDtoSize();
        this.modelComputerPrice = modelComputerDto.getModelComputerDtoPrice();
        this.modelComputerCategory = modelComputerDto.getModelComputerDtoCategory();
        this.modelComputerCpu = modelComputerDto.getModelComputerDtoCpu();
        this.modelComputerAvailability = modelComputerDto.isModelComputerDtoAvailability();
    }
}
