package com.ivanbespalov.study.equipment_register_project.dto.computerDto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.ivanbespalov.study.equipment_register_project.entity.computer.ModelComputer;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.UUID;

@Data
@AllArgsConstructor
public class ModelComputerDto {
    @JsonProperty(value = "modelComputerId")
    private UUID modelComputerDtoId;
    @JsonProperty(value = "modelComputerName")
    private String modelComputerDtoName;
    @JsonProperty(value = "modelComputerSerialNumber")
    private int modelComputerDtoSerialNumber;
    @JsonProperty(value = "modelComputerColor")
    private String modelComputerDtoColor;
    @JsonProperty(value = "modelComputerSize")
    private String modelComputerDtoSize;
    @JsonProperty(value = "modelComputerPrice")
    private int modelComputerDtoPrice;
    @JsonProperty(value = "modelComputerCategory")
    private String modelComputerDtoCategory;
    @JsonProperty(value = "modelComputerCpu")
    private String modelComputerDtoCpu;
    @JsonProperty(value = "modelComputerAvailability")
    private boolean modelComputerDtoAvailability;

    public ModelComputerDto(ModelComputer modelComputer) {
        this.modelComputerDtoId = modelComputer.getModelComputerId();
        this.modelComputerDtoName = modelComputer.getModelComputerName();
        this.modelComputerDtoSerialNumber = modelComputer.getModelComputerSerialNumber();
        this.modelComputerDtoColor = modelComputer.getModelComputerColor();
        this.modelComputerDtoSize = modelComputer.getModelComputerSize();
        this.modelComputerDtoPrice = modelComputer.getModelComputerPrice();
        this.modelComputerDtoCategory = modelComputer.getModelComputerCategory();
        this.modelComputerDtoCpu = modelComputer.getModelComputerCpu();
        this.modelComputerDtoAvailability = modelComputer.isModelComputerAvailability();
    }
}
